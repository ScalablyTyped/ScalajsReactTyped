package typingsJapgolly.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropName extends StObject {
  
  var propName: String
  
  var templateName: String
}
object PropName {
  
  inline def apply(propName: String, templateName: String): PropName = {
    val __obj = js.Dynamic.literal(propName = propName.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropName]
  }
  
  extension [Self <: PropName](x: Self) {
    
    inline def setPropName(value: String): Self = StObject.set(x, "propName", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
