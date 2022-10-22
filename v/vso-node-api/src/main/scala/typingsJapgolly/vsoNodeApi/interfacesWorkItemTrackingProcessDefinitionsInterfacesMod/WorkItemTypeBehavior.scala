package typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeBehavior extends StObject {
  
  var behavior: WorkItemBehaviorReference
  
  var isDefault: Boolean
  
  var url: String
}
object WorkItemTypeBehavior {
  
  inline def apply(behavior: WorkItemBehaviorReference, isDefault: Boolean, url: String): WorkItemTypeBehavior = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeBehavior]
  }
  
  extension [Self <: WorkItemTypeBehavior](x: Self) {
    
    inline def setBehavior(value: WorkItemBehaviorReference): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
