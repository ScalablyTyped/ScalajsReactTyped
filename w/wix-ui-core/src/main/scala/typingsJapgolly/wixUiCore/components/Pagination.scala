package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.wixUiCore.anon.Event
import typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationPaginationMod.PaginationMode
import typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationPaginationMod.PaginationProps
import typingsJapgolly.wixUiCore.wixUiCoreStrings.compact
import typingsJapgolly.wixUiCore.wixUiCoreStrings.input
import typingsJapgolly.wixUiCore.wixUiCoreStrings.pages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  inline def apply(totalPages: Double): Builder = {
    val __props = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "Pagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.Pagination] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def currentPage(value: Double): this.type = set("currentPage", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def firstLabel(value: VdomNode): this.type = set("firstLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def firstLabelNull: this.type = set("firstLabel", null)
    
    inline def firstLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("firstLabel", js.Array(value*))
    
    inline def firstLabelVdomElement(value: VdomElement): this.type = set("firstLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def gapLabel(value: VdomNode): this.type = set("gapLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def gapLabelNull: this.type = set("gapLabel", null)
    
    inline def gapLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("gapLabel", js.Array(value*))
    
    inline def gapLabelVdomElement(value: VdomElement): this.type = set("gapLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def lastLabel(value: VdomNode): this.type = set("lastLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def lastLabelNull: this.type = set("lastLabel", null)
    
    inline def lastLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("lastLabel", js.Array(value*))
    
    inline def lastLabelVdomElement(value: VdomElement): this.type = set("lastLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def maxPagesToShow(value: Double): this.type = set("maxPagesToShow", value.asInstanceOf[js.Any])
    
    inline def nextLabel(value: VdomNode): this.type = set("nextLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def nextLabelNull: this.type = set("nextLabel", null)
    
    inline def nextLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nextLabel", js.Array(value*))
    
    inline def nextLabelVdomElement(value: VdomElement): this.type = set("nextLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def onChange(value: /* event */ Event => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def onClick(value: /* event */ ReactEventFrom[org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDoubleClick(value: /* event */ ReactEventFrom[org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: /* event */ ReactEventFrom[org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: /* event */ ReactEventFrom[org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def pageUrl(value: /* pageNumber */ Double => String): this.type = set("pageUrl", js.Any.fromFunction1(value))
    
    inline def paginationMode(value: pages | input | compact | PaginationMode): this.type = set("paginationMode", value.asInstanceOf[js.Any])
    
    inline def previousLabel(value: VdomNode): this.type = set("previousLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def previousLabelNull: this.type = set("previousLabel", null)
    
    inline def previousLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("previousLabel", js.Array(value*))
    
    inline def previousLabelVdomElement(value: VdomElement): this.type = set("previousLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def showFirstLastNavButtons(value: Boolean): this.type = set("showFirstLastNavButtons", value.asInstanceOf[js.Any])
    
    inline def showFirstPage(value: Boolean): this.type = set("showFirstPage", value.asInstanceOf[js.Any])
    
    inline def showInputModeTotalPages(value: Boolean): this.type = set("showInputModeTotalPages", value.asInstanceOf[js.Any])
    
    inline def showLastPage(value: Boolean): this.type = set("showLastPage", value.asInstanceOf[js.Any])
    
    inline def showNextLabel(value: Boolean): this.type = set("showNextLabel", value.asInstanceOf[js.Any])
    
    inline def showPreviousLabel(value: Boolean): this.type = set("showPreviousLabel", value.asInstanceOf[js.Any])
    
    inline def slashLabel(value: VdomNode): this.type = set("slashLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def slashLabelNull: this.type = set("slashLabel", null)
    
    inline def slashLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("slashLabel", js.Array(value*))
    
    inline def slashLabelVdomElement(value: VdomElement): this.type = set("slashLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def updateResponsiveLayout(value: /* callback */ js.Function0[Unit] => Callback): this.type = set("updateResponsiveLayout", js.Any.fromFunction1((t0: /* callback */ js.Function0[Unit]) => value(t0).runNow()))
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
