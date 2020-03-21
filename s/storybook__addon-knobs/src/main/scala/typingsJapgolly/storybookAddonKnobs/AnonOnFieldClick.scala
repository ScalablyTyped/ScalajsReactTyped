package typingsJapgolly.storybookAddonKnobs

import typingsJapgolly.react.mod.Validator
import typingsJapgolly.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnFieldClick extends js.Object {
  var knobs: Validator[js.Array[KnobStoreKnob]]
  var onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]]
  var onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]
}

object AnonOnFieldClick {
  @scala.inline
  def apply(
    knobs: Validator[js.Array[KnobStoreKnob]],
    onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]],
    onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]
  ): AnonOnFieldClick = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = onFieldChange.asInstanceOf[js.Any], onFieldClick = onFieldClick.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnFieldClick]
  }
}

