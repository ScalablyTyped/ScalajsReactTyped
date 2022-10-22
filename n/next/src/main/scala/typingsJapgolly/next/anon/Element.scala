package typingsJapgolly.next.anon

import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var ReactDOMServer: Any
  
  var element: japgolly.scalajs.react.facade.React.Element
  
  var streamOptions: js.UndefOr[Any] = js.undefined
}
object Element {
  
  inline def apply(ReactDOMServer: Any, element: VdomElement): Element = {
    val __obj = js.Dynamic.literal(ReactDOMServer = ReactDOMServer.asInstanceOf[js.Any], element = element.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
    
    inline def setReactDOMServer(value: Any): Self = StObject.set(x, "ReactDOMServer", value.asInstanceOf[js.Any])
    
    inline def setStreamOptions(value: Any): Self = StObject.set(x, "streamOptions", value.asInstanceOf[js.Any])
    
    inline def setStreamOptionsUndefined: Self = StObject.set(x, "streamOptions", js.undefined)
  }
}
