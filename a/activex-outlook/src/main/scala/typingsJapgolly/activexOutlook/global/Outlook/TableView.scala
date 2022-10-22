package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlAutoPreview
import typingsJapgolly.activexOutlook.Outlook.OlDefaultExpandCollapseSetting
import typingsJapgolly.activexOutlook.Outlook.OlGridLineStyle
import typingsJapgolly.activexOutlook.Outlook.OlMultiLine
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.activexOutlook.Outlook.OlViewSaveOption
import typingsJapgolly.activexOutlook.Outlook.OlViewType
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.TableView")
@js.native
/* private */ open class TableView ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.TableView {
  
  /* CompleteClass */
  var AllowInCellEditing: Boolean = js.native
  
  /* CompleteClass */
  var AlwaysExpandConversation: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override def Apply(): Unit = js.native
  
  /* CompleteClass */
  override val AutoFormatRules: typingsJapgolly.activexOutlook.Outlook.AutoFormatRules = js.native
  
  /* CompleteClass */
  var AutoPreview: OlAutoPreview = js.native
  
  /* CompleteClass */
  override val AutoPreviewFont: typingsJapgolly.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  var AutomaticColumnSizing: Boolean = js.native
  
  /* CompleteClass */
  var AutomaticGrouping: Boolean = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val ColumnFont: typingsJapgolly.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  override def Copy(Name: String, SaveOption: OlViewSaveOption): typingsJapgolly.activexOutlook.Outlook.View = js.native
  
  /* CompleteClass */
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Filter: String = js.native
  
  /* CompleteClass */
  override def GetTable(): typingsJapgolly.activexOutlook.Outlook.Table = js.native
  
  /* CompleteClass */
  override def GoToDate(Date: VarDate): Unit = js.native
  
  /* CompleteClass */
  var GridLineStyle: OlGridLineStyle = js.native
  
  /* CompleteClass */
  override val GroupByFields: typingsJapgolly.activexOutlook.Outlook.OrderFields = js.native
  
  /* CompleteClass */
  var HideReadingPaneHeaderInfo: Boolean = js.native
  
  /* CompleteClass */
  var Language: String = js.native
  
  /* CompleteClass */
  var LockUserChanges: Boolean = js.native
  
  /* CompleteClass */
  var MaxLinesInMultiLineView: Double = js.native
  
  /* CompleteClass */
  var MultiLine: OlMultiLine = js.native
  
  /* CompleteClass */
  var MultiLineWidth: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.TableView_typekey")
  var OutlookDotTableView_typekey: typingsJapgolly.activexOutlook.Outlook.TableView = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Reset(): Unit = js.native
  
  /* CompleteClass */
  override val RowFont: typingsJapgolly.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  override val SaveOption: OlViewSaveOption = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var ShowConversationByDate: Boolean = js.native
  
  /* CompleteClass */
  var ShowConversationSendersAboveSubject: Boolean = js.native
  
  /* CompleteClass */
  var ShowFullConversations: Boolean = js.native
  
  /* CompleteClass */
  var ShowItemsInGroups: Boolean = js.native
  
  /* CompleteClass */
  var ShowNewItemRow: Boolean = js.native
  
  /* CompleteClass */
  var ShowReadingPane: Boolean = js.native
  
  /* CompleteClass */
  var ShowUnreadAndFlaggedMessages: Boolean = js.native
  
  /* CompleteClass */
  override val SortFields: typingsJapgolly.activexOutlook.Outlook.OrderFields = js.native
  
  /* CompleteClass */
  override val Standard: Boolean = js.native
  
  /* CompleteClass */
  override val ViewFields: typingsJapgolly.activexOutlook.Outlook.ViewFields = js.native
  
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  
  /* CompleteClass */
  var XML: String = js.native
}
