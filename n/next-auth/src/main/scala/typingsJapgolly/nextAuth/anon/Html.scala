package typingsJapgolly.nextAuth.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Html extends StObject {
  
  var html: Element
  
  var status: Any
}
object Html {
  
  inline def apply(html: VdomElement, status: Any): Html = {
    val __obj = js.Dynamic.literal(html = html.rawElement.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html]
  }
  
  extension [Self <: Html](x: Self) {
    
    inline def setHtml(value: VdomElement): Self = StObject.set(x, "html", value.rawElement.asInstanceOf[js.Any])
    
    inline def setStatus(value: Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
