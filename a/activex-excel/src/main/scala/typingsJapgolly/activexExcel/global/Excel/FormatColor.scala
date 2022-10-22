package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.XlColorIndex
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlRgbColor
import typingsJapgolly.activexExcel.Excel.XlThemeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.FormatColor")
@js.native
/* private */ open class FormatColor ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.FormatColor {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Color: XlRgbColor | Double = js.native
  
  /* CompleteClass */
  var ColorIndex: XlColorIndex = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.FormatColor_typekey")
  var ExcelDotFormatColor_typekey: typingsJapgolly.activexExcel.Excel.FormatColor = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var ThemeColor: XlThemeColor = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
}
