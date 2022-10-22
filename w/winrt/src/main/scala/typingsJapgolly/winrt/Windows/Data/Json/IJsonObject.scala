package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJsonObject
  extends StObject
     with IJsonValue {
  
  def getNamedArray(name: String): JsonArray
  
  def getNamedBoolean(name: String): Boolean
  
  def getNamedNumber(name: String): Double
  
  def getNamedObject(name: String): JsonObject
  
  def getNamedString(name: String): String
  
  def getNamedValue(name: String): JsonValue
  
  def setNamedValue(name: String, value: IJsonValue): Unit
}
object IJsonObject {
  
  inline def apply(
    getArray: CallbackTo[JsonArray],
    getBoolean: CallbackTo[Boolean],
    getNamedArray: String => JsonArray,
    getNamedBoolean: String => Boolean,
    getNamedNumber: String => Double,
    getNamedObject: String => JsonObject,
    getNamedString: String => String,
    getNamedValue: String => JsonValue,
    getNumber: CallbackTo[Double],
    getObject: CallbackTo[JsonObject],
    getString: CallbackTo[String],
    setNamedValue: (String, IJsonValue) => Callback,
    stringify: CallbackTo[String],
    valueType: JsonValueType
  ): IJsonObject = {
    val __obj = js.Dynamic.literal(getArray = getArray.toJsFn, getBoolean = getBoolean.toJsFn, getNamedArray = js.Any.fromFunction1(getNamedArray), getNamedBoolean = js.Any.fromFunction1(getNamedBoolean), getNamedNumber = js.Any.fromFunction1(getNamedNumber), getNamedObject = js.Any.fromFunction1(getNamedObject), getNamedString = js.Any.fromFunction1(getNamedString), getNamedValue = js.Any.fromFunction1(getNamedValue), getNumber = getNumber.toJsFn, getObject = getObject.toJsFn, getString = getString.toJsFn, setNamedValue = js.Any.fromFunction2((t0: String, t1: IJsonValue) => (setNamedValue(t0, t1)).runNow()), stringify = stringify.toJsFn, valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonObject]
  }
  
  extension [Self <: IJsonObject](x: Self) {
    
    inline def setGetNamedArray(value: String => JsonArray): Self = StObject.set(x, "getNamedArray", js.Any.fromFunction1(value))
    
    inline def setGetNamedBoolean(value: String => Boolean): Self = StObject.set(x, "getNamedBoolean", js.Any.fromFunction1(value))
    
    inline def setGetNamedNumber(value: String => Double): Self = StObject.set(x, "getNamedNumber", js.Any.fromFunction1(value))
    
    inline def setGetNamedObject(value: String => JsonObject): Self = StObject.set(x, "getNamedObject", js.Any.fromFunction1(value))
    
    inline def setGetNamedString(value: String => String): Self = StObject.set(x, "getNamedString", js.Any.fromFunction1(value))
    
    inline def setGetNamedValue(value: String => JsonValue): Self = StObject.set(x, "getNamedValue", js.Any.fromFunction1(value))
    
    inline def setSetNamedValue(value: (String, IJsonValue) => Callback): Self = StObject.set(x, "setNamedValue", js.Any.fromFunction2((t0: String, t1: IJsonValue) => (value(t0, t1)).runNow()))
  }
}
