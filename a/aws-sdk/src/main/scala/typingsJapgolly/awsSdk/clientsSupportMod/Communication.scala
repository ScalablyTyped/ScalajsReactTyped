package typingsJapgolly.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Communication extends StObject {
  
  /**
    * Information about the attachments to the case communication.
    */
  var attachmentSet: js.UndefOr[AttachmentSet] = js.undefined
  
  /**
    * The text of the communication between the customer and Amazon Web Services Support.
    */
  var body: js.UndefOr[CommunicationBody] = js.undefined
  
  /**
    * The support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.undefined
  
  /**
    * The identity of the account that submitted, or responded to, the support case. Customer entries include the role or IAM user as well as the email address. For example, "AdminRole (Role) &lt;janedoe@example.com&gt;. Entries from the Amazon Web Services Support team display "Amazon Web Services," and don't show an email address. 
    */
  var submittedBy: js.UndefOr[SubmittedBy] = js.undefined
  
  /**
    * The time the communication was created.
    */
  var timeCreated: js.UndefOr[TimeCreated] = js.undefined
}
object Communication {
  
  inline def apply(): Communication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Communication]
  }
  
  extension [Self <: Communication](x: Self) {
    
    inline def setAttachmentSet(value: AttachmentSet): Self = StObject.set(x, "attachmentSet", value.asInstanceOf[js.Any])
    
    inline def setAttachmentSetUndefined: Self = StObject.set(x, "attachmentSet", js.undefined)
    
    inline def setAttachmentSetVarargs(value: AttachmentDetails*): Self = StObject.set(x, "attachmentSet", js.Array(value*))
    
    inline def setBody(value: CommunicationBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setCaseIdUndefined: Self = StObject.set(x, "caseId", js.undefined)
    
    inline def setSubmittedBy(value: SubmittedBy): Self = StObject.set(x, "submittedBy", value.asInstanceOf[js.Any])
    
    inline def setSubmittedByUndefined: Self = StObject.set(x, "submittedBy", js.undefined)
    
    inline def setTimeCreated(value: TimeCreated): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
  }
}
