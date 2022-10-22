package typingsJapgolly.officeJs.Office

import typingsJapgolly.officeJs.Office.MailboxEnums.AttachmentStatus
import typingsJapgolly.officeJs.officeJsStrings.olkAttachmentsChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentsChangedEventArgs extends StObject {
  
  /**
    * Represents the set of attachments that were added or removed.
    * For each such attachment, gets `id`, `name`, `size`, and `attachmentType` properties.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    */
  var attachmentDetails: js.Array[js.Object]
  
  /**
    * Gets whether the attachments were added or removed. For details, refer to {@link Office.MailboxEnums.AttachmentStatus | MailboxEnums.AttachmentStatus}.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    */
  var attachmentStatus: AttachmentStatus | String
  
  /**
    * Gets the type of the event. For details, refer to {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType}.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    */
  var `type`: olkAttachmentsChanged
}
object AttachmentsChangedEventArgs {
  
  inline def apply(attachmentDetails: js.Array[js.Object], attachmentStatus: AttachmentStatus | String): AttachmentsChangedEventArgs = {
    val __obj = js.Dynamic.literal(attachmentDetails = attachmentDetails.asInstanceOf[js.Any], attachmentStatus = attachmentStatus.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("olkAttachmentsChanged")
    __obj.asInstanceOf[AttachmentsChangedEventArgs]
  }
  
  extension [Self <: AttachmentsChangedEventArgs](x: Self) {
    
    inline def setAttachmentDetails(value: js.Array[js.Object]): Self = StObject.set(x, "attachmentDetails", value.asInstanceOf[js.Any])
    
    inline def setAttachmentDetailsVarargs(value: js.Object*): Self = StObject.set(x, "attachmentDetails", js.Array(value*))
    
    inline def setAttachmentStatus(value: AttachmentStatus | String): Self = StObject.set(x, "attachmentStatus", value.asInstanceOf[js.Any])
    
    inline def setType(value: olkAttachmentsChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
