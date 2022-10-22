package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.paginationMod.PaginationProps
import typingsJapgolly.cathoQuantum.paginationMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  inline def apply(totalPages: Double): Builder = {
    val __props = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
  
  @JSImport("@catho/quantum/Pagination", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def activePage(value: Double): this.type = set("activePage", value.asInstanceOf[js.Any])
    
    inline def activePageAriaLabel(value: String): this.type = set("activePageAriaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def followOnlyFirstPage(value: Boolean): this.type = set("followOnlyFirstPage", value.asInstanceOf[js.Any])
    
    inline def infoFormatter(value: (/* activePage */ js.UndefOr[Double], /* lastPage */ js.UndefOr[Double]) => Callback): this.type = set("infoFormatter", js.Any.fromFunction2((t0: /* activePage */ js.UndefOr[Double], t1: /* lastPage */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def nextButtonText(value: String): this.type = set("nextButtonText", value.asInstanceOf[js.Any])
    
    inline def onPageClick(value: /* page */ js.UndefOr[Double] => Callback): this.type = set("onPageClick", js.Any.fromFunction1((t0: /* page */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def pageAriaLabel(value: String): this.type = set("pageAriaLabel", value.asInstanceOf[js.Any])
    
    inline def pageHref(value: /* page */ js.UndefOr[Double] => Callback): this.type = set("pageHref", js.Any.fromFunction1((t0: /* page */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def prevButtonText(value: String): this.type = set("prevButtonText", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
