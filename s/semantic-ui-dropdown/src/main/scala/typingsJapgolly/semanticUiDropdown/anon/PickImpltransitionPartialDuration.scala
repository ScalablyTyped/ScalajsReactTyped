package typingsJapgolly.semanticUiDropdown.anon

import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings.Param
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl, 'transition'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.LabelSettings._Impl>> */
trait PickImpltransitionPartialDuration
  extends StObject
     with Param {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var transition: String & js.UndefOr[String]
  
  var variation: js.UndefOr[`false` | String] = js.undefined
}
object PickImpltransitionPartialDuration {
  
  inline def apply(transition: String & js.UndefOr[String]): PickImpltransitionPartialDuration = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltransitionPartialDuration]
  }
  
  extension [Self <: PickImpltransitionPartialDuration](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTransition(value: String & js.UndefOr[String]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setVariation(value: `false` | String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}
