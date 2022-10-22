package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.XlColorIndex
import typingsJapgolly.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.ErrorCheckingOptions")
@js.native
/* private */ open class ErrorCheckingOptions ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.ErrorCheckingOptions {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var BackgroundChecking: Boolean = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var EmptyCellReferences: Boolean = js.native
  
  /* CompleteClass */
  var EvaluateToError: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.ErrorCheckingOptions_typekey")
  var ExcelDotErrorCheckingOptions_typekey: typingsJapgolly.activexExcel.Excel.ErrorCheckingOptions = js.native
  
  /* CompleteClass */
  var InconsistentFormula: Boolean = js.native
  
  /* CompleteClass */
  var InconsistentTableFormula: Boolean = js.native
  
  /* CompleteClass */
  var IndicatorColorIndex: XlColorIndex = js.native
  
  /* CompleteClass */
  var ListDataValidation: Boolean = js.native
  
  /* CompleteClass */
  var NumberAsText: Boolean = js.native
  
  /* CompleteClass */
  var OmittedCells: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var TextDate: Boolean = js.native
  
  /* CompleteClass */
  var UnlockedFormulaCells: Boolean = js.native
}
