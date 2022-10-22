package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJsonArray
  extends StObject
     with IJsonValue {
  
  def getArrayAt(index: Double): JsonArray
  
  def getBooleanAt(index: Double): Boolean
  
  def getNumberAt(index: Double): Double
  
  def getObjectAt(index: Double): JsonObject
  
  def getStringAt(index: Double): String
}
object IJsonArray {
  
  inline def apply(
    getArray: CallbackTo[JsonArray],
    getArrayAt: Double => JsonArray,
    getBoolean: CallbackTo[Boolean],
    getBooleanAt: Double => Boolean,
    getNumber: CallbackTo[Double],
    getNumberAt: Double => Double,
    getObject: CallbackTo[JsonObject],
    getObjectAt: Double => JsonObject,
    getString: CallbackTo[String],
    getStringAt: Double => String,
    stringify: CallbackTo[String],
    valueType: JsonValueType
  ): IJsonArray = {
    val __obj = js.Dynamic.literal(getArray = getArray.toJsFn, getArrayAt = js.Any.fromFunction1(getArrayAt), getBoolean = getBoolean.toJsFn, getBooleanAt = js.Any.fromFunction1(getBooleanAt), getNumber = getNumber.toJsFn, getNumberAt = js.Any.fromFunction1(getNumberAt), getObject = getObject.toJsFn, getObjectAt = js.Any.fromFunction1(getObjectAt), getString = getString.toJsFn, getStringAt = js.Any.fromFunction1(getStringAt), stringify = stringify.toJsFn, valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonArray]
  }
  
  extension [Self <: IJsonArray](x: Self) {
    
    inline def setGetArrayAt(value: Double => JsonArray): Self = StObject.set(x, "getArrayAt", js.Any.fromFunction1(value))
    
    inline def setGetBooleanAt(value: Double => Boolean): Self = StObject.set(x, "getBooleanAt", js.Any.fromFunction1(value))
    
    inline def setGetNumberAt(value: Double => Double): Self = StObject.set(x, "getNumberAt", js.Any.fromFunction1(value))
    
    inline def setGetObjectAt(value: Double => JsonObject): Self = StObject.set(x, "getObjectAt", js.Any.fromFunction1(value))
    
    inline def setGetStringAt(value: Double => String): Self = StObject.set(x, "getStringAt", js.Any.fromFunction1(value))
  }
}
