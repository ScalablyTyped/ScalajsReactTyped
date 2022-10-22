package typingsJapgolly.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppInstanceUserRequest extends StObject {
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: ChimeArn
  
  /**
    * The metadata of the AppInstanceUser.
    */
  var Metadata: typingsJapgolly.awsSdk.clientsChimesdkidentityMod.Metadata
  
  /**
    * The name of the AppInstanceUser.
    */
  var Name: UserName
}
object UpdateAppInstanceUserRequest {
  
  inline def apply(AppInstanceUserArn: ChimeArn, Metadata: Metadata, Name: UserName): UpdateAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppInstanceUserRequest]
  }
  
  extension [Self <: UpdateAppInstanceUserRequest](x: Self) {
    
    inline def setAppInstanceUserArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: UserName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
