package typingsJapgolly.storybookAddonKnobs.anon

import typingsJapgolly.react.mod.Validator
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesRadioMod.RadiosTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsInlineKnob extends StObject {
  
  var isInline: Validator[Boolean]
  
  var knob: Validator[RadiosTypeKnob]
  
  var onChange: Validator[
    js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
  ]
}
object IsInlineKnob {
  
  inline def apply(
    isInline: Validator[Boolean],
    knob: Validator[RadiosTypeKnob],
    onChange: Validator[
      js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
    ]
  ): IsInlineKnob = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsInlineKnob]
  }
  
  extension [Self <: IsInlineKnob](x: Self) {
    
    inline def setIsInline(value: Validator[Boolean]): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    inline def setKnob(value: Validator[RadiosTypeKnob]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setOnChange(
      value: Validator[
          js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
        ]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
  }
}
