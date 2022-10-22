package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslSpanWithinQuery
  extends StObject
     with QueryDslQueryBase {
  
  var big: QueryDslSpanQuery
  
  var little: QueryDslSpanQuery
}
object QueryDslSpanWithinQuery {
  
  inline def apply(big: QueryDslSpanQuery, little: QueryDslSpanQuery): QueryDslSpanWithinQuery = {
    val __obj = js.Dynamic.literal(big = big.asInstanceOf[js.Any], little = little.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslSpanWithinQuery]
  }
  
  extension [Self <: QueryDslSpanWithinQuery](x: Self) {
    
    inline def setBig(value: QueryDslSpanQuery): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
    
    inline def setLittle(value: QueryDslSpanQuery): Self = StObject.set(x, "little", value.asInstanceOf[js.Any])
  }
}
