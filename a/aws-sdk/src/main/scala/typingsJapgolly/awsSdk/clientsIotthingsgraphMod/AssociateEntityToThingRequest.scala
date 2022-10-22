package typingsJapgolly.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateEntityToThingRequest extends StObject {
  
  /**
    * The ID of the device to be associated with the thing. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME 
    */
  var entityId: Urn
  
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The name of the thing to which the entity is to be associated.
    */
  var thingName: ThingName
}
object AssociateEntityToThingRequest {
  
  inline def apply(entityId: Urn, thingName: ThingName): AssociateEntityToThingRequest = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateEntityToThingRequest]
  }
  
  extension [Self <: AssociateEntityToThingRequest](x: Self) {
    
    inline def setEntityId(value: Urn): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceVersion(value: Version): Self = StObject.set(x, "namespaceVersion", value.asInstanceOf[js.Any])
    
    inline def setNamespaceVersionUndefined: Self = StObject.set(x, "namespaceVersion", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
