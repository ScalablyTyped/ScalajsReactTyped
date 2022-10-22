package typingsJapgolly.suitescript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardLines extends StObject {
  
  def getCount(): Double
  
  def getLine(index: Double): StandardLine
}
object StandardLines {
  
  inline def apply(getCount: CallbackTo[Double], getLine: Double => StandardLine): StandardLines = {
    val __obj = js.Dynamic.literal(getCount = getCount.toJsFn, getLine = js.Any.fromFunction1(getLine))
    __obj.asInstanceOf[StandardLines]
  }
  
  extension [Self <: StandardLines](x: Self) {
    
    inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCount", value.toJsFn)
    
    inline def setGetLine(value: Double => StandardLine): Self = StObject.set(x, "getLine", js.Any.fromFunction1(value))
  }
}
