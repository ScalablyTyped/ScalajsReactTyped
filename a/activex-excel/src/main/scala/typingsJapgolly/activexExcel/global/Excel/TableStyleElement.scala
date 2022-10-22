package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Borders
import typingsJapgolly.activexExcel.Excel.XlBordersIndex
import typingsJapgolly.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.TableStyleElement")
@js.native
/* private */ open class TableStyleElement ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.TableStyleElement {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def Borders(Index: XlBordersIndex): typingsJapgolly.activexExcel.Excel.Border = js.native
  /* CompleteClass */
  @JSName("Borders")
  override val Borders_Original: Borders = js.native
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.TableStyleElement_typekey")
  var ExcelDotTableStyleElement_typekey: typingsJapgolly.activexExcel.Excel.TableStyleElement = js.native
  
  /* CompleteClass */
  override val Font: typingsJapgolly.activexExcel.Excel.Font = js.native
  
  /* CompleteClass */
  override val HasFormat: Boolean = js.native
  
  /* CompleteClass */
  override val Interior: typingsJapgolly.activexExcel.Excel.Interior = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var StripeSize: Double = js.native
}
