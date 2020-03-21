package typingsJapgolly.storybookAddonKnobs.propFormMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropFormProps extends js.Object {
  var knobs: js.Array[KnobStoreKnob]
  def onFieldChange(changedKnob: KnobStoreKnob): Unit
  def onFieldClick(knob: KnobStoreKnob): Unit
}

object PropFormProps {
  @scala.inline
  def apply(
    knobs: js.Array[KnobStoreKnob],
    onFieldChange: KnobStoreKnob => Callback,
    onFieldClick: KnobStoreKnob => Callback
  ): PropFormProps = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any])
    __obj.updateDynamic("onFieldChange")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.knobStoreMod.KnobStoreKnob) => onFieldChange(t0).runNow()))
    __obj.updateDynamic("onFieldClick")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonKnobs.knobStoreMod.KnobStoreKnob) => onFieldClick(t0).runNow()))
    __obj.asInstanceOf[PropFormProps]
  }
}

