String ssd(int d, int n) {
    switch ((d*10)+n) {
        case 1: case 5: case 21: case 23: case 25: case 31: case 33: case 35:
        case 43: case 51: case 53: case 55: case 61: case 63: case 65: case 71:
        case 81: case 83: case 85: case 91: case 93: case 95:
            return " --  ";
        case 24: case 52: case 62:
            return "|    ";
        case 12: case 14: case 22: case 32: case 34: case 44: case 54: case 72:
        case 74: case 94:
            return "   | ";
        case 2: case 4: case 42: case 64: case 82: case 84: case 92:
            return "|  | ";
        default: return "     ";
    }
}

void display(int n) {
	int length = String.valueOf(n).length();
	int[] digits = new int[length];	// creates array same length as num	
	
	while (n > 0) {		// convert n into an array of n in single digits, in order
		length --;	// both bc array is 0 index and length is 1, and to put at end
		digits[length] = n % 10;
		n = n / 10;
	}
	
	for (int i = 1; i <= 5; i++) {	// goes through line by line finding correct
		String output = "";
		for (int digit : digits) {
			output = output + ssd(digit, i);
		}
		System.out.println(output);	// prints each time so i don't have to store each line
	}
}