package typingsJapgolly.storybookAddonKnobs

import typingsJapgolly.react.mod.Validator
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnChange extends js.Object {
  var knob: Validator[KnobControlConfig[String]]
  var onChange: Validator[js.Function1[/* value */ String, String]]
}

object AnonOnChange {
  @scala.inline
  def apply(
    knob: Validator[KnobControlConfig[String]],
    onChange: Validator[js.Function1[/* value */ String, String]]
  ): AnonOnChange = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnChange]
  }
}

