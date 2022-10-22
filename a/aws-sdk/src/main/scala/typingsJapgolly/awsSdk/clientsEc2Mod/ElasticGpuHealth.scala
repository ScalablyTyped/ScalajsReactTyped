package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticGpuHealth extends StObject {
  
  /**
    * The health status.
    */
  var Status: js.UndefOr[ElasticGpuStatus] = js.undefined
}
object ElasticGpuHealth {
  
  inline def apply(): ElasticGpuHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpuHealth]
  }
  
  extension [Self <: ElasticGpuHealth](x: Self) {
    
    inline def setStatus(value: ElasticGpuStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
