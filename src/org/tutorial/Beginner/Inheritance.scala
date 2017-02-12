 /*
 ***  ___                  ___  __  ___  _____                         ___   ___ 
 ***   |   |\    | |    | |    |  |  |     |       /\      |\    |    /     |
 ***   |   | \   | |    | |    |  |  |     |      /  \     | \   |   |      |
 ***   |   |  \  | |----| |--  |__|  |     |     /----\    |  \  |   |      |--
 ***   |   |   \ | |    | |    |\    |     |    /      \   |   \ |   |      |
 ***  _|_  |    \| |    | |___ | \  _|_    |   /        \  |    \|    \__   |___
 */                                

package org.tutorial.Beginner


/** An abstract class is declared with abstract keyword.
 *  It can have declared and
 *  undeclared methods.  
 */
abstract class ParentMethods {
  def availableToys(name : String):String 
	{
	  
	  }
	
	def toysPriceRange(name : String) : String 
	{
    
	}
	
	def numberOfToys(name : String) :String =
	{
   name match {
	  case "barbie"    => "15"
	  case "hotwheels" => "100"
	  case "disney"    => "2"   
	  case "Playskool" => "70"             
	  }
	}
	
	def toyPopularity(name :String) : String =
	{
   name match {
	  case "barbie"    => "High"
	  case "hotwheels" => "Med"
	  case "disney"    => "Med"   
	  case "Playskool" => "High"             
	  }
	}
}

/** Subclass which inherits 
 *  the parent abstract class.  
 */
class ParentClass extends ParentMethods  {

	def availableToys(name : String):String =
	{
	  name match {
	  case "barbie"    => "Barbie Starlight Adventure || Barbie Puppy Chase        || Barbie Dreamtopia   || Barbie Fashionistas"
	  case "hotwheels" => "Mattel Hot Wheels          || Hot Wheel Escape Velocity || Hot Wheel Star Wars || Hot Wheels SkyBuster"
	  case "disney"    => "Captain America            || Captain Phasma            || Spider Man          || Cinderella Castle Play Set"   
	  case "Playskool" => "Playskool shapey turtle    || Playskool poppin park     || Playskool Rocktivity|| Playskool raised"             
	  }
	  
	  }
	
	def toysPriceRange(name : String) : String =
	{
    name match {
	  case "barbie"    => "100$ - 500$"
	  case "hotwheels" => "1$ - 2$ "
	  case "disney"    => "5000$ - 7000$"   
	  case "Playskool" => "3$ - 5$"             
	  }
	}

}

object Inheritence extends ParentClass  {    
  
  def main(args : Array[String]) :String = 
  {
    new ParentClass().availableToys("barbie")
    new ParentClass().availableToys("hotwheels")
    new ParentClass().availableToys("disney")
    new ParentClass().availableToys("Playskool")
  }
}