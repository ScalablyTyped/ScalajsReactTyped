package typingsJapgolly.reactInfiniteScrollComponent

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactInfiniteScrollComponent.anon.PrevDataLength
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-infinite-scroll-component", JSImport.Default)
  @js.native
  open class default protected () extends InfiniteScroll {
    def this(props: Props) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-infinite-scroll-component", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: Props, prevState: State): PrevDataLength | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PrevDataLength | Null]
  }
  
  type Fn = js.Function0[Any]
  
  @js.native
  trait InfiniteScroll extends Component[Props, State, Any] {
    
    /* private */ var _infScroll: Any = js.native
    
    /* private */ var _pullDown: Any = js.native
    
    /* private */ var _scrollableNode: Any = js.native
    
    /* private */ var actionTriggered: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MInfiniteScroll(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInfiniteScroll(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MInfiniteScroll(): Unit = js.native
    
    /* private */ var currentY: Any = js.native
    
    /* private */ var dragging: Any = js.native
    
    /* private */ var el: Any = js.native
    
    def getScrollableTarget(): HTMLElement | Null = js.native
    
    def isElementAtBottom(target: HTMLElement): Boolean = js.native
    def isElementAtBottom(target: HTMLElement, scrollThreshold: String): Boolean = js.native
    def isElementAtBottom(target: HTMLElement, scrollThreshold: Double): Boolean = js.native
    
    def isElementAtTop(target: HTMLElement): Boolean = js.native
    def isElementAtTop(target: HTMLElement, scrollThreshold: String): Boolean = js.native
    def isElementAtTop(target: HTMLElement, scrollThreshold: Double): Boolean = js.native
    
    /* private */ var lastScrollTop: Any = js.native
    
    /* private */ var maxPullDownDistance: Any = js.native
    
    var onEnd: EventListener = js.native
    
    var onMove: EventListener = js.native
    
    def onScrollListener(event: MouseEvent): Unit = js.native
    
    var onStart: EventListener = js.native
    
    /* private */ var startY: Any = js.native
    
    /* private */ var throttledOnScrollListener: Any = js.native
  }
  
  trait Props extends StObject {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataLength: Double
    
    var endMessage: js.UndefOr[Node] = js.undefined
    
    var hasChildren: js.UndefOr[Boolean] = js.undefined
    
    var hasMore: Boolean
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var initialScrollY: js.UndefOr[Double] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var loader: Node
    
    var next: Fn
    
    var onScroll: js.UndefOr[js.Function1[/* e */ MouseEvent, Any]] = js.undefined
    
    var pullDownToRefresh: js.UndefOr[Boolean] = js.undefined
    
    var pullDownToRefreshContent: js.UndefOr[Node] = js.undefined
    
    var pullDownToRefreshThreshold: js.UndefOr[Double] = js.undefined
    
    var refreshFunction: js.UndefOr[Fn] = js.undefined
    
    var releaseToRefreshContent: js.UndefOr[Node] = js.undefined
    
    var scrollThreshold: js.UndefOr[Double | String] = js.undefined
    
    var scrollableTarget: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object Props {
    
    inline def apply(dataLength: Double, hasMore: Boolean, next: CallbackTo[Any]): Props = {
      val __obj = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], next = next.toJsFn, children = null, loader = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
      
      inline def setEndMessage(value: VdomNode): Self = StObject.set(x, "endMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEndMessageNull: Self = StObject.set(x, "endMessage", null)
      
      inline def setEndMessageUndefined: Self = StObject.set(x, "endMessage", js.undefined)
      
      inline def setEndMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endMessage", js.Array(value*))
      
      inline def setEndMessageVdomElement(value: VdomElement): Self = StObject.set(x, "endMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      inline def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
      
      inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInitialScrollY(value: Double): Self = StObject.set(x, "initialScrollY", value.asInstanceOf[js.Any])
      
      inline def setInitialScrollYUndefined: Self = StObject.set(x, "initialScrollY", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setLoader(value: VdomNode): Self = StObject.set(x, "loader", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLoaderNull: Self = StObject.set(x, "loader", null)
      
      inline def setLoaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loader", js.Array(value*))
      
      inline def setLoaderVdomElement(value: VdomElement): Self = StObject.set(x, "loader", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNext(value: CallbackTo[Any]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setOnScroll(value: /* e */ MouseEvent => Any): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setPullDownToRefresh(value: Boolean): Self = StObject.set(x, "pullDownToRefresh", value.asInstanceOf[js.Any])
      
      inline def setPullDownToRefreshContent(value: VdomNode): Self = StObject.set(x, "pullDownToRefreshContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPullDownToRefreshContentNull: Self = StObject.set(x, "pullDownToRefreshContent", null)
      
      inline def setPullDownToRefreshContentUndefined: Self = StObject.set(x, "pullDownToRefreshContent", js.undefined)
      
      inline def setPullDownToRefreshContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "pullDownToRefreshContent", js.Array(value*))
      
      inline def setPullDownToRefreshContentVdomElement(value: VdomElement): Self = StObject.set(x, "pullDownToRefreshContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPullDownToRefreshThreshold(value: Double): Self = StObject.set(x, "pullDownToRefreshThreshold", value.asInstanceOf[js.Any])
      
      inline def setPullDownToRefreshThresholdUndefined: Self = StObject.set(x, "pullDownToRefreshThreshold", js.undefined)
      
      inline def setPullDownToRefreshUndefined: Self = StObject.set(x, "pullDownToRefresh", js.undefined)
      
      inline def setRefreshFunction(value: CallbackTo[Any]): Self = StObject.set(x, "refreshFunction", value.toJsFn)
      
      inline def setRefreshFunctionUndefined: Self = StObject.set(x, "refreshFunction", js.undefined)
      
      inline def setReleaseToRefreshContent(value: VdomNode): Self = StObject.set(x, "releaseToRefreshContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setReleaseToRefreshContentNull: Self = StObject.set(x, "releaseToRefreshContent", null)
      
      inline def setReleaseToRefreshContentUndefined: Self = StObject.set(x, "releaseToRefreshContent", js.undefined)
      
      inline def setReleaseToRefreshContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "releaseToRefreshContent", js.Array(value*))
      
      inline def setReleaseToRefreshContentVdomElement(value: VdomElement): Self = StObject.set(x, "releaseToRefreshContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setScrollThreshold(value: Double | String): Self = StObject.set(x, "scrollThreshold", value.asInstanceOf[js.Any])
      
      inline def setScrollThresholdUndefined: Self = StObject.set(x, "scrollThreshold", js.undefined)
      
      inline def setScrollableTarget(value: VdomNode): Self = StObject.set(x, "scrollableTarget", value.rawNode.asInstanceOf[js.Any])
      
      inline def setScrollableTargetNull: Self = StObject.set(x, "scrollableTarget", null)
      
      inline def setScrollableTargetUndefined: Self = StObject.set(x, "scrollableTarget", js.undefined)
      
      inline def setScrollableTargetVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "scrollableTarget", js.Array(value*))
      
      inline def setScrollableTargetVdomElement(value: VdomElement): Self = StObject.set(x, "scrollableTarget", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var prevDataLength: js.UndefOr[Double] = js.undefined
    
    var pullToRefreshThresholdBreached: Boolean
    
    var showLoader: Boolean
  }
  object State {
    
    inline def apply(pullToRefreshThresholdBreached: Boolean, showLoader: Boolean): State = {
      val __obj = js.Dynamic.literal(pullToRefreshThresholdBreached = pullToRefreshThresholdBreached.asInstanceOf[js.Any], showLoader = showLoader.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setPrevDataLength(value: Double): Self = StObject.set(x, "prevDataLength", value.asInstanceOf[js.Any])
      
      inline def setPrevDataLengthUndefined: Self = StObject.set(x, "prevDataLength", js.undefined)
      
      inline def setPullToRefreshThresholdBreached(value: Boolean): Self = StObject.set(x, "pullToRefreshThresholdBreached", value.asInstanceOf[js.Any])
      
      inline def setShowLoader(value: Boolean): Self = StObject.set(x, "showLoader", value.asInstanceOf[js.Any])
    }
  }
}
