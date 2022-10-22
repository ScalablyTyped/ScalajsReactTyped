package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineGroup extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Axes: SparkAxes
  
  val Count: Double
  
  val Creator: XlCreator
  
  var DateRange: String
  
  def Delete(): Unit
  
  var DisplayBlanksAs: XlDisplayBlanksAs
  
  var DisplayHidden: Boolean
  
  /* private */ @JSName("Excel.SparklineGroup_typekey")
  var ExcelDotSparklineGroup_typekey: SparklineGroup
  
  def Item(Index: Any): Sparkline
  
  var LineWeight: Any
  
  def Location(Address: String): Range
  def Location(RowIndex: Double): Range
  def Location(RowIndex: Double, ColumnIndex: Double): Range
  @JSName("Location")
  var Location_Original: Range
  
  def Modify(Location: Range, SourceData: String): Unit
  
  def ModifyDateRange(DateRange: String): Unit
  
  def ModifyLocation(Location: Range): Unit
  
  def ModifySourceData(SourceData: String): Unit
  
  val Parent: Any
  
  var PlotBy: XlSparklineRowCol
  
  val Points: SparkPoints
  
  val SeriesColor: FormatColor
  
  var SourceData: String
  
  var Type: XlSparkType
}
object SparklineGroup {
  
  inline def apply(
    Application: Application,
    Axes: SparkAxes,
    Count: Double,
    Creator: XlCreator,
    DateRange: String,
    Delete: Callback,
    DisplayBlanksAs: XlDisplayBlanksAs,
    DisplayHidden: Boolean,
    ExcelDotSparklineGroup_typekey: SparklineGroup,
    Item: Any => Sparkline,
    LineWeight: Any,
    Location: Range,
    Modify: (Range, String) => Callback,
    ModifyDateRange: String => Callback,
    ModifyLocation: Range => Callback,
    ModifySourceData: String => Callback,
    Parent: Any,
    PlotBy: XlSparklineRowCol,
    Points: SparkPoints,
    SeriesColor: FormatColor,
    SourceData: String,
    Type: XlSparkType
  ): SparklineGroup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Axes = Axes.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DateRange = DateRange.asInstanceOf[js.Any], Delete = Delete.toJsFn, DisplayBlanksAs = DisplayBlanksAs.asInstanceOf[js.Any], DisplayHidden = DisplayHidden.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), LineWeight = LineWeight.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Modify = js.Any.fromFunction2((t0: Range, t1: String) => (Modify(t0, t1)).runNow()), ModifyDateRange = js.Any.fromFunction1((t0: String) => ModifyDateRange(t0).runNow()), ModifyLocation = js.Any.fromFunction1((t0: Range) => ModifyLocation(t0).runNow()), ModifySourceData = js.Any.fromFunction1((t0: String) => ModifySourceData(t0).runNow()), Parent = Parent.asInstanceOf[js.Any], PlotBy = PlotBy.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], SeriesColor = SeriesColor.asInstanceOf[js.Any], SourceData = SourceData.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparklineGroup_typekey")(ExcelDotSparklineGroup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineGroup]
  }
  
  extension [Self <: SparklineGroup](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAxes(value: SparkAxes): Self = StObject.set(x, "Axes", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDateRange(value: String): Self = StObject.set(x, "DateRange", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setDisplayBlanksAs(value: XlDisplayBlanksAs): Self = StObject.set(x, "DisplayBlanksAs", value.asInstanceOf[js.Any])
    
    inline def setDisplayHidden(value: Boolean): Self = StObject.set(x, "DisplayHidden", value.asInstanceOf[js.Any])
    
    inline def setExcelDotSparklineGroup_typekey(value: SparklineGroup): Self = StObject.set(x, "Excel.SparklineGroup_typekey", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => Sparkline): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setLineWeight(value: Any): Self = StObject.set(x, "LineWeight", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Range): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setModify(value: (Range, String) => Callback): Self = StObject.set(x, "Modify", js.Any.fromFunction2((t0: Range, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setModifyDateRange(value: String => Callback): Self = StObject.set(x, "ModifyDateRange", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setModifyLocation(value: Range => Callback): Self = StObject.set(x, "ModifyLocation", js.Any.fromFunction1((t0: Range) => value(t0).runNow()))
    
    inline def setModifySourceData(value: String => Callback): Self = StObject.set(x, "ModifySourceData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPlotBy(value: XlSparklineRowCol): Self = StObject.set(x, "PlotBy", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: SparkPoints): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
    
    inline def setSeriesColor(value: FormatColor): Self = StObject.set(x, "SeriesColor", value.asInstanceOf[js.Any])
    
    inline def setSourceData(value: String): Self = StObject.set(x, "SourceData", value.asInstanceOf[js.Any])
    
    inline def setType(value: XlSparkType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
