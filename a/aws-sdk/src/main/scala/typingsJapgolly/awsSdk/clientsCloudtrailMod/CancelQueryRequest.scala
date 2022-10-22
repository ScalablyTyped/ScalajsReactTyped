package typingsJapgolly.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelQueryRequest extends StObject {
  
  /**
    * The ARN (or the ID suffix of the ARN) of an event data store on which the specified query is running.
    */
  var EventDataStore: EventDataStoreArn
  
  /**
    * The ID of the query that you want to cancel. The QueryId comes from the response of a StartQuery operation.
    */
  var QueryId: UUID
}
object CancelQueryRequest {
  
  inline def apply(EventDataStore: EventDataStoreArn, QueryId: UUID): CancelQueryRequest = {
    val __obj = js.Dynamic.literal(EventDataStore = EventDataStore.asInstanceOf[js.Any], QueryId = QueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelQueryRequest]
  }
  
  extension [Self <: CancelQueryRequest](x: Self) {
    
    inline def setEventDataStore(value: EventDataStoreArn): Self = StObject.set(x, "EventDataStore", value.asInstanceOf[js.Any])
    
    inline def setQueryId(value: UUID): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
  }
}
