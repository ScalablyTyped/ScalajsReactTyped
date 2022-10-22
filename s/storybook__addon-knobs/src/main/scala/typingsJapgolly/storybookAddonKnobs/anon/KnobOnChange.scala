package typingsJapgolly.storybookAddonKnobs.anon

import typingsJapgolly.react.mod.Validator
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnobOnChange extends StObject {
  
  var knob: Validator[KnobControlConfig[Double]]
  
  var onChange: Validator[js.Function1[/* value */ Double, Double]]
}
object KnobOnChange {
  
  inline def apply(
    knob: Validator[KnobControlConfig[Double]],
    onChange: Validator[js.Function1[/* value */ Double, Double]]
  ): KnobOnChange = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobOnChange]
  }
  
  extension [Self <: KnobOnChange](x: Self) {
    
    inline def setKnob(value: Validator[KnobControlConfig[Double]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Validator[js.Function1[/* value */ Double, Double]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
