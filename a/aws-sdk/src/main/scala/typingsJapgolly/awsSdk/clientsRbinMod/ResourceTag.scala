package typingsJapgolly.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTag extends StObject {
  
  /**
    * The tag key.
    */
  var ResourceTagKey: typingsJapgolly.awsSdk.clientsRbinMod.ResourceTagKey
  
  /**
    * The tag value.
    */
  var ResourceTagValue: js.UndefOr[typingsJapgolly.awsSdk.clientsRbinMod.ResourceTagValue] = js.undefined
}
object ResourceTag {
  
  inline def apply(ResourceTagKey: ResourceTagKey): ResourceTag = {
    val __obj = js.Dynamic.literal(ResourceTagKey = ResourceTagKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTag]
  }
  
  extension [Self <: ResourceTag](x: Self) {
    
    inline def setResourceTagKey(value: ResourceTagKey): Self = StObject.set(x, "ResourceTagKey", value.asInstanceOf[js.Any])
    
    inline def setResourceTagValue(value: ResourceTagValue): Self = StObject.set(x, "ResourceTagValue", value.asInstanceOf[js.Any])
    
    inline def setResourceTagValueUndefined: Self = StObject.set(x, "ResourceTagValue", js.undefined)
  }
}
