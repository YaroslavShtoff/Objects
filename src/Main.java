public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", " Пушкин ");
        Author turgenev = new Author("Иван", " Тургенев ");

        Book goldenFish = new Book("Золотая рыбка", pushkin, 1835);
        Book fathersAndSons = new Book("Отци и дети ", turgenev, 1867);

        System.out.println(goldenFish.getTitle() +" "+ goldenFish.getAuthorSurname() + " " + goldenFish.getAuthorName()
                +" "+goldenFish.getYearPublishing() );
        System.out.println(fathersAndSons.getTitle() +" "+ fathersAndSons.getAuthorSurname() + " "
                + fathersAndSons.getAuthorName()
                +" "+fathersAndSons.getYearPublishing() );
        fathersAndSons.setYearPublishing(1865);
        System.out.println(fathersAndSons.getTitle() + " " + fathersAndSons.getAuthorSurname() + " "
                + fathersAndSons.getAuthorName()
                +" "+fathersAndSons.getYearPublishing() );

        System.out.println(pushkin.toString());
        System.out.println(goldenFish.toString());


    }
}
