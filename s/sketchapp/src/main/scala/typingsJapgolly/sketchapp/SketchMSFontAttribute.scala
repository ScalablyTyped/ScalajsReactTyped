package typingsJapgolly.sketchapp

import typingsJapgolly.sketchapp.anon.Name
import typingsJapgolly.sketchapp.sketchappStrings.fontDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSFontAttribute extends StObject {
  
  var _class: fontDescriptor
  
  var attributes: Name
}
object SketchMSFontAttribute {
  
  inline def apply(attributes: Name): SketchMSFontAttribute = {
    val __obj = js.Dynamic.literal(_class = "fontDescriptor", attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFontAttribute]
  }
  
  extension [Self <: SketchMSFontAttribute](x: Self) {
    
    inline def setAttributes(value: Name): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def set_class(value: fontDescriptor): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
