package typingsJapgolly.meteor.meteorMod.Meteor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Login **/
/** Event **/
trait Event extends js.Object {
  var currentTarget: HTMLElement
  var target: HTMLElement
  var `type`: String
  var which: Double
  def isDefaultPrevented(): Boolean
  def isImmediatePropagationStopped(): Boolean
  def isPropagationStopped(): Boolean
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

object Event {
  @scala.inline
  def apply(
    currentTarget: HTMLElement,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    preventDefault: Callback,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: HTMLElement,
    `type`: String,
    which: Double
  ): Event = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

