public class Lab3
{
  public static void testLightCandles1()
  {
    Robot.load("candles1.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  
  public static void testLightCandles2()
  {
    Robot.load("candles2.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
   
  public static void lightCandles()
  {
      Robot.turnLeft();
      Robot.move();
      turnRight();
      lightCandle();
      lightCandle();
      lightCandle();
      lightCandle();
      lightCandle();
      lightCandle();
      lightCandle();
      lightCandle();
      lightCandle();
      lightCandle();
    }
  //precondition: The robot starts in the bottom left square facing right.
  //postconditon: The robot ends in the right middle square facing right with all the candles darkened.
  public static void lightCandle()
  {
    if(Robot.frontIsClear())
    {
        Robot.move();
        Robot.makeDark();
        Robot.move();
    }
    else
    {
       Robot.turnLeft();
       Robot.move();
       turnRight();
       Robot.move();
       Robot.makeDark();
       Robot.move();
       turnRight();
       Robot.move();
       Robot.turnLeft();
    }  
  }
  //precondition:The candle in front of the bot is not lit(light).
  //postcondition:The candle in front of the bot is lit(dark).
  public static void turnRight()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.turnLeft();
    }
  //precondition:The robot is facing any direction.
  //postcondition:The robot is facing 90 degrees clockwise.
  public static void testCompleteRoom1()
  {
     Robot.load("room1.txt");
     Robot.setDelay(0.05);
     completeRoom();
  }
  
  public static void moveSideways()
  {
      turnRight();
      Robot.move();
      Robot.turnLeft();
    }
  //precondition:The robot is facing any direction.
  //postcondition:The robot is facing the same direction, one unit to the right of where it was.
  public static void moveBackwards()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.move();
      Robot.turnLeft();
      Robot.turnLeft();
    }
  //precondition:The robot is facing any direction
  //postcondition:The robot is facing the same direction, one unit to the back of where it was    
  public static void darkenSquare()
  {
      if(Robot.frontIsClear())
      {
          Robot.move();
          if(Robot.onDark())
          {
          moveBackwards();
            }
          else
          {
          Robot.makeDark();
          moveBackwards();
        }
        }
    }
  //precondition:The square in front of the bot is brick, dark or light.
  //postcondition:If the square in front was light, it is dark.
  public static void testCompleteRoom2()
  {
    Robot.load("room2.txt");
    Robot.setDelay(0.05);
    completeRoom();
  }
  
  public static void completeRow()
  {
      darkenSquare();
      moveSideways();
      darkenSquare();
      moveSideways();
      darkenSquare();
      moveSideways();
      darkenSquare();
      moveSideways();
      darkenSquare();
    }
  //precondition:The robot starts in any corner facing the corresponding row
  //postcondition:The row has only dark squares between each brick. The robot is at the end of the row.
  public static void completeRoom()
  {
    Robot.turnLeft();
    completeRow();
    turnRight();
    completeRow();
    turnRight();
    completeRow();
    turnRight();
    completeRow();
  }
  //precondition:The border has either light, dark or brick blocks.
  //postcondition:The border only has brick or dark blocks.
  public static void testSwapAll1()
  {
    Robot.load("swap1.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
  
  public static void testSwapAll2()
  {
    Robot.load("swap2.txt");
    Robot.setDelay(0.05);
    swapAll();
  }

  public static void swapAll()
  {
    swapAndMove();
    swapAndMove();
    swapAndMove();
    swapAndMove();
    swapAndMove();
    swapAndMove();
    swapAndMove();
    swapAndMove();
    swapAndMove();
    swap();
  }
  //precondition:The robot is in the bottom middle square facing up.
  //postcondition:The robot is in the top left square facing left with the right and left rows swapped.
  public static void testLightCandles3()
  {
    Robot.load("candles3.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  
  public static void testLightCandles4()
  {
    Robot.load("candles4.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  
  public static void testCompleteRoom3()
  {
     Robot.load("room3.txt");
     Robot.setDelay(0.05);
     completeRoom();
  }
  
  public static void testCompleteRoom4()
  {
    Robot.load("room4.txt");
    Robot.setDelay(0.05);
    completeRoom();
  }
  
  public static void turnAround()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.move();
      Robot.move();
    }
  //precondition:The robot is facing out on either side.
  //postcondition:The robot is facing out on the opposing side.
  public static void swap()
  {
      Robot.turnLeft();
      Robot.move();
      if(Robot.onDark())
      {
          turnAround();
          if (Robot.onDark())
          {
              turnAround();
            }
          else
          {
              Robot.makeDark();
              turnAround();
              Robot.makeLight();
            }
        }
      else
      {
          turnAround();
          if (Robot.onDark())
          {
              Robot.makeLight();
              turnAround();
              Robot.makeDark();
            }
          else
          {
              turnAround();
            }
        }
    }
  //precondition:The blocks to the right and left of the bot are either dark or light.
  //postcondition:The blocks mentioned in the precondition are swapped.
  public static void swapAndMove()
  {
      swap();
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.move();
      Robot.turnLeft();
      Robot.move();
    }
  //precondition:The bot is facing forward in the middle row.
  //postcondition:The bot is facing forward and is one block forward from where it was. The blocks it used to be next to are swapped.
  public static void testSwapAll3()
  {
    Robot.load("swap3.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
  
  public static void testSwapAll4()
  {
    Robot.load("swap4.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
}
