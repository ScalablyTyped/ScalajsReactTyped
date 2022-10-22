package typingsJapgolly.primereact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.primereact.primereactStrings.self
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogDialogMod {
  
  @JSImport("primereact/dialog/dialog", "Dialog")
  @js.native
  open class Dialog protected () extends Component[DialogProps, Any, Any] {
    def this(props: DialogProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DialogProps, context: Any) = this()
    
    def getCloseButton(): HTMLButtonElement = js.native
    
    def getContent(): HTMLDivElement = js.native
    
    def getElement(): HTMLDivElement = js.native
    
    def getFooter(): HTMLDivElement = js.native
    
    def getHeader(): HTMLDivElement = js.native
    
    def getMask(): HTMLDivElement = js.native
    
    def resetPosition(): Unit = js.native
  }
  
  type DialogAppendToType = js.UndefOr[self | HTMLElement | Null]
  
  type DialogBreakpoints = StringDictionary[String]
  
  trait DialogMaximizeParams extends StObject {
    
    var maximized: Boolean
    
    var originalEvent: ReactEventFrom[Element]
  }
  object DialogMaximizeParams {
    
    inline def apply(maximized: Boolean, originalEvent: ReactEventFrom[Element]): DialogMaximizeParams = {
      val __obj = js.Dynamic.literal(maximized = maximized.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogMaximizeParams]
    }
    
    extension [Self <: DialogMaximizeParams](x: Self) {
      
      inline def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.primereact.primereactStrings.center
    - typingsJapgolly.primereact.primereactStrings.top
    - typingsJapgolly.primereact.primereactStrings.bottom
    - typingsJapgolly.primereact.primereactStrings.left
    - typingsJapgolly.primereact.primereactStrings.right
    - typingsJapgolly.primereact.primereactStrings.`top-left`
    - typingsJapgolly.primereact.primereactStrings.`top-right`
    - typingsJapgolly.primereact.primereactStrings.`bottom-left`
    - typingsJapgolly.primereact.primereactStrings.`bottom-right`
  */
  trait DialogPositionType extends StObject
  object DialogPositionType {
    
    inline def bottom: typingsJapgolly.primereact.primereactStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.primereact.primereactStrings.bottom]
    
    inline def `bottom-left`: typingsJapgolly.primereact.primereactStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsJapgolly.primereact.primereactStrings.`bottom-left`]
    
    inline def `bottom-right`: typingsJapgolly.primereact.primereactStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsJapgolly.primereact.primereactStrings.`bottom-right`]
    
    inline def center: typingsJapgolly.primereact.primereactStrings.center = "center".asInstanceOf[typingsJapgolly.primereact.primereactStrings.center]
    
    inline def left: typingsJapgolly.primereact.primereactStrings.left = "left".asInstanceOf[typingsJapgolly.primereact.primereactStrings.left]
    
    inline def right: typingsJapgolly.primereact.primereactStrings.right = "right".asInstanceOf[typingsJapgolly.primereact.primereactStrings.right]
    
    inline def top: typingsJapgolly.primereact.primereactStrings.top = "top".asInstanceOf[typingsJapgolly.primereact.primereactStrings.top]
    
    inline def `top-left`: typingsJapgolly.primereact.primereactStrings.`top-left` = "top-left".asInstanceOf[typingsJapgolly.primereact.primereactStrings.`top-left`]
    
    inline def `top-right`: typingsJapgolly.primereact.primereactStrings.`top-right` = "top-right".asInstanceOf[typingsJapgolly.primereact.primereactStrings.`top-right`]
  }
  
  trait DialogProps extends StObject {
    
    var appendTo: js.UndefOr[DialogAppendToType] = js.undefined
    
    var ariaCloseIconLabel: js.UndefOr[String] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var blockScroll: js.UndefOr[Boolean] = js.undefined
    
    var breakpoints: js.UndefOr[DialogBreakpoints] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeOnEscape: js.UndefOr[Boolean] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[js.Object] = js.undefined
    
    var dismissableMask: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var focusOnShow: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[DialogTemplateType] = js.undefined
    
    var header: js.UndefOr[DialogTemplateType] = js.undefined
    
    var headerClassName: js.UndefOr[String] = js.undefined
    
    var headerStyle: js.UndefOr[js.Object] = js.undefined
    
    var icons: js.UndefOr[DialogTemplateType] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var keepInViewport: js.UndefOr[Boolean] = js.undefined
    
    var maskClassName: js.UndefOr[String] = js.undefined
    
    var maskStyle: js.UndefOr[js.Object] = js.undefined
    
    var maximizable: js.UndefOr[Boolean] = js.undefined
    
    var maximized: js.UndefOr[Boolean] = js.undefined
    
    var minX: js.UndefOr[Double] = js.undefined
    
    var minY: js.UndefOr[Double] = js.undefined
    
    var modal: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
    
    var onDrag: js.UndefOr[js.Function1[/* e */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* e */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* e */ ReactDragEventFrom[HTMLElement], Unit]] = js.undefined
    
    def onHide(): Unit
    
    var onMaskClick: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
    
    var onMaximize: js.UndefOr[js.Function1[/* e */ DialogMaximizeParams, Unit]] = js.undefined
    
    var onResize: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
    
    var onResizeEnd: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
    
    var onResizeStart: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var position: js.UndefOr[DialogPositionType] = js.undefined
    
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var transitionOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DialogProps {
    
    inline def apply(onHide: Callback): DialogProps = {
      val __obj = js.Dynamic.literal(onHide = onHide.toJsFn)
      __obj.asInstanceOf[DialogProps]
    }
    
    extension [Self <: DialogProps](x: Self) {
      
      inline def setAppendTo(value: DialogAppendToType): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAriaCloseIconLabel(value: String): Self = StObject.set(x, "ariaCloseIconLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaCloseIconLabelUndefined: Self = StObject.set(x, "ariaCloseIconLabel", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setBlockScroll(value: Boolean): Self = StObject.set(x, "blockScroll", value.asInstanceOf[js.Any])
      
      inline def setBlockScrollUndefined: Self = StObject.set(x, "blockScroll", js.undefined)
      
      inline def setBreakpoints(value: DialogBreakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: js.Object): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setDismissableMask(value: Boolean): Self = StObject.set(x, "dismissableMask", value.asInstanceOf[js.Any])
      
      inline def setDismissableMaskUndefined: Self = StObject.set(x, "dismissableMask", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFocusOnShow(value: Boolean): Self = StObject.set(x, "focusOnShow", value.asInstanceOf[js.Any])
      
      inline def setFocusOnShowUndefined: Self = StObject.set(x, "focusOnShow", js.undefined)
      
      inline def setFooter(value: DialogTemplateType): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterFunction1(value: /* props */ DialogProps => Node): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeader(value: DialogTemplateType): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      inline def setHeaderFunction1(value: /* props */ DialogProps => Node): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderStyle(value: js.Object): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIcons(value: DialogTemplateType): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsFunction1(value: /* props */ DialogProps => Node): Self = StObject.set(x, "icons", js.Any.fromFunction1(value))
      
      inline def setIconsNull: Self = StObject.set(x, "icons", null)
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setIconsVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "icons", js.Array(value*))
      
      inline def setIconsVdomElement(value: VdomElement): Self = StObject.set(x, "icons", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeepInViewport(value: Boolean): Self = StObject.set(x, "keepInViewport", value.asInstanceOf[js.Any])
      
      inline def setKeepInViewportUndefined: Self = StObject.set(x, "keepInViewport", js.undefined)
      
      inline def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      inline def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      inline def setMaskStyle(value: js.Object): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      inline def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
      
      inline def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
      
      inline def setMaximized(value: Boolean): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      inline def setMaximizedUndefined: Self = StObject.set(x, "maximized", js.undefined)
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOnClick(value: /* e */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDrag(value: /* e */ ReactDragEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: /* e */ ReactDragEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnDragEnd(value: /* e */ ReactDragEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: /* e */ ReactDragEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: /* e */ ReactDragEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: /* e */ ReactDragEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnMaskClick(value: /* e */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onMaskClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnMaskClickUndefined: Self = StObject.set(x, "onMaskClick", js.undefined)
      
      inline def setOnMaximize(value: /* e */ DialogMaximizeParams => Callback): Self = StObject.set(x, "onMaximize", js.Any.fromFunction1((t0: /* e */ DialogMaximizeParams) => value(t0).runNow()))
      
      inline def setOnMaximizeUndefined: Self = StObject.set(x, "onMaximize", js.undefined)
      
      inline def setOnResize(value: /* e */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnResizeEnd(value: /* e */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onResizeEnd", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnResizeEndUndefined: Self = StObject.set(x, "onResizeEnd", js.undefined)
      
      inline def setOnResizeStart(value: /* e */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPosition(value: DialogPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ): Self = StObject.set(x, "transitionOptions", value.asInstanceOf[js.Any])
      
      inline def setTransitionOptionsUndefined: Self = StObject.set(x, "transitionOptions", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type DialogTemplateType = Node | (js.Function1[/* props */ DialogProps, Node])
}
