package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoteItem extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  val AutoResolvedWinner: Boolean = js.native
  
  var Body: String = js.native
  
  var Categories: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  
  var Color: OlNoteColor = js.native
  
  val Conflicts: typingsJapgolly.activexOutlook.Outlook.Conflicts = js.native
  
  def Copy(): Any = js.native
  
  val CreationTime: VarDate = js.native
  
  def Delete(): Unit = js.native
  
  def Display(): Unit = js.native
  def Display(Modal: Any): Unit = js.native
  
  val DownloadState: OlDownloadState = js.native
  
  val EntryID: String = js.native
  
  val GetInspector: Inspector = js.native
  
  var Height: Double = js.native
  
  val IsConflict: Boolean = js.native
  
  val ItemProperties: typingsJapgolly.activexOutlook.Outlook.ItemProperties = js.native
  
  val LastModificationTime: VarDate = js.native
  
  var Left: Double = js.native
  
  val Links: typingsJapgolly.activexOutlook.Outlook.Links = js.native
  
  var MarkForDownload: OlRemoteStatus = js.native
  
  var MessageClass: String = js.native
  
  def Move(DestFldr: Folder): Any = js.native
  
  /* private */ @JSName("Outlook.NoteItem_typekey")
  var OutlookDotNoteItem_typekey: NoteItem = js.native
  
  val Parent: Any = js.native
  
  def PrintOut(): Unit = js.native
  
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: Any): Unit = js.native
  
  val Saved: Boolean = js.native
  
  val Session: NameSpace = js.native
  
  val Size: Double = js.native
  
  val Subject: String = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
}
