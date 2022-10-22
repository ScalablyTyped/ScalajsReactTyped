package typingsJapgolly.reactMdMenu.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuRef extends StObject {
  
  var children: Node
  
  var menuRef: Ref[HTMLDivElement]
  
  def onRequestClose(): Unit
  
  var visible: Boolean
}
object MenuRef {
  
  inline def apply(onRequestClose: Callback, visible: Boolean): MenuRef = {
    val __obj = js.Dynamic.literal(onRequestClose = onRequestClose.toJsFn, visible = visible.asInstanceOf[js.Any], children = null, menuRef = null)
    __obj.asInstanceOf[MenuRef]
  }
  
  extension [Self <: MenuRef](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setMenuRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "menuRef", value.asInstanceOf[js.Any])
    
    inline def setMenuRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "menuRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def setMenuRefNull: Self = StObject.set(x, "menuRef", null)
    
    inline def setOnRequestClose(value: Callback): Self = StObject.set(x, "onRequestClose", value.toJsFn)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
