package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupGetRollupIndexCapsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: Ids
}
object RollupGetRollupIndexCapsRequest {
  
  inline def apply(index: Ids): RollupGetRollupIndexCapsRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupGetRollupIndexCapsRequest]
  }
  
  extension [Self <: RollupGetRollupIndexCapsRequest](x: Self) {
    
    inline def setIndex(value: Ids): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: Id*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
