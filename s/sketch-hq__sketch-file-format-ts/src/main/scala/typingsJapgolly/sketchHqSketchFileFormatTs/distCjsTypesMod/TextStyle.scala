package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import typingsJapgolly.sketchHqSketchFileFormatTs.anon.MSAttributedStringColorAttribute
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.textStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyle
  extends StObject
     with AnyObject {
  
  var _class: textStyle
  
  var encodedAttributes: MSAttributedStringColorAttribute
  
  var verticalAlignment: TextVerticalAlignment
}
object TextStyle {
  
  inline def apply(encodedAttributes: MSAttributedStringColorAttribute, verticalAlignment: TextVerticalAlignment): TextStyle = {
    val __obj = js.Dynamic.literal(_class = "textStyle", encodedAttributes = encodedAttributes.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
  
  extension [Self <: TextStyle](x: Self) {
    
    inline def setEncodedAttributes(value: MSAttributedStringColorAttribute): Self = StObject.set(x, "encodedAttributes", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignment(value: TextVerticalAlignment): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def set_class(value: textStyle): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
