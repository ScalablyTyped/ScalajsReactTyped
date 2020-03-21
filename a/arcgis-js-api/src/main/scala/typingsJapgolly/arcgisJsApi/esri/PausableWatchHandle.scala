package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PausableWatchHandle extends Object {
  /**
    * Pauses the handle preventing changes to invoke the associated callback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
    *
    *
    */
  def pause(): Unit
  /**
    * Removes the watch handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
    *
    *
    */
  def remove(): Unit
  /**
    * Resumes a paused the handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
    *
    *
    */
  def resume(): Unit
}

object PausableWatchHandle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    pause: Callback,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    remove: Callback,
    resume: Callback
  ): PausableWatchHandle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.asInstanceOf[PausableWatchHandle]
  }
}

