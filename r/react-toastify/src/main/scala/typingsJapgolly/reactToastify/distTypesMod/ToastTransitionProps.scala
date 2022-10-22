package typingsJapgolly.reactToastify.distTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastTransitionProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  def done(): Unit
  
  var isIn: Boolean
  
  var nodeRef: RefHandle[HTMLElement]
  
  var position: ToastPosition | String
  
  var preventExitTransition: Boolean
}
object ToastTransitionProps {
  
  inline def apply(
    done: Callback,
    isIn: Boolean,
    nodeRef: RefHandle[HTMLElement],
    position: ToastPosition | String,
    preventExitTransition: Boolean
  ): ToastTransitionProps = {
    val __obj = js.Dynamic.literal(done = done.toJsFn, isIn = isIn.asInstanceOf[js.Any], nodeRef = nodeRef.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventExitTransition = preventExitTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastTransitionProps]
  }
  
  extension [Self <: ToastTransitionProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDone(value: Callback): Self = StObject.set(x, "done", value.toJsFn)
    
    inline def setIsIn(value: Boolean): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
    
    inline def setNodeRef(value: RefHandle[HTMLElement]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: ToastPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPreventExitTransition(value: Boolean): Self = StObject.set(x, "preventExitTransition", value.asInstanceOf[js.Any])
  }
}
