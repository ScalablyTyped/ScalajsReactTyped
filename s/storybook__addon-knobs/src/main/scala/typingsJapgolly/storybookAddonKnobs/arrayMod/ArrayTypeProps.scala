package typingsJapgolly.storybookAddonKnobs.arrayMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayTypeProps extends KnobControlProps[ArrayTypeKnobValue] {
  @JSName("knob")
  var knob_ArrayTypeProps: ArrayTypeKnob
}

object ArrayTypeProps {
  @scala.inline
  def apply(knob: ArrayTypeKnob, onChange: ArrayTypeKnobValue => CallbackTo[ArrayTypeKnobValue]): ArrayTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue) => onChange(t0).runNow()))
    __obj.asInstanceOf[ArrayTypeProps]
  }
}

