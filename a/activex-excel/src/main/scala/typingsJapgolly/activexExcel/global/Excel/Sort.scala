package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.SortFields
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlSortMethod
import typingsJapgolly.activexExcel.Excel.XlSortOrientation
import typingsJapgolly.activexExcel.Excel.XlYesNoGuess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Sort")
@js.native
/* private */ open class Sort ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Sort {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def Apply(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Sort_typekey")
  var ExcelDotSort_typekey: typingsJapgolly.activexExcel.Excel.Sort = js.native
  
  /* CompleteClass */
  var Header: XlYesNoGuess = js.native
  
  /* CompleteClass */
  var MatchCase: Boolean = js.native
  
  /* CompleteClass */
  var Orientation: XlSortOrientation = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Rng(Address: String): Range = js.native
  /* CompleteClass */
  override def Rng(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def Rng(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("Rng")
  override val Rng_Original: Range = js.native
  
  /* CompleteClass */
  override def SetRange(Rng: Range): Unit = js.native
  
  /* CompleteClass */
  override def SortFields(Index: Any): typingsJapgolly.activexExcel.Excel.SortField = js.native
  /* CompleteClass */
  @JSName("SortFields")
  override val SortFields_Original: SortFields = js.native
  
  /* CompleteClass */
  var SortMethod: XlSortMethod = js.native
}
