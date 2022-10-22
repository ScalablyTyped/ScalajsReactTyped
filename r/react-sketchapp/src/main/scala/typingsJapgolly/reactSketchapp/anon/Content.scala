package typingsJapgolly.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: String
  
  var textStyles: js.Object
}
object Content {
  
  inline def apply(content: String, textStyles: js.Object): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], textStyles = textStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setTextStyles(value: js.Object): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
  }
}
