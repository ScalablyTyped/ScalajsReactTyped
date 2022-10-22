package typingsJapgolly.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventIntegrationRequest extends StObject {
  
  /**
    * The description of the event inegration.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsAppintegrationsMod.Description] = js.undefined
  
  /**
    * The name of the event integration.
    */
  var Name: typingsJapgolly.awsSdk.clientsAppintegrationsMod.Name
}
object UpdateEventIntegrationRequest {
  
  inline def apply(Name: Name): UpdateEventIntegrationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventIntegrationRequest]
  }
  
  extension [Self <: UpdateEventIntegrationRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
