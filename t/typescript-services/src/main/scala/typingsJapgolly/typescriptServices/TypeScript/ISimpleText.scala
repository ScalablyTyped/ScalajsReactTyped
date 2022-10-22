package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISimpleText extends StObject {
  
  def charCodeAt(index: Double): Double
  
  def copyTo(sourceIndex: Double, destination: js.Array[Double], destinationIndex: Double, count: Double): Unit
  
  def length(): Double
  
  def lineMap(): LineMap
  
  def subText(span: TextSpan): ISimpleText
  
  def substr(start: Double, length: Double, intern: Boolean): String
}
object ISimpleText {
  
  inline def apply(
    charCodeAt: Double => Double,
    copyTo: (Double, js.Array[Double], Double, Double) => Callback,
    length: CallbackTo[Double],
    lineMap: CallbackTo[LineMap],
    subText: TextSpan => ISimpleText,
    substr: (Double, Double, Boolean) => String
  ): ISimpleText = {
    val __obj = js.Dynamic.literal(charCodeAt = js.Any.fromFunction1(charCodeAt), copyTo = js.Any.fromFunction4((t0: Double, t1: js.Array[Double], t2: Double, t3: Double) => (copyTo(t0, t1, t2, t3)).runNow()), length = length.toJsFn, lineMap = lineMap.toJsFn, subText = js.Any.fromFunction1(subText), substr = js.Any.fromFunction3(substr))
    __obj.asInstanceOf[ISimpleText]
  }
  
  extension [Self <: ISimpleText](x: Self) {
    
    inline def setCharCodeAt(value: Double => Double): Self = StObject.set(x, "charCodeAt", js.Any.fromFunction1(value))
    
    inline def setCopyTo(value: (Double, js.Array[Double], Double, Double) => Callback): Self = StObject.set(x, "copyTo", js.Any.fromFunction4((t0: Double, t1: js.Array[Double], t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setLength(value: CallbackTo[Double]): Self = StObject.set(x, "length", value.toJsFn)
    
    inline def setLineMap(value: CallbackTo[LineMap]): Self = StObject.set(x, "lineMap", value.toJsFn)
    
    inline def setSubText(value: TextSpan => ISimpleText): Self = StObject.set(x, "subText", js.Any.fromFunction1(value))
    
    inline def setSubstr(value: (Double, Double, Boolean) => String): Self = StObject.set(x, "substr", js.Any.fromFunction3(value))
  }
}
