package typingsJapgolly.primereact.treeTreeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTogglerTemplateOptions extends StObject {
  
  var containerClassName: String
  
  var element: Element
  
  var expanded: Boolean
  
  var iconClassName: String
  
  def onClick(e: ReactEventFrom[org.scalajs.dom.Element]): Unit
  
  var props: TreeProps
}
object TreeTogglerTemplateOptions {
  
  inline def apply(
    containerClassName: String,
    element: VdomElement,
    expanded: Boolean,
    iconClassName: String,
    onClick: ReactEventFrom[org.scalajs.dom.Element] => Callback,
    props: TreeProps
  ): TreeTogglerTemplateOptions = {
    val __obj = js.Dynamic.literal(containerClassName = containerClassName.asInstanceOf[js.Any], element = element.rawElement.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], iconClassName = iconClassName.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => onClick(t0).runNow()), props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTogglerTemplateOptions]
  }
  
  extension [Self <: TreeTogglerTemplateOptions](x: Self) {
    
    inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setProps(value: TreeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
