package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.activexOutlook.Outlook.OlViewSaveOption
import typingsJapgolly.activexOutlook.Outlook.OlViewType
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.CardView")
@js.native
/* private */ open class CardView ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.CardView {
  
  /* CompleteClass */
  var AllowInCellEditing: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override def Apply(): Unit = js.native
  
  /* CompleteClass */
  override val AutoFormatRules: typingsJapgolly.activexOutlook.Outlook.AutoFormatRules = js.native
  
  /* CompleteClass */
  override val BodyFont: typingsJapgolly.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def Copy(Name: String, SaveOption: OlViewSaveOption): typingsJapgolly.activexOutlook.Outlook.View = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Filter: String = js.native
  
  /* CompleteClass */
  override def GoToDate(Date: VarDate): Unit = js.native
  
  /* CompleteClass */
  override val HeadingsFont: typingsJapgolly.activexOutlook.Outlook.ViewFont = js.native
  
  /* CompleteClass */
  var Language: String = js.native
  
  /* CompleteClass */
  var LockUserChanges: Boolean = js.native
  
  /* CompleteClass */
  var MultiLineFieldHeight: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.CardView_typekey")
  var OutlookDotCardView_typekey: typingsJapgolly.activexOutlook.Outlook.CardView = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Reset(): Unit = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  override val SaveOption: OlViewSaveOption = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var ShowEmptyFields: Boolean = js.native
  
  /* CompleteClass */
  override val SortFields: typingsJapgolly.activexOutlook.Outlook.OrderFields = js.native
  
  /* CompleteClass */
  override val Standard: Boolean = js.native
  
  /* CompleteClass */
  override val ViewFields: typingsJapgolly.activexOutlook.Outlook.ViewFields = js.native
  
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  
  /* CompleteClass */
  var Width: Double = js.native
  
  /* CompleteClass */
  var XML: String = js.native
}
