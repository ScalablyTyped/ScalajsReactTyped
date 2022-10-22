package typingsJapgolly.semanticUiDropdown.anon

import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, 'count'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl>> */
trait PickImplcountPartialPickI
  extends StObject
     with Param {
  
  var addResult: js.UndefOr[String] = js.undefined
  
  var count: String & js.UndefOr[String]
  
  var maxSelections: js.UndefOr[String] = js.undefined
  
  var noResults: js.UndefOr[String] = js.undefined
}
object PickImplcountPartialPickI {
  
  inline def apply(count: String & js.UndefOr[String]): PickImplcountPartialPickI = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcountPartialPickI]
  }
  
  extension [Self <: PickImplcountPartialPickI](x: Self) {
    
    inline def setAddResult(value: String): Self = StObject.set(x, "addResult", value.asInstanceOf[js.Any])
    
    inline def setAddResultUndefined: Self = StObject.set(x, "addResult", js.undefined)
    
    inline def setCount(value: String & js.UndefOr[String]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMaxSelections(value: String): Self = StObject.set(x, "maxSelections", value.asInstanceOf[js.Any])
    
    inline def setMaxSelectionsUndefined: Self = StObject.set(x, "maxSelections", js.undefined)
    
    inline def setNoResults(value: String): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
    
    inline def setNoResultsUndefined: Self = StObject.set(x, "noResults", js.undefined)
  }
}
