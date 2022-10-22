package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.XlColorIndex
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlPattern
import typingsJapgolly.activexExcel.Excel.XlRgbColor
import typingsJapgolly.activexExcel.Excel.XlThemeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Interior")
@js.native
/* private */ open class Interior ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Interior {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Color: XlRgbColor | Double = js.native
  
  /* CompleteClass */
  var ColorIndex: Double | XlColorIndex = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Interior_typekey")
  var ExcelDotInterior_typekey: typingsJapgolly.activexExcel.Excel.Interior = js.native
  
  /* CompleteClass */
  override val Gradient: Any = js.native
  
  /* CompleteClass */
  var InvertIfNegative: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Pattern: XlPattern = js.native
  
  /* CompleteClass */
  var PatternColor: XlRgbColor | Double = js.native
  
  /* CompleteClass */
  var PatternColorIndex: Double | XlColorIndex = js.native
  
  /* CompleteClass */
  var PatternThemeColor: XlThemeColor = js.native
  
  /* CompleteClass */
  var PatternTintAndShade: Double = js.native
  
  /* CompleteClass */
  var ThemeColor: XlThemeColor = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
}
