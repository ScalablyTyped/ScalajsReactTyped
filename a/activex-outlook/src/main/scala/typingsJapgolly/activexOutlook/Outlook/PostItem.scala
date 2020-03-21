package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.PostItem")
@js.native
class PostItem protected () extends js.Object {
  val Actions: typingsJapgolly.activexOutlook.Outlook.Actions = js.native
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  val Attachments: typingsJapgolly.activexOutlook.Outlook.Attachments = js.native
  val AutoResolvedWinner: Boolean = js.native
  var BillingInformation: String = js.native
  var Body: String = js.native
  var BodyFormat: OlBodyFormat = js.native
  var Categories: String = js.native
  val Class: OlObjectClass = js.native
  var Companies: String = js.native
  val Conflicts: typingsJapgolly.activexOutlook.Outlook.Conflicts = js.native
  val ConversationID: String = js.native
  val ConversationIndex: String = js.native
  val ConversationTopic: String = js.native
  val CreationTime: VarDate = js.native
  val DownloadState: OlDownloadState = js.native
  val EntryID: String = js.native
  var ExpiryTime: VarDate = js.native
  val FormDescription: typingsJapgolly.activexOutlook.Outlook.FormDescription = js.native
  val GetInspector: Inspector = js.native
  var HTMLBody: String = js.native
  var Importance: OlImportance = js.native
  var InternetCodepage: Double = js.native
  val IsConflict: Boolean = js.native
  val IsMarkedAsTask: Boolean = js.native
  val ItemProperties: typingsJapgolly.activexOutlook.Outlook.ItemProperties = js.native
  val LastModificationTime: VarDate = js.native
  val Links: typingsJapgolly.activexOutlook.Outlook.Links = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  var MessageClass: String = js.native
  var Mileage: String = js.native
  var NoAging: Boolean = js.native
  @JSName("Outlook.PostItem_typekey")
  var OutlookDotPostItem_typekey: PostItem = js.native
  val OutlookInternalVersion: Double = js.native
  val OutlookVersion: String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  var RTFBody: js.Any = js.native
  val ReceivedTime: VarDate = js.native
  var ReminderOverrideDefault: Boolean = js.native
  var ReminderPlaySound: Boolean = js.native
  var ReminderSet: Boolean = js.native
  var ReminderSoundFile: String = js.native
  var ReminderTime: VarDate = js.native
  val Saved: Boolean = js.native
  val SenderEmailAddress: String = js.native
  val SenderEmailType: String = js.native
  val SenderName: String = js.native
  var Sensitivity: OlSensitivity = js.native
  val SentOn: VarDate = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  var Subject: String = js.native
  var TaskCompletedDate: VarDate = js.native
  var TaskDueDate: VarDate = js.native
  var TaskStartDate: VarDate = js.native
  var TaskSubject: String = js.native
  var ToDoTaskOrdinal: VarDate = js.native
  var UnRead: Boolean = js.native
  val UserProperties: typingsJapgolly.activexOutlook.Outlook.UserProperties = js.native
  def ClearConversationIndex(): Unit = js.native
  def ClearTaskFlag(): Unit = js.native
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): Unit = js.native
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  def Forward(): MailItem = js.native
  def GetConversation(): Conversation = js.native
  def MarkAsTask(MarkInterval: OlMarkInterval): Unit = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def Post(): Unit = js.native
  def PrintOut(): Unit = js.native
  def Reply(): MailItem = js.native
  def Save(): Unit = js.native
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: js.Any): Unit = js.native
  def SetACLs(): Boolean = js.native
  def ShowCategoriesDialog(): Unit = js.native
}

