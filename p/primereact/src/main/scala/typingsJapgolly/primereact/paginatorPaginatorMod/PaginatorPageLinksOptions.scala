package typingsJapgolly.primereact.paginatorPaginatorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorPageLinksOptions extends StObject {
  
  var className: String
  
  var currentPage: Double
  
  var element: Element
  
  def onClick(event: ReactEventFrom[org.scalajs.dom.Element]): Unit
  
  var page: Double
  
  var props: PaginatorProps
  
  var totalPages: Double
  
  var view: PaginatorViewOptions
}
object PaginatorPageLinksOptions {
  
  inline def apply(
    className: String,
    currentPage: Double,
    element: VdomElement,
    onClick: ReactEventFrom[org.scalajs.dom.Element] => Callback,
    page: Double,
    props: PaginatorProps,
    totalPages: Double,
    view: PaginatorViewOptions
  ): PaginatorPageLinksOptions = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], element = element.rawElement.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => onClick(t0).runNow()), page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorPageLinksOptions]
  }
  
  extension [Self <: PaginatorPageLinksOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnClick(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setProps(value: PaginatorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setView(value: PaginatorViewOptions): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
