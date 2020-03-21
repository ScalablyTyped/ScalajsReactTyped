package typingsJapgolly.storybookAddonKnobs.selectMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectTypeProps[T /* <: SelectTypeKnobValue */] extends KnobControlProps[T] {
  @JSName("knob")
  var knob_SelectTypeProps: SelectTypeKnob[T]
}

object SelectTypeProps {
  @scala.inline
  def apply[T /* <: SelectTypeKnobValue */](knob: SelectTypeKnob[T], onChange: T => CallbackTo[T]): SelectTypeProps[T] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: T) => onChange(t0).runNow()))
    __obj.asInstanceOf[SelectTypeProps[T]]
  }
}

