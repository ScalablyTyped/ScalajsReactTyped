package typingsJapgolly.reactJsPagination.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactJsPagination.mod.ReactJsPaginationProps
import typingsJapgolly.reactJsPagination.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactJsPagination {
  
  inline def apply(activePage: Double, onChange: Double => Callback, totalItemsCount: Double): Builder = {
    val __props = js.Dynamic.literal(activePage = activePage.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: Double) => onChange(t0).runNow()), totalItemsCount = totalItemsCount.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactJsPaginationProps]))
  }
  
  @JSImport("react-js-pagination", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def activeClass(value: String): this.type = set("activeClass", value.asInstanceOf[js.Any])
    
    inline def activeLinkClass(value: String): this.type = set("activeLinkClass", value.asInstanceOf[js.Any])
    
    inline def disabledClass(value: String): this.type = set("disabledClass", value.asInstanceOf[js.Any])
    
    inline def firstPageText(value: String | Element): this.type = set("firstPageText", value.asInstanceOf[js.Any])
    
    inline def firstPageTextVdomElement(value: VdomElement): this.type = set("firstPageText", value.rawElement.asInstanceOf[js.Any])
    
    inline def getPageUrl(value: /* pageNumber */ Double => String): this.type = set("getPageUrl", js.Any.fromFunction1(value))
    
    inline def hideDisabled(value: Boolean): this.type = set("hideDisabled", value.asInstanceOf[js.Any])
    
    inline def hideFirstLastPages(value: Boolean): this.type = set("hideFirstLastPages", value.asInstanceOf[js.Any])
    
    inline def hideNavigation(value: Boolean): this.type = set("hideNavigation", value.asInstanceOf[js.Any])
    
    inline def innerClass(value: String): this.type = set("innerClass", value.asInstanceOf[js.Any])
    
    inline def itemClass(value: String): this.type = set("itemClass", value.asInstanceOf[js.Any])
    
    inline def itemClassFirst(value: String): this.type = set("itemClassFirst", value.asInstanceOf[js.Any])
    
    inline def itemClassLast(value: String): this.type = set("itemClassLast", value.asInstanceOf[js.Any])
    
    inline def itemClassNext(value: String): this.type = set("itemClassNext", value.asInstanceOf[js.Any])
    
    inline def itemClassPrev(value: String): this.type = set("itemClassPrev", value.asInstanceOf[js.Any])
    
    inline def itemsCountPerPage(value: Double): this.type = set("itemsCountPerPage", value.asInstanceOf[js.Any])
    
    inline def lastPageText(value: String | Element): this.type = set("lastPageText", value.asInstanceOf[js.Any])
    
    inline def lastPageTextVdomElement(value: VdomElement): this.type = set("lastPageText", value.rawElement.asInstanceOf[js.Any])
    
    inline def linkClass(value: String): this.type = set("linkClass", value.asInstanceOf[js.Any])
    
    inline def linkClassFirst(value: String): this.type = set("linkClassFirst", value.asInstanceOf[js.Any])
    
    inline def linkClassLast(value: String): this.type = set("linkClassLast", value.asInstanceOf[js.Any])
    
    inline def linkClassNext(value: String): this.type = set("linkClassNext", value.asInstanceOf[js.Any])
    
    inline def linkClassPrev(value: String): this.type = set("linkClassPrev", value.asInstanceOf[js.Any])
    
    inline def nextPageText(value: String | Element): this.type = set("nextPageText", value.asInstanceOf[js.Any])
    
    inline def nextPageTextVdomElement(value: VdomElement): this.type = set("nextPageText", value.rawElement.asInstanceOf[js.Any])
    
    inline def pageRangeDisplayed(value: Double): this.type = set("pageRangeDisplayed", value.asInstanceOf[js.Any])
    
    inline def prevPageText(value: String | Element): this.type = set("prevPageText", value.asInstanceOf[js.Any])
    
    inline def prevPageTextVdomElement(value: VdomElement): this.type = set("prevPageText", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactJsPaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
