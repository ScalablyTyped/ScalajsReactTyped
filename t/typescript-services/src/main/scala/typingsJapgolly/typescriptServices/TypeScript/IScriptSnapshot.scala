package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScriptSnapshot extends StObject {
  
  def getLength(): Double
  
  def getLineStartPositions(): js.Array[Double]
  
  def getText(start: Double, end: Double): String
  
  def getTextChangeRangeSinceVersion(scriptVersion: Double): TextChangeRange
}
object IScriptSnapshot {
  
  inline def apply(
    getLength: CallbackTo[Double],
    getLineStartPositions: CallbackTo[js.Array[Double]],
    getText: (Double, Double) => String,
    getTextChangeRangeSinceVersion: Double => TextChangeRange
  ): IScriptSnapshot = {
    val __obj = js.Dynamic.literal(getLength = getLength.toJsFn, getLineStartPositions = getLineStartPositions.toJsFn, getText = js.Any.fromFunction2(getText), getTextChangeRangeSinceVersion = js.Any.fromFunction1(getTextChangeRangeSinceVersion))
    __obj.asInstanceOf[IScriptSnapshot]
  }
  
  extension [Self <: IScriptSnapshot](x: Self) {
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setGetLineStartPositions(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getLineStartPositions", value.toJsFn)
    
    inline def setGetText(value: (Double, Double) => String): Self = StObject.set(x, "getText", js.Any.fromFunction2(value))
    
    inline def setGetTextChangeRangeSinceVersion(value: Double => TextChangeRange): Self = StObject.set(x, "getTextChangeRangeSinceVersion", js.Any.fromFunction1(value))
  }
}
