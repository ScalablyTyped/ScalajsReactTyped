package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlThreadMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.MultiThreadedCalculation")
@js.native
/* private */ open class MultiThreadedCalculation ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.MultiThreadedCalculation {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.MultiThreadedCalculation_typekey")
  var ExcelDotMultiThreadedCalculation_typekey: typingsJapgolly.activexExcel.Excel.MultiThreadedCalculation = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var ThreadCount: Double = js.native
  
  /* CompleteClass */
  var ThreadMode: XlThreadMode = js.native
}
