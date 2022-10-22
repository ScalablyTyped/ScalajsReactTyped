package typingsJapgolly.reactThreeFiber.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: Node
  
  var set: Dispatch[js.UndefOr[js.Error]]
}
object Children {
  
  inline def apply(set: js.UndefOr[js.Error] => Callback): Children = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1((t0: js.UndefOr[js.Error]) => set(t0).runNow()), children = null)
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSet(value: js.UndefOr[js.Error] => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: js.UndefOr[js.Error]) => value(t0).runNow()))
  }
}
