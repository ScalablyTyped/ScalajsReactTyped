package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceUri extends StObject {
  
  /**
    * The type of the resource.
    */
  var ResourceType: js.UndefOr[typingsJapgolly.awsSdk.clientsGlueMod.ResourceType] = js.undefined
  
  /**
    * The URI for accessing the resource.
    */
  var Uri: js.UndefOr[URI] = js.undefined
}
object ResourceUri {
  
  inline def apply(): ResourceUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUri]
  }
  
  extension [Self <: ResourceUri](x: Self) {
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setUri(value: URI): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "Uri", js.undefined)
  }
}
