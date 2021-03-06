package typingsJapgolly.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ItemNotificationMessageType extends js.Object

/**
  * Specifies the notification message type for an appointment or message.
  *
  * [Api set: Mailbox 1.3]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.ItemNotificationMessageType")
@js.native
object ItemNotificationMessageType extends js.Object {
  /**
    * The notification message is an error message.
    */
  @js.native
  sealed trait ErrorMessage extends ItemNotificationMessageType
  
  /**
    * The notification message is an informational message.
    */
  @js.native
  sealed trait InformationalMessage extends ItemNotificationMessageType
  
  /**
    * The notification message is a progress indicator.
    */
  @js.native
  sealed trait ProgressIndicator extends ItemNotificationMessageType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ItemNotificationMessageType with String] = js.native
  /* "errorMessage" */ @js.native
  object ErrorMessage extends TopLevel[ErrorMessage with String]
  
  /* "informationalMessage" */ @js.native
  object InformationalMessage extends TopLevel[InformationalMessage with String]
  
  /* "progressIndicator" */ @js.native
  object ProgressIndicator extends TopLevel[ProgressIndicator with String]
  
}

