package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailItem extends StObject {
  
  val Actions: typingsJapgolly.activexOutlook.Outlook.Actions = js.native
  
  def AddBusinessCard(contact: ContactItem): Unit = js.native
  
  var AlternateRecipientAllowed: Boolean = js.native
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  val Attachments: typingsJapgolly.activexOutlook.Outlook.Attachments = js.native
  
  var AutoForwarded: Boolean = js.native
  
  val AutoResolvedWinner: Boolean = js.native
  
  var BCC: String = js.native
  
  var BillingInformation: String = js.native
  
  var Body: String = js.native
  
  var BodyFormat: OlBodyFormat = js.native
  
  var CC: String = js.native
  
  var Categories: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def ClearConversationIndex(): Unit = js.native
  
  def ClearTaskFlag(): Unit = js.native
  
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
  def Display(Modal: Boolean): Unit = js.native
  
  val DownloadState: OlDownloadState = js.native
  
  var EnableSharedAttachments: Boolean = js.native
  
  val EntryID: String = js.native
  
  var ExpiryTime: VarDate = js.native
  
  var FlagDueBy: VarDate = js.native
  
  var FlagIcon: OlFlagIcon = js.native
  
  var FlagRequest: String = js.native
  
  var FlagStatus: OlFlagStatus = js.native
  
  val FormDescription: typingsJapgolly.activexOutlook.Outlook.FormDescription = js.native
  
  def Forward(): MailItem = js.native
  
  def GetConversation(): Conversation = js.native
  
  val GetInspector: Inspector = js.native
  
  var HTMLBody: String = js.native
  
  var HasCoverSheet: Boolean = js.native
  
  var Importance: OlImportance = js.native
  
  var InternetCodepage: Double = js.native
  
  val IsConflict: Boolean = js.native
  
  var IsIPFax: Boolean = js.native
  
  val IsMarkedAsTask: Boolean = js.native
  
  val ItemProperties: typingsJapgolly.activexOutlook.Outlook.ItemProperties = js.native
  
  val LastModificationTime: VarDate = js.native
  
  val Links: typingsJapgolly.activexOutlook.Outlook.Links = js.native
  
  val MAPIOBJECT: Any = js.native
  
  def MarkAsTask(MarkInterval: OlMarkInterval): Unit = js.native
  
  var MarkForDownload: OlRemoteStatus = js.native
  
  var MessageClass: String = js.native
  
  var Mileage: String = js.native
  
  def Move(DestFldr: Folder): Any = js.native
  
  var NoAging: Boolean = js.native
  
  var OriginatorDeliveryReportRequested: Boolean = js.native
  
  /* private */ @JSName("Outlook.MailItem_typekey")
  var OutlookDotMailItem_typekey: MailItem = js.native
  
  val OutlookInternalVersion: Double = js.native
  
  val OutlookVersion: String = js.native
  
  val Parent: Any = js.native
  
  var Permission: OlPermission = js.native
  
  var PermissionService: OlPermissionService = js.native
  
  var PermissionTemplateGuid: String = js.native
  
  def PrintOut(): Unit = js.native
  
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  
  var RTFBody: Any = js.native
  
  var ReadReceiptRequested: Boolean = js.native
  
  val ReceivedByEntryID: String = js.native
  
  val ReceivedByName: String = js.native
  
  val ReceivedOnBehalfOfEntryID: String = js.native
  
  val ReceivedOnBehalfOfName: String = js.native
  
  val ReceivedTime: VarDate = js.native
  
  var RecipientReassignmentProhibited: Boolean = js.native
  
  val Recipients: typingsJapgolly.activexOutlook.Outlook.Recipients = js.native
  
  var ReminderOverrideDefault: Boolean = js.native
  
  var ReminderPlaySound: Boolean = js.native
  
  var ReminderSet: Boolean = js.native
  
  var ReminderSoundFile: String = js.native
  
  var ReminderTime: VarDate = js.native
  
  var RemoteStatus: OlRemoteStatus = js.native
  
  def Reply(): MailItem = js.native
  
  def ReplyAll(): MailItem = js.native
  
  val ReplyRecipientNames: String = js.native
  
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
  
  var Sender: AddressEntry = js.native
  
  val SenderEmailAddress: String = js.native
  
  val SenderEmailType: String = js.native
  
  val SenderName: String = js.native
  
  var Sensitivity: OlSensitivity = js.native
  
  val Sent: Boolean = js.native
  
  val SentOn: VarDate = js.native
  
  var SentOnBehalfOfName: String = js.native
  
  val Session: NameSpace = js.native
  
  def ShowCategoriesDialog(): Unit = js.native
  
  val Size: Double = js.native
  
  var Subject: String = js.native
  
  val Submitted: Boolean = js.native
  
  var TaskCompletedDate: VarDate = js.native
  
  var TaskDueDate: VarDate = js.native
  
  var TaskStartDate: VarDate = js.native
  
  var TaskSubject: String = js.native
  
  var To: String = js.native
  
  var ToDoTaskOrdinal: VarDate = js.native
  
  var UnRead: Boolean = js.native
  
  val UserProperties: typingsJapgolly.activexOutlook.Outlook.UserProperties = js.native
  
  var VotingOptions: String = js.native
  
  var VotingResponse: String = js.native
}
