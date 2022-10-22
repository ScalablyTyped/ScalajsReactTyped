package typingsJapgolly.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceSetRequest extends StObject {
  
  /**
    * Name of a resource set.
    */
  var ResourceSetName: string
}
object DeleteResourceSetRequest {
  
  inline def apply(ResourceSetName: string): DeleteResourceSetRequest = {
    val __obj = js.Dynamic.literal(ResourceSetName = ResourceSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceSetRequest]
  }
  
  extension [Self <: DeleteResourceSetRequest](x: Self) {
    
    inline def setResourceSetName(value: string): Self = StObject.set(x, "ResourceSetName", value.asInstanceOf[js.Any])
  }
}
