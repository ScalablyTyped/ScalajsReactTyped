package typingsJapgolly.storybookAddonKnobs

import typingsJapgolly.react.mod.Validator
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKnobOnChange extends js.Object {
  var knob: Validator[KnobControlConfig[Double]]
  var onChange: Validator[js.Function1[/* value */ Double, Double]]
}

object AnonKnobOnChange {
  @scala.inline
  def apply(
    knob: Validator[KnobControlConfig[Double]],
    onChange: Validator[js.Function1[/* value */ Double, Double]]
  ): AnonKnobOnChange = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKnobOnChange]
  }
}

