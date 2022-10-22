package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonObject
  extends StObject
     with IJsonObject
     with IMap[String, IJsonValue]
object JsonObject {
  
  inline def apply(
    clear: Callback,
    first: CallbackTo[IIterator[IKeyValuePair[String, IJsonValue]]],
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
    getView: CallbackTo[IMapView[String, IJsonValue]],
    hasKey: String => Boolean,
    insert: (String, IJsonValue) => Boolean,
    lookup: String => IJsonValue,
    remove: String => Callback,
    setNamedValue: (String, IJsonValue) => Callback,
    size: Double,
    stringify: CallbackTo[String],
    valueType: JsonValueType
  ): JsonObject = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, first = first.toJsFn, getArray = getArray.toJsFn, getBoolean = getBoolean.toJsFn, getNamedArray = js.Any.fromFunction1(getNamedArray), getNamedBoolean = js.Any.fromFunction1(getNamedBoolean), getNamedNumber = js.Any.fromFunction1(getNamedNumber), getNamedObject = js.Any.fromFunction1(getNamedObject), getNamedString = js.Any.fromFunction1(getNamedString), getNamedValue = js.Any.fromFunction1(getNamedValue), getNumber = getNumber.toJsFn, getObject = getObject.toJsFn, getString = getString.toJsFn, getView = getView.toJsFn, hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), setNamedValue = js.Any.fromFunction2((t0: String, t1: IJsonValue) => (setNamedValue(t0, t1)).runNow()), size = size.asInstanceOf[js.Any], stringify = stringify.toJsFn, valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonObject]
  }
}
