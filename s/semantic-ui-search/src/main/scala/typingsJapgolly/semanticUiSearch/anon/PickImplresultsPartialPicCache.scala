package typingsJapgolly.semanticUiSearch.anon

import typingsJapgolly.semanticUiSearch.SemanticUI.Search.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl, 'results'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl>> */
trait PickImplresultsPartialPicCache
  extends StObject
     with Param {
  
  var cache: js.UndefOr[String] = js.undefined
  
  var results: String & js.UndefOr[String]
}
object PickImplresultsPartialPicCache {
  
  inline def apply(results: String & js.UndefOr[String]): PickImplresultsPartialPicCache = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplresultsPartialPicCache]
  }
  
  extension [Self <: PickImplresultsPartialPicCache](x: Self) {
    
    inline def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setResults(value: String & js.UndefOr[String]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
