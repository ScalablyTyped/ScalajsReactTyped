package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typingsJapgolly.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import typingsJapgolly.storybookAddonKnobs.storybookAddonKnobsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHideLabel extends js.Object {
  var callback: ButtonTypeOnClickProp
  var hideLabel: `true`
}

object AnonHideLabel {
  @scala.inline
  def apply(callback: /* knob */ ButtonTypeKnob => CallbackTo[js.Any], hideLabel: `true`): AnonHideLabel = {
    val __obj = js.Dynamic.literal(hideLabel = hideLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* knob */ typingsJapgolly.storybookAddonKnobs.buttonMod.ButtonTypeKnob) => callback(t0).runNow()))
    __obj.asInstanceOf[AnonHideLabel]
  }
}

