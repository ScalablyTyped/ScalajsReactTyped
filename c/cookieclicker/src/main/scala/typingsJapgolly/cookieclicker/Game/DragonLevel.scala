package typingsJapgolly.cookieclicker.Game

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragonLevel extends StObject {
  
  /**
    * Description of the effects of leveling up the dragon, in HTML text
    */
  var action: String
  
  /**
    * Does all the spending, spending cookies, sacrificing buildings, etc.
    */
  def buy(): Unit
  
  /**
    * Determines if the level can be bought
    */
  def cost(): Boolean
  
  /**
    * Generates the cost description in HTML text
    */
  def costStr(): String
  
  var name: String
  
  /**
    * The picture number in the dragon pictures
    */
  var pic: Double
}
object DragonLevel {
  
  inline def apply(
    action: String,
    buy: Callback,
    cost: CallbackTo[Boolean],
    costStr: CallbackTo[String],
    name: String,
    pic: Double
  ): DragonLevel = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], buy = buy.toJsFn, cost = cost.toJsFn, costStr = costStr.toJsFn, name = name.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragonLevel]
  }
  
  extension [Self <: DragonLevel](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setBuy(value: Callback): Self = StObject.set(x, "buy", value.toJsFn)
    
    inline def setCost(value: CallbackTo[Boolean]): Self = StObject.set(x, "cost", value.toJsFn)
    
    inline def setCostStr(value: CallbackTo[String]): Self = StObject.set(x, "costStr", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPic(value: Double): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
  }
}
