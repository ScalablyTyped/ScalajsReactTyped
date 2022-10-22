package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OLEControl extends StObject {
  
  def Activate(): Unit
  
  var AltHTML: String
  
  val Automation: Any
  
  def Copy(): Unit
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  var Height: Double
  
  var Left: Double
  
  var Name: String
  
  def Select(): Unit
  
  var Top: Double
  
  var Width: Double
  
  /* private */ @JSName("Word.OLEControl_typekey")
  var WordDotOLEControl_typekey: OLEControl
}
object OLEControl {
  
  inline def apply(
    Activate: Callback,
    AltHTML: String,
    Automation: Any,
    Copy: Callback,
    Cut: Callback,
    Delete: Callback,
    Height: Double,
    Left: Double,
    Name: String,
    Select: Callback,
    Top: Double,
    Width: Double,
    WordDotOLEControl_typekey: OLEControl
  ): OLEControl = {
    val __obj = js.Dynamic.literal(Activate = Activate.toJsFn, AltHTML = AltHTML.asInstanceOf[js.Any], Automation = Automation.asInstanceOf[js.Any], Copy = Copy.toJsFn, Cut = Cut.toJsFn, Delete = Delete.toJsFn, Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Select = Select.toJsFn, Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OLEControl_typekey")(WordDotOLEControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OLEControl]
  }
  
  extension [Self <: OLEControl](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "Activate", value.toJsFn)
    
    inline def setAltHTML(value: String): Self = StObject.set(x, "AltHTML", value.asInstanceOf[js.Any])
    
    inline def setAutomation(value: Any): Self = StObject.set(x, "Automation", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: Callback): Self = StObject.set(x, "Copy", value.toJsFn)
    
    inline def setCut(value: Callback): Self = StObject.set(x, "Cut", value.toJsFn)
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWordDotOLEControl_typekey(value: OLEControl): Self = StObject.set(x, "Word.OLEControl_typekey", value.asInstanceOf[js.Any])
  }
}
