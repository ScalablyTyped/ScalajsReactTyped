package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoprocessorWaitForJobCompletionOptions extends Object {
  /**
    * The time in millisecond between remote job status requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#waitForJobCompletion)
    *
    * @default 1000
    */
  var interval: js.UndefOr[js.Any] = js.undefined
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable asynchronous job. If canceled, the promise will be rejected with an error named `AbortError`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#waitForJobCompletion)
    */
  var signal: js.UndefOr[js.Any] = js.undefined
  /**
    * Callback function that is called at the specified interval. Use this method to monitor job status and messages.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#waitForJobCompletion)
    */
  var statusCallback: js.UndefOr[js.Any] = js.undefined
}

object GeoprocessorWaitForJobCompletionOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    interval: js.Any = null,
    signal: js.Any = null,
    statusCallback: js.Any = null
  ): GeoprocessorWaitForJobCompletionOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (statusCallback != null) __obj.updateDynamic("statusCallback")(statusCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoprocessorWaitForJobCompletionOptions]
  }
}

