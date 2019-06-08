package com.ucsdextandroid1.kotlinlist;

public class JavaUnitTest {

    private String HelloWorld(){
        return "Hello World";
    }

    public class PropertyDemo {
        private int counter;
        private String propertyWithCounter;

        public int getCounter(){
            return counter;
        }

        public String getPropertyWithCounter(){
            return propertyWithCounter;
        }

        public void setPropertyWithCounter(String propertyWithCounter){
            this.counter += 1;
            this.propertyWithCounter = propertyWithCounter;
        }
    }
}
