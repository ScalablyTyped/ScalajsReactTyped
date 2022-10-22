package typingsJapgolly.reactToastify.distTypesMod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toast extends StObject {
  
  var content: ToastContent[Any]
  
  var props: ToastProps
}
object Toast {
  
  inline def apply(props: ToastProps): Toast = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], content = null)
    __obj.asInstanceOf[Toast]
  }
  
  extension [Self <: Toast](x: Self) {
    
    inline def setContent(value: ToastContent[Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: /* props */ ToastContentProps[Any] => Node): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    
    inline def setProps(value: ToastProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
