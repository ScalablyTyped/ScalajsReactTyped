package typingsJapgolly.semanticUiRating.anon

import typingsJapgolly.semanticUiRating.SemanticUI.Rating.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl, 'hover'> & std.Partial<std.Pick<semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl, keyof semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl>> */
trait PickImplhoverPartialPickI
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var hover: String & js.UndefOr[String]
  
  var loading: js.UndefOr[String] = js.undefined
}
object PickImplhoverPartialPickI {
  
  inline def apply(hover: String & js.UndefOr[String]): PickImplhoverPartialPickI = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhoverPartialPickI]
  }
  
  extension [Self <: PickImplhoverPartialPickI](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setHover(value: String & js.UndefOr[String]): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
  }
}
