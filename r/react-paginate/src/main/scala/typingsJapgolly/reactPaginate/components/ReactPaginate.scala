package typingsJapgolly.reactPaginate.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPaginate.anon.Event
import typingsJapgolly.reactPaginate.anon.Selected
import typingsJapgolly.reactPaginate.mod.ReactPaginateProps
import typingsJapgolly.reactPaginate.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPaginate {
  
  inline def apply(pageCount: Double): Builder = {
    val __props = js.Dynamic.literal(pageCount = pageCount.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactPaginateProps]))
  }
  
  @JSImport("react-paginate", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def activeClassName(value: String): this.type = set("activeClassName", value.asInstanceOf[js.Any])
    
    inline def activeLinkClassName(value: String): this.type = set("activeLinkClassName", value.asInstanceOf[js.Any])
    
    inline def ariaLabelBuilder(value: (/* pageIndex */ Double, /* selectedPage */ Double) => Callback): this.type = set("ariaLabelBuilder", js.Any.fromFunction2((t0: /* pageIndex */ Double, t1: /* selectedPage */ Double) => (value(t0, t1)).runNow()))
    
    inline def breakClassName(value: String): this.type = set("breakClassName", value.asInstanceOf[js.Any])
    
    inline def breakLabel(value: String | Node): this.type = set("breakLabel", value.asInstanceOf[js.Any])
    
    inline def breakLabelNull: this.type = set("breakLabel", null)
    
    inline def breakLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("breakLabel", js.Array(value*))
    
    inline def breakLabelVdomElement(value: VdomElement): this.type = set("breakLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def breakLinkClassName(value: String): this.type = set("breakLinkClassName", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    inline def disableInitialCallback(value: Boolean): this.type = set("disableInitialCallback", value.asInstanceOf[js.Any])
    
    inline def disabledClassName(value: String): this.type = set("disabledClassName", value.asInstanceOf[js.Any])
    
    inline def disabledLinkClassName(value: String): this.type = set("disabledLinkClassName", value.asInstanceOf[js.Any])
    
    inline def eventListener(value: String): this.type = set("eventListener", value.asInstanceOf[js.Any])
    
    inline def extraAriaContext(value: String): this.type = set("extraAriaContext", value.asInstanceOf[js.Any])
    
    inline def forcePage(value: Double): this.type = set("forcePage", value.asInstanceOf[js.Any])
    
    inline def hrefAllControls(value: Boolean): this.type = set("hrefAllControls", value.asInstanceOf[js.Any])
    
    inline def hrefBuilder(value: (/* pageIndex */ Double, /* pageCount */ Double, /* selectedPage */ Double) => Callback): this.type = set("hrefBuilder", js.Any.fromFunction3((t0: /* pageIndex */ Double, t1: /* pageCount */ Double, t2: /* selectedPage */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def initialPage(value: Double): this.type = set("initialPage", value.asInstanceOf[js.Any])
    
    inline def marginPagesDisplayed(value: Double): this.type = set("marginPagesDisplayed", value.asInstanceOf[js.Any])
    
    inline def nextAriaLabel(value: String): this.type = set("nextAriaLabel", value.asInstanceOf[js.Any])
    
    inline def nextClassName(value: String): this.type = set("nextClassName", value.asInstanceOf[js.Any])
    
    inline def nextLabel(value: String | Node): this.type = set("nextLabel", value.asInstanceOf[js.Any])
    
    inline def nextLabelNull: this.type = set("nextLabel", null)
    
    inline def nextLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nextLabel", js.Array(value*))
    
    inline def nextLabelVdomElement(value: VdomElement): this.type = set("nextLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def nextLinkClassName(value: String): this.type = set("nextLinkClassName", value.asInstanceOf[js.Any])
    
    inline def nextPageRel(value: String): this.type = set("nextPageRel", value.asInstanceOf[js.Any])
    
    inline def nextPageRelNull: this.type = set("nextPageRel", null)
    
    inline def nextRel(value: String): this.type = set("nextRel", value.asInstanceOf[js.Any])
    
    inline def nextRelNull: this.type = set("nextRel", null)
    
    inline def onClick(value: /* clickEvent */ Event => Boolean | Double | Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def onPageActive(value: /* selectedItem */ Selected => Callback): this.type = set("onPageActive", js.Any.fromFunction1((t0: /* selectedItem */ Selected) => value(t0).runNow()))
    
    inline def onPageChange(value: /* selectedItem */ Selected => Callback): this.type = set("onPageChange", js.Any.fromFunction1((t0: /* selectedItem */ Selected) => value(t0).runNow()))
    
    inline def pageClassName(value: String): this.type = set("pageClassName", value.asInstanceOf[js.Any])
    
    inline def pageLabelBuilder(value: /* page */ Double => String | Node): this.type = set("pageLabelBuilder", js.Any.fromFunction1(value))
    
    inline def pageLinkClassName(value: String): this.type = set("pageLinkClassName", value.asInstanceOf[js.Any])
    
    inline def pageRangeDisplayed(value: Double): this.type = set("pageRangeDisplayed", value.asInstanceOf[js.Any])
    
    inline def prevPageRel(value: String): this.type = set("prevPageRel", value.asInstanceOf[js.Any])
    
    inline def prevPageRelNull: this.type = set("prevPageRel", null)
    
    inline def prevRel(value: String): this.type = set("prevRel", value.asInstanceOf[js.Any])
    
    inline def prevRelNull: this.type = set("prevRel", null)
    
    inline def previousAriaLabel(value: String): this.type = set("previousAriaLabel", value.asInstanceOf[js.Any])
    
    inline def previousClassName(value: String): this.type = set("previousClassName", value.asInstanceOf[js.Any])
    
    inline def previousLabel(value: String | Node): this.type = set("previousLabel", value.asInstanceOf[js.Any])
    
    inline def previousLabelNull: this.type = set("previousLabel", null)
    
    inline def previousLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("previousLabel", js.Array(value*))
    
    inline def previousLabelVdomElement(value: VdomElement): this.type = set("previousLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def previousLinkClassName(value: String): this.type = set("previousLinkClassName", value.asInstanceOf[js.Any])
    
    inline def renderOnZeroPageCount(value: ReactPaginateProps => Unit | Null): this.type = set("renderOnZeroPageCount", js.Any.fromFunction1(value))
    
    inline def selectedPageRel(value: String): this.type = set("selectedPageRel", value.asInstanceOf[js.Any])
    
    inline def selectedPageRelNull: this.type = set("selectedPageRel", null)
  }
  
  def withProps(p: ReactPaginateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
