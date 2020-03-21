package typingsJapgolly.storybookAddonKnobs.buttonMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonTypeProps
  extends KnobControlProps[scala.Nothing] {
  @JSName("knob")
  var knob_ButtonTypeProps: ButtonTypeKnob
  var onClick: ButtonTypeOnClickProp
}

object ButtonTypeProps {
  @scala.inline
  def apply(knob: ButtonTypeKnob, onClick: /* knob */ ButtonTypeKnob => CallbackTo[js.Any]): ButtonTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* knob */ typingsJapgolly.storybookAddonKnobs.buttonMod.ButtonTypeKnob) => onClick(t0).runNow()))
    __obj.asInstanceOf[ButtonTypeProps]
  }
}

