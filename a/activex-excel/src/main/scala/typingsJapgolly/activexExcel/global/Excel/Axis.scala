package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.Range
import typingsJapgolly.activexExcel.Excel.XlAxisCrosses
import typingsJapgolly.activexExcel.Excel.XlAxisGroup
import typingsJapgolly.activexExcel.Excel.XlAxisType
import typingsJapgolly.activexExcel.Excel.XlCategoryType
import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.activexExcel.Excel.XlDisplayUnit
import typingsJapgolly.activexExcel.Excel.XlScaleType
import typingsJapgolly.activexExcel.Excel.XlTickLabelPosition
import typingsJapgolly.activexExcel.Excel.XlTickMark
import typingsJapgolly.activexExcel.Excel.XlTimeUnit
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Axis")
@js.native
/* private */ open class Axis ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Axis {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var AxisBetweenCategories: Boolean = js.native
  
  /* CompleteClass */
  override val AxisGroup: XlAxisGroup = js.native
  
  /* CompleteClass */
  override val AxisTitle: typingsJapgolly.activexExcel.Excel.AxisTitle = js.native
  
  /* CompleteClass */
  var BaseUnit: XlTimeUnit = js.native
  
  /* CompleteClass */
  var BaseUnitIsAuto: Boolean = js.native
  
  /* CompleteClass */
  override val Border: typingsJapgolly.activexExcel.Excel.Border = js.native
  
  /* CompleteClass */
  var CategoryNames: SafeArray[String] | Range = js.native
  
  /* CompleteClass */
  var CategoryType: XlCategoryType = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var Crosses: XlAxisCrosses = js.native
  
  /* CompleteClass */
  var CrossesAt: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Any = js.native
  
  /* CompleteClass */
  var DisplayUnit: XlDisplayUnit = js.native
  
  /* CompleteClass */
  var DisplayUnitCustom: Double = js.native
  
  /* CompleteClass */
  override val DisplayUnitLabel: typingsJapgolly.activexExcel.Excel.DisplayUnitLabel = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Axis_typekey")
  var ExcelDotAxis_typekey: typingsJapgolly.activexExcel.Excel.Axis = js.native
  
  /* CompleteClass */
  override val Format: typingsJapgolly.activexExcel.Excel.ChartFormat = js.native
  
  /* CompleteClass */
  var HasDisplayUnitLabel: Boolean = js.native
  
  /* CompleteClass */
  var HasMajorGridlines: Boolean = js.native
  
  /* CompleteClass */
  var HasMinorGridlines: Boolean = js.native
  
  /* CompleteClass */
  var HasTitle: Boolean = js.native
  
  /* CompleteClass */
  override val Height: Double = js.native
  
  /* CompleteClass */
  override val Left: Double = js.native
  
  /* CompleteClass */
  var LogBase: Double = js.native
  
  /* CompleteClass */
  override val MajorGridlines: typingsJapgolly.activexExcel.Excel.Gridlines = js.native
  
  /* CompleteClass */
  var MajorTickMark: XlTickMark = js.native
  
  /* CompleteClass */
  var MajorUnit: Double = js.native
  
  /* CompleteClass */
  var MajorUnitIsAuto: Boolean = js.native
  
  /* CompleteClass */
  var MajorUnitScale: XlTimeUnit = js.native
  
  /* CompleteClass */
  var MaximumScale: Double = js.native
  
  /* CompleteClass */
  var MaximumScaleIsAuto: Boolean = js.native
  
  /* CompleteClass */
  var MinimumScale: Double = js.native
  
  /* CompleteClass */
  var MinimumScaleIsAuto: Boolean = js.native
  
  /* CompleteClass */
  override val MinorGridlines: typingsJapgolly.activexExcel.Excel.Gridlines = js.native
  
  /* CompleteClass */
  var MinorTickMark: XlTickMark = js.native
  
  /* CompleteClass */
  var MinorUnit: Double = js.native
  
  /* CompleteClass */
  var MinorUnitIsAuto: Boolean = js.native
  
  /* CompleteClass */
  var MinorUnitScale: XlTimeUnit = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var ReversePlotOrder: Boolean = js.native
  
  /* CompleteClass */
  var ScaleType: XlScaleType = js.native
  
  /* CompleteClass */
  override def Select(): Any = js.native
  
  /* CompleteClass */
  var TickLabelPosition: XlTickLabelPosition = js.native
  
  /* CompleteClass */
  var TickLabelSpacing: Double = js.native
  
  /* CompleteClass */
  var TickLabelSpacingIsAuto: Boolean = js.native
  
  /* CompleteClass */
  override val TickLabels: typingsJapgolly.activexExcel.Excel.TickLabels = js.native
  
  /* CompleteClass */
  var TickMarkSpacing: Double = js.native
  
  /* CompleteClass */
  override val Top: Double = js.native
  
  /* CompleteClass */
  var Type: XlAxisType = js.native
  
  /* CompleteClass */
  override val Width: Double = js.native
}
