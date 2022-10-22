package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.baseui.layerTypesMod.TetherPlacement
import typingsJapgolly.baseui.popoverTypesMod.AccessibilityType
import typingsJapgolly.baseui.popoverTypesMod.ContentRenderProp
import typingsJapgolly.baseui.popoverTypesMod.PopoverOverrides
import typingsJapgolly.baseui.popoverTypesMod.TriggerType
import typingsJapgolly.std.FocusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/popover/types.PopoverProps & {  innerRef :react.react.Ref<std.HTMLElement> | undefined} */
trait PopoverPropsinnerRefRefHT extends StObject {
  
  /** Controls how this popover behaves for screen readers and other assistive devices.
    * See the A11Y section at the bottom of this document for more details.
    */
  var accessibilityType: js.UndefOr[AccessibilityType] = js.undefined
  
  /** How long should be fade out animation in ms, default 0ms */
  var animateOutTime: js.UndefOr[Double] = js.undefined
  
  /** If true, focus will shift to the first interactive element within the popover.
    * If false, the popover container itself will receive focus.
    * Moving focus into a newly opened popover is important for accessibility purposes, so please be careful!
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /** Content that should trigger the popover to be shown (also acts as the anchor against
    * which the popover will be positioned).
    */
  var children: Node
  
  /** Content to render within the popover when it's shown. */
  var content: Node | ContentRenderProp
  
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  
  /** If true, focus will be locked to elements within the popover.
    */
  var focusLock: js.UndefOr[Boolean] = js.undefined
  
  /** Pass FocusOptions for focusing (used as `HtmlElement.focus(focusOptions)`) */
  var focusOptions: js.UndefOr[FocusOptions] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /** If true, popover element will not avoid element boundaries. */
  var ignoreBoundary: js.UndefOr[Boolean] = js.undefined
  
  var innerRef: js.UndefOr[typingsJapgolly.react.mod.Ref[HTMLElement]] = js.undefined
  
  /** Whether or not to show the popover. */
  var isOpen: Boolean
  
  /** Where to mount the popover */
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  
  /** Handler for blur events on trigger element. */
  var onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.undefined
  
  /** Handler for click events on trigger element. */
  var onClick: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Any]] = js.undefined
  
  /** Handler for clicks outside the anchor/popover elements. */
  var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, Any]] = js.undefined
  
  /** Handler for click events on trigger element. */
  var onEsc: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** Handler for 'Esc' keypress events */
  var onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.undefined
  
  /** Handler for mouseenter events on trigger element. */
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.undefined
  
  /** Number of milliseconds to wait before showing the popover after mouse enters the trigger element (for triggerType `hover`). */
  var onMouseEnterDelay: js.UndefOr[Double] = js.undefined
  
  /** Handler for mouseleave events on trigger element. */
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.undefined
  
  /** Number of milliseconds to wait before showing the popover after mouse leaves the trigger element (for triggerType `hover`). */
  var onMouseLeaveDelay: js.UndefOr[Double] = js.undefined
  
  var overrides: js.UndefOr[PopoverOverrides] = js.undefined
  
  /** How to position the popover relative to the target. */
  var placement: js.UndefOr[TetherPlacement] = js.undefined
  
  /** Margin of the popover */
  var popoverMargin: js.UndefOr[Double] = js.undefined
  
  /** Popper options override
    * https://github.com/popperjs/popper.js/blob/v1.x/docs/_includes/popper-documentation.md
    */
  var popperOptions: js.UndefOr[Any] = js.undefined
  
  /** Renders all popover content for SEO purposes regardless of popover isOpen state */
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  /** If true, focus will shift back to the original element that triggered the popover
    * Be careful with elements that open the popover on focus (e.g. input) this will cause the popover to reopen on close!
    */
  var returnFocus: js.UndefOr[
    Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
  ] = js.undefined
  
  /** Whether or not to show the arrow pointing from the popover to the trigger. */
  var showArrow: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to toggle the popover when trigger is clicked or hovered. */
  var triggerType: js.UndefOr[TriggerType] = js.undefined
}
object PopoverPropsinnerRefRefHT {
  
  inline def apply(isOpen: Boolean): PopoverPropsinnerRefRefHT = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], children = null, content = null)
    __obj.asInstanceOf[PopoverPropsinnerRefRefHT]
  }
  
  extension [Self <: PopoverPropsinnerRefRefHT](x: Self) {
    
    inline def setAccessibilityType(value: AccessibilityType): Self = StObject.set(x, "accessibilityType", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityTypeUndefined: Self = StObject.set(x, "accessibilityType", js.undefined)
    
    inline def setAnimateOutTime(value: Double): Self = StObject.set(x, "animateOutTime", value.asInstanceOf[js.Any])
    
    inline def setAnimateOutTimeUndefined: Self = StObject.set(x, "animateOutTime", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setContent(value: Node | ContentRenderProp): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "content", value.toJsFn)
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    
    inline def `setData-baseweb`(value: String): Self = StObject.set(x, "data-baseweb", value.asInstanceOf[js.Any])
    
    inline def `setData-basewebUndefined`: Self = StObject.set(x, "data-baseweb", js.undefined)
    
    inline def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
    
    inline def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
    
    inline def setFocusOptions(value: FocusOptions): Self = StObject.set(x, "focusOptions", value.asInstanceOf[js.Any])
    
    inline def setFocusOptionsUndefined: Self = StObject.set(x, "focusOptions", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIgnoreBoundary(value: Boolean): Self = StObject.set(x, "ignoreBoundary", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBoundaryUndefined: Self = StObject.set(x, "ignoreBoundary", js.undefined)
    
    inline def setInnerRef(value: typingsJapgolly.react.mod.Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
    
    inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
    
    inline def setOnBlur(value: /* e */ ReactFocusEventFrom[Element] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClick(value: /* e */ ReactEventFrom[Element] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickOutside(value: /* event */ MouseEvent => Any): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
    
    inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnEsc(value: CallbackTo[Any]): Self = StObject.set(x, "onEsc", value.toJsFn)
    
    inline def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
    
    inline def setOnFocus(value: /* e */ ReactFocusEventFrom[Element] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnMouseEnter(value: /* e */ ReactMouseEventFrom[Element] => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    
    inline def setOnMouseEnterDelay(value: Double): Self = StObject.set(x, "onMouseEnterDelay", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnterDelayUndefined: Self = StObject.set(x, "onMouseEnterDelay", js.undefined)
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: /* e */ ReactMouseEventFrom[Element] => Any): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveDelay(value: Double): Self = StObject.set(x, "onMouseLeaveDelay", value.asInstanceOf[js.Any])
    
    inline def setOnMouseLeaveDelayUndefined: Self = StObject.set(x, "onMouseLeaveDelay", js.undefined)
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOverrides(value: PopoverOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPlacement(value: TetherPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setPopoverMargin(value: Double): Self = StObject.set(x, "popoverMargin", value.asInstanceOf[js.Any])
    
    inline def setPopoverMarginUndefined: Self = StObject.set(x, "popoverMargin", js.undefined)
    
    inline def setPopperOptions(value: Any): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
    
    inline def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
    
    inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    inline def setReturnFocus(value: Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
    
    inline def setReturnFocusFunction1(value: /* returnTo */ Element => Boolean | FocusOptions): Self = StObject.set(x, "returnFocus", js.Any.fromFunction1(value))
    
    inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
    
    inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    inline def setTriggerType(value: TriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    inline def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
  }
}
