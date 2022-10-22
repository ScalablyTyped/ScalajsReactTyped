package typingsJapgolly.primereact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualscrollerVirtualscrollerMod {
  
  @JSImport("primereact/virtualscroller/virtualscroller", "VirtualScroller")
  @js.native
  open class VirtualScroller protected () extends Component[VirtualScrollerProps, Any, Any] {
    def this(props: VirtualScrollerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VirtualScrollerProps, context: Any) = this()
    
    def getElementRef(): Ref[HTMLDivElement] = js.native
    
    def getRenderedRange(): VirtualScrollerRenderedRange = js.native
    
    def scrollInView(index: VirtualScrollerToIndexType, to: VirtualScrollerToType): Unit = js.native
    def scrollInView(
      index: VirtualScrollerToIndexType,
      to: VirtualScrollerToType,
      behavior: VirtualScrollerScrollBehavior
    ): Unit = js.native
    
    def scrollTo(options: VirtualScrollerOptionsType): Unit = js.native
    
    def scrollToIndex(index: VirtualScrollerToIndexType): Unit = js.native
    def scrollToIndex(index: VirtualScrollerToIndexType, behavior: VirtualScrollerScrollBehavior): Unit = js.native
  }
  
  trait VirtualScrollerChangeParams extends StObject {
    
    var first: VirtualScrollerStateType
    
    var last: VirtualScrollerStateType
  }
  object VirtualScrollerChangeParams {
    
    inline def apply(first: VirtualScrollerStateType, last: VirtualScrollerStateType): VirtualScrollerChangeParams = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerChangeParams]
    }
    
    extension [Self <: VirtualScrollerChangeParams](x: Self) {
      
      inline def setFirst(value: VirtualScrollerStateType): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setLast(value: VirtualScrollerStateType): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VirtualScrollerContentTemplateOptions extends StObject {
    
    var both: Boolean = js.native
    
    var children: Any = js.native
    
    var className: String = js.native
    
    var columns: js.Array[Any] = js.native
    
    var contentRef: Any = js.native
    
    var element: Element = js.native
    
    def getItemOptions(index: Double): VirtualScrollerTemplateOptions = js.native
    
    def getLoaderOptions(index: Double): VirtualScrollerLoadingTemplateOptions = js.native
    def getLoaderOptions(index: Double, ext: js.Object): VirtualScrollerLoadingTemplateOptions = js.native
    
    var horizontal: Boolean = js.native
    
    var itemSize: VirtualScrollerItemSizeType = js.native
    
    var items: VirtualScrollerItemsType = js.native
    
    var loading: Boolean = js.native
    
    var loadingTemplate: VirtualScrollerLoadingTemplateType = js.native
    
    var props: VirtualScrollerProps = js.native
    
    var rows: js.Array[Any] = js.native
    
    var spacerRef: Any = js.native
    
    var stickyRef: Any = js.native
    
    var vertical: Boolean = js.native
  }
  
  type VirtualScrollerContentTemplateType = Node | (js.Function1[/* options */ VirtualScrollerContentTemplateOptions, Node])
  
  type VirtualScrollerItemSizeType = Double | js.Array[Double]
  
  type VirtualScrollerItemTemplateType = Node | (js.Function2[/* item */ Any, /* options */ VirtualScrollerTemplateOptions, Node])
  
  type VirtualScrollerItemsType = js.UndefOr[(js.Array[Any | js.Array[Any]]) | Null]
  
  type VirtualScrollerLazyParams = VirtualScrollerChangeParams
  
  trait VirtualScrollerLoaderIconTemplateOptions extends StObject {
    
    var className: String
    
    var element: Element
    
    var props: VirtualScrollerProps
  }
  object VirtualScrollerLoaderIconTemplateOptions {
    
    inline def apply(className: String, element: VdomElement, props: VirtualScrollerProps): VirtualScrollerLoaderIconTemplateOptions = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], element = element.rawElement.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerLoaderIconTemplateOptions]
    }
    
    extension [Self <: VirtualScrollerLoaderIconTemplateOptions](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
      
      inline def setProps(value: VirtualScrollerProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type VirtualScrollerLoaderIconTemplateType = Node | (js.Function1[/* options */ VirtualScrollerLoaderIconTemplateOptions, Node])
  
  trait VirtualScrollerLoadingTemplateOptions
    extends StObject
       with VirtualScrollerTemplateOptions
       with /* key */ StringDictionary[Any] {
    
    var numCols: Double
  }
  object VirtualScrollerLoadingTemplateOptions {
    
    inline def apply(
      count: Double,
      even: Boolean,
      first: Boolean,
      index: Double,
      last: Boolean,
      numCols: Double,
      odd: Boolean,
      props: VirtualScrollerProps
    ): VirtualScrollerLoadingTemplateOptions = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], even = even.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], numCols = numCols.asInstanceOf[js.Any], odd = odd.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerLoadingTemplateOptions]
    }
    
    extension [Self <: VirtualScrollerLoadingTemplateOptions](x: Self) {
      
      inline def setNumCols(value: Double): Self = StObject.set(x, "numCols", value.asInstanceOf[js.Any])
    }
  }
  
  type VirtualScrollerLoadingTemplateType = Node | (js.Function1[/* options */ VirtualScrollerLoadingTemplateOptions, Node])
  
  trait VirtualScrollerOptionsType extends StObject {
    
    var behavior: VirtualScrollerScrollBehavior
    
    var left: Double
    
    var top: Double
  }
  object VirtualScrollerOptionsType {
    
    inline def apply(behavior: VirtualScrollerScrollBehavior, left: Double, top: Double): VirtualScrollerOptionsType = {
      val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerOptionsType]
    }
    
    extension [Self <: VirtualScrollerOptionsType](x: Self) {
      
      inline def setBehavior(value: VirtualScrollerScrollBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.vertical
    - typingsJapgolly.primereact.primereactStrings.horizontal
    - typingsJapgolly.primereact.primereactStrings.both
  */
  trait VirtualScrollerOrientationType extends StObject
  object VirtualScrollerOrientationType {
    
    inline def both: typingsJapgolly.primereact.primereactStrings.both = "both".asInstanceOf[typingsJapgolly.primereact.primereactStrings.both]
    
    inline def horizontal: typingsJapgolly.primereact.primereactStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.primereact.primereactStrings.horizontal]
    
    inline def vertical: typingsJapgolly.primereact.primereactStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.primereact.primereactStrings.vertical]
  }
  
  trait VirtualScrollerProps extends StObject {
    
    var autoSize: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var columns: js.UndefOr[Any] = js.undefined
    
    var contentTemplate: js.UndefOr[VirtualScrollerContentTemplateType] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var itemSize: js.UndefOr[VirtualScrollerItemSizeType] = js.undefined
    
    var itemTemplate: js.UndefOr[VirtualScrollerItemTemplateType] = js.undefined
    
    var items: js.UndefOr[VirtualScrollerItemsType] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var loaderDisabled: js.UndefOr[Boolean] = js.undefined
    
    var loaderIconTemplate: js.UndefOr[VirtualScrollerLoaderIconTemplateType] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var loadingTemplate: js.UndefOr[VirtualScrollerLoadingTemplateType] = js.undefined
    
    var numToleratedItems: js.UndefOr[Double] = js.undefined
    
    var onLazyLoad: js.UndefOr[js.Function1[/* e */ VirtualScrollerLazyParams, Unit]] = js.undefined
    
    var onScroll: js.UndefOr[js.Function1[/* e */ ReactUIEventFrom[HTMLElement], Unit]] = js.undefined
    
    var onScrollIndexChange: js.UndefOr[js.Function1[/* e */ VirtualScrollerChangeParams, Unit]] = js.undefined
    
    var orientation: js.UndefOr[VirtualScrollerOrientationType] = js.undefined
    
    var resizeDelay: js.UndefOr[Double] = js.undefined
    
    var scrollHeight: js.UndefOr[String] = js.undefined
    
    var scrollWidth: js.UndefOr[String] = js.undefined
    
    var showLoader: js.UndefOr[Boolean] = js.undefined
    
    var showSpacer: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object VirtualScrollerProps {
    
    inline def apply(): VirtualScrollerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VirtualScrollerProps]
    }
    
    extension [Self <: VirtualScrollerProps](x: Self) {
      
      inline def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setContentTemplate(value: VirtualScrollerContentTemplateType): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
      
      inline def setContentTemplateFunction1(value: /* options */ VirtualScrollerContentTemplateOptions => Node): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction1(value))
      
      inline def setContentTemplateNull: Self = StObject.set(x, "contentTemplate", null)
      
      inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
      
      inline def setContentTemplateVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "contentTemplate", js.Array(value*))
      
      inline def setContentTemplateVdomElement(value: VdomElement): Self = StObject.set(x, "contentTemplate", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemSize(value: VirtualScrollerItemSizeType): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
      
      inline def setItemSizeUndefined: Self = StObject.set(x, "itemSize", js.undefined)
      
      inline def setItemSizeVarargs(value: Double*): Self = StObject.set(x, "itemSize", js.Array(value*))
      
      inline def setItemTemplate(value: VirtualScrollerItemTemplateType): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
      
      inline def setItemTemplateFunction2(value: (/* item */ Any, /* options */ VirtualScrollerTemplateOptions) => Node): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction2(value))
      
      inline def setItemTemplateNull: Self = StObject.set(x, "itemTemplate", null)
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setItemTemplateVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "itemTemplate", js.Array(value*))
      
      inline def setItemTemplateVdomElement(value: VdomElement): Self = StObject.set(x, "itemTemplate", value.rawElement.asInstanceOf[js.Any])
      
      inline def setItems(value: VirtualScrollerItemsType): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsNull: Self = StObject.set(x, "items", null)
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: (Any | js.Array[Any])*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLoaderDisabled(value: Boolean): Self = StObject.set(x, "loaderDisabled", value.asInstanceOf[js.Any])
      
      inline def setLoaderDisabledUndefined: Self = StObject.set(x, "loaderDisabled", js.undefined)
      
      inline def setLoaderIconTemplate(value: VirtualScrollerLoaderIconTemplateType): Self = StObject.set(x, "loaderIconTemplate", value.asInstanceOf[js.Any])
      
      inline def setLoaderIconTemplateFunction1(value: /* options */ VirtualScrollerLoaderIconTemplateOptions => Node): Self = StObject.set(x, "loaderIconTemplate", js.Any.fromFunction1(value))
      
      inline def setLoaderIconTemplateNull: Self = StObject.set(x, "loaderIconTemplate", null)
      
      inline def setLoaderIconTemplateUndefined: Self = StObject.set(x, "loaderIconTemplate", js.undefined)
      
      inline def setLoaderIconTemplateVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "loaderIconTemplate", js.Array(value*))
      
      inline def setLoaderIconTemplateVdomElement(value: VdomElement): Self = StObject.set(x, "loaderIconTemplate", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingTemplate(value: VirtualScrollerLoadingTemplateType): Self = StObject.set(x, "loadingTemplate", value.asInstanceOf[js.Any])
      
      inline def setLoadingTemplateFunction1(value: /* options */ VirtualScrollerLoadingTemplateOptions => Node): Self = StObject.set(x, "loadingTemplate", js.Any.fromFunction1(value))
      
      inline def setLoadingTemplateNull: Self = StObject.set(x, "loadingTemplate", null)
      
      inline def setLoadingTemplateUndefined: Self = StObject.set(x, "loadingTemplate", js.undefined)
      
      inline def setLoadingTemplateVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "loadingTemplate", js.Array(value*))
      
      inline def setLoadingTemplateVdomElement(value: VdomElement): Self = StObject.set(x, "loadingTemplate", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setNumToleratedItems(value: Double): Self = StObject.set(x, "numToleratedItems", value.asInstanceOf[js.Any])
      
      inline def setNumToleratedItemsUndefined: Self = StObject.set(x, "numToleratedItems", js.undefined)
      
      inline def setOnLazyLoad(value: /* e */ VirtualScrollerLazyParams => Callback): Self = StObject.set(x, "onLazyLoad", js.Any.fromFunction1((t0: /* e */ VirtualScrollerLazyParams) => value(t0).runNow()))
      
      inline def setOnLazyLoadUndefined: Self = StObject.set(x, "onLazyLoad", js.undefined)
      
      inline def setOnScroll(value: /* e */ ReactUIEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: /* e */ ReactUIEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnScrollIndexChange(value: /* e */ VirtualScrollerChangeParams => Callback): Self = StObject.set(x, "onScrollIndexChange", js.Any.fromFunction1((t0: /* e */ VirtualScrollerChangeParams) => value(t0).runNow()))
      
      inline def setOnScrollIndexChangeUndefined: Self = StObject.set(x, "onScrollIndexChange", js.undefined)
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOrientation(value: VirtualScrollerOrientationType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setResizeDelay(value: Double): Self = StObject.set(x, "resizeDelay", value.asInstanceOf[js.Any])
      
      inline def setResizeDelayUndefined: Self = StObject.set(x, "resizeDelay", js.undefined)
      
      inline def setScrollHeight(value: String): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      inline def setScrollWidth(value: String): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
      
      inline def setScrollWidthUndefined: Self = StObject.set(x, "scrollWidth", js.undefined)
      
      inline def setShowLoader(value: Boolean): Self = StObject.set(x, "showLoader", value.asInstanceOf[js.Any])
      
      inline def setShowLoaderUndefined: Self = StObject.set(x, "showLoader", js.undefined)
      
      inline def setShowSpacer(value: Boolean): Self = StObject.set(x, "showSpacer", value.asInstanceOf[js.Any])
      
      inline def setShowSpacerUndefined: Self = StObject.set(x, "showSpacer", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait VirtualScrollerRenderedRange extends StObject {
    
    var first: Double
    
    var last: Double
    
    var viewport: VirtualScrollerViewportRenderedRange
  }
  object VirtualScrollerRenderedRange {
    
    inline def apply(first: Double, last: Double, viewport: VirtualScrollerViewportRenderedRange): VirtualScrollerRenderedRange = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerRenderedRange]
    }
    
    extension [Self <: VirtualScrollerRenderedRange](x: Self) {
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setViewport(value: VirtualScrollerViewportRenderedRange): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.auto
    - typingsJapgolly.primereact.primereactStrings.smooth
  */
  trait VirtualScrollerScrollBehavior extends StObject
  object VirtualScrollerScrollBehavior {
    
    inline def auto: typingsJapgolly.primereact.primereactStrings.auto = "auto".asInstanceOf[typingsJapgolly.primereact.primereactStrings.auto]
    
    inline def smooth: typingsJapgolly.primereact.primereactStrings.smooth = "smooth".asInstanceOf[typingsJapgolly.primereact.primereactStrings.smooth]
  }
  
  trait VirtualScrollerState extends StObject {
    
    var cols: Double
    
    var rows: Double
  }
  object VirtualScrollerState {
    
    inline def apply(cols: Double, rows: Double): VirtualScrollerState = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerState]
    }
    
    extension [Self <: VirtualScrollerState](x: Self) {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  type VirtualScrollerStateType = Double | VirtualScrollerState
  
  trait VirtualScrollerTemplateOptions extends StObject {
    
    var count: Double
    
    var even: Boolean
    
    var first: Boolean
    
    var index: Double
    
    var last: Boolean
    
    var odd: Boolean
    
    var props: VirtualScrollerProps
  }
  object VirtualScrollerTemplateOptions {
    
    inline def apply(
      count: Double,
      even: Boolean,
      first: Boolean,
      index: Double,
      last: Boolean,
      odd: Boolean,
      props: VirtualScrollerProps
    ): VirtualScrollerTemplateOptions = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], even = even.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], odd = odd.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerTemplateOptions]
    }
    
    extension [Self <: VirtualScrollerTemplateOptions](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEven(value: Boolean): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
      
      inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setOdd(value: Boolean): Self = StObject.set(x, "odd", value.asInstanceOf[js.Any])
      
      inline def setProps(value: VirtualScrollerProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type VirtualScrollerToIndexType = Double | js.Array[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.`to-start`
    - typingsJapgolly.primereact.primereactStrings.`to-end`
  */
  trait VirtualScrollerToType extends StObject
  object VirtualScrollerToType {
    
    inline def `to-end`: typingsJapgolly.primereact.primereactStrings.`to-end` = "to-end".asInstanceOf[typingsJapgolly.primereact.primereactStrings.`to-end`]
    
    inline def `to-start`: typingsJapgolly.primereact.primereactStrings.`to-start` = "to-start".asInstanceOf[typingsJapgolly.primereact.primereactStrings.`to-start`]
  }
  
  trait VirtualScrollerViewportRenderedRange extends StObject {
    
    var first: Double
    
    var last: Double
  }
  object VirtualScrollerViewportRenderedRange {
    
    inline def apply(first: Double, last: Double): VirtualScrollerViewportRenderedRange = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualScrollerViewportRenderedRange]
    }
    
    extension [Self <: VirtualScrollerViewportRenderedRange](x: Self) {
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    }
  }
}
