package typingsJapgolly.storybookAddonKnobs.radioMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadiosTypeProps
  extends KnobControlProps[RadiosTypeKnobValue]
     with RadiosWrapperProps {
  @JSName("knob")
  var knob_RadiosTypeProps: RadiosTypeKnob
}

object RadiosTypeProps {
  @scala.inline
  def apply(
    isInline: Boolean,
    knob: RadiosTypeKnob,
    onChange: RadiosTypeKnobValue => CallbackTo[RadiosTypeKnobValue]
  ): RadiosTypeProps = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.radioMod.RadiosTypeKnobValue) => onChange(t0).runNow()))
    __obj.asInstanceOf[RadiosTypeProps]
  }
}

