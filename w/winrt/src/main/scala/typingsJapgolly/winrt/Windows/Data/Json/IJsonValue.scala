package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJsonValue extends StObject {
  
  def getArray(): JsonArray
  
  def getBoolean(): Boolean
  
  def getNumber(): Double
  
  def getObject(): JsonObject
  
  def getString(): String
  
  def stringify(): String
  
  var valueType: JsonValueType
}
object IJsonValue {
  
  inline def apply(
    getArray: CallbackTo[JsonArray],
    getBoolean: CallbackTo[Boolean],
    getNumber: CallbackTo[Double],
    getObject: CallbackTo[JsonObject],
    getString: CallbackTo[String],
    stringify: CallbackTo[String],
    valueType: JsonValueType
  ): IJsonValue = {
    val __obj = js.Dynamic.literal(getArray = getArray.toJsFn, getBoolean = getBoolean.toJsFn, getNumber = getNumber.toJsFn, getObject = getObject.toJsFn, getString = getString.toJsFn, stringify = stringify.toJsFn, valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonValue]
  }
  
  extension [Self <: IJsonValue](x: Self) {
    
    inline def setGetArray(value: CallbackTo[JsonArray]): Self = StObject.set(x, "getArray", value.toJsFn)
    
    inline def setGetBoolean(value: CallbackTo[Boolean]): Self = StObject.set(x, "getBoolean", value.toJsFn)
    
    inline def setGetNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getNumber", value.toJsFn)
    
    inline def setGetObject(value: CallbackTo[JsonObject]): Self = StObject.set(x, "getObject", value.toJsFn)
    
    inline def setGetString(value: CallbackTo[String]): Self = StObject.set(x, "getString", value.toJsFn)
    
    inline def setStringify(value: CallbackTo[String]): Self = StObject.set(x, "stringify", value.toJsFn)
    
    inline def setValueType(value: JsonValueType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
  }
}
