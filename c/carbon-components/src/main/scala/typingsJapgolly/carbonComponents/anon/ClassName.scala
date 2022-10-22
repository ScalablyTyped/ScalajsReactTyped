package typingsJapgolly.carbonComponents.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: String
  
  var element: HTMLElement
  
  var html: String
}
object ClassName {
  
  inline def apply(className: String, element: HTMLElement, html: String): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
