package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppointmentItem extends StObject {
  
  val Actions: typingsJapgolly.activexOutlook.Outlook.Actions = js.native
  
  var AllDayEvent: Boolean = js.native
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  val Attachments: typingsJapgolly.activexOutlook.Outlook.Attachments = js.native
  
  val AutoResolvedWinner: Boolean = js.native
  
  var BillingInformation: String = js.native
  
  var Body: String = js.native
  
  var BusyStatus: OlBusyStatus = js.native
  
  var Categories: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def ClearRecurrencePattern(): Unit = js.native
  
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  
  var Companies: String = js.native
  
  var ConferenceServerAllowExternal: Boolean = js.native
  
  var ConferenceServerPassword: String = js.native
  
  val Conflicts: typingsJapgolly.activexOutlook.Outlook.Conflicts = js.native
  
  val ConversationID: String = js.native
  
  val ConversationIndex: String = js.native
  
  val ConversationTopic: String = js.native
  
  def Copy(): Any = js.native
  
  def CopyTo(DestinationFolder: Folder, CopyOptions: OlAppointmentCopyOptions): AppointmentItem = js.native
  
  val CreationTime: VarDate = js.native
  
  def Delete(): Unit = js.native
  
  def Display(): Unit = js.native
  def Display(Modal: Any): Unit = js.native
  
  val DownloadState: OlDownloadState = js.native
  
  var Duration: Double = js.native
  
  var End: VarDate = js.native
  
  var EndInEndTimeZone: VarDate = js.native
  
  var EndTimeZone: TimeZone = js.native
  
  var EndUTC: VarDate = js.native
  
  val EntryID: String = js.native
  
  var ForceUpdateToAllAttendees: Boolean = js.native
  
  val FormDescription: typingsJapgolly.activexOutlook.Outlook.FormDescription = js.native
  
  def ForwardAsVcal(): MailItem = js.native
  
  def GetConversation(): Conversation = js.native
  
  val GetInspector: Inspector = js.native
  
  def GetOrganizer(): AddressEntry = js.native
  
  def GetRecurrencePattern(): RecurrencePattern = js.native
  
  val GlobalAppointmentID: String = js.native
  
  var Importance: OlImportance = js.native
  
  var InternetCodepage: Double = js.native
  
  val IsConflict: Boolean = js.native
  
  var IsOnlineMeeting: Boolean = js.native
  
  val IsRecurring: Boolean = js.native
  
  val ItemProperties: typingsJapgolly.activexOutlook.Outlook.ItemProperties = js.native
  
  val LastModificationTime: VarDate = js.native
  
  val Links: typingsJapgolly.activexOutlook.Outlook.Links = js.native
  
  var Location: String = js.native
  
  val MAPIOBJECT: Any = js.native
  
  var MarkForDownload: OlRemoteStatus = js.native
  
  var MeetingStatus: OlMeetingStatus = js.native
  
  val MeetingWorkspaceURL: String = js.native
  
  var MessageClass: String = js.native
  
  var Mileage: String = js.native
  
  def Move(DestFldr: Folder): Any = js.native
  
  var NetMeetingAutoStart: Boolean = js.native
  
  var NetMeetingDocPathName: String = js.native
  
  var NetMeetingOrganizerAlias: String = js.native
  
  var NetMeetingServer: String = js.native
  
  var NetMeetingType: OlNetMeetingType = js.native
  
  var NetShowURL: String = js.native
  
  var NoAging: Boolean = js.native
  
  var OptionalAttendees: String = js.native
  
  val Organizer: String = js.native
  
  /* private */ @JSName("Outlook.AppointmentItem_typekey")
  var OutlookDotAppointmentItem_typekey: AppointmentItem = js.native
  
  val OutlookInternalVersion: Double = js.native
  
  val OutlookVersion: String = js.native
  
  val Parent: Any = js.native
  
  def PrintOut(): Unit = js.native
  
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  
  var RTFBody: Any = js.native
  
  val Recipients: typingsJapgolly.activexOutlook.Outlook.Recipients = js.native
  
  val RecurrenceState: OlRecurrenceState = js.native
  
  var ReminderMinutesBeforeStart: Double = js.native
  
  var ReminderOverrideDefault: Boolean = js.native
  
  var ReminderPlaySound: Boolean = js.native
  
  var ReminderSet: Boolean = js.native
  
  var ReminderSoundFile: String = js.native
  
  var ReplyTime: VarDate = js.native
  
  var RequiredAttendees: String = js.native
  
  var Resources: String = js.native
  
  def Respond(Response: OlMeetingResponse): MeetingItem = js.native
  def Respond(Response: OlMeetingResponse, fNoUI: Any): MeetingItem = js.native
  def Respond(Response: OlMeetingResponse, fNoUI: Any, fAdditionalTextDialog: Any): MeetingItem = js.native
  def Respond(Response: OlMeetingResponse, fNoUI: Unit, fAdditionalTextDialog: Any): MeetingItem = js.native
  
  var ResponseRequested: Boolean = js.native
  
  val ResponseStatus: OlResponseStatus = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: Any): Unit = js.native
  
  val Saved: Boolean = js.native
  
  def Send(): Unit = js.native
  
  var SendUsingAccount: Account = js.native
  
  var Sensitivity: OlSensitivity = js.native
  
  val Session: NameSpace = js.native
  
  def ShowCategoriesDialog(): Unit = js.native
  
  val Size: Double = js.native
  
  var Start: VarDate = js.native
  
  var StartInStartTimeZone: VarDate = js.native
  
  var StartTimeZone: TimeZone = js.native
  
  var StartUTC: VarDate = js.native
  
  var Subject: String = js.native
  
  var UnRead: Boolean = js.native
  
  val UserProperties: typingsJapgolly.activexOutlook.Outlook.UserProperties = js.native
}
