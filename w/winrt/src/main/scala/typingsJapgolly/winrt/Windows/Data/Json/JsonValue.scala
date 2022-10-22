package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonValue
  extends StObject
     with IJsonValue
object JsonValue {
  
  inline def apply(
    getArray: CallbackTo[JsonArray],
    getBoolean: CallbackTo[Boolean],
    getNumber: CallbackTo[Double],
    getObject: CallbackTo[JsonObject],
    getString: CallbackTo[String],
    stringify: CallbackTo[String],
    valueType: JsonValueType
  ): JsonValue = {
    val __obj = js.Dynamic.literal(getArray = getArray.toJsFn, getBoolean = getBoolean.toJsFn, getNumber = getNumber.toJsFn, getObject = getObject.toJsFn, getString = getString.toJsFn, stringify = stringify.toJsFn, valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonValue]
  }
}
