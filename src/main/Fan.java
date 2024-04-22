public class Fan {
  private int speed;  // Priviate variables
  private double radius;
  private String color;
  private boolean on;
  
  public Fan() {
  speed = 1; // default speed
  on = false; // fan is intitially off
  radius = 5; // default radius
  color = "blue"; // default color
  }
  
  // Getters and Setters
  public int getSpeed() {
      return speed;
  }

  public void setSpeed(int speed) {
      this.speed = speed;
  }

  public boolean isOn() {
      return on;
  }

  public void setOn(boolean on) {
      this.on = on;
  }

  public double getRadius() {
      return radius;
  }

  public void setRadius(double radius) {
      this.radius = radius;
  }

  public String getColor() {
      return color;
  }

  public void setColor(String color) {
      this.color = color;
  }
  
  // toString method to display the fan's details
      public String toString() {
          if (on) {
              return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius + ", fan is on";
          } else {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius + ", fan is off";
          }
      }
  }