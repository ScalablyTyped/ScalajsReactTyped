package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.FileDialogFilters
import typingsJapgolly.activexOffice.Office.FileDialogSelectedItems
import typingsJapgolly.activexOffice.Office.MsoFileDialogType
import typingsJapgolly.activexOffice.Office.MsoFileDialogView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.FileDialog")
@js.native
/* private */ open class FileDialog ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.FileDialog {
  
  /* CompleteClass */
  var AllowMultiSelect: Boolean = js.native
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var ButtonName: String = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val DialogType: MsoFileDialogType = js.native
  
  /* CompleteClass */
  override def Execute(): Unit = js.native
  
  /* CompleteClass */
  var FilterIndex: Double = js.native
  
  /* CompleteClass */
  override def Filters(Index: Double): typingsJapgolly.activexOffice.Office.FileDialogFilter = js.native
  /* CompleteClass */
  @JSName("Filters")
  override val Filters_Original: FileDialogFilters = js.native
  
  /* CompleteClass */
  var InitialFileName: String = js.native
  
  /* CompleteClass */
  var InitialView: MsoFileDialogView = js.native
  
  /* CompleteClass */
  override val Item: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.FileDialog_typekey")
  var OfficeDotFileDialog_typekey: typingsJapgolly.activexOffice.Office.FileDialog = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def SelectedItems(Index: Double): String = js.native
  /* CompleteClass */
  @JSName("SelectedItems")
  override val SelectedItems_Original: FileDialogSelectedItems = js.native
  
  /* CompleteClass */
  override def Show(): Double = js.native
  
  /* CompleteClass */
  var Title: String = js.native
}
