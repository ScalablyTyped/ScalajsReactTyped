package typingsJapgolly.storybookAddonKnobs.booleanMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanTypeProps extends KnobControlProps[BooleanTypeKnobValue] {
  @JSName("knob")
  var knob_BooleanTypeProps: BooleanTypeKnob
}

object BooleanTypeProps {
  @scala.inline
  def apply(knob: BooleanTypeKnob, onChange: BooleanTypeKnobValue => CallbackTo[BooleanTypeKnobValue]): BooleanTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.booleanMod.BooleanTypeKnobValue) => onChange(t0).runNow()))
    __obj.asInstanceOf[BooleanTypeProps]
  }
}

