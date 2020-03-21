package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhaseEvent extends Object {
  /**
    * The elapsed time since the last animation frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var deltaTime: Double
  /**
    * The amount of time spent within the current animation frame. This can be used for budgeting (e.g. some tasks may already have run).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var elapsedFrameTime: Double
  /**
    * The absolute time at the start of the current animation frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var time: Double
}

object PhaseEvent {
  @scala.inline
  def apply(
    constructor: js.Function,
    deltaTime: Double,
    elapsedFrameTime: Double,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    time: Double
  ): PhaseEvent = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], deltaTime = deltaTime.asInstanceOf[js.Any], elapsedFrameTime = elapsedFrameTime.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[PhaseEvent]
  }
}

