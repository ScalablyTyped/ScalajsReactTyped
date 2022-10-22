package typingsJapgolly.mailchimpMailchimpTransactional.mod

import typingsJapgolly.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.rejected
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An array of objects for each recipient containing the key "email" with the email address,
  * and details of the message status for that recipient
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mailchimpMailchimpTransactional.mod.MessagesSendSuccessResponse
  - typingsJapgolly.mailchimpMailchimpTransactional.mod.MessagesSendRejectResponse
*/
trait MessagesSendResponse extends StObject
object MessagesSendResponse {
  
  inline def MessagesSendRejectResponse(_id: String, email: String, reject_reason: RejectReason): typingsJapgolly.mailchimpMailchimpTransactional.mod.MessagesSendRejectResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], reject_reason = reject_reason.asInstanceOf[js.Any], status = "rejected")
    __obj.asInstanceOf[typingsJapgolly.mailchimpMailchimpTransactional.mod.MessagesSendRejectResponse]
  }
  
  inline def MessagesSendSuccessResponse(_id: String, email: String, status: Exclude[SendingStatus, rejected]): typingsJapgolly.mailchimpMailchimpTransactional.mod.MessagesSendSuccessResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mailchimpMailchimpTransactional.mod.MessagesSendSuccessResponse]
  }
}
