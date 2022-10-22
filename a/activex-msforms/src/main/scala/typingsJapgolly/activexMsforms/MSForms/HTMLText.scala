package typingsJapgolly.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLText extends StObject {
  
  var HTMLName: String
  
  var HTMLType: String
  
  /* private */ @JSName("MSForms.HTMLText_typekey")
  var MSFormsDotHTMLText_typekey: HTMLText
  
  var MaxLength: Double
  
  var Value: String
  
  var Width: Double
}
object HTMLText {
  
  inline def apply(
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLText_typekey: HTMLText,
    MaxLength: Double,
    Value: String,
    Width: Double
  ): HTMLText = {
    val __obj = js.Dynamic.literal(HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLText_typekey")(MSFormsDotHTMLText_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLText]
  }
  
  extension [Self <: HTMLText](x: Self) {
    
    inline def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    inline def setHTMLType(value: String): Self = StObject.set(x, "HTMLType", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotHTMLText_typekey(value: HTMLText): Self = StObject.set(x, "MSForms.HTMLText_typekey", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
