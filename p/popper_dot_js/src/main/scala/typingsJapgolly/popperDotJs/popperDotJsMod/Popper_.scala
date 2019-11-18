package typingsJapgolly.popperDotJs.popperDotJsMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Popper")
trait Popper_ extends js.Object {
  var options: PopperOptions
  var popper: Element
  var reference: Element | ReferenceObject
  def destroy(): Unit
  def disableEventListeners(): Unit
  def enableEventListeners(): Unit
  def scheduleUpdate(): Unit
  def update(): Unit
}

object Popper_ {
  @scala.inline
  def apply(
    destroy: Callback,
    disableEventListeners: Callback,
    enableEventListeners: Callback,
    options: PopperOptions,
    popper: Element,
    reference: Element | ReferenceObject,
    scheduleUpdate: Callback,
    update: Callback
  ): Popper_ = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disableEventListeners")(disableEventListeners.toJsFn)
    __obj.updateDynamic("enableEventListeners")(enableEventListeners.toJsFn)
    __obj.updateDynamic("scheduleUpdate")(scheduleUpdate.toJsFn)
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[Popper_]
  }
}

