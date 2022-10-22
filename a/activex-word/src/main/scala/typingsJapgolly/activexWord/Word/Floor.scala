package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Floor extends StObject {
  
  val Application: Any
  
  val Border: ChartBorder
  
  def ClearFormats(): Any
  
  val Creator: Double
  
  val Fill: ChartFillFormat
  
  val Format: ChartFormat
  
  val Interior: typingsJapgolly.activexWord.Word.Interior
  
  val Name: String
  
  val Parent: Any
  
  def Paste(): Unit
  
  var PictureType: Any
  
  def Select(): Any
  
  var Thickness: Double
  
  /* private */ @JSName("Word.Floor_typekey")
  var WordDotFloor_typekey: Floor
}
object Floor {
  
  inline def apply(
    Application: Any,
    Border: ChartBorder,
    ClearFormats: CallbackTo[Any],
    Creator: Double,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: Any,
    Paste: Callback,
    PictureType: Any,
    Select: CallbackTo[Any],
    Thickness: Double,
    WordDotFloor_typekey: Floor
  ): Floor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = ClearFormats.toJsFn, Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Paste = Paste.toJsFn, PictureType = PictureType.asInstanceOf[js.Any], Select = Select.toJsFn, Thickness = Thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Floor_typekey")(WordDotFloor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Floor]
  }
  
  extension [Self <: Floor](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setClearFormats(value: CallbackTo[Any]): Self = StObject.set(x, "ClearFormats", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPaste(value: Callback): Self = StObject.set(x, "Paste", value.toJsFn)
    
    inline def setPictureType(value: Any): Self = StObject.set(x, "PictureType", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: CallbackTo[Any]): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "Thickness", value.asInstanceOf[js.Any])
    
    inline def setWordDotFloor_typekey(value: Floor): Self = StObject.set(x, "Word.Floor_typekey", value.asInstanceOf[js.Any])
  }
}
