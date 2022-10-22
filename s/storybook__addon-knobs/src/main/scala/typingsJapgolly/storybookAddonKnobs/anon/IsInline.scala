package typingsJapgolly.storybookAddonKnobs.anon

import typingsJapgolly.react.mod.Validator
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesCheckboxesMod.CheckboxesTypeKnob
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesCheckboxesMod.CheckboxesTypeKnobValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsInline extends StObject {
  
  var isInline: Validator[Boolean]
  
  var knob: Validator[CheckboxesTypeKnob]
  
  var onChange: Validator[js.Function1[/* value */ CheckboxesTypeKnobValue, CheckboxesTypeKnobValue]]
}
object IsInline {
  
  inline def apply(
    isInline: Validator[Boolean],
    knob: Validator[CheckboxesTypeKnob],
    onChange: Validator[js.Function1[/* value */ CheckboxesTypeKnobValue, CheckboxesTypeKnobValue]]
  ): IsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInline]
  }
  
  extension [Self <: IsInline](x: Self) {
    
    inline def setIsInline(value: Validator[Boolean]): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    inline def setKnob(value: Validator[CheckboxesTypeKnob]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Validator[js.Function1[/* value */ CheckboxesTypeKnobValue, CheckboxesTypeKnobValue]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
