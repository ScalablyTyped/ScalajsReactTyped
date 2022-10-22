package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkloadIdentityConfig extends StObject {
  
  /** The workload pool to attach all Kubernetes service accounts to. */
  var workloadPool: js.UndefOr[String] = js.undefined
}
object WorkloadIdentityConfig {
  
  inline def apply(): WorkloadIdentityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkloadIdentityConfig]
  }
  
  extension [Self <: WorkloadIdentityConfig](x: Self) {
    
    inline def setWorkloadPool(value: String): Self = StObject.set(x, "workloadPool", value.asInstanceOf[js.Any])
    
    inline def setWorkloadPoolUndefined: Self = StObject.set(x, "workloadPool", js.undefined)
  }
}
