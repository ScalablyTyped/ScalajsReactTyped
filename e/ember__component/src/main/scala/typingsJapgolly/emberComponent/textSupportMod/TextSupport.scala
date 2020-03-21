package typingsJapgolly.emberComponent.textSupportMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.emberComponent.targetActionSupportMod.TargetActionSupport
import typingsJapgolly.emberComponent.targetActionSupportMod.TriggerActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `TextSupport` is a shared mixin used by both `Ember.TextField` and
  * `Ember.TextArea`. `TextSupport` adds a number of methods that allow you to
  * specify a controller action to invoke when a certain event is fired on your
  * text field or textarea. The specifed controller action would get the current
  * value of the field passed in as the only argument unless the value of
  * the field is empty. In that case, the instance of the field itself is passed
  * in as the only argument.
  */
trait TextSupport extends TargetActionSupport {
  var action: String
  var bubbles: Boolean
  var onEvent: String
  // tslint:disable-next-line:ban-types
  def cancel(event: js.Function): Unit
  // tslint:disable-next-line:ban-types
  def focusIn(event: js.Function): Unit
  // tslint:disable-next-line:ban-types
  def focusOut(event: js.Function): Unit
  // tslint:disable-next-line:ban-types
  def insertNewLine(event: js.Function): Unit
  // tslint:disable-next-line:ban-types
  def keyPress(event: js.Function): Unit
}

object TextSupport {
  @scala.inline
  def apply(
    action: String,
    bubbles: Boolean,
    cancel: js.Function => Callback,
    focusIn: js.Function => Callback,
    focusOut: js.Function => Callback,
    insertNewLine: js.Function => Callback,
    keyPress: js.Function => Callback,
    onEvent: String,
    triggerAction: TriggerActionOptions => CallbackTo[Boolean]
  ): TextSupport = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], onEvent = onEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: js.Function) => cancel(t0).runNow()))
    __obj.updateDynamic("focusIn")(js.Any.fromFunction1((t0: js.Function) => focusIn(t0).runNow()))
    __obj.updateDynamic("focusOut")(js.Any.fromFunction1((t0: js.Function) => focusOut(t0).runNow()))
    __obj.updateDynamic("insertNewLine")(js.Any.fromFunction1((t0: js.Function) => insertNewLine(t0).runNow()))
    __obj.updateDynamic("keyPress")(js.Any.fromFunction1((t0: js.Function) => keyPress(t0).runNow()))
    __obj.updateDynamic("triggerAction")(js.Any.fromFunction1((t0: typingsJapgolly.emberComponent.targetActionSupportMod.TriggerActionOptions) => triggerAction(t0).runNow()))
    __obj.asInstanceOf[TextSupport]
  }
}

