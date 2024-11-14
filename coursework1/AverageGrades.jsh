int[] average_grades(int grades[][], int weights[])	{
	int numStudents = grades.length;
	int numGrades = weights.length;
	int[] weightedGrades = new int[numStudents];
	
	for (int i = 0; i < numStudents; i++) {
		weightedGrades[i] = 0;
		for (int j = 0; j < numGrades; j++) {
			weightedGrades[i] += grades[i][j] * weights[j];
		}
		weightedGrades[i] /= 100;
	}
	return weightedGrades;
}