package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexRoutingAllocationInitialRecovery extends StObject {
  
  var _id: js.UndefOr[Id] = js.undefined
}
object IndicesIndexRoutingAllocationInitialRecovery {
  
  inline def apply(): IndicesIndexRoutingAllocationInitialRecovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexRoutingAllocationInitialRecovery]
  }
  
  extension [Self <: IndicesIndexRoutingAllocationInitialRecovery](x: Self) {
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
