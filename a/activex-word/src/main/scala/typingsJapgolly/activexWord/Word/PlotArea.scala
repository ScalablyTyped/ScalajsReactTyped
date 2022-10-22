package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotArea extends StObject {
  
  val Application: Any
  
  val Border: ChartBorder
  
  def ClearFormats(): Any
  
  val Creator: Double
  
  val Fill: ChartFillFormat
  
  val Format: ChartFormat
  
  var Height: Double
  
  var InsideHeight: Double
  
  var InsideLeft: Double
  
  var InsideTop: Double
  
  var InsideWidth: Double
  
  val Interior: typingsJapgolly.activexWord.Word.Interior
  
  var Left: Double
  
  val Name: String
  
  val Parent: Any
  
  var Position: XlChartElementPosition
  
  def Select(): Any
  
  var Top: Double
  
  var Width: Double
  
  /* private */ @JSName("Word.PlotArea_typekey")
  var WordDotPlotArea_typekey: PlotArea
}
object PlotArea {
  
  inline def apply(
    Application: Any,
    Border: ChartBorder,
    ClearFormats: CallbackTo[Any],
    Creator: Double,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Height: Double,
    InsideHeight: Double,
    InsideLeft: Double,
    InsideTop: Double,
    InsideWidth: Double,
    Interior: Interior,
    Left: Double,
    Name: String,
    Parent: Any,
    Position: XlChartElementPosition,
    Select: CallbackTo[Any],
    Top: Double,
    Width: Double,
    WordDotPlotArea_typekey: PlotArea
  ): PlotArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = ClearFormats.toJsFn, Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], InsideHeight = InsideHeight.asInstanceOf[js.Any], InsideLeft = InsideLeft.asInstanceOf[js.Any], InsideTop = InsideTop.asInstanceOf[js.Any], InsideWidth = InsideWidth.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Select = Select.toJsFn, Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.PlotArea_typekey")(WordDotPlotArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotArea]
  }
  
  extension [Self <: PlotArea](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setClearFormats(value: CallbackTo[Any]): Self = StObject.set(x, "ClearFormats", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setInsideHeight(value: Double): Self = StObject.set(x, "InsideHeight", value.asInstanceOf[js.Any])
    
    inline def setInsideLeft(value: Double): Self = StObject.set(x, "InsideLeft", value.asInstanceOf[js.Any])
    
    inline def setInsideTop(value: Double): Self = StObject.set(x, "InsideTop", value.asInstanceOf[js.Any])
    
    inline def setInsideWidth(value: Double): Self = StObject.set(x, "InsideWidth", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: XlChartElementPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: CallbackTo[Any]): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWordDotPlotArea_typekey(value: PlotArea): Self = StObject.set(x, "Word.PlotArea_typekey", value.asInstanceOf[js.Any])
  }
}
