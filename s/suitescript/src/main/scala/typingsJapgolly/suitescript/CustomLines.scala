package typingsJapgolly.suitescript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLines extends StObject {
  
  def addNewLine(): CustomLine
  
  def getCount(): Double
  
  def getLine(index: Double): CustomLine
}
object CustomLines {
  
  inline def apply(addNewLine: CallbackTo[CustomLine], getCount: CallbackTo[Double], getLine: Double => CustomLine): CustomLines = {
    val __obj = js.Dynamic.literal(addNewLine = addNewLine.toJsFn, getCount = getCount.toJsFn, getLine = js.Any.fromFunction1(getLine))
    __obj.asInstanceOf[CustomLines]
  }
  
  extension [Self <: CustomLines](x: Self) {
    
    inline def setAddNewLine(value: CallbackTo[CustomLine]): Self = StObject.set(x, "addNewLine", value.toJsFn)
    
    inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCount", value.toJsFn)
    
    inline def setGetLine(value: Double => CustomLine): Self = StObject.set(x, "getLine", js.Any.fromFunction1(value))
  }
}
