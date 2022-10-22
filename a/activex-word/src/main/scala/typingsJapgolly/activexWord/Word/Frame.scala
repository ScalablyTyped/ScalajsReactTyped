package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  var Borders: typingsJapgolly.activexWord.Word.Borders
  
  def Copy(): Unit
  
  val Creator: Double
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  var Height: Double
  
  var HeightRule: WdFrameSizeRule
  
  var HorizontalDistanceFromText: Double
  
  var HorizontalPosition: Double
  
  var LockAnchor: Boolean
  
  val Parent: Any
  
  val Range: typingsJapgolly.activexWord.Word.Range
  
  var RelativeHorizontalPosition: WdRelativeHorizontalPosition
  
  var RelativeVerticalPosition: WdRelativeVerticalPosition
  
  def Select(): Unit
  
  val Shading: typingsJapgolly.activexWord.Word.Shading
  
  var TextWrap: Boolean
  
  var VerticalDistanceFromText: Double
  
  var VerticalPosition: Double
  
  var Width: Double
  
  var WidthRule: WdFrameSizeRule
  
  /* private */ @JSName("Word.Frame_typekey")
  var WordDotFrame_typekey: Frame
}
object Frame {
  
  inline def apply(
    Application: Application,
    Borders: Borders,
    Copy: Callback,
    Creator: Double,
    Cut: Callback,
    Delete: Callback,
    Height: Double,
    HeightRule: WdFrameSizeRule,
    HorizontalDistanceFromText: Double,
    HorizontalPosition: Double,
    LockAnchor: Boolean,
    Parent: Any,
    Range: Range,
    RelativeHorizontalPosition: WdRelativeHorizontalPosition,
    RelativeVerticalPosition: WdRelativeVerticalPosition,
    Select: Callback,
    Shading: Shading,
    TextWrap: Boolean,
    VerticalDistanceFromText: Double,
    VerticalPosition: Double,
    Width: Double,
    WidthRule: WdFrameSizeRule,
    WordDotFrame_typekey: Frame
  ): Frame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Copy = Copy.toJsFn, Creator = Creator.asInstanceOf[js.Any], Cut = Cut.toJsFn, Delete = Delete.toJsFn, Height = Height.asInstanceOf[js.Any], HeightRule = HeightRule.asInstanceOf[js.Any], HorizontalDistanceFromText = HorizontalDistanceFromText.asInstanceOf[js.Any], HorizontalPosition = HorizontalPosition.asInstanceOf[js.Any], LockAnchor = LockAnchor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RelativeHorizontalPosition = RelativeHorizontalPosition.asInstanceOf[js.Any], RelativeVerticalPosition = RelativeVerticalPosition.asInstanceOf[js.Any], Select = Select.toJsFn, Shading = Shading.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], VerticalDistanceFromText = VerticalDistanceFromText.asInstanceOf[js.Any], VerticalPosition = VerticalPosition.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WidthRule = WidthRule.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Frame_typekey")(WordDotFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  extension [Self <: Frame](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorders(value: Borders): Self = StObject.set(x, "Borders", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: Callback): Self = StObject.set(x, "Copy", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCut(value: Callback): Self = StObject.set(x, "Cut", value.toJsFn)
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightRule(value: WdFrameSizeRule): Self = StObject.set(x, "HeightRule", value.asInstanceOf[js.Any])
    
    inline def setHorizontalDistanceFromText(value: Double): Self = StObject.set(x, "HorizontalDistanceFromText", value.asInstanceOf[js.Any])
    
    inline def setHorizontalPosition(value: Double): Self = StObject.set(x, "HorizontalPosition", value.asInstanceOf[js.Any])
    
    inline def setLockAnchor(value: Boolean): Self = StObject.set(x, "LockAnchor", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRelativeHorizontalPosition(value: WdRelativeHorizontalPosition): Self = StObject.set(x, "RelativeHorizontalPosition", value.asInstanceOf[js.Any])
    
    inline def setRelativeVerticalPosition(value: WdRelativeVerticalPosition): Self = StObject.set(x, "RelativeVerticalPosition", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setShading(value: Shading): Self = StObject.set(x, "Shading", value.asInstanceOf[js.Any])
    
    inline def setTextWrap(value: Boolean): Self = StObject.set(x, "TextWrap", value.asInstanceOf[js.Any])
    
    inline def setVerticalDistanceFromText(value: Double): Self = StObject.set(x, "VerticalDistanceFromText", value.asInstanceOf[js.Any])
    
    inline def setVerticalPosition(value: Double): Self = StObject.set(x, "VerticalPosition", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthRule(value: WdFrameSizeRule): Self = StObject.set(x, "WidthRule", value.asInstanceOf[js.Any])
    
    inline def setWordDotFrame_typekey(value: Frame): Self = StObject.set(x, "Word.Frame_typekey", value.asInstanceOf[js.Any])
  }
}
