package typingsJapgolly.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

/**
  * Specifies an attachment's type.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  /**
    * The attachment is stored in a cloud location, such as OneDrive. The `id` property of the attachment contains a URL to the file.
    */
  @js.native
  sealed trait Cloud extends AttachmentType
  
  /**
    * The attachment is a file.
    */
  @js.native
  sealed trait File extends AttachmentType
  
  /**
    * The attachment is an Exchange item.
    */
  @js.native
  sealed trait Item extends AttachmentType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AttachmentType with String] = js.native
  /* "cloud" */ @js.native
  object Cloud extends TopLevel[Cloud with String]
  
  /* "file" */ @js.native
  object File extends TopLevel[File with String]
  
  /* "item" */ @js.native
  object Item extends TopLevel[Item with String]
  
}

