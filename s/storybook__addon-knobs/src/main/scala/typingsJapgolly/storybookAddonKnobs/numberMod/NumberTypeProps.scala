package typingsJapgolly.storybookAddonKnobs.numberMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberTypeProps extends KnobControlProps[NumberTypeKnobValue | Null] {
  @JSName("knob")
  var knob_NumberTypeProps: NumberTypeKnob
}

object NumberTypeProps {
  @scala.inline
  def apply(
    knob: NumberTypeKnob,
    onChange: NumberTypeKnobValue | Null => CallbackTo[NumberTypeKnobValue | Null]
  ): NumberTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.numberMod.NumberTypeKnobValue | scala.Null) => onChange(t0).runNow()))
    __obj.asInstanceOf[NumberTypeProps]
  }
}

