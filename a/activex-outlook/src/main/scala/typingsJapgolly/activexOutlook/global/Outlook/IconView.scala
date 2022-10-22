package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlIconViewPlacement
import typingsJapgolly.activexOutlook.Outlook.OlIconViewType
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.activexOutlook.Outlook.OlViewSaveOption
import typingsJapgolly.activexOutlook.Outlook.OlViewType
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.IconView")
@js.native
/* private */ open class IconView ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.IconView {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override def Apply(): Unit = js.native
  
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
  var IconPlacement: OlIconViewPlacement = js.native
  
  /* CompleteClass */
  var IconViewType: OlIconViewType = js.native
  
  /* CompleteClass */
  var Language: String = js.native
  
  /* CompleteClass */
  var LockUserChanges: Boolean = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.IconView_typekey")
  var OutlookDotIconView_typekey: typingsJapgolly.activexOutlook.Outlook.IconView = js.native
  
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
  override val SortFields: typingsJapgolly.activexOutlook.Outlook.OrderFields = js.native
  
  /* CompleteClass */
  override val Standard: Boolean = js.native
  
  /* CompleteClass */
  override val ViewType: OlViewType = js.native
  
  /* CompleteClass */
  var XML: String = js.native
}
