package typingsJapgolly.semanticUiTab.anon

import typingsJapgolly.semanticUiTab.SemanticUI.Tab.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'path'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl>> */
trait PickImplpathPartialPickImApi
  extends StObject
     with Param {
  
  var api: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var missingTab: js.UndefOr[String] = js.undefined
  
  var noContent: js.UndefOr[String] = js.undefined
  
  var path: String & js.UndefOr[String]
  
  var recursion: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object PickImplpathPartialPickImApi {
  
  inline def apply(path: String & js.UndefOr[String]): PickImplpathPartialPickImApi = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpathPartialPickImApi]
  }
  
  extension [Self <: PickImplpathPartialPickImApi](x: Self) {
    
    inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMissingTab(value: String): Self = StObject.set(x, "missingTab", value.asInstanceOf[js.Any])
    
    inline def setMissingTabUndefined: Self = StObject.set(x, "missingTab", js.undefined)
    
    inline def setNoContent(value: String): Self = StObject.set(x, "noContent", value.asInstanceOf[js.Any])
    
    inline def setNoContentUndefined: Self = StObject.set(x, "noContent", js.undefined)
    
    inline def setPath(value: String & js.UndefOr[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRecursion(value: String): Self = StObject.set(x, "recursion", value.asInstanceOf[js.Any])
    
    inline def setRecursionUndefined: Self = StObject.set(x, "recursion", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
