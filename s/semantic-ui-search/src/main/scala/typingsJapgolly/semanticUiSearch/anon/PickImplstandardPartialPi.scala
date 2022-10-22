package typingsJapgolly.semanticUiSearch.anon

import typingsJapgolly.semanticUiSearch.SemanticUI.Search.TemplatesSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, 'standard'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl>> */
trait PickImplstandardPartialPi
  extends StObject
     with Param {
  
  var category: js.UndefOr[js.Function1[/* response */ Any, String]] = js.undefined
  
  var escape: js.UndefOr[js.Function1[/* string */ String, String]] = js.undefined
  
  var message: js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]] = js.undefined
  
  def standard(response: Any): String
  @JSName("standard")
  var standard_Original: (js.Function1[/* response */ Any, String]) & (js.UndefOr[js.Function1[/* response */ Any, String]])
}
object PickImplstandardPartialPi {
  
  inline def apply(
    standard: (js.Function1[/* response */ Any, String]) & (js.UndefOr[js.Function1[/* response */ Any, String]])
  ): PickImplstandardPartialPi = {
    val __obj = js.Dynamic.literal(standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstandardPartialPi]
  }
  
  extension [Self <: PickImplstandardPartialPi](x: Self) {
    
    inline def setCategory(value: /* response */ Any => String): Self = StObject.set(x, "category", js.Any.fromFunction1(value))
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setEscape(value: /* string */ String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setMessage(value: (/* message */ String, /* type */ String) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStandard(
      value: (js.Function1[/* response */ Any, String]) & (js.UndefOr[js.Function1[/* response */ Any, String]])
    ): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
  }
}
