package typingsJapgolly.reactInfiniteScroller

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-infinite-scroller", JSImport.Namespace)
  @js.native
  open class ^ () extends InfiniteScroll
  
  object InfiniteScroll {
    
    @js.native
    trait InfiniteScroll
      extends Component[InfiniteScrollProps, js.Object, Any] {
      
      def getParentElement(): js.UndefOr[HTMLElement | Null] = js.native
      def getParentElement(elem: HTMLElement): js.UndefOr[HTMLElement | Null] = js.native
    }
    
    /**
      * <InfiniteScroll /> properties.
      */
    trait InfiniteScrollProps
      extends StObject
         with HTMLProps[typingsJapgolly.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll] {
      
      /**
        * Name of the element that the component should render as.
        * Defaults to 'div'.
        */
      var element: js.UndefOr[Node | String] = js.undefined
      
      /**
        * Override method to return a different scroll listener if it's not the immediate parent of InfiniteScroll.
        */
      var getScrollParent: js.UndefOr[js.Function0[HTMLElement | Null]] = js.undefined
      
      /**
        * Whether there are more items to be loaded. Event listeners are removed if false.
        * Defaults to false.
        */
      var hasMore: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether the component should load the first set of items.
        * Defaults to true.
        */
      var initialLoad: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether new items should be loaded when user scrolls to the top of the scrollable area.
        * Default to false.
        */
      var isReverse: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A callback for when more items are requested by the user.
        * Page param is next page index.
        */
      def loadMore(page: Double): Unit
      
      /**
        * Loader component for indicating "loading more".
        */
      var loader: js.UndefOr[Element] = js.undefined
      
      /**
        * The number of the first page to load, with the default of 0, the first page is 1.
        * Defaults to 0.
        */
      var pageStart: js.UndefOr[Double] = js.undefined
      
      /**
        * The distance in pixels before the end of the items that will trigger a call to loadMore.
        * Defaults to 250.
        */
      var threshold: js.UndefOr[Double] = js.undefined
      
      /**
        * Proxy to the useCapture option of the added event listeners.
        * Defaults to false.
        */
      var useCapture: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Add scroll listeners to the window, or else, the component's parentNode.
        * Defaults to true.
        */
      var useWindow: js.UndefOr[Boolean] = js.undefined
    }
    object InfiniteScrollProps {
      
      inline def apply(loadMore: Double => Callback): InfiniteScrollProps = {
        val __obj = js.Dynamic.literal(loadMore = js.Any.fromFunction1((t0: Double) => loadMore(t0).runNow()))
        __obj.asInstanceOf[InfiniteScrollProps]
      }
      
      extension [Self <: InfiniteScrollProps](x: Self) {
        
        inline def setElement(value: Node | String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
        
        inline def setElementNull: Self = StObject.set(x, "element", null)
        
        inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
        
        inline def setElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "element", js.Array(value*))
        
        inline def setElementVdomElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
        
        inline def setGetScrollParent(value: CallbackTo[HTMLElement | Null]): Self = StObject.set(x, "getScrollParent", value.toJsFn)
        
        inline def setGetScrollParentUndefined: Self = StObject.set(x, "getScrollParent", js.undefined)
        
        inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
        
        inline def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
        
        inline def setInitialLoad(value: Boolean): Self = StObject.set(x, "initialLoad", value.asInstanceOf[js.Any])
        
        inline def setInitialLoadUndefined: Self = StObject.set(x, "initialLoad", js.undefined)
        
        inline def setIsReverse(value: Boolean): Self = StObject.set(x, "isReverse", value.asInstanceOf[js.Any])
        
        inline def setIsReverseUndefined: Self = StObject.set(x, "isReverse", js.undefined)
        
        inline def setLoadMore(value: Double => Callback): Self = StObject.set(x, "loadMore", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
        
        inline def setLoader(value: VdomElement): Self = StObject.set(x, "loader", value.rawElement.asInstanceOf[js.Any])
        
        inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
        
        inline def setPageStart(value: Double): Self = StObject.set(x, "pageStart", value.asInstanceOf[js.Any])
        
        inline def setPageStartUndefined: Self = StObject.set(x, "pageStart", js.undefined)
        
        inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
        
        inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
        
        inline def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
        
        inline def setUseCaptureUndefined: Self = StObject.set(x, "useCapture", js.undefined)
        
        inline def setUseWindow(value: Boolean): Self = StObject.set(x, "useWindow", value.asInstanceOf[js.Any])
        
        inline def setUseWindowUndefined: Self = StObject.set(x, "useWindow", js.undefined)
      }
    }
  }
}
