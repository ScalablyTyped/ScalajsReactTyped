package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixUiCore.anon.ResponsiveLayout
import typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationPageStripLayoutMod.PageStripLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPaginationPageStripMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/pagination/PageStrip", "PageStrip")
  @js.native
  open class PageStrip protected () extends Component[PageStripProps, PageStripState, Any] {
    def this(props: PageStripProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PageStripProps, context: Any) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MPageStrip(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPageStrip(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPageStrip(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPageStrip(): Unit = js.native
    
    /* private */ var forceRepaintInMsEdge: Any = js.native
    
    /* private */ var getLayout: Any = js.native
    
    /* private */ var isResponsive: Any = js.native
    
    /* private */ var renderLayout: Any = js.native
    
    /* private */ var responsiveLayoutIsFresh: Any = js.native
    
    /* private */ var rootNode: Any = js.native
    
    @JSName("state")
    var state_PageStrip: ResponsiveLayout = js.native
    
    /* private */ var unmounted: Any = js.native
    
    /* private */ var updateLayoutIfNeeded: Any = js.native
  }
  
  trait PageStripProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var currentPage: Double
    
    var disabled: Boolean
    
    var gapLabel: Node
    
    var id: js.UndefOr[String] = js.undefined
    
    var maxPagesToShow: Double
    
    def onPageClick(event: ReactMouseEventFrom[Element], page: Double): Unit
    
    def onPageKeyDown(event: ReactKeyboardEventFrom[Element], page: Double): Unit
    
    var pageUrl: js.UndefOr[js.Function1[/* pageNumber */ Double, String]] = js.undefined
    
    var responsive: Boolean
    
    var showFirstPage: Boolean
    
    var showLastPage: Boolean
    
    var totalPages: Double
    
    def updateResponsiveLayout(callback: js.Function0[Unit]): Unit
  }
  object PageStripProps {
    
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
    ): PageStripProps = {
      val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], maxPagesToShow = maxPagesToShow.asInstanceOf[js.Any], onPageClick = js.Any.fromFunction2((t0: ReactMouseEventFrom[Element], t1: Double) => (onPageClick(t0, t1)).runNow()), onPageKeyDown = js.Any.fromFunction2((t0: ReactKeyboardEventFrom[Element], t1: Double) => (onPageKeyDown(t0, t1)).runNow()), responsive = responsive.asInstanceOf[js.Any], showFirstPage = showFirstPage.asInstanceOf[js.Any], showLastPage = showLastPage.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any], updateResponsiveLayout = js.Any.fromFunction1((t0: js.Function0[Unit]) => updateResponsiveLayout(t0).runNow()), gapLabel = null)
      __obj.asInstanceOf[PageStripProps]
    }
    
    extension [Self <: PageStripProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setGapLabel(value: VdomNode): Self = StObject.set(x, "gapLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setGapLabelNull: Self = StObject.set(x, "gapLabel", null)
      
      inline def setGapLabelVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "gapLabel", js.Array(value*))
      
      inline def setGapLabelVdomElement(value: VdomElement): Self = StObject.set(x, "gapLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMaxPagesToShow(value: Double): Self = StObject.set(x, "maxPagesToShow", value.asInstanceOf[js.Any])
      
      inline def setOnPageClick(value: (ReactMouseEventFrom[Element], Double) => Callback): Self = StObject.set(x, "onPageClick", js.Any.fromFunction2((t0: ReactMouseEventFrom[Element], t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setOnPageKeyDown(value: (ReactKeyboardEventFrom[Element], Double) => Callback): Self = StObject.set(x, "onPageKeyDown", js.Any.fromFunction2((t0: ReactKeyboardEventFrom[Element], t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setPageUrl(value: /* pageNumber */ Double => String): Self = StObject.set(x, "pageUrl", js.Any.fromFunction1(value))
      
      inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setShowFirstPage(value: Boolean): Self = StObject.set(x, "showFirstPage", value.asInstanceOf[js.Any])
      
      inline def setShowLastPage(value: Boolean): Self = StObject.set(x, "showLastPage", value.asInstanceOf[js.Any])
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
      
      inline def setUpdateResponsiveLayout(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "updateResponsiveLayout", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    }
  }
  
  trait PageStripState extends StObject {
    
    var responsiveLayout: PageStripLayout | Null
  }
  object PageStripState {
    
    inline def apply(): PageStripState = {
      val __obj = js.Dynamic.literal(responsiveLayout = null)
      __obj.asInstanceOf[PageStripState]
    }
    
    extension [Self <: PageStripState](x: Self) {
      
      inline def setResponsiveLayout(value: PageStripLayout): Self = StObject.set(x, "responsiveLayout", value.asInstanceOf[js.Any])
      
      inline def setResponsiveLayoutNull: Self = StObject.set(x, "responsiveLayout", null)
      
      inline def setResponsiveLayoutVarargs(value: Double*): Self = StObject.set(x, "responsiveLayout", js.Array(value*))
    }
  }
}
