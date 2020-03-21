package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnFieldChange extends js.Object {
  var knobs: js.Array[KnobStoreKnob]
  def onFieldChange(): Unit
  def onFieldClick(): Unit
}

object AnonOnFieldChange {
  @scala.inline
  def apply(knobs: js.Array[KnobStoreKnob], onFieldChange: Callback, onFieldClick: Callback): AnonOnFieldChange = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
    __obj.updateDynamic("onFieldChange")(onFieldChange.toJsFn)
    __obj.updateDynamic("onFieldClick")(onFieldClick.toJsFn)
    __obj.asInstanceOf[AnonOnFieldChange]
  }
}

