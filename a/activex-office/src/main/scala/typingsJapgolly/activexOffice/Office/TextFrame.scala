package typingsJapgolly.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFrame extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  var MarginBottom: Double
  
  var MarginLeft: Double
  
  var MarginRight: Double
  
  var MarginTop: Double
  
  /* private */ @JSName("Office.TextFrame_typekey")
  var OfficeDotTextFrame_typekey: TextFrame
  
  var Orientation: MsoTextOrientation
  
  val Parent: Any
}
object TextFrame {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    MarginBottom: Double,
    MarginLeft: Double,
    MarginRight: Double,
    MarginTop: Double,
    OfficeDotTextFrame_typekey: TextFrame,
    Orientation: MsoTextOrientation,
    Parent: Any
  ): TextFrame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], MarginBottom = MarginBottom.asInstanceOf[js.Any], MarginLeft = MarginLeft.asInstanceOf[js.Any], MarginRight = MarginRight.asInstanceOf[js.Any], MarginTop = MarginTop.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TextFrame_typekey")(OfficeDotTextFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrame]
  }
  
  extension [Self <: TextFrame](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "MarginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "MarginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "MarginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "MarginTop", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotTextFrame_typekey(value: TextFrame): Self = StObject.set(x, "Office.TextFrame_typekey", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: MsoTextOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
