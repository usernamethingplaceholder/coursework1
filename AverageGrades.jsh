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

int[] results = average_grades(new int[][]{{51, 83, 28}, {0, 38, 95}}, new int[]{30, 40, 30});
for (int result : results) {
    System.out.println(result);
}