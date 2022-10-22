package typingsJapgolly.storybookAddonKnobs.anon

import typingsJapgolly.react.mod.Validator
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  var knob: Validator[KnobControlConfig[String]]
  
  var onChange: Validator[js.Function1[/* value */ String, String]]
}
object OnChange {
  
  inline def apply(
    knob: Validator[KnobControlConfig[String]],
    onChange: Validator[js.Function1[/* value */ String, String]]
  ): OnChange = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange]
  }
  
  extension [Self <: OnChange](x: Self) {
    
    inline def setKnob(value: Validator[KnobControlConfig[String]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Validator[js.Function1[/* value */ String, String]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
