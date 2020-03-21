package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.JournalItem")
@js.native
class JournalItem protected () extends js.Object {
  val Actions: typingsJapgolly.activexOutlook.Outlook.Actions = js.native
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  val Attachments: typingsJapgolly.activexOutlook.Outlook.Attachments = js.native
  val AutoResolvedWinner: Boolean = js.native
  var BillingInformation: String = js.native
  var Body: String = js.native
  var Categories: String = js.native
  val Class: OlObjectClass = js.native
  var Companies: String = js.native
  val Conflicts: typingsJapgolly.activexOutlook.Outlook.Conflicts = js.native
  var ContactNames: String = js.native
  val ConversationID: String = js.native
  val ConversationIndex: String = js.native
  val ConversationTopic: String = js.native
  val CreationTime: VarDate = js.native
  var DocPosted: Boolean = js.native
  var DocPrinted: Boolean = js.native
  var DocRouted: Boolean = js.native
  var DocSaved: Boolean = js.native
  val DownloadState: OlDownloadState = js.native
  var Duration: Double = js.native
  var End: VarDate = js.native
  val EntryID: String = js.native
  val FormDescription: typingsJapgolly.activexOutlook.Outlook.FormDescription = js.native
  val GetInspector: Inspector = js.native
  var Importance: OlImportance = js.native
  val IsConflict: Boolean = js.native
  val ItemProperties: typingsJapgolly.activexOutlook.Outlook.ItemProperties = js.native
  val LastModificationTime: VarDate = js.native
  val Links: typingsJapgolly.activexOutlook.Outlook.Links = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  var MessageClass: String = js.native
  var Mileage: String = js.native
  var NoAging: Boolean = js.native
  @JSName("Outlook.JournalItem_typekey")
  var OutlookDotJournalItem_typekey: JournalItem = js.native
  val OutlookInternalVersion: Double = js.native
  val OutlookVersion: String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  val Recipients: typingsJapgolly.activexOutlook.Outlook.Recipients = js.native
  val Saved: Boolean = js.native
  var Sensitivity: OlSensitivity = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  var Start: VarDate = js.native
  var Subject: String = js.native
  var Type: String = js.native
  var UnRead: Boolean = js.native
  val UserProperties: typingsJapgolly.activexOutlook.Outlook.UserProperties = js.native
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): Unit = js.native
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  def Forward(): MailItem = js.native
  def GetConversation(): Conversation = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): Unit = js.native
  def Reply(): MailItem = js.native
  def ReplyAll(): MailItem = js.native
  def Save(): Unit = js.native
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: js.Any): Unit = js.native
  def ShowCategoriesDialog(): Unit = js.native
  def StartTimer(): Unit = js.native
  def StopTimer(): Unit = js.native
}

