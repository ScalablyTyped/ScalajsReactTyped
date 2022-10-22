package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.Ranges
import typingsJapgolly.activexExcel.Excel.XlConnectionType
import typingsJapgolly.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.WorkbookConnection")
@js.native
/* private */ open class WorkbookConnection ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.WorkbookConnection {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Description: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.WorkbookConnection_typekey")
  var ExcelDotWorkbookConnection_typekey: typingsJapgolly.activexExcel.Excel.WorkbookConnection = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val ODBCConnection: typingsJapgolly.activexExcel.Excel.ODBCConnection = js.native
  
  /* CompleteClass */
  override val OLEDBConnection: typingsJapgolly.activexExcel.Excel.OLEDBConnection = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Ranges(Index: Any): Range = js.native
  /* CompleteClass */
  @JSName("Ranges")
  override val Ranges_Original: Ranges = js.native
  
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /* CompleteClass */
  override val Type: XlConnectionType = js.native
  
  /* CompleteClass */
  var _Default: String = js.native
}
