package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import typingsJapgolly.sketchHqSketchFileFormatTs.anon.Name
import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.fontDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontDescriptor
  extends StObject
     with AnyObject {
  
  var _class: fontDescriptor
  
  var attributes: Name
}
object FontDescriptor {
  
  inline def apply(attributes: Name): FontDescriptor = {
    val __obj = js.Dynamic.literal(_class = "fontDescriptor", attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontDescriptor]
  }
  
  extension [Self <: FontDescriptor](x: Self) {
    
    inline def setAttributes(value: Name): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def set_class(value: fontDescriptor): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
