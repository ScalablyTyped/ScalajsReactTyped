package typingsJapgolly.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MailboxEnums {
  
  /**
    * Specifies the type of custom action in a notification message.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  @JSGlobal("Office.MailboxEnums.ActionType")
  @js.native
  object ActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.ActionType & String] = js.native
    
    /* "showTaskPane" */ val ShowTaskPane: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ActionType.ShowTaskPane & String = js.native
  }
  
  /**
    * Specifies the sensitivity type of an appointment.
    *
    * @remarks 
    * [Api set: Mailbox preview]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    *
    * @beta
    */
  @JSGlobal("Office.MailboxEnums.AppointmentSensitivityType")
  @js.native
  object AppointmentSensitivityType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType & String
      ] = js.native
    
    /* "confidential" */ val Confidential: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Confidential & String = js.native
    
    /* "normal" */ val Normal: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Normal & String = js.native
    
    /* "personal" */ val Personal: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Personal & String = js.native
    
    /* "private" */ val Private: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType.Private & String = js.native
  }
  
  /**
    * Specifies the formatting that applies to an attachment's content.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.AttachmentContentFormat")
  @js.native
  object AttachmentContentFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat & String
      ] = js.native
    
    /* "base64" */ val Base64: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Base64 & String = js.native
    
    /* "eml" */ val Eml: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Eml & String = js.native
    
    /* "iCalendar" */ val ICalendar: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.ICalendar & String = js.native
    
    /* "url" */ val Url: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentContentFormat.Url & String = js.native
  }
  
  /**
    * Specifies whether an attachment was added to or removed from an item.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.AttachmentStatus")
  @js.native
  object AttachmentStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentStatus & String] = js.native
    
    /* "added" */ val Added: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentStatus.Added & String = js.native
    
    /* "removed" */ val Removed: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentStatus.Removed & String = js.native
  }
  
  /**
    * Specifies an attachment's type.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.AttachmentType")
  @js.native
  object AttachmentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentType & String] = js.native
    
    /* "cloud" */ val Cloud: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentType.Cloud & String = js.native
    
    /* "file" */ val File: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentType.File & String = js.native
    
    /* "item" */ val Item: typingsJapgolly.officeJsPreview.Office.MailboxEnums.AttachmentType.Item & String = js.native
  }
  
  /**
    * Specifies the category color.
    *
    * **Note**: The actual color depends on how the Outlook client renders it.
    * In this case, the colors noted on each preset are for the Outlook desktop client.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.CategoryColor")
  @js.native
  object CategoryColor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor & Double] = js.native
    
    /* 0 */ val None: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.None & Double = js.native
    
    /* 1 */ val Preset0: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset0 & Double = js.native
    
    /* 2 */ val Preset1: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset1 & Double = js.native
    
    /* 11 */ val Preset10: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset10 & Double = js.native
    
    /* 12 */ val Preset11: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset11 & Double = js.native
    
    /* 13 */ val Preset12: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset12 & Double = js.native
    
    /* 14 */ val Preset13: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset13 & Double = js.native
    
    /* 15 */ val Preset14: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset14 & Double = js.native
    
    /* 16 */ val Preset15: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset15 & Double = js.native
    
    /* 17 */ val Preset16: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset16 & Double = js.native
    
    /* 18 */ val Preset17: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset17 & Double = js.native
    
    /* 19 */ val Preset18: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset18 & Double = js.native
    
    /* 20 */ val Preset19: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset19 & Double = js.native
    
    /* 3 */ val Preset2: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset2 & Double = js.native
    
    /* 21 */ val Preset20: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset20 & Double = js.native
    
    /* 22 */ val Preset21: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset21 & Double = js.native
    
    /* 23 */ val Preset22: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset22 & Double = js.native
    
    /* 24 */ val Preset23: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset23 & Double = js.native
    
    /* 25 */ val Preset24: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset24 & Double = js.native
    
    /* 4 */ val Preset3: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset3 & Double = js.native
    
    /* 5 */ val Preset4: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset4 & Double = js.native
    
    /* 6 */ val Preset5: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset5 & Double = js.native
    
    /* 7 */ val Preset6: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset6 & Double = js.native
    
    /* 8 */ val Preset7: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset7 & Double = js.native
    
    /* 9 */ val Preset8: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset8 & Double = js.native
    
    /* 10 */ val Preset9: typingsJapgolly.officeJsPreview.Office.MailboxEnums.CategoryColor.Preset9 & Double = js.native
  }
  
  /**
    * Specifies a message's compose type.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    */
  @JSGlobal("Office.MailboxEnums.ComposeType")
  @js.native
  object ComposeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.ComposeType & String] = js.native
    
    /* "forward" */ val Forward: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ComposeType.Forward & String = js.native
    
    /* "newMail" */ val NewMail: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ComposeType.NewMail & String = js.native
    
    /* "reply" */ val Reply: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ComposeType.Reply & String = js.native
  }
  
  /**
    * Specifies the day of week or type of day.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.Days")
  @js.native
  object Days extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.Days & String] = js.native
    
    /* "day" */ val Day: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Days.Day & String = js.native
    
    /* "fri" */ val Fri: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Days.Fri & String = js.native
    
    /* "mon" */ val Mon: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Days.Mon & String = js.native
    
    /* "sat" */ val Sat: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Days.Sat & String = js.native
    
    /* "sun" */ val Sun: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Days.Sun & String = js.native
    
    /* "thu" */ val Thu: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Days.Thu & String = js.native
    
    /* "tue" */ val Tue: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Days.Tue & String = js.native
    
    /* "wed" */ val Wed: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Days.Wed & String = js.native
    
    /* "weekday" */ val Weekday: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Days.Weekday & String = js.native
    
    /* "weekendDay" */ val WeekendDay: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Days.WeekendDay & String = js.native
  }
  
  /**
    * This bitmask represents a delegate's permissions on a shared folder, or a user's permissions on a shared mailbox.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.DelegatePermissions")
  @js.native
  object DelegatePermissions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.DelegatePermissions & Double] = js.native
    
    /* 8 */ val DeleteAll: typingsJapgolly.officeJsPreview.Office.MailboxEnums.DelegatePermissions.DeleteAll & Double = js.native
    
    /* 4 */ val DeleteOwn: typingsJapgolly.officeJsPreview.Office.MailboxEnums.DelegatePermissions.DeleteOwn & Double = js.native
    
    /* 32 */ val EditAll: typingsJapgolly.officeJsPreview.Office.MailboxEnums.DelegatePermissions.EditAll & Double = js.native
    
    /* 16 */ val EditOwn: typingsJapgolly.officeJsPreview.Office.MailboxEnums.DelegatePermissions.EditOwn & Double = js.native
    
    /* 1 */ val Read: typingsJapgolly.officeJsPreview.Office.MailboxEnums.DelegatePermissions.Read & Double = js.native
    
    /* 2 */ val Write: typingsJapgolly.officeJsPreview.Office.MailboxEnums.DelegatePermissions.Write & Double = js.native
  }
  
  /**
    * Specifies an entity's type.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.EntityType")
  @js.native
  object EntityType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.EntityType & String] = js.native
    
    /* "address" */ val Address: typingsJapgolly.officeJsPreview.Office.MailboxEnums.EntityType.Address & String = js.native
    
    /* "contact" */ val Contact: typingsJapgolly.officeJsPreview.Office.MailboxEnums.EntityType.Contact & String = js.native
    
    /* "emailAddress" */ val EmailAddress: typingsJapgolly.officeJsPreview.Office.MailboxEnums.EntityType.EmailAddress & String = js.native
    
    /* "meetingSuggestion" */ val MeetingSuggestion: typingsJapgolly.officeJsPreview.Office.MailboxEnums.EntityType.MeetingSuggestion & String = js.native
    
    /* "phoneNumber" */ val PhoneNumber: typingsJapgolly.officeJsPreview.Office.MailboxEnums.EntityType.PhoneNumber & String = js.native
    
    /* "taskSuggestion" */ val TaskSuggestion: typingsJapgolly.officeJsPreview.Office.MailboxEnums.EntityType.TaskSuggestion & String = js.native
    
    /* "url" */ val Url: typingsJapgolly.officeJsPreview.Office.MailboxEnums.EntityType.Url & String = js.native
  }
  
  /**
    * Action types supported by {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType.InfobarClicked}.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  @JSGlobal("Office.MailboxEnums.InfobarActionType")
  @js.native
  object InfobarActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.InfobarActionType & Double] = js.native
    
    /* 1 */ val Dismiss: typingsJapgolly.officeJsPreview.Office.MailboxEnums.InfobarActionType.Dismiss & Double = js.native
  }
  
  /**
    * Type of notification allowed by {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType.InfobarClicked}.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  @JSGlobal("Office.MailboxEnums.InfobarType")
  @js.native
  object InfobarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.InfobarType & Double] = js.native
    
    /* 2 */ val Error: typingsJapgolly.officeJsPreview.Office.MailboxEnums.InfobarType.Error & Double = js.native
    
    /* 0 */ val Informational: typingsJapgolly.officeJsPreview.Office.MailboxEnums.InfobarType.Informational & Double = js.native
    
    /* 3 */ val Insight: typingsJapgolly.officeJsPreview.Office.MailboxEnums.InfobarType.Insight & Double = js.native
    
    /* 1 */ val ProgressIndicator: typingsJapgolly.officeJsPreview.Office.MailboxEnums.InfobarType.ProgressIndicator & Double = js.native
  }
  
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType & String
      ] = js.native
    
    /* "errorMessage" */ val ErrorMessage: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.ErrorMessage & String = js.native
    
    /* "informationalMessage" */ val InformationalMessage: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.InformationalMessage & String = js.native
    
    /* "insightMessage" */ val InsightMessage: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.InsightMessage & String = js.native
    
    /* "progressIndicator" */ val ProgressIndicator: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ItemNotificationMessageType.ProgressIndicator & String = js.native
  }
  
  /**
    * Specifies an item's type.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.ItemType")
  @js.native
  object ItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.ItemType & String] = js.native
    
    /* "appointment" */ val Appointment: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ItemType.Appointment & String = js.native
    
    /* "message" */ val Message: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ItemType.Message & String = js.native
  }
  
  /**
    * Specifies an appointment location's type.
    *
    * @remarks
    * [Api set: Mailbox 1.8]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.LocationType")
  @js.native
  object LocationType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.LocationType & String] = js.native
    
    /* "custom" */ val Custom: typingsJapgolly.officeJsPreview.Office.MailboxEnums.LocationType.Custom & String = js.native
    
    /* "room" */ val Room: typingsJapgolly.officeJsPreview.Office.MailboxEnums.LocationType.Room & String = js.native
  }
  
  /**
    * Specifies the month.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.Month")
  @js.native
  object Month extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month & String] = js.native
    
    /* "apr" */ val Apr: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.Apr & String = js.native
    
    /* "aug" */ val Aug: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.Aug & String = js.native
    
    /* "dec" */ val Dec: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.Dec & String = js.native
    
    /* "feb" */ val Feb: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.Feb & String = js.native
    
    /* "jan" */ val Jan: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.Jan & String = js.native
    
    /* "jul" */ val Jul: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.Jul & String = js.native
    
    /* "jun" */ val Jun: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.Jun & String = js.native
    
    /* "mar" */ val Mar: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.Mar & String = js.native
    
    /* "may" */ val May: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.May & String = js.native
    
    /* "nov" */ val Nov: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.Nov & String = js.native
    
    /* "oct" */ val Oct: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.Oct & String = js.native
    
    /* "sep" */ val Sep: typingsJapgolly.officeJsPreview.Office.MailboxEnums.Month.Sep & String = js.native
  }
  
  /**
    * Represents the current view of Outlook on the web.
    */
  @JSGlobal("Office.MailboxEnums.OWAView")
  @js.native
  object OWAView extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.OWAView & String] = js.native
    
    /* "OneColumn" */ val OneColumn: typingsJapgolly.officeJsPreview.Office.MailboxEnums.OWAView.OneColumn & String = js.native
    
    /* "OneColumnNarrow" */ val OneColumnNarrow: typingsJapgolly.officeJsPreview.Office.MailboxEnums.OWAView.OneColumnNarrow & String = js.native
    
    /* "ThreeColumns" */ val ThreeColumns: typingsJapgolly.officeJsPreview.Office.MailboxEnums.OWAView.ThreeColumns & String = js.native
    
    /* "TwoColumns" */ val TwoColumns: typingsJapgolly.officeJsPreview.Office.MailboxEnums.OWAView.TwoColumns & String = js.native
  }
  
  /**
    * Specifies the type of recipient of a message or appointment.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    * 
    * **Important**: A `recipientType` property value isn't returned by the 
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.from?view=outlook-js-preview#outlook-office-from-getasync-member(1) | Office.context.mailbox.item.from.getAsync} 
    * and {@link https://learn.microsoft.com/javascript/api/outlook/office.organizer?view=outlook-js-preview#outlook-office-organizer-getasync-member(1) | Office.context.mailbox.item.organizer.getAsync} methods.
    * The email sender or appointment organizer is always a user whose email address is on the Exchange server.
    */
  @JSGlobal("Office.MailboxEnums.RecipientType")
  @js.native
  object RecipientType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecipientType & String] = js.native
    
    /* "distributionList" */ val DistributionList: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecipientType.DistributionList & String = js.native
    
    /* "externalUser" */ val ExternalUser: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecipientType.ExternalUser & String = js.native
    
    /* "other" */ val Other: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecipientType.Other & String = js.native
    
    /* "user" */ val User: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecipientType.User & String = js.native
  }
  
  /**
    * Specifies the time zone applied to the recurrence.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.RecurrenceTimeZone")
  @js.native
  object RecurrenceTimeZone extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone & String] = js.native
    
    /* "AUS Central Standard Time" */ val AUSCentralStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AUSCentralStandardTime & String = js.native
    
    /* "AUS Eastern Standard Time" */ val AUSEasternStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AUSEasternStandardTime & String = js.native
    
    /* "Afghanistan Standard Time" */ val AfghanistanStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AfghanistanStandardTime & String = js.native
    
    /* "Alaskan Standard Time" */ val AlaskanStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AlaskanStandardTime & String = js.native
    
    /* "Aleutian Standard Time" */ val AleutianStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AleutianStandardTime & String = js.native
    
    /* "Altai Standard Time" */ val AltaiStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AltaiStandardTime & String = js.native
    
    /* "Arab Standard Time" */ val ArabStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArabStandardTime & String = js.native
    
    /* "Arabian Standard Time" */ val ArabianStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArabianStandardTime & String = js.native
    
    /* "Arabic Standard Time" */ val ArabicStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArabicStandardTime & String = js.native
    
    /* "Argentina Standard Time" */ val ArgentinaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ArgentinaStandardTime & String = js.native
    
    /* "Astrakhan Standard Time" */ val AstrakhanStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AstrakhanStandardTime & String = js.native
    
    /* "Atlantic Standard Time" */ val AtlanticStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AtlanticStandardTime & String = js.native
    
    /* "Aus Central W. Standard Time" */ val AusCentralW_StandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AusCentralW_StandardTime & String = js.native
    
    /* "Azerbaijan Standard Time" */ val AzerbaijanStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AzerbaijanStandardTime & String = js.native
    
    /* "Azores Standard Time" */ val AzoresStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.AzoresStandardTime & String = js.native
    
    /* "Bahia Standard Time" */ val BahiaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BahiaStandardTime & String = js.native
    
    /* "Bangladesh Standard Time" */ val BangladeshStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BangladeshStandardTime & String = js.native
    
    /* "Belarus Standard Time" */ val BelarusStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BelarusStandardTime & String = js.native
    
    /* "Bougainville Standard Time" */ val BougainvilleStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.BougainvilleStandardTime & String = js.native
    
    /* "Canada Central Standard Time" */ val CanadaCentralStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CanadaCentralStandardTime & String = js.native
    
    /* "Cape Verde Standard Time" */ val CapeVerdeStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CapeVerdeStandardTime & String = js.native
    
    /* "Caucasus Standard Time" */ val CaucasusStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CaucasusStandardTime & String = js.native
    
    /* "Cen. Australia Standard Time" */ val CenAustraliaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CenAustraliaStandardTime & String = js.native
    
    /* "Central America Standard Time" */ val CentralAmericaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralAmericaStandardTime & String = js.native
    
    /* "Central Asia Standard Time" */ val CentralAsiaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralAsiaStandardTime & String = js.native
    
    /* "Central Brazilian Standard Time" */ val CentralBrazilianStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralBrazilianStandardTime & String = js.native
    
    /* "Central Europe Standard Time" */ val CentralEuropeStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralEuropeStandardTime & String = js.native
    
    /* "Central European Standard Time" */ val CentralEuropeanStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralEuropeanStandardTime & String = js.native
    
    /* "Central Pacific Standard Time" */ val CentralPacificStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralPacificStandardTime & String = js.native
    
    /* "Central Standard Time" */ val CentralStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralStandardTime & String = js.native
    
    /* "Central Standard Time (Mexico)" */ val CentralStandardTime_Mexico: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CentralStandardTime_Mexico & String = js.native
    
    /* "Chatham Islands Standard Time" */ val ChathamIslandsStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ChathamIslandsStandardTime & String = js.native
    
    /* "China Standard Time" */ val ChinaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ChinaStandardTime & String = js.native
    
    /* "Cuba Standard Time" */ val CubaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.CubaStandardTime & String = js.native
    
    /* "Dateline Standard Time" */ val DatelineStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.DatelineStandardTime & String = js.native
    
    /* "E. Africa Standard Time" */ val E_AfricaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_AfricaStandardTime & String = js.native
    
    /* "E. Australia Standard Time" */ val E_AustraliaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_AustraliaStandardTime & String = js.native
    
    /* "E. Europe Standard Time" */ val E_EuropeStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_EuropeStandardTime & String = js.native
    
    /* "E. South America Standard Time" */ val E_SouthAmericaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.E_SouthAmericaStandardTime & String = js.native
    
    /* "Easter Island Standard Time" */ val EasterIslandStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EasterIslandStandardTime & String = js.native
    
    /* "Eastern Standard Time" */ val EasternStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EasternStandardTime & String = js.native
    
    /* "Eastern Standard Time (Mexico)" */ val EasternStandardTime_Mexico: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EasternStandardTime_Mexico & String = js.native
    
    /* "Egypt Standard Time" */ val EgyptStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EgyptStandardTime & String = js.native
    
    /* "Ekaterinburg Standard Time" */ val EkaterinburgStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.EkaterinburgStandardTime & String = js.native
    
    /* "FLE Standard Time" */ val FLEStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.FLEStandardTime & String = js.native
    
    /* "Fiji Standard Time" */ val FijiStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.FijiStandardTime & String = js.native
    
    /* "GMT Standard Time" */ val GMTStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GMTStandardTime & String = js.native
    
    /* "GTB Standard Time" */ val GTBStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GTBStandardTime & String = js.native
    
    /* "Georgian Standard Time" */ val GeorgianStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GeorgianStandardTime & String = js.native
    
    /* "Greenland Standard Time" */ val GreenlandStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GreenlandStandardTime & String = js.native
    
    /* "Greenwich Standard Time" */ val GreenwichStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.GreenwichStandardTime & String = js.native
    
    /* "Haiti Standard Time" */ val HaitiStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.HaitiStandardTime & String = js.native
    
    /* "Hawaiian Standard Time" */ val HawaiianStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.HawaiianStandardTime & String = js.native
    
    /* "India Standard Time" */ val IndiaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.IndiaStandardTime & String = js.native
    
    /* "Iran Standard Time" */ val IranStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.IranStandardTime & String = js.native
    
    /* "Israel Standard Time" */ val IsraelStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.IsraelStandardTime & String = js.native
    
    /* "Jordan Standard Time" */ val JordanStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.JordanStandardTime & String = js.native
    
    /* "Kaliningrad Standard Time" */ val KaliningradStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.KaliningradStandardTime & String = js.native
    
    /* "Kamchatka Standard Time" */ val KamchatkaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.KamchatkaStandardTime & String = js.native
    
    /* "Korea Standard Time" */ val KoreaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.KoreaStandardTime & String = js.native
    
    /* "Libya Standard Time" */ val LibyaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.LibyaStandardTime & String = js.native
    
    /* "Line Islands Standard Time" */ val LineIslandsStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.LineIslandsStandardTime & String = js.native
    
    /* "Lord Howe Standard Time" */ val LordHoweStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.LordHoweStandardTime & String = js.native
    
    /* "Magadan Standard Time" */ val MagadanStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MagadanStandardTime & String = js.native
    
    /* "Magallanes Standard Time" */ val MagallanesStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MagallanesStandardTime & String = js.native
    
    /* "Marquesas Standard Time" */ val MarquesasStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MarquesasStandardTime & String = js.native
    
    /* "Mauritius Standard Time" */ val MauritiusStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MauritiusStandardTime & String = js.native
    
    /* "Mid-Atlantic Standard Time" */ val MidAtlanticStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MidAtlanticStandardTime & String = js.native
    
    /* "Middle East Standard Time" */ val MiddleEastStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MiddleEastStandardTime & String = js.native
    
    /* "Montevideo Standard Time" */ val MontevideoStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MontevideoStandardTime & String = js.native
    
    /* "Morocco Standard Time" */ val MoroccoStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MoroccoStandardTime & String = js.native
    
    /* "Mountain Standard Time" */ val MountainStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MountainStandardTime & String = js.native
    
    /* "Mountain Standard Time (Mexico)" */ val MountainStandardTime_Mexico: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MountainStandardTime_Mexico & String = js.native
    
    /* "Myanmar Standard Time" */ val MyanmarStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.MyanmarStandardTime & String = js.native
    
    /* "N. Central Asia Standard Time" */ val N_CentralAsiaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.N_CentralAsiaStandardTime & String = js.native
    
    /* "Namibia Standard Time" */ val NamibiaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NamibiaStandardTime & String = js.native
    
    /* "Nepal Standard Time" */ val NepalStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NepalStandardTime & String = js.native
    
    /* "New Zealand Standard Time" */ val NewZealandStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NewZealandStandardTime & String = js.native
    
    /* "Newfoundland Standard Time" */ val NewfoundlandStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NewfoundlandStandardTime & String = js.native
    
    /* "Norfolk Standard Time" */ val NorfolkStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorfolkStandardTime & String = js.native
    
    /* "North Asia East Standard Time" */ val NorthAsiaEastStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorthAsiaEastStandardTime & String = js.native
    
    /* "North Asia Standard Time" */ val NorthAsiaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorthAsiaStandardTime & String = js.native
    
    /* "North Korea Standard Time" */ val NorthKoreaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.NorthKoreaStandardTime & String = js.native
    
    /* "Omsk Standard Time" */ val OmskStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.OmskStandardTime & String = js.native
    
    /* "Pacific SA Standard Time" */ val PacificSAStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PacificSAStandardTime & String = js.native
    
    /* "Pacific Standard Time" */ val PacificStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PacificStandardTime & String = js.native
    
    /* "Pacific Standard Time (Mexico)" */ val PacificStandardTimeMexico: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PacificStandardTimeMexico & String = js.native
    
    /* "Pakistan Standard Time" */ val PakistanStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.PakistanStandardTime & String = js.native
    
    /* "Paraguay Standard Time" */ val ParaguayStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.ParaguayStandardTime & String = js.native
    
    /* "Romance Standard Time" */ val RomanceStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RomanceStandardTime & String = js.native
    
    /* "Russia Time Zone 10" */ val RussiaTimeZone10: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone10 & String = js.native
    
    /* "Russia Time Zone 11" */ val RussiaTimeZone11: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone11 & String = js.native
    
    /* "Russia Time Zone 3" */ val RussiaTimeZone3: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussiaTimeZone3 & String = js.native
    
    /* "Russian Standard Time" */ val RussianStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.RussianStandardTime & String = js.native
    
    /* "SA Eastern Standard Time" */ val SAEasternStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SAEasternStandardTime & String = js.native
    
    /* "SA Pacific Standard Time" */ val SAPacificStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SAPacificStandardTime & String = js.native
    
    /* "SA Western Standard Time" */ val SAWesternStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SAWesternStandardTime & String = js.native
    
    /* "SE Asia Standard Time" */ val SEAsiaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SEAsiaStandardTime & String = js.native
    
    /* "Saint Pierre Standard Time" */ val SaintPierreStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SaintPierreStandardTime & String = js.native
    
    /* "Sakhalin Standard Time" */ val SakhalinStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SakhalinStandardTime & String = js.native
    
    /* "Samoa Standard Time" */ val SamoaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SamoaStandardTime & String = js.native
    
    /* "Saratov Standard Time" */ val SaratovStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SaratovStandardTime & String = js.native
    
    /* "Singapore Standard Time" */ val SingaporeStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SingaporeStandardTime & String = js.native
    
    /* "South Africa Standard Time" */ val SouthAfricaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SouthAfricaStandardTime & String = js.native
    
    /* "Sri Lanka Standard Time" */ val SriLankaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SriLankaStandardTime & String = js.native
    
    /* "Sudan Standard Time" */ val SudanStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SudanStandardTime & String = js.native
    
    /* "Syria Standard Time" */ val SyriaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.SyriaStandardTime & String = js.native
    
    /* "Taipei Standard Time" */ val TaipeiStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TaipeiStandardTime & String = js.native
    
    /* "Tasmania Standard Time" */ val TasmaniaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TasmaniaStandardTime & String = js.native
    
    /* "Tocantins Standard Time" */ val TocantinsStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TocantinsStandardTime & String = js.native
    
    /* "Tokyo Standard Time" */ val TokyoStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TokyoStandardTime & String = js.native
    
    /* "Tomsk Standard Time" */ val TomskStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TomskStandardTime & String = js.native
    
    /* "Tonga Standard Time" */ val TongaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TongaStandardTime & String = js.native
    
    /* "Transbaikal Standard Time" */ val TransbaikalStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TransbaikalStandardTime & String = js.native
    
    /* "Turkey Standard Time" */ val TurkeyStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TurkeyStandardTime & String = js.native
    
    /* "Turks And Caicos Standard Time" */ val TurksAndCaicosStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.TurksAndCaicosStandardTime & String = js.native
    
    /* "US Eastern Standard Time" */ val USEasternStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.USEasternStandardTime & String = js.native
    
    /* "US Mountain Standard Time" */ val USMountainStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.USMountainStandardTime & String = js.native
    
    /* "UTC" */ val UTC: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTC & String = js.native
    
    /* "UTC-02" */ val UTCMINUS02: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS02 & String = js.native
    
    /* "UTC-08" */ val UTCMINUS08: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS08 & String = js.native
    
    /* "UTC-09" */ val UTCMINUS09: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS09 & String = js.native
    
    /* "UTC-11" */ val UTCMINUS11: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCMINUS11 & String = js.native
    
    /* "UTC+12" */ val UTCPLUS12: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCPLUS12 & String = js.native
    
    /* "UTC+13" */ val UTCPLUS13: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UTCPLUS13 & String = js.native
    
    /* "Ulaanbaatar Standard Time" */ val UlaanbaatarStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.UlaanbaatarStandardTime & String = js.native
    
    /* "Venezuela Standard Time" */ val VenezuelaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.VenezuelaStandardTime & String = js.native
    
    /* "Vladivostok Standard Time" */ val VladivostokStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.VladivostokStandardTime & String = js.native
    
    /* "W. Australia Standard Time" */ val W_AustraliaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_AustraliaStandardTime & String = js.native
    
    /* "W. Central Africa Standard Time" */ val W_CentralAfricaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_CentralAfricaStandardTime & String = js.native
    
    /* "W. Europe Standard Time" */ val W_EuropeStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_EuropeStandardTime & String = js.native
    
    /* "W. Mongolia Standard Time" */ val W_MongoliaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.W_MongoliaStandardTime & String = js.native
    
    /* "West Asia Standard Time" */ val WestAsiaStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.WestAsiaStandardTime & String = js.native
    
    /* "West Bank Standard Time" */ val WestBankStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.WestBankStandardTime & String = js.native
    
    /* "West Pacific Standard Time" */ val WestPacificStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.WestPacificStandardTime & String = js.native
    
    /* "Yakutsk Standard Time" */ val YakutskStandardTime: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceTimeZone.YakutskStandardTime & String = js.native
  }
  
  /**
    * Specifies the type of recurrence.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.RecurrenceType")
  @js.native
  object RecurrenceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceType & String] = js.native
    
    /* "daily" */ val Daily: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceType.Daily & String = js.native
    
    /* "monthly" */ val Monthly: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceType.Monthly & String = js.native
    
    /* "weekday" */ val Weekday: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceType.Weekday & String = js.native
    
    /* "weekly" */ val Weekly: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceType.Weekly & String = js.native
    
    /* "yearly" */ val Yearly: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RecurrenceType.Yearly & String = js.native
  }
  
  /**
    * Specifies the type of response to a meeting invitation.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.ResponseType & String] = js.native
    
    /* "accepted" */ val Accepted: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ResponseType.Accepted & String = js.native
    
    /* "declined" */ val Declined: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ResponseType.Declined & String = js.native
    
    /* "none" */ val None: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ResponseType.None & String = js.native
    
    /* "organizer" */ val Organizer: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ResponseType.Organizer & String = js.native
    
    /* "tentative" */ val Tentative: typingsJapgolly.officeJsPreview.Office.MailboxEnums.ResponseType.Tentative & String = js.native
  }
  
  /**
    * Specifies the version of the REST API that corresponds to a REST-formatted item ID.
    *
    * @remarks
    * [Api set: Mailbox 1.3]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.RestVersion")
  @js.native
  object RestVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.RestVersion & String] = js.native
    
    /* "beta" */ val Beta: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RestVersion.Beta & String = js.native
    
    /* "v1.0" */ val v1_0: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RestVersion.v1_0 & String = js.native
    
    /* "v2.0" */ val v2_0: typingsJapgolly.officeJsPreview.Office.MailboxEnums.RestVersion.v2_0 & String = js.native
  }
  
  /**
    * Specifies the source of the selected data in an item (see `Office.mailbox.item.getSelectedDataAsync` for details).
    *
    * @remarks
    * [Api set: Mailbox 1.2]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    */
  @JSGlobal("Office.MailboxEnums.SourceProperty")
  @js.native
  object SourceProperty extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.SourceProperty & String] = js.native
    
    /* "body" */ val Body: typingsJapgolly.officeJsPreview.Office.MailboxEnums.SourceProperty.Body & String = js.native
    
    /* "subject" */ val Subject: typingsJapgolly.officeJsPreview.Office.MailboxEnums.SourceProperty.Subject & String = js.native
  }
  
  /**
    * Specifies the week of the month.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  @JSGlobal("Office.MailboxEnums.WeekNumber")
  @js.native
  object WeekNumber extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.MailboxEnums.WeekNumber & String] = js.native
    
    /* "first" */ val First: typingsJapgolly.officeJsPreview.Office.MailboxEnums.WeekNumber.First & String = js.native
    
    /* "fourth" */ val Fourth: typingsJapgolly.officeJsPreview.Office.MailboxEnums.WeekNumber.Fourth & String = js.native
    
    /* "last" */ val Last: typingsJapgolly.officeJsPreview.Office.MailboxEnums.WeekNumber.Last & String = js.native
    
    /* "second" */ val Second: typingsJapgolly.officeJsPreview.Office.MailboxEnums.WeekNumber.Second & String = js.native
    
    /* "third" */ val Third: typingsJapgolly.officeJsPreview.Office.MailboxEnums.WeekNumber.Third & String = js.native
  }
}
