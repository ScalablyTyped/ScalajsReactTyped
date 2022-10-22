package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Menus
import typingsJapgolly.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.MenuBar")
@js.native
/* private */ open class MenuBar ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.MenuBar {
  
  /* CompleteClass */
  override def Activate(): Unit = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val BuiltIn: Boolean = js.native
  
  /* CompleteClass */
  var Caption: String = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.MenuBar_typekey")
  var ExcelDotMenuBar_typekey: typingsJapgolly.activexExcel.Excel.MenuBar = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override def Menus(Index: Any): typingsJapgolly.activexExcel.Excel.Menu = js.native
  /* CompleteClass */
  @JSName("Menus")
  override val Menus_Original: Menus = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Reset(): Unit = js.native
}
