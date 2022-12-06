class TestMatrix {

    public static void main(String[] args) {
        final Matrix matrix = new Matrix(2, 3);

        matrix.initialize();
        matrix.showMatrix();
        System.out.println();

        final int average = matrix.average();
        System.out.println("Среднее значение матрицы равно: " + average);
        System.out.println();

        System.out.println("Вычитание среднего значения из матрицы");
        matrix.subtractNumber(average);
        matrix.showMatrix();
    }
}
