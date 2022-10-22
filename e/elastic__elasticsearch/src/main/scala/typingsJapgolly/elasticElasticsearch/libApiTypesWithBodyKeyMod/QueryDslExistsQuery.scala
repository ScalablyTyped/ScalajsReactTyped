package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslExistsQuery
  extends StObject
     with QueryDslQueryBase {
  
  var field: Field
}
object QueryDslExistsQuery {
  
  inline def apply(field: Field): QueryDslExistsQuery = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslExistsQuery]
  }
  
  extension [Self <: QueryDslExistsQuery](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
