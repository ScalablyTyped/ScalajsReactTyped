package typingsJapgolly.svgPanZoom.SvgPanZoom_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEventHandler extends js.Object {
  var destroy: js.Function
  var haltEventListeners: js.Array[String]
  def init(options: CustomEventOptions): Unit
}

object CustomEventHandler {
  @scala.inline
  def apply(destroy: js.Function, haltEventListeners: js.Array[String], init: CustomEventOptions => Callback): CustomEventHandler = {
    val __obj = js.Dynamic.literal(destroy = destroy.asInstanceOf[js.Any], haltEventListeners = haltEventListeners.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.svgPanZoom.SvgPanZoom_.CustomEventOptions) => init(t0).runNow()))
    __obj.asInstanceOf[CustomEventHandler]
  }
}

