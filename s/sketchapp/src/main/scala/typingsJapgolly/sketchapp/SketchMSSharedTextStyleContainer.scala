package typingsJapgolly.sketchapp

import typingsJapgolly.sketchapp.sketchappStrings.sharedTextStyleContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSSharedTextStyleContainer extends StObject {
  
  var _class: sharedTextStyleContainer
  
  var objects: js.Array[Any]
}
object SketchMSSharedTextStyleContainer {
  
  inline def apply(objects: js.Array[Any]): SketchMSSharedTextStyleContainer = {
    val __obj = js.Dynamic.literal(_class = "sharedTextStyleContainer", objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSharedTextStyleContainer]
  }
  
  extension [Self <: SketchMSSharedTextStyleContainer](x: Self) {
    
    inline def setObjects(value: js.Array[Any]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: Any*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def set_class(value: sharedTextStyleContainer): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
