package typingsJapgolly.primereact.treeTreeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeNodeTemplateOptions extends StObject {
  
  var className: String
  
  var element: Element
  
  var expanded: Boolean
  
  def onTogglerClick(e: ReactEventFrom[org.scalajs.dom.Element]): Unit
  
  var props: TreeProps
}
object TreeNodeTemplateOptions {
  
  inline def apply(
    className: String,
    element: VdomElement,
    expanded: Boolean,
    onTogglerClick: ReactEventFrom[org.scalajs.dom.Element] => Callback,
    props: TreeProps
  ): TreeNodeTemplateOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], element = element.rawElement.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], onTogglerClick = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => onTogglerClick(t0).runNow()), props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeTemplateOptions]
  }
  
  extension [Self <: TreeNodeTemplateOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setOnTogglerClick(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTogglerClick", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setProps(value: TreeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
