package typingsJapgolly.storybookAddonKnobs.checkboxesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxesTypeProps
  extends KnobControlProps[CheckboxesTypeKnobValue]
     with CheckboxesWrapperProps {
  @JSName("knob")
  var knob_CheckboxesTypeProps: CheckboxesTypeKnob
}

object CheckboxesTypeProps {
  @scala.inline
  def apply(
    isInline: Boolean,
    knob: CheckboxesTypeKnob,
    onChange: CheckboxesTypeKnobValue => CallbackTo[CheckboxesTypeKnobValue]
  ): CheckboxesTypeProps = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.checkboxesMod.CheckboxesTypeKnobValue) => onChange(t0).runNow()))
    __obj.asInstanceOf[CheckboxesTypeProps]
  }
}

