package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trendline extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  var Backward: Double
  
  var Backward2: Double
  
  val Border: typingsJapgolly.activexExcel.Excel.Border
  
  def ClearFormats(): Any
  
  val Creator: XlCreator
  
  val DataLabel: typingsJapgolly.activexExcel.Excel.DataLabel
  
  def Delete(): Any
  
  var DisplayEquation: Boolean
  
  var DisplayRSquared: Boolean
  
  /* private */ @JSName("Excel.Trendline_typekey")
  var ExcelDotTrendline_typekey: Trendline
  
  val Format: ChartFormat
  
  var Forward: Double
  
  var Forward2: Double
  
  val Index: Double
  
  var Intercept: Double
  
  var InterceptIsAuto: Boolean
  
  var Name: String
  
  var NameIsAuto: Boolean
  
  var Order: Double
  
  val Parent: Any
  
  var Period: Double
  
  def Select(): Any
  
  var Type: XlTrendlineType
}
object Trendline {
  
  inline def apply(
    Application: Application,
    Backward: Double,
    Backward2: Double,
    Border: Border,
    ClearFormats: CallbackTo[Any],
    Creator: XlCreator,
    DataLabel: DataLabel,
    Delete: CallbackTo[Any],
    DisplayEquation: Boolean,
    DisplayRSquared: Boolean,
    ExcelDotTrendline_typekey: Trendline,
    Format: ChartFormat,
    Forward: Double,
    Forward2: Double,
    Index: Double,
    Intercept: Double,
    InterceptIsAuto: Boolean,
    Name: String,
    NameIsAuto: Boolean,
    Order: Double,
    Parent: Any,
    Period: Double,
    Select: CallbackTo[Any],
    Type: XlTrendlineType
  ): Trendline = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Backward = Backward.asInstanceOf[js.Any], Backward2 = Backward2.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = ClearFormats.toJsFn, Creator = Creator.asInstanceOf[js.Any], DataLabel = DataLabel.asInstanceOf[js.Any], Delete = Delete.toJsFn, DisplayEquation = DisplayEquation.asInstanceOf[js.Any], DisplayRSquared = DisplayRSquared.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any], Forward2 = Forward2.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Intercept = Intercept.asInstanceOf[js.Any], InterceptIsAuto = InterceptIsAuto.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameIsAuto = NameIsAuto.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Select = Select.toJsFn, Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Trendline_typekey")(ExcelDotTrendline_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trendline]
  }
  
  extension [Self <: Trendline](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBackward(value: Double): Self = StObject.set(x, "Backward", value.asInstanceOf[js.Any])
    
    inline def setBackward2(value: Double): Self = StObject.set(x, "Backward2", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Border): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setClearFormats(value: CallbackTo[Any]): Self = StObject.set(x, "ClearFormats", value.toJsFn)
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDataLabel(value: DataLabel): Self = StObject.set(x, "DataLabel", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: CallbackTo[Any]): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setDisplayEquation(value: Boolean): Self = StObject.set(x, "DisplayEquation", value.asInstanceOf[js.Any])
    
    inline def setDisplayRSquared(value: Boolean): Self = StObject.set(x, "DisplayRSquared", value.asInstanceOf[js.Any])
    
    inline def setExcelDotTrendline_typekey(value: Trendline): Self = StObject.set(x, "Excel.Trendline_typekey", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setForward(value: Double): Self = StObject.set(x, "Forward", value.asInstanceOf[js.Any])
    
    inline def setForward2(value: Double): Self = StObject.set(x, "Forward2", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIntercept(value: Double): Self = StObject.set(x, "Intercept", value.asInstanceOf[js.Any])
    
    inline def setInterceptIsAuto(value: Boolean): Self = StObject.set(x, "InterceptIsAuto", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameIsAuto(value: Boolean): Self = StObject.set(x, "NameIsAuto", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: CallbackTo[Any]): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setType(value: XlTrendlineType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
