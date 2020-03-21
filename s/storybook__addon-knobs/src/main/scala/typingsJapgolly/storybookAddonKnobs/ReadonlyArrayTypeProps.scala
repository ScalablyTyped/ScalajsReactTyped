package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.arrayMod.ArrayTypeKnob
import typingsJapgolly.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Array.ArrayTypeProps> */
trait ReadonlyArrayTypeProps extends js.Object {
  val knob: ArrayTypeKnob
  val onChange: js.Function1[/* value */ ArrayTypeKnobValue, ArrayTypeKnobValue]
}

object ReadonlyArrayTypeProps {
  @scala.inline
  def apply(knob: ArrayTypeKnob, onChange: /* value */ ArrayTypeKnobValue => CallbackTo[ArrayTypeKnobValue]): ReadonlyArrayTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue) => onChange(t0).runNow()))
    __obj.asInstanceOf[ReadonlyArrayTypeProps]
  }
}

