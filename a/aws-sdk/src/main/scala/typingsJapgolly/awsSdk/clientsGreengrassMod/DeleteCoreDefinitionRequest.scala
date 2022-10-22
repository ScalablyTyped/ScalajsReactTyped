package typingsJapgolly.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoreDefinitionRequest extends StObject {
  
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string
}
object DeleteCoreDefinitionRequest {
  
  inline def apply(CoreDefinitionId: string): DeleteCoreDefinitionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCoreDefinitionRequest]
  }
  
  extension [Self <: DeleteCoreDefinitionRequest](x: Self) {
    
    inline def setCoreDefinitionId(value: string): Self = StObject.set(x, "CoreDefinitionId", value.asInstanceOf[js.Any])
  }
}
