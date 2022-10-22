package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.cssElementQueries.mod.ResizeSensor
import typingsJapgolly.node.timersMod.global.NodeJS.Timeout
import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.react.mod.ReactPortal
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.ScrollToOptions
import typingsJapgolly.wixStyleReact.anon.FooterHeight
import typingsJapgolly.wixStyleReact.anon.MaxWidth
import typingsJapgolly.wixStyleReact.anon.OnScrollAreaChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPagePageMod {
  
  @JSImport("wix-style-react/dist/types/Page/Page", JSImport.Default)
  @js.native
  open class default protected () extends Page {
    def this(props: Any) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.defaultProps.maxWidth")
      @js.native
      def maxWidth: Double = js.native
      inline def maxWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.defaultProps.minWidth")
      @js.native
      def minWidth: Double = js.native
      inline def minWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("wix-style-react/dist/types/Page/Page", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.backgroundImageUrl")
      @js.native
      val backgroundImageUrl: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.children")
      @js.native
      val children: Validator[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.gradientClassName")
      @js.native
      val gradientClassName: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.height")
      @js.native
      val height: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.horizontalScroll")
      @js.native
      val horizontalScroll: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.maxWidth")
      @js.native
      val maxWidth: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.minWidth")
      @js.native
      val minWidth: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.scrollProps")
      @js.native
      val scrollProps: Requireable[InferProps[OnScrollAreaChanged]] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.scrollableContentRef")
      @js.native
      val scrollableContentRef: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.sidePadding")
      @js.native
      val sidePadding: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Page/Page", "default.propTypes.zIndex")
      @js.native
      val zIndex: Requireable[Double] = js.native
    }
  }
  
  @js.native
  trait Page extends PureComponent[Any, Any, Any] {
    
    def _calculateComponentsHeights(): Unit = js.native
    
    def _getMinimizationDiff(): Double | Null = js.native
    
    def _getMinimizedHeaderWrapperHeight(): Double = js.native
    
    def _getNamedChildren(): ReactChild | ReactFragment | ReactPortal = js.native
    
    def _getPageDimensionsStyle(): MaxWidth | Null = js.native
    
    def _getScrollContainer(): Any = js.native
    
    def _handleScroll(e: Any): Unit = js.native
    
    def _handleWidthResize(): Unit = js.native
    
    def _handleWindowResize(): Unit = js.native
    
    def _hasBackgroundImage(): Boolean = js.native
    
    def _hasGradientClassName(): Boolean = js.native
    
    def _hasHeader(): Boolean = js.native
    
    def _hasTail(): Boolean = js.native
    
    def _renderContentContainer(): Element = js.native
    
    def _renderContentHorizontalLayout(props: Any): Element = js.native
    
    def _renderFixedFooter(): js.UndefOr[Element] = js.native
    
    def _renderHeader(): Any = js.native
    
    def _renderHeaderContainer(): Element = js.native
    
    def _renderScrollableBackground(): js.UndefOr[Element] = js.native
    
    def _renderScrollableContainer(): Element = js.native
    
    def _renderTail(): Any = js.native
    
    def _safeGetChildren(element: Any): Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPage(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPage(prevProps: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPage(): Unit = js.native
    
    var contentResizeListener: js.UndefOr[ResizeSensor] = js.native
    
    var footerWrapperRef: js.UndefOr[HTMLDivElement | Null] = js.native
    
    var headerContainerRef: js.UndefOr[HTMLDivElement | Null] = js.native
    
    var headerWrapperRef: js.UndefOr[HTMLDivElement | Null] = js.native
    
    var pageHeaderTailRef: js.UndefOr[HTMLDivElement | Null] = js.native
    
    var pageRef: js.UndefOr[HTMLDivElement | Null] = js.native
    
    /**
      * Scrolls the page to a particular set of coordinates
      * @param {ScrollToOptions} scrollTo { left: number, top: number, behavior: 'smooth' | 'auto' }
      */
    def scrollTo(scrollTo: ScrollToOptions): Unit = js.native
    
    var scrollableContainerRef: RefHandle[Any] = js.native
    
    @JSName("state")
    var state_Page: FooterHeight = js.native
    
    var timerId: js.UndefOr[Timeout] = js.native
  }
}
