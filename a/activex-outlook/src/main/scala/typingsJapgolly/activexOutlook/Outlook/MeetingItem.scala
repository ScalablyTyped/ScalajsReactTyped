package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeetingItem extends StObject {
  
  val Actions: typingsJapgolly.activexOutlook.Outlook.Actions = js.native
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  val Attachments: typingsJapgolly.activexOutlook.Outlook.Attachments = js.native
  
  var AutoForwarded: Boolean = js.native
  
  val AutoResolvedWinner: Boolean = js.native
  
  var BillingInformation: String = js.native
  
  var Body: String = js.native
  
  var Categories: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  
  var Companies: String = js.native
  
  val Conflicts: typingsJapgolly.activexOutlook.Outlook.Conflicts = js.native
  
  val ConversationID: String = js.native
  
  val ConversationIndex: String = js.native
  
  val ConversationTopic: String = js.native
  
  def Copy(): Any = js.native
  
  val CreationTime: VarDate = js.native
  
  var DeferredDeliveryTime: VarDate = js.native
  
  def Delete(): Unit = js.native
  
  var DeleteAfterSubmit: Boolean = js.native
  
  def Display(): Unit = js.native
  def Display(Modal: Any): Unit = js.native
  
  val DownloadState: OlDownloadState = js.native
  
  val EntryID: String = js.native
  
  var ExpiryTime: VarDate = js.native
  
  var FlagDueBy: VarDate = js.native
  
  var FlagIcon: OlFlagIcon = js.native
  
  var FlagRequest: String = js.native
  
  var FlagStatus: OlFlagStatus = js.native
  
  val FormDescription: typingsJapgolly.activexOutlook.Outlook.FormDescription = js.native
  
  def Forward(): MeetingItem = js.native
  
  def GetAssociatedAppointment(AddToCalendar: Boolean): AppointmentItem = js.native
  
  def GetConversation(): Conversation = js.native
  
  val GetInspector: Inspector = js.native
  
  var Importance: OlImportance = js.native
  
  val IsConflict: Boolean = js.native
  
  val IsLatestVersion: Boolean = js.native
  
  val ItemProperties: typingsJapgolly.activexOutlook.Outlook.ItemProperties = js.native
  
  val LastModificationTime: VarDate = js.native
  
  val Links: typingsJapgolly.activexOutlook.Outlook.Links = js.native
  
  val MAPIOBJECT: Any = js.native
  
  var MarkForDownload: OlRemoteStatus = js.native
  
  val MeetingWorkspaceURL: String = js.native
  
  var MessageClass: String = js.native
  
  var Mileage: String = js.native
  
  def Move(DestFldr: Folder): Any = js.native
  
  var NoAging: Boolean = js.native
  
  var OriginatorDeliveryReportRequested: Boolean = js.native
  
  /* private */ @JSName("Outlook.MeetingItem_typekey")
  var OutlookDotMeetingItem_typekey: MeetingItem = js.native
  
  val OutlookInternalVersion: Double = js.native
  
  val OutlookVersion: String = js.native
  
  val Parent: Any = js.native
  
  def PrintOut(): Unit = js.native
  
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  
  var RTFBody: Any = js.native
  
  var ReceivedTime: VarDate = js.native
  
  val Recipients: typingsJapgolly.activexOutlook.Outlook.Recipients = js.native
  
  var ReminderSet: Boolean = js.native
  
  var ReminderTime: VarDate = js.native
  
  def Reply(): MailItem = js.native
  
  def ReplyAll(): MailItem = js.native
  
  val ReplyRecipients: typingsJapgolly.activexOutlook.Outlook.Recipients = js.native
  
  val RetentionExpirationDate: VarDate = js.native
  
  val RetentionPolicyName: String = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: Any): Unit = js.native
  
  var SaveSentMessageFolder: Folder = js.native
  
  val Saved: Boolean = js.native
  
  def Send(): Unit = js.native
  
  var SendUsingAccount: Account = js.native
  
  val SenderEmailAddress: String = js.native
  
  val SenderEmailType: String = js.native
  
  val SenderName: String = js.native
  
  var Sensitivity: OlSensitivity = js.native
  
  val Sent: Boolean = js.native
  
  val SentOn: VarDate = js.native
  
  val Session: NameSpace = js.native
  
  def ShowCategoriesDialog(): Unit = js.native
  
  val Size: Double = js.native
  
  var Subject: String = js.native
  
  val Submitted: Boolean = js.native
  
  var UnRead: Boolean = js.native
  
  val UserProperties: typingsJapgolly.activexOutlook.Outlook.UserProperties = js.native
}
