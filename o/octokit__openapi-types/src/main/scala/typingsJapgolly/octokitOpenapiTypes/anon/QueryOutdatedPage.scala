package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOutdatedPage extends StObject {
  
  var query: OutdatedPage
}
object QueryOutdatedPage {
  
  inline def apply(query: OutdatedPage): QueryOutdatedPage = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOutdatedPage]
  }
  
  extension [Self <: QueryOutdatedPage](x: Self) {
    
    inline def setQuery(value: OutdatedPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
