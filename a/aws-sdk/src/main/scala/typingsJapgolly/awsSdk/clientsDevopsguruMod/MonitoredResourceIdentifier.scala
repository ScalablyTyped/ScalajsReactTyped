package typingsJapgolly.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoredResourceIdentifier extends StObject {
  
  /**
    *  The name of the resource being monitored. 
    */
  var MonitoredResourceName: js.UndefOr[typingsJapgolly.awsSdk.clientsDevopsguruMod.MonitoredResourceName] = js.undefined
  
  /**
    *  The permission status of a resource. 
    */
  var ResourcePermission: js.UndefOr[typingsJapgolly.awsSdk.clientsDevopsguruMod.ResourcePermission] = js.undefined
  
  /**
    *  The type of resource being monitored. 
    */
  var Type: js.UndefOr[ResourceType] = js.undefined
}
object MonitoredResourceIdentifier {
  
  inline def apply(): MonitoredResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoredResourceIdentifier]
  }
  
  extension [Self <: MonitoredResourceIdentifier](x: Self) {
    
    inline def setMonitoredResourceName(value: MonitoredResourceName): Self = StObject.set(x, "MonitoredResourceName", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceNameUndefined: Self = StObject.set(x, "MonitoredResourceName", js.undefined)
    
    inline def setResourcePermission(value: ResourcePermission): Self = StObject.set(x, "ResourcePermission", value.asInstanceOf[js.Any])
    
    inline def setResourcePermissionUndefined: Self = StObject.set(x, "ResourcePermission", js.undefined)
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
