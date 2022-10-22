package typingsJapgolly.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeServiceResponse extends StObject {
  
  /**
    * The unique ID of the asynchronous operation that this request started. You can use it combined with the ListOperations call to track the operation's progress.
    */
  var OperationId: js.UndefOr[UUID] = js.undefined
  
  /**
    * A description of the App Runner service that this request just resumed.
    */
  var Service: typingsJapgolly.awsSdk.clientsApprunnerMod.Service
}
object ResumeServiceResponse {
  
  inline def apply(Service: Service): ResumeServiceResponse = {
    val __obj = js.Dynamic.literal(Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeServiceResponse]
  }
  
  extension [Self <: ResumeServiceResponse](x: Self) {
    
    inline def setOperationId(value: UUID): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
    
    inline def setService(value: Service): Self = StObject.set(x, "Service", value.asInstanceOf[js.Any])
  }
}
