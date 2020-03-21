package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EachAlwaysResult extends Object {
  /**
    * The error with which the promise rejected. Defined only if the promise rejected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
    */
  var error: js.UndefOr[js.Any] = js.undefined
  /**
    * The promise that has been fulfilled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
    */
  var promise: js.Promise[_]
  /**
    * The value with which the promise resolved. Defined only if the promise resolved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object EachAlwaysResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    promise: js.Promise[_],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    error: js.Any = null,
    value: js.Any = null
  ): EachAlwaysResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachAlwaysResult]
  }
}

