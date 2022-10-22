package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstancePortStatesRequest extends StObject {
  
  /**
    * The name of the instance for which to return firewall port states.
    */
  var instanceName: ResourceName
}
object GetInstancePortStatesRequest {
  
  inline def apply(instanceName: ResourceName): GetInstancePortStatesRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancePortStatesRequest]
  }
  
  extension [Self <: GetInstancePortStatesRequest](x: Self) {
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
