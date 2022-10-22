package typingsJapgolly.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewFont extends StObject {
  
  val Bold: Boolean
  
  val Charset: Double
  
  val Italic: Boolean
  
  /* private */ @JSName("MSForms.NewFont_typekey")
  var MSFormsDotNewFont_typekey: NewFont
  
  val Name: String
  
  val Size: Double
  
  val Strikethrough: Boolean
  
  val Underline: Boolean
  
  val Weight: Double
}
object NewFont {
  
  inline def apply(
    Bold: Boolean,
    Charset: Double,
    Italic: Boolean,
    MSFormsDotNewFont_typekey: NewFont,
    Name: String,
    Size: Double,
    Strikethrough: Boolean,
    Underline: Boolean,
    Weight: Double
  ): NewFont = {
    val __obj = js.Dynamic.literal(Bold = Bold.asInstanceOf[js.Any], Charset = Charset.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.NewFont_typekey")(MSFormsDotNewFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewFont]
  }
  
  extension [Self <: NewFont](x: Self) {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    inline def setCharset(value: Double): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
    
    inline def setItalic(value: Boolean): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotNewFont_typekey(value: NewFont): Self = StObject.set(x, "MSForms.NewFont_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "Strikethrough", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
  }
}
