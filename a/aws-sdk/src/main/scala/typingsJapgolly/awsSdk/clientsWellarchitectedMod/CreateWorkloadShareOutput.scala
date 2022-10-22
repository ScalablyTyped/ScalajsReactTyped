package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkloadShareOutput extends StObject {
  
  var ShareId: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.ShareId] = js.undefined
  
  var WorkloadId: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
}
object CreateWorkloadShareOutput {
  
  inline def apply(): CreateWorkloadShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkloadShareOutput]
  }
  
  extension [Self <: CreateWorkloadShareOutput](x: Self) {
    
    inline def setShareId(value: ShareId): Self = StObject.set(x, "ShareId", value.asInstanceOf[js.Any])
    
    inline def setShareIdUndefined: Self = StObject.set(x, "ShareId", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
  }
}
