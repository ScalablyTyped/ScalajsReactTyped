package typingsJapgolly.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact or escalation plan.
    */
  var ContactArn: SsmContactsArn
}
object GetContactPolicyRequest {
  
  inline def apply(ContactArn: SsmContactsArn): GetContactPolicyRequest = {
    val __obj = js.Dynamic.literal(ContactArn = ContactArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactPolicyRequest]
  }
  
  extension [Self <: GetContactPolicyRequest](x: Self) {
    
    inline def setContactArn(value: SsmContactsArn): Self = StObject.set(x, "ContactArn", value.asInstanceOf[js.Any])
  }
}
