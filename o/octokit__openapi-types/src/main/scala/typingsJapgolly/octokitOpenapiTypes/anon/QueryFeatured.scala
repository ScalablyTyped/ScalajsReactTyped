package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFeatured extends StObject {
  
  var query: Featured
}
object QueryFeatured {
  
  inline def apply(query: Featured): QueryFeatured = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFeatured]
  }
  
  extension [Self <: QueryFeatured](x: Self) {
    
    inline def setQuery(value: Featured): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
