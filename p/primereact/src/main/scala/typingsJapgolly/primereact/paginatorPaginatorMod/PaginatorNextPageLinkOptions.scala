package typingsJapgolly.primereact.paginatorPaginatorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorNextPageLinkOptions extends StObject {
  
  var className: String
  
  var disabled: Boolean
  
  var element: Element
  
  var iconClassName: String
  
  def onClick(event: ReactEventFrom[org.scalajs.dom.Element]): Unit
  
  var props: PaginatorProps
}
object PaginatorNextPageLinkOptions {
  
  inline def apply(
    className: String,
    disabled: Boolean,
    element: VdomElement,
    iconClassName: String,
    onClick: ReactEventFrom[org.scalajs.dom.Element] => Callback,
    props: PaginatorProps
  ): PaginatorNextPageLinkOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], element = element.rawElement.asInstanceOf[js.Any], iconClassName = iconClassName.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => onClick(t0).runNow()), props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorNextPageLinkOptions]
  }
  
  extension [Self <: PaginatorNextPageLinkOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setProps(value: PaginatorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
