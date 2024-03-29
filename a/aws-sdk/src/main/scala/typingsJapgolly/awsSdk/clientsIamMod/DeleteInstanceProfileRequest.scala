package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInstanceProfileRequest extends StObject {
  
  /**
    * The name of the instance profile to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var InstanceProfileName: instanceProfileNameType
}
object DeleteInstanceProfileRequest {
  
  inline def apply(InstanceProfileName: instanceProfileNameType): DeleteInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceProfileRequest]
  }
  
  extension [Self <: DeleteInstanceProfileRequest](x: Self) {
    
    inline def setInstanceProfileName(value: instanceProfileNameType): Self = StObject.set(x, "InstanceProfileName", value.asInstanceOf[js.Any])
  }
}
