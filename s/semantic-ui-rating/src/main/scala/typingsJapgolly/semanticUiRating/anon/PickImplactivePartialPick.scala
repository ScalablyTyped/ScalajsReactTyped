package typingsJapgolly.semanticUiRating.anon

import typingsJapgolly.semanticUiRating.SemanticUI.Rating.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl, 'active'> & std.Partial<std.Pick<semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl, keyof semantic-ui-rating.SemanticUI.Rating.ClassNameSettings._Impl>> */
trait PickImplactivePartialPick
  extends StObject
     with Param {
  
  var active: String & js.UndefOr[String]
  
  var hover: js.UndefOr[String] = js.undefined
  
  var loading: js.UndefOr[String] = js.undefined
}
object PickImplactivePartialPick {
  
  inline def apply(active: String & js.UndefOr[String]): PickImplactivePartialPick = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactivePartialPick]
  }
  
  extension [Self <: PickImplactivePartialPick](x: Self) {
    
    inline def setActive(value: String & js.UndefOr[String]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
  }
}
