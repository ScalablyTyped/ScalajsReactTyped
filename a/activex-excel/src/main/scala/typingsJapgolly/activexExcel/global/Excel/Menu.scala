package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.MenuItems
import typingsJapgolly.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Menu")
@js.native
/* private */ open class Menu ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Menu {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Caption: String = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Menu_typekey")
  var ExcelDotMenu_typekey: typingsJapgolly.activexExcel.Excel.Menu = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override def MenuItems(Index: Any): Any = js.native
  /* CompleteClass */
  @JSName("MenuItems")
  override val MenuItems_Original: MenuItems = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
}
