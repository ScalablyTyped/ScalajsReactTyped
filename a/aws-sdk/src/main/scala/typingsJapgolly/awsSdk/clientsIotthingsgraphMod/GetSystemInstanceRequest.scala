package typingsJapgolly.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSystemInstanceRequest extends StObject {
  
  /**
    * The ID of the system deployment instance. This value is returned by CreateSystemInstance. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:deployment:DEPLOYMENTNAME 
    */
  var id: Urn
}
object GetSystemInstanceRequest {
  
  inline def apply(id: Urn): GetSystemInstanceRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSystemInstanceRequest]
  }
  
  extension [Self <: GetSystemInstanceRequest](x: Self) {
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
