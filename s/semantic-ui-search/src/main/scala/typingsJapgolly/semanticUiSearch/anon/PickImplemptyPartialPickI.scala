package typingsJapgolly.semanticUiSearch.anon

import typingsJapgolly.semanticUiSearch.SemanticUI.Search.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl, 'empty'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl>> */
trait PickImplemptyPartialPickI
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var empty: String & js.UndefOr[String]
  
  var focus: js.UndefOr[String] = js.undefined
  
  var loading: js.UndefOr[String] = js.undefined
  
  var pressed: js.UndefOr[String] = js.undefined
}
object PickImplemptyPartialPickI {
  
  inline def apply(empty: String & js.UndefOr[String]): PickImplemptyPartialPickI = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplemptyPartialPickI]
  }
  
  extension [Self <: PickImplemptyPartialPickI](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setEmpty(value: String & js.UndefOr[String]): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setPressed(value: String): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
  }
}
