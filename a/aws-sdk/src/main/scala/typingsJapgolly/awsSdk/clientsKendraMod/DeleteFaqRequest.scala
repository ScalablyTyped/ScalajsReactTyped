package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFaqRequest extends StObject {
  
  /**
    * The identifier of the FAQ you want to remove.
    */
  var Id: FaqId
  
  /**
    * The identifier of the index for the FAQ.
    */
  var IndexId: typingsJapgolly.awsSdk.clientsKendraMod.IndexId
}
object DeleteFaqRequest {
  
  inline def apply(Id: FaqId, IndexId: IndexId): DeleteFaqRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFaqRequest]
  }
  
  extension [Self <: DeleteFaqRequest](x: Self) {
    
    inline def setId(value: FaqId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
