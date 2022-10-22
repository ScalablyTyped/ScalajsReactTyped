package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axis extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  var AxisBetweenCategories: Boolean
  
  val AxisGroup: XlAxisGroup
  
  val AxisTitle: typingsJapgolly.activexExcel.Excel.AxisTitle
  
  var BaseUnit: XlTimeUnit
  
  var BaseUnitIsAuto: Boolean
  
  val Border: typingsJapgolly.activexExcel.Excel.Border
  
  var CategoryNames: SafeArray[String] | Range
  
  var CategoryType: XlCategoryType
  
  val Creator: XlCreator
  
  var Crosses: XlAxisCrosses
  
  var CrossesAt: Double
  
  def Delete(): Any
  
  var DisplayUnit: XlDisplayUnit
  
  var DisplayUnitCustom: Double
  
  val DisplayUnitLabel: typingsJapgolly.activexExcel.Excel.DisplayUnitLabel
  
  /* private */ @JSName("Excel.Axis_typekey")
  var ExcelDotAxis_typekey: Axis
  
  val Format: ChartFormat
  
  var HasDisplayUnitLabel: Boolean
  
  var HasMajorGridlines: Boolean
  
  var HasMinorGridlines: Boolean
  
  var HasTitle: Boolean
  
  val Height: Double
  
  val Left: Double
  
  var LogBase: Double
  
  val MajorGridlines: Gridlines
  
  var MajorTickMark: XlTickMark
  
  var MajorUnit: Double
  
  var MajorUnitIsAuto: Boolean
  
  var MajorUnitScale: XlTimeUnit
  
  var MaximumScale: Double
  
  var MaximumScaleIsAuto: Boolean
  
  var MinimumScale: Double
  
  var MinimumScaleIsAuto: Boolean
  
  val MinorGridlines: Gridlines
  
  var MinorTickMark: XlTickMark
  
  var MinorUnit: Double
  
  var MinorUnitIsAuto: Boolean
  
  var MinorUnitScale: XlTimeUnit
  
  val Parent: Any
  
  var ReversePlotOrder: Boolean
  
  var ScaleType: XlScaleType
  
  def Select(): Any
  
  var TickLabelPosition: XlTickLabelPosition
  
  var TickLabelSpacing: Double
  
  var TickLabelSpacingIsAuto: Boolean
  
  val TickLabels: typingsJapgolly.activexExcel.Excel.TickLabels
  
  var TickMarkSpacing: Double
  
  val Top: Double
  
  var Type: XlAxisType
  
  val Width: Double
}
object Axis {
  
