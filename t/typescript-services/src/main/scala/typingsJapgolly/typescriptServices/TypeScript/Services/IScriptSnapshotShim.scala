package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScriptSnapshotShim extends StObject {
  
  def getLength(): Double
  
  def getLineStartPositions(): String
  
  def getText(start: Double, end: Double): String
  
  def getTextChangeRangeSinceVersion(scriptVersion: Double): String
}
object IScriptSnapshotShim {
  
  inline def apply(
    getLength: CallbackTo[Double],
    getLineStartPositions: CallbackTo[String],
    getText: (Double, Double) => String,
    getTextChangeRangeSinceVersion: Double => String
  ): IScriptSnapshotShim = {
    val __obj = js.Dynamic.literal(getLength = getLength.toJsFn, getLineStartPositions = getLineStartPositions.toJsFn, getText = js.Any.fromFunction2(getText), getTextChangeRangeSinceVersion = js.Any.fromFunction1(getTextChangeRangeSinceVersion))
    __obj.asInstanceOf[IScriptSnapshotShim]
  }
  
  extension [Self <: IScriptSnapshotShim](x: Self) {
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setGetLineStartPositions(value: CallbackTo[String]): Self = StObject.set(x, "getLineStartPositions", value.toJsFn)
    
    inline def setGetText(value: (Double, Double) => String): Self = StObject.set(x, "getText", js.Any.fromFunction2(value))
    
    inline def setGetTextChangeRangeSinceVersion(value: Double => String): Self = StObject.set(x, "getTextChangeRangeSinceVersion", js.Any.fromFunction1(value))
  }
}
