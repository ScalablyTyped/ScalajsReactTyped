package typingsJapgolly.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Number extends StObject {
  
  def format(value: Double, config: Any): String
  
  def getConfig(format: String): Any
  
  def numToStr(config: Any): WebixCallback
  
  def parse(value: String, config: Any): Double
}
object Number {
  
  @JSImport("webix", "Number")
  @js.native
  val ^ : Number = js.native
  
  extension [Self <: Number](x: Self) {
    
    inline def setFormat(value: (Double, Any) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    inline def setGetConfig(value: String => Any): Self = StObject.set(x, "getConfig", js.Any.fromFunction1(value))
    
    inline def setNumToStr(value: Any => WebixCallback): Self = StObject.set(x, "numToStr", js.Any.fromFunction1(value))
    
    inline def setParse(value: (String, Any) => Double): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
  }
}
