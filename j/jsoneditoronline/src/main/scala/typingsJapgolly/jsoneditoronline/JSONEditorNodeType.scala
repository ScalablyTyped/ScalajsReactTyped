package typingsJapgolly.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorNodeType extends StObject {
  
  var className: String
  
  var title: String
  
  var value: String
}
object JSONEditorNodeType {
  
  inline def apply(className: String, title: String, value: String): JSONEditorNodeType = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorNodeType]
  }
  
  extension [Self <: JSONEditorNodeType](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
