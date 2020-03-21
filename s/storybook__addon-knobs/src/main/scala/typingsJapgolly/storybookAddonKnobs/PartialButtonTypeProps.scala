package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.buttonMod.ButtonTypeKnob
import typingsJapgolly.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Button.ButtonTypeProps> */
trait PartialButtonTypeProps extends js.Object {
  var knob: js.UndefOr[ButtonTypeKnob] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Nothing, scala.Nothing]] = js.undefined
  var onClick: js.UndefOr[ButtonTypeOnClickProp] = js.undefined
}

object PartialButtonTypeProps {
  @scala.inline
  def apply(knob: ButtonTypeKnob = null, onClick: /* knob */ ButtonTypeKnob => CallbackTo[js.Any] = null): PartialButtonTypeProps = {
    val __obj = js.Dynamic.literal()
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* knob */ typingsJapgolly.storybookAddonKnobs.buttonMod.ButtonTypeKnob) => onClick(t0).runNow()))
    __obj.asInstanceOf[PartialButtonTypeProps]
  }
}

