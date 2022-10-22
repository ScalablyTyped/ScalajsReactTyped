package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlParameterDataType
import typingsJapgolly.activexExcel.Excel.XlParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Parameter")
@js.native
/* private */ open class Parameter ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Parameter {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var DataType: XlParameterDataType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Parameter_typekey")
  var ExcelDotParameter_typekey: typingsJapgolly.activexExcel.Excel.Parameter = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val PromptString: String = js.native
  
  /* CompleteClass */
  var RefreshOnChange: Boolean = js.native
  
  /* CompleteClass */
  override def SetParam(Type: XlParameterType, Value: Any): Unit = js.native
  
  /* CompleteClass */
  override def SourceRange(Address: String): Range = js.native
  /* CompleteClass */
  override def SourceRange(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def SourceRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("SourceRange")
  override val SourceRange_Original: Range = js.native
  
  /* CompleteClass */
  override val Type: XlParameterType = js.native
  
  /* CompleteClass */
  override val Value: Any = js.native
}
