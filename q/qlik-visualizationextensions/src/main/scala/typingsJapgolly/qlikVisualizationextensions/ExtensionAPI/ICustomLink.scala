package typingsJapgolly.qlikVisualizationextensions.ExtensionAPI

import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomLink extends StObject {
  
  var component: link
  
  var label: String
  
  var `type`: String
  
  var url: String
}
object ICustomLink {
  
  inline def apply(label: String, `type`: String, url: String): ICustomLink = {
    val __obj = js.Dynamic.literal(component = "link", label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomLink]
  }
  
  extension [Self <: ICustomLink](x: Self) {
    
    inline def setComponent(value: link): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
