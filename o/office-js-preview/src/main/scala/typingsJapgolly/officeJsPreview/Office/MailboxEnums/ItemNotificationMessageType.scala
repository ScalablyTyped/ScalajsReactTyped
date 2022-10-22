package typingsJapgolly.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ItemNotificationMessageType extends StObject
/**
  * Specifies the notification message type for an appointment or message.
  *
  * @remarks
  * [Api set: Mailbox 1.3]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.ItemNotificationMessageType")
@js.native
object ItemNotificationMessageType extends StObject {
  
  /**
    * The notification message is an error message.
    */
  @js.native
  sealed trait ErrorMessage
    extends StObject
       with ItemNotificationMessageType
  
  /**
    * The notification message is an informational message.
    */
  @js.native
  sealed trait InformationalMessage
    extends StObject
       with ItemNotificationMessageType
  
  /**
    * The notification message is an informational message with actions.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  @js.native
  sealed trait InsightMessage
    extends StObject
       with ItemNotificationMessageType
  
  /**
    * The notification message is a progress indicator.
    */
  @js.native
  sealed trait ProgressIndicator
    extends StObject
       with ItemNotificationMessageType
}