  inline def apply(
    Application: Application,
    AxisBetweenCategories: Boolean,
    AxisGroup: XlAxisGroup,
    AxisTitle: AxisTitle,
    BaseUnit: XlTimeUnit,
    BaseUnitIsAuto: Boolean,
    Border: Border,
    CategoryNames: SafeArray[String] | Range,
    CategoryType: XlCategoryType,
    Creator: XlCreator,
    Crosses: XlAxisCrosses,
    CrossesAt: Double,
    Delete: CallbackTo[Any],
    DisplayUnit: XlDisplayUnit,
    DisplayUnitCustom: Double,
    DisplayUnitLabel: DisplayUnitLabel,
    ExcelDotAxis_typekey: Axis,
    Format: ChartFormat,
    HasDisplayUnitLabel: Boolean,
    HasMajorGridlines: Boolean,
    HasMinorGridlines: Boolean,
    HasTitle: Boolean,
    Height: Double,
    Left: Double,
    LogBase: Double,
    MajorGridlines: Gridlines,
    MajorTickMark: XlTickMark,
    MajorUnit: Double,
    MajorUnitIsAuto: Boolean,
    MajorUnitScale: XlTimeUnit,
    MaximumScale: Double,
    MaximumScaleIsAuto: Boolean,
    MinimumScale: Double,
    MinimumScaleIsAuto: Boolean,
    MinorGridlines: Gridlines,
    MinorTickMark: XlTickMark,
    MinorUnit: Double,
    MinorUnitIsAuto: Boolean,
    MinorUnitScale: XlTimeUnit,
    Parent: Any,
    ReversePlotOrder: Boolean,
    ScaleType: XlScaleType,
    Select: CallbackTo[Any],
    TickLabelPosition: XlTickLabelPosition,
    TickLabelSpacing: Double,
    TickLabelSpacingIsAuto: Boolean,
    TickLabels: TickLabels,
    TickMarkSpacing: Double,
    Top: Double,
    Type: XlAxisType,
    Width: Double
  ): Axis = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AxisBetweenCategories = AxisBetweenCategories.asInstanceOf[js.Any], AxisGroup = AxisGroup.asInstanceOf[js.Any], AxisTitle = AxisTitle.asInstanceOf[js.Any], BaseUnit = BaseUnit.asInstanceOf[js.Any], BaseUnitIsAuto = BaseUnitIsAuto.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], CategoryNames = CategoryNames.asInstanceOf[js.Any], CategoryType = CategoryType.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Crosses = Crosses.asInstanceOf[js.Any], CrossesAt = CrossesAt.asInstanceOf[js.Any], Delete = Delete.toJsFn, DisplayUnit = DisplayUnit.asInstanceOf[js.Any], DisplayUnitCustom = DisplayUnitCustom.asInstanceOf[js.Any], DisplayUnitLabel = DisplayUnitLabel.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasDisplayUnitLabel = HasDisplayUnitLabel.asInstanceOf[js.Any], HasMajorGridlines = HasMajorGridlines.asInstanceOf[js.Any], HasMinorGridlines = HasMinorGridlines.asInstanceOf[js.Any], HasTitle = HasTitle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], LogBase = LogBase.asInstanceOf[js.Any], MajorGridlines = MajorGridlines.asInstanceOf[js.Any], MajorTickMark = MajorTickMark.asInstanceOf[js.Any], MajorUnit = MajorUnit.asInstanceOf[js.Any], MajorUnitIsAuto = MajorUnitIsAuto.asInstanceOf[js.Any], MajorUnitScale = MajorUnitScale.asInstanceOf[js.Any], MaximumScale = MaximumScale.asInstanceOf[js.Any], MaximumScaleIsAuto = MaximumScaleIsAuto.asInstanceOf[js.Any], MinimumScale = MinimumScale.asInstanceOf[js.Any], MinimumScaleIsAuto = MinimumScaleIsAuto.asInstanceOf[js.Any], MinorGridlines = MinorGridlines.asInstanceOf[js.Any], MinorTickMark = MinorTickMark.asInstanceOf[js.Any], MinorUnit = MinorUnit.asInstanceOf[js.Any], MinorUnitIsAuto = MinorUnitIsAuto.asInstanceOf[js.Any], MinorUnitScale = MinorUnitScale.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReversePlotOrder = ReversePlotOrder.asInstanceOf[js.Any], ScaleType = ScaleType.asInstanceOf[js.Any], Select = Select.toJsFn, TickLabelPosition = TickLabelPosition.asInstanceOf[js.Any], TickLabelSpacing = TickLabelSpacing.asInstanceOf[js.Any], TickLabelSpacingIsAuto = TickLabelSpacingIsAuto.asInstanceOf[js.Any], TickLabels = TickLabels.asInstanceOf[js.Any], TickMarkSpacing = TickMarkSpacing.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Axis_typekey")(ExcelDotAxis_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  
  extension [Self <: Axis](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAxisBetweenCategories(value: Boolean): Self = StObject.set(x, "AxisBetweenCategories", value.asInstanceOf[js.Any])
    
    inline def setAxisGroup(value: XlAxisGroup): Self = StObject.set(x, "AxisGroup", value.asInstanceOf[js.Any])
    
    inline def setAxisTitle(value: AxisTitle): Self = StObject.set(x, "AxisTitle", value.asInstanceOf[js.Any])
    
    inline def setBaseUnit(value: XlTimeUnit): Self = StObject.set(x, "BaseUnit", value.asInstanceOf[js.Any])
    
    inline def setBaseUnitIsAuto(value: Boolean): Self = StObject.set(x, "BaseUnitIsAuto", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCategoryNames(value: SafeArray[String] | Range): Self = StObject.set(x, "CategoryNames", value.asInstanceOf[js.Any])
    
    inline def setCategoryType(value: XlCategoryType): Self = StObject.set(x, "CategoryType", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCrosses(value: XlAxisCrosses): Self = StObject.set(x, "Crosses", value.asInstanceOf[js.Any])
    
    inline def setCrossesAt(value: Double): Self = StObject.set(x, "CrossesAt", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: CallbackTo[Any]): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setDisplayUnit(value: XlDisplayUnit): Self = StObject.set(x, "DisplayUnit", value.asInstanceOf[js.Any])
    
    inline def setDisplayUnitCustom(value: Double): Self = StObject.set(x, "DisplayUnitCustom", value.asInstanceOf[js.Any])
    
    inline def setDisplayUnitLabel(value: DisplayUnitLabel): Self = StObject.set(x, "DisplayUnitLabel", value.asInstanceOf[js.Any])
    
    inline def setExcelDotAxis_typekey(value: Axis): Self = StObject.set(x, "Excel.Axis_typekey", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setHasDisplayUnitLabel(value: Boolean): Self = StObject.set(x, "HasDisplayUnitLabel", value.asInstanceOf[js.Any])
    
    inline def setHasMajorGridlines(value: Boolean): Self = StObject.set(x, "HasMajorGridlines", value.asInstanceOf[js.Any])
    
    inline def setHasMinorGridlines(value: Boolean): Self = StObject.set(x, "HasMinorGridlines", value.asInstanceOf[js.Any])
    
    inline def setHasTitle(value: Boolean): Self = StObject.set(x, "HasTitle", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setLogBase(value: Double): Self = StObject.set(x, "LogBase", value.asInstanceOf[js.Any])
    
    inline def setMajorGridlines(value: Gridlines): Self = StObject.set(x, "MajorGridlines", value.asInstanceOf[js.Any])
    
    inline def setMajorTickMark(value: XlTickMark): Self = StObject.set(x, "MajorTickMark", value.asInstanceOf[js.Any])
    
    inline def setMajorUnit(value: Double): Self = StObject.set(x, "MajorUnit", value.asInstanceOf[js.Any])
    
    inline def setMajorUnitIsAuto(value: Boolean): Self = StObject.set(x, "MajorUnitIsAuto", value.asInstanceOf[js.Any])
    
    inline def setMajorUnitScale(value: XlTimeUnit): Self = StObject.set(x, "MajorUnitScale", value.asInstanceOf[js.Any])
    
    inline def setMaximumScale(value: Double): Self = StObject.set(x, "MaximumScale", value.asInstanceOf[js.Any])
    
    inline def setMaximumScaleIsAuto(value: Boolean): Self = StObject.set(x, "MaximumScaleIsAuto", value.asInstanceOf[js.Any])
    
    inline def setMinimumScale(value: Double): Self = StObject.set(x, "MinimumScale", value.asInstanceOf[js.Any])
    
    inline def setMinimumScaleIsAuto(value: Boolean): Self = StObject.set(x, "MinimumScaleIsAuto", value.asInstanceOf[js.Any])
    
    inline def setMinorGridlines(value: Gridlines): Self = StObject.set(x, "MinorGridlines", value.asInstanceOf[js.Any])
    
    inline def setMinorTickMark(value: XlTickMark): Self = StObject.set(x, "MinorTickMark", value.asInstanceOf[js.Any])
    
    inline def setMinorUnit(value: Double): Self = StObject.set(x, "MinorUnit", value.asInstanceOf[js.Any])
    
    inline def setMinorUnitIsAuto(value: Boolean): Self = StObject.set(x, "MinorUnitIsAuto", value.asInstanceOf[js.Any])
    
    inline def setMinorUnitScale(value: XlTimeUnit): Self = StObject.set(x, "MinorUnitScale", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReversePlotOrder(value: Boolean): Self = StObject.set(x, "ReversePlotOrder", value.asInstanceOf[js.Any])
    
    inline def setScaleType(value: XlScaleType): Self = StObject.set(x, "ScaleType", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: CallbackTo[Any]): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setTickLabelPosition(value: XlTickLabelPosition): Self = StObject.set(x, "TickLabelPosition", value.asInstanceOf[js.Any])
    
    inline def setTickLabelSpacing(value: Double): Self = StObject.set(x, "TickLabelSpacing", value.asInstanceOf[js.Any])
    
    inline def setTickLabelSpacingIsAuto(value: Boolean): Self = StObject.set(x, "TickLabelSpacingIsAuto", value.asInstanceOf[js.Any])
    
    inline def setTickLabels(value: TickLabels): Self = StObject.set(x, "TickLabels", value.asInstanceOf[js.Any])
    
    inline def setTickMarkSpacing(value: Double): Self = StObject.set(x, "TickMarkSpacing", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setType(value: XlAxisType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
