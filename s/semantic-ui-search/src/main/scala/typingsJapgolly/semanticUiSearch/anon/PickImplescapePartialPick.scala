package typingsJapgolly.semanticUiSearch.anon

import typingsJapgolly.semanticUiSearch.SemanticUI.Search.TemplatesSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, 'escape'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl>> */
trait PickImplescapePartialPick
  extends StObject
     with Param {
  
  var category: js.UndefOr[js.Function1[/* response */ Any, String]] = js.undefined
  
  def escape(string: String): String
  @JSName("escape")
  var escape_Original: (js.Function1[/* string */ String, String]) & (js.UndefOr[js.Function1[/* string */ String, String]])
  
  var message: js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]] = js.undefined
  
  var standard: js.UndefOr[js.Function1[/* response */ Any, String]] = js.undefined
}
object PickImplescapePartialPick {
  
  inline def apply(
    escape: (js.Function1[/* string */ String, String]) & (js.UndefOr[js.Function1[/* string */ String, String]])
  ): PickImplescapePartialPick = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplescapePartialPick]
  }
  
  extension [Self <: PickImplescapePartialPick](x: Self) {
    
    inline def setCategory(value: /* response */ Any => String): Self = StObject.set(x, "category", js.Any.fromFunction1(value))
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setEscape(
      value: (js.Function1[/* string */ String, String]) & (js.UndefOr[js.Function1[/* string */ String, String]])
    ): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: (/* message */ String, /* type */ String) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStandard(value: /* response */ Any => String): Self = StObject.set(x, "standard", js.Any.fromFunction1(value))
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
