package typingsJapgolly.zustand.anon

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.zustand.vanillaMod.StoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children[S /* <: StoreApi[Any] */] extends StObject {
  
  var children: Node
  
  def createStore(): S
}
object Children {
  
  inline def apply[S /* <: StoreApi[Any] */](createStore: CallbackTo[S]): Children[S] = {
    val __obj = js.Dynamic.literal(createStore = createStore.toJsFn, children = null)
    __obj.asInstanceOf[Children[S]]
  }
  
  extension [Self <: Children[?], S /* <: StoreApi[Any] */](x: Self & Children[S]) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCreateStore(value: CallbackTo[S]): Self = StObject.set(x, "createStore", value.toJsFn)
  }
}
