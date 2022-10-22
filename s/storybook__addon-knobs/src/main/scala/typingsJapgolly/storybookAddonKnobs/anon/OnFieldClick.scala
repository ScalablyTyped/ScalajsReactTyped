package typingsJapgolly.storybookAddonKnobs.anon

import typingsJapgolly.react.mod.Validator
import typingsJapgolly.storybookAddonKnobs.distKnobStoreMod.KnobStoreKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFieldClick extends StObject {
  
  var knobs: Validator[js.Array[KnobStoreKnob]]
  
  var onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]]
  
  var onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]
}
object OnFieldClick {
  
  inline def apply(
    knobs: Validator[js.Array[KnobStoreKnob]],
    onFieldChange: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]],
    onFieldClick: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]
  ): OnFieldClick = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = onFieldChange.asInstanceOf[js.Any], onFieldClick = onFieldClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFieldClick]
  }
  
  extension [Self <: OnFieldClick](x: Self) {
    
    inline def setKnobs(value: Validator[js.Array[KnobStoreKnob]]): Self = StObject.set(x, "knobs", value.asInstanceOf[js.Any])
    
    inline def setOnFieldChange(value: Validator[js.Function1[/* changedKnob */ KnobStoreKnob, Unit]]): Self = StObject.set(x, "onFieldChange", value.asInstanceOf[js.Any])
    
    inline def setOnFieldClick(value: Validator[js.Function1[/* knob */ KnobStoreKnob, Unit]]): Self = StObject.set(x, "onFieldClick", value.asInstanceOf[js.Any])
  }
}
