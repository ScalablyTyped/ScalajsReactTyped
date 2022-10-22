package typingsJapgolly.semanticUiSearch.anon

import typingsJapgolly.semanticUiSearch.SemanticUI.Search.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, 'source'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl>> */
trait PickImplsourcePartialPickLogging
  extends StObject
     with Param {
  
  var logging: js.UndefOr[String] = js.undefined
  
  var maxResults: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var noResults: js.UndefOr[String] = js.undefined
  
  var noTemplate: js.UndefOr[String] = js.undefined
  
  var serverError: js.UndefOr[String] = js.undefined
  
  var source: String & js.UndefOr[String]
}
object PickImplsourcePartialPickLogging {
  
  inline def apply(source: String & js.UndefOr[String]): PickImplsourcePartialPickLogging = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsourcePartialPickLogging]
  }
  
  extension [Self <: PickImplsourcePartialPickLogging](x: Self) {
    
    inline def setLogging(value: String): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMaxResults(value: String): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoResults(value: String): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
    
    inline def setNoResultsUndefined: Self = StObject.set(x, "noResults", js.undefined)
    
    inline def setNoTemplate(value: String): Self = StObject.set(x, "noTemplate", value.asInstanceOf[js.Any])
    
    inline def setNoTemplateUndefined: Self = StObject.set(x, "noTemplate", js.undefined)
    
    inline def setServerError(value: String): Self = StObject.set(x, "serverError", value.asInstanceOf[js.Any])
    
    inline def setServerErrorUndefined: Self = StObject.set(x, "serverError", js.undefined)
    
    inline def setSource(value: String & js.UndefOr[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
