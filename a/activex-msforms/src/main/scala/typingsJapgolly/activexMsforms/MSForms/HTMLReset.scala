package typingsJapgolly.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLReset extends StObject {
  
  var Caption: String
  
  var HTMLName: String
  
  var HTMLType: String
  
  /* private */ @JSName("MSForms.HTMLReset_typekey")
  var MSFormsDotHTMLReset_typekey: HTMLReset
}
object HTMLReset {
  
  inline def apply(Caption: String, HTMLName: String, HTMLType: String, MSFormsDotHTMLReset_typekey: HTMLReset): HTMLReset = {
    val __obj = js.Dynamic.literal(Caption = Caption.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLReset_typekey")(MSFormsDotHTMLReset_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLReset]
  }
  
  extension [Self <: HTMLReset](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    inline def setHTMLType(value: String): Self = StObject.set(x, "HTMLType", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotHTMLReset_typekey(value: HTMLReset): Self = StObject.set(x, "MSForms.HTMLReset_typekey", value.asInstanceOf[js.Any])
  }
}
