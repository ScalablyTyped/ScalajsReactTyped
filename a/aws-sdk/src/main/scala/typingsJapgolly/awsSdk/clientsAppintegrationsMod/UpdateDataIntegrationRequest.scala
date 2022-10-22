package typingsJapgolly.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataIntegrationRequest extends StObject {
  
  /**
    * A description of the DataIntegration.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsAppintegrationsMod.Description] = js.undefined
  
  /**
    * A unique identifier for the DataIntegration.
    */
  var Identifier: typingsJapgolly.awsSdk.clientsAppintegrationsMod.Identifier
  
  /**
    * The name of the DataIntegration.
    */
  var Name: js.UndefOr[typingsJapgolly.awsSdk.clientsAppintegrationsMod.Name] = js.undefined
}
object UpdateDataIntegrationRequest {
  
  inline def apply(Identifier: Identifier): UpdateDataIntegrationRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataIntegrationRequest]
  }
  
  extension [Self <: UpdateDataIntegrationRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
