package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import typingsJapgolly.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.sharedStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStyle
  extends StObject
     with AnyObject {
  
  var _class: sharedStyle
  
  var do_objectID: Uuid
  
  var name: String
  
  var value: Style
}
object SharedStyle {
  
  inline def apply(do_objectID: Uuid, name: String, value: Style): SharedStyle = {
    val __obj = js.Dynamic.literal(_class = "sharedStyle", do_objectID = do_objectID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStyle]
  }
  
  extension [Self <: SharedStyle](x: Self) {
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Style): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_class(value: sharedStyle): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
