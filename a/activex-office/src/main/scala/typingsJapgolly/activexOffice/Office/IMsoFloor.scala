package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoFloor extends StObject {
  
  val Application: Any
  
  val Border: IMsoBorder
  
  def ClearFormats(): Any
  
  val Creator: Double
  
  val Fill: ChartFillFormat
  
  val Format: IMsoChartFormat
  
  val Interior: IMsoInterior
  
  val Name: String
  
  /* private */ @JSName("Office.IMsoFloor_typekey")
  var OfficeDotIMsoFloor_typekey: IMsoFloor
  
  val Parent: Any
  
  def Paste(): Unit
  
  var PictureType: Any
  
  def Select(): Any
  
  var Thickness: Double
}
object IMsoFloor {
  
  inline def apply(
    Application: Any,
    Border: IMsoBorder,
    ClearFormats: CallbackTo[Any],
    Creator: Double,
    Fill: ChartFillFormat,
    Format: IMsoChartFormat,
    Interior: IMsoInterior,
    Name: String,
    OfficeDotIMsoFloor_typekey: IMsoFloor,
    Parent: Any,
    Paste: Callback,
    PictureType: Any,
    Select: CallbackTo[Any],
    Thickness: Double
  ): IMsoFloor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = ClearFormats.toJsFn, Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Paste = Paste.toJsFn, PictureType = PictureType.asInstanceOf[js.Any], Select = Select.toJsFn, Thickness = Thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoFloor_typekey")(OfficeDotIMsoFloor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoFloor]
  }
  
  extension [Self <: IMsoFloor](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: IMsoBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setClearFormats(value: CallbackTo[Any]): Self = StObject.set(x, "ClearFormats", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IMsoChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: IMsoInterior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoFloor_typekey(value: IMsoFloor): Self = StObject.set(x, "Office.IMsoFloor_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPaste(value: Callback): Self = StObject.set(x, "Paste", value.toJsFn)
    
    inline def setPictureType(value: Any): Self = StObject.set(x, "PictureType", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: CallbackTo[Any]): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "Thickness", value.asInstanceOf[js.Any])
  }
}
