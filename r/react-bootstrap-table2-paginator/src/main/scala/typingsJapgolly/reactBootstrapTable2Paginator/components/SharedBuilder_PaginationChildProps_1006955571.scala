package typingsJapgolly.reactBootstrapTable2Paginator.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactBootstrapTableNext.anon.Text
import typingsJapgolly.reactBootstrapTableNext.mod.PageButtonRendererOptions
import typingsJapgolly.reactBootstrapTableNext.mod.PageListRendererOptions
import typingsJapgolly.reactBootstrapTableNext.mod.SizePerPageOptionRendererOptions
import typingsJapgolly.reactBootstrapTableNext.mod.SizePerPageRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PaginationChildProps_1006955571 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def alwaysShowAllBtns(value: Boolean): this.type = set("alwaysShowAllBtns", value.asInstanceOf[js.Any])
  
  inline def bootstrap4(value: Boolean): this.type = set("bootstrap4", value.asInstanceOf[js.Any])
  
  inline def custom(value: Boolean): this.type = set("custom", value.asInstanceOf[js.Any])
  
  inline def firstPageText(value: String | Element): this.type = set("firstPageText", value.asInstanceOf[js.Any])
  
  inline def firstPageTextVdomElement(value: VdomElement): this.type = set("firstPageText", value.rawElement.asInstanceOf[js.Any])
  
  inline def firstPageTitle(value: String): this.type = set("firstPageTitle", value.asInstanceOf[js.Any])
  
  inline def hidePageListOnlyOnePage(value: Boolean): this.type = set("hidePageListOnlyOnePage", value.asInstanceOf[js.Any])
  
  inline def hideSizePerPage(value: Boolean): this.type = set("hideSizePerPage", value.asInstanceOf[js.Any])
  
  inline def lastPageText(value: String | Element): this.type = set("lastPageText", value.asInstanceOf[js.Any])
  
  inline def lastPageTextVdomElement(value: VdomElement): this.type = set("lastPageText", value.rawElement.asInstanceOf[js.Any])
  
  inline def lastPageTitle(value: String): this.type = set("lastPageTitle", value.asInstanceOf[js.Any])
  
  inline def nextPageText(value: String | Element): this.type = set("nextPageText", value.asInstanceOf[js.Any])
  
  inline def nextPageTextVdomElement(value: VdomElement): this.type = set("nextPageText", value.rawElement.asInstanceOf[js.Any])
  
  inline def nextPageTitle(value: String): this.type = set("nextPageTitle", value.asInstanceOf[js.Any])
  
  inline def onPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Callback): this.type = set("onPageChange", js.Any.fromFunction2((t0: /* page */ Double, t1: /* sizePerPage */ Double) => (value(t0, t1)).runNow()))
  
  inline def onSizePerPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Callback): this.type = set("onSizePerPageChange", js.Any.fromFunction2((t0: /* page */ Double, t1: /* sizePerPage */ Double) => (value(t0, t1)).runNow()))
  
  inline def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
  
  inline def pageButtonRenderer(value: /* options */ PageButtonRendererOptions => Element): this.type = set("pageButtonRenderer", js.Any.fromFunction1(value))
  
  inline def pageListRenderer(value: /* options */ PageListRendererOptions => Element): this.type = set("pageListRenderer", js.Any.fromFunction1(value))
  
  inline def pageStartIndex(value: Double): this.type = set("pageStartIndex", value.asInstanceOf[js.Any])
  
  inline def paginationSize(value: Double): this.type = set("paginationSize", value.asInstanceOf[js.Any])
  
  inline def paginationTotalRenderer(value: (/* from */ Double, /* to */ Double, /* size */ Double) => Element): this.type = set("paginationTotalRenderer", js.Any.fromFunction3(value))
  
  inline def prePageText(value: String | Element): this.type = set("prePageText", value.asInstanceOf[js.Any])
  
  inline def prePageTextVdomElement(value: VdomElement): this.type = set("prePageText", value.rawElement.asInstanceOf[js.Any])
  
  inline def prePageTitle(value: String): this.type = set("prePageTitle", value.asInstanceOf[js.Any])
  
  inline def showTotal(value: Boolean): this.type = set("showTotal", value.asInstanceOf[js.Any])
  
  inline def sizePerPage(value: Double): this.type = set("sizePerPage", value.asInstanceOf[js.Any])
  
  inline def sizePerPageList(value: js.Array[Double | Text]): this.type = set("sizePerPageList", value.asInstanceOf[js.Any])
  
  inline def sizePerPageListVarargs(value: (Double | Text)*): this.type = set("sizePerPageList", js.Array(value*))
  
  inline def sizePerPageOptionRenderer(value: /* options */ SizePerPageOptionRendererOptions => Element): this.type = set("sizePerPageOptionRenderer", js.Any.fromFunction1(value))
  
  inline def sizePerPageRenderer(value: /* options */ SizePerPageRendererOptions => Element): this.type = set("sizePerPageRenderer", js.Any.fromFunction1(value))
  
  inline def tableId(value: String): this.type = set("tableId", value.asInstanceOf[js.Any])
  
  inline def totalSize(value: Double): this.type = set("totalSize", value.asInstanceOf[js.Any])
  
  inline def withFirstAndLast(value: Boolean): this.type = set("withFirstAndLast", value.asInstanceOf[js.Any])
}
