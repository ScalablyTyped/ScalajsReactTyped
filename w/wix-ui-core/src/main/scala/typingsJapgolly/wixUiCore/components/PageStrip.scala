package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationPageStripMod.PageStripProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageStrip {
  
  inline def apply(
    currentPage: Double,
    disabled: Boolean,
    maxPagesToShow: Double,
    onPageClick: (ReactMouseEventFrom[Element], Double) => Callback,
    onPageKeyDown: (ReactKeyboardEventFrom[Element], Double) => Callback,
    responsive: Boolean,
    showFirstPage: Boolean,
    showLastPage: Boolean,
    totalPages: Double,
    updateResponsiveLayout: js.Function0[Unit] => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], maxPagesToShow = maxPagesToShow.asInstanceOf[js.Any], onPageClick = js.Any.fromFunction2((t0: ReactMouseEventFrom[Element], t1: Double) => (onPageClick(t0, t1)).runNow()), onPageKeyDown = js.Any.fromFunction2((t0: ReactKeyboardEventFrom[Element], t1: Double) => (onPageKeyDown(t0, t1)).runNow()), responsive = responsive.asInstanceOf[js.Any], showFirstPage = showFirstPage.asInstanceOf[js.Any], showLastPage = showLastPage.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], updateResponsiveLayout = js.Any.fromFunction1((t0: js.Function0[Unit]) => updateResponsiveLayout(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[PageStripProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/pagination/PageStrip", "PageStrip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationPageStripMod.PageStrip] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def gapLabel(value: VdomNode): this.type = set("gapLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def gapLabelNull: this.type = set("gapLabel", null)
    
    inline def gapLabelVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("gapLabel", js.Array(value*))
    
    inline def gapLabelVdomElement(value: VdomElement): this.type = set("gapLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def pageUrl(value: /* pageNumber */ Double => String): this.type = set("pageUrl", js.Any.fromFunction1(value))
  }
  
  def withProps(p: PageStripProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
