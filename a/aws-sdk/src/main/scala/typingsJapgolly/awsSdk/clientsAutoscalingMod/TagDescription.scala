package typingsJapgolly.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagDescription extends StObject {
  
  /**
    * The tag key.
    */
  var Key: js.UndefOr[TagKey] = js.undefined
  
  /**
    * Determines whether the tag is added to new instances as they are launched in the group.
    */
  var PropagateAtLaunch: js.UndefOr[typingsJapgolly.awsSdk.clientsAutoscalingMod.PropagateAtLaunch] = js.undefined
  
  /**
    * The name of the group.
    */
  var ResourceId: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The type of resource. The only supported value is auto-scaling-group.
    */
  var ResourceType: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The tag value.
    */
  var Value: js.UndefOr[TagValue] = js.undefined
}
object TagDescription {
  
  inline def apply(): TagDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagDescription]
  }
  
  extension [Self <: TagDescription](x: Self) {
    
    inline def setKey(value: TagKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setPropagateAtLaunch(value: PropagateAtLaunch): Self = StObject.set(x, "PropagateAtLaunch", value.asInstanceOf[js.Any])
    
    inline def setPropagateAtLaunchUndefined: Self = StObject.set(x, "PropagateAtLaunch", js.undefined)
    
    inline def setResourceId(value: XmlString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: XmlString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setValue(value: TagValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
