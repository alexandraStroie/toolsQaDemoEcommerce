package com.orangeHRM.demo.loadableComponents;

public abstract class CustomLoadableComponent<T extends CustomLoadableComponent<T>> {

    // wrap cast with generics
    @SuppressWarnings("unchecked")
    public <T extends CustomLoadableComponent> T get()  {
        try {
            isLoaded();
            return (T)this;
        }
        catch (Exception e) {
            System.out.println(e);
            load();
        }

        isLoaded();
        return (T)this;
    }

    public abstract void load();
    public abstract void isLoaded() throws Error;

}
