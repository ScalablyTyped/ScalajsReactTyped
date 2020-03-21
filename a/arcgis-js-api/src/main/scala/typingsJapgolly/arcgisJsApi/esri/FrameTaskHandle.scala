package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameTaskHandle extends Object {
  /**
    * Pause the execution the frame task at every frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    *
    *
    */
  def pause(): Unit
  /**
    * Removes the frame task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    *
    *
    */
  def remove(): Unit
  /**
    * Resumes the execution the frame task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    *
    *
    */
  def resume(): Unit
}

object FrameTaskHandle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    pause: Callback,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    remove: Callback,
    resume: Callback
  ): FrameTaskHandle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.asInstanceOf[FrameTaskHandle]
  }
}

