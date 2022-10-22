package typingsJapgolly.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: String
  
  var isCallbackWidget: Boolean
  
  var isHidden: Boolean
  
  var name: String
}
object Description {
  
  inline def apply(description: String, isCallbackWidget: Boolean, isHidden: Boolean, name: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], isCallbackWidget = isCallbackWidget.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIsCallbackWidget(value: Boolean): Self = StObject.set(x, "isCallbackWidget", value.asInstanceOf[js.Any])
    
    inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
