package typingsJapgolly.storybookAddonKnobs.typesTypesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobControlProps[T] extends js.Object {
  var knob: KnobControlConfig[T]
  def onChange(value: T): T
}

object KnobControlProps {
  @scala.inline
  def apply[T](knob: KnobControlConfig[T], onChange: T => CallbackTo[T]): KnobControlProps[T] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: T) => onChange(t0).runNow()))
    __obj.asInstanceOf[KnobControlProps[T]]
  }
}

