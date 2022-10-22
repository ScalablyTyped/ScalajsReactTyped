package typingsJapgolly.awsSdk.anon

import typingsJapgolly.awsSdk.clientsProtonMod.ResourceName
import typingsJapgolly.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/proton.GetServiceInstanceInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetServiceInstanceInputwa extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of a service instance that you want to get the detailed data for.
    */
  var name: ResourceName
  
  /**
    * The name of the service that the service instance belongs to.
    */
  var serviceName: ResourceName
}
object GetServiceInstanceInputwa {
  
  inline def apply(name: ResourceName, serviceName: ResourceName): GetServiceInstanceInputwa = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceInstanceInputwa]
  }
  
  extension [Self <: GetServiceInstanceInputwa](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
