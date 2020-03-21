package typingsJapgolly.officeJsPreview.Office

import typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an attachment on an item from the server. Read mode only.
  *
  * An array of `AttachmentDetails` objects is returned as the attachments property of an appointment or message item.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
trait AttachmentDetails extends js.Object {
  /**
    * Gets a value that indicates the type of an attachment.
    */
  var attachmentType: AttachmentType | String
  /**
    * Gets the MIME content type of the attachment.
    */
  var contentType: String
  /**
    * Gets the Exchange attachment ID of the attachment.
    */
  var id: String
  /**
    * Gets a value that indicates whether the attachment should be displayed in the body of the item.
    */
  var isInline: Boolean
  /**
    * Gets the name of the attachment.
    * 
    * **Important**: For message or appointment items that were attached by drag-and-drop or "Attach Item",
    * `name` includes a file extension in Outlook on Mac, but excludes the extension on the web or Windows.
    */
  var name: String
  /**
    * Gets the size of the attachment in bytes.
    */
  var size: Double
  /**
    * Gets the url of the attachment if its type is `MailboxEnums.AttachmentType.Cloud`.
    * 
    * [Api set: Mailbox 1.8]
    */
  var url: String
}

object AttachmentDetails {
  @scala.inline
  def apply(
    attachmentType: AttachmentType | String,
    contentType: String,
    id: String,
    isInline: Boolean,
    name: String,
    size: Double,
    url: String
  ): AttachmentDetails = {
    val __obj = js.Dynamic.literal(attachmentType = attachmentType.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachmentDetails]
  }
}

