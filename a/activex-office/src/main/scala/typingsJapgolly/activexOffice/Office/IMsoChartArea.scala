package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoChartArea extends StObject {
  
  val Application: Any
  
  var AutoScaleFont: Any
  
  val Border: IMsoBorder
  
  def Clear(): Any
  
  def ClearContents(): Any
  
  def ClearFormats(): Any
  
  def Copy(): Any
  
  val Creator: Double
  
  val Fill: ChartFillFormat
  
  val Font: ChartFont
  
  val Format: IMsoChartFormat
  
  var Height: Double
  
  val Interior: IMsoInterior
  
  var Left: Double
  
  val Name: String
  
  /* private */ @JSName("Office.IMsoChartArea_typekey")
  var OfficeDotIMsoChartArea_typekey: IMsoChartArea
  
  val Parent: Any
  
  var RoundedCorners: Boolean
  
  def Select(): Any
  
  var Shadow: Boolean
  
  var Top: Double
  
  var Width: Double
}
object IMsoChartArea {
  
  inline def apply(
    Application: Any,
    AutoScaleFont: Any,
    Border: IMsoBorder,
    Clear: CallbackTo[Any],
    ClearContents: CallbackTo[Any],
    ClearFormats: CallbackTo[Any],
    Copy: CallbackTo[Any],
    Creator: Double,
    Fill: ChartFillFormat,
    Font: ChartFont,
    Format: IMsoChartFormat,
    Height: Double,
    Interior: IMsoInterior,
    Left: Double,
    Name: String,
    OfficeDotIMsoChartArea_typekey: IMsoChartArea,
    Parent: Any,
    RoundedCorners: Boolean,
    Select: CallbackTo[Any],
    Shadow: Boolean,
    Top: Double,
    Width: Double
  ): IMsoChartArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Clear = Clear.toJsFn, ClearContents = ClearContents.toJsFn, ClearFormats = ClearFormats.toJsFn, Copy = Copy.toJsFn, Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RoundedCorners = RoundedCorners.asInstanceOf[js.Any], Select = Select.toJsFn, Shadow = Shadow.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoChartArea_typekey")(OfficeDotIMsoChartArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoChartArea]
  }
  
  extension [Self <: IMsoChartArea](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutoScaleFont(value: Any): Self = StObject.set(x, "AutoScaleFont", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setClear(value: CallbackTo[Any]): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setClearContents(value: CallbackTo[Any]): Self = StObject.set(x, "ClearContents", value.toJsFn)
    
    inline def setClearFormats(value: CallbackTo[Any]): Self = StObject.set(x, "ClearFormats", value.toJsFn)
    
    inline def setCopy(value: CallbackTo[Any]): Self = StObject.set(x, "Copy", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFont(value: ChartFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: IMsoInterior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoChartArea_typekey(value: IMsoChartArea): Self = StObject.set(x, "Office.IMsoChartArea_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRoundedCorners(value: Boolean): Self = StObject.set(x, "RoundedCorners", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: CallbackTo[Any]): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
