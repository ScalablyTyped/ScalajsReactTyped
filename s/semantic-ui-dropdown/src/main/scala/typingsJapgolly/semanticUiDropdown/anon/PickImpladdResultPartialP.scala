package typingsJapgolly.semanticUiDropdown.anon

import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, 'addResult'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl>> */
trait PickImpladdResultPartialP
  extends StObject
     with Param {
  
  var addResult: String & js.UndefOr[String]
  
  var count: js.UndefOr[String] = js.undefined
  
  var maxSelections: js.UndefOr[String] = js.undefined
  
  var noResults: js.UndefOr[String] = js.undefined
}
object PickImpladdResultPartialP {
  
  inline def apply(addResult: String & js.UndefOr[String]): PickImpladdResultPartialP = {
    val __obj = js.Dynamic.literal(addResult = addResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpladdResultPartialP]
  }
  
  extension [Self <: PickImpladdResultPartialP](x: Self) {
    
    inline def setAddResult(value: String & js.UndefOr[String]): Self = StObject.set(x, "addResult", value.asInstanceOf[js.Any])
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setMaxSelections(value: String): Self = StObject.set(x, "maxSelections", value.asInstanceOf[js.Any])
    
    inline def setMaxSelectionsUndefined: Self = StObject.set(x, "maxSelections", js.undefined)
    
    inline def setNoResults(value: String): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
    
    inline def setNoResultsUndefined: Self = StObject.set(x, "noResults", js.undefined)
  }
}
