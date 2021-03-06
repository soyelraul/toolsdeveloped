package org.academiadecodigo.bootcamp54.arabiannights;

public class RecyclableDemon extends Genie {
    private boolean recycled;

    public RecyclableDemon(int maxNumberOfWishes) {
        super(maxNumberOfWishes);

        recycled = false;

        System.out.println("Spawned Recycled Demon");
    }

    @Override
    protected void grantWish() {
        if (!recycled) {
           super.grantWish();

           return;
        }

        System.out.println("Can't grant wish if already recycled");
    }

    public void recycle() {
        recycled = true;

        System.out.println("Recycled");
    }

    public boolean isRecycled() {
        return recycled;
    }
}
