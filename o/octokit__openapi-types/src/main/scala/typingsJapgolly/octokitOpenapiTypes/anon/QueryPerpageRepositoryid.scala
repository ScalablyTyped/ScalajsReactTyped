package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPerpageRepositoryid extends StObject {
  
  var query: PerpageRepositoryid
}
object QueryPerpageRepositoryid {
  
  inline def apply(query: PerpageRepositoryid): QueryPerpageRepositoryid = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPerpageRepositoryid]
  }
  
  extension [Self <: QueryPerpageRepositoryid](x: Self) {
    
    inline def setQuery(value: PerpageRepositoryid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
