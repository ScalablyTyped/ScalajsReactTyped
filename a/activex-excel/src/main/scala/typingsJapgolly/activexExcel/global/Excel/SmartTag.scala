package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.CustomProperties
import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.SmartTagActions
import typingsJapgolly.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.SmartTag")
@js.native
/* private */ open class SmartTag ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.SmartTag {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val DownloadURL: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.SmartTag_typekey")
  var ExcelDotSmartTag_typekey: typingsJapgolly.activexExcel.Excel.SmartTag = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Properties(Index: String): typingsJapgolly.activexExcel.Excel.CustomProperty = js.native
  /* CompleteClass */
  override def Properties(Index: Double): typingsJapgolly.activexExcel.Excel.CustomProperty = js.native
  /* CompleteClass */
  @JSName("Properties")
  override val Properties_Original: CustomProperties = js.native
  
  /* CompleteClass */
  override def Range(Address: String): typingsJapgolly.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  override def Range(RowIndex: Double): typingsJapgolly.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  override def Range(RowIndex: Double, ColumnIndex: Double): typingsJapgolly.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  @JSName("Range")
  override val Range_Original: Range = js.native
  
  /* CompleteClass */
  override def SmartTagActions(Index: Any): typingsJapgolly.activexExcel.Excel.SmartTagAction = js.native
  /* CompleteClass */
  @JSName("SmartTagActions")
  override val SmartTagActions_Original: SmartTagActions = js.native
  
  /* CompleteClass */
  override val XML: String = js.native
  
  /* CompleteClass */
  override val _Default: String = js.native
}
