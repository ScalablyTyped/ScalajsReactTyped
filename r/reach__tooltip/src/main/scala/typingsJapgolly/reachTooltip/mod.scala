package typingsJapgolly.reachTooltip

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.DOMRect
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.reachPolymorphic.mod.ForwardRefComponent
import typingsJapgolly.reachTooltip.anon.DEBUGSTYLE
import typingsJapgolly.reachTooltip.reachTooltipStrings.div
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PointerEventHandler
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@reach/tooltip", "LEAVE_TIMEOUT")
  @js.native
  val LEAVE_TIMEOUT: /* 500 */ Double = js.native
  
  /**
    * Welcome to @reach/tooltip!
    *
    * When the user's mouse or focus rests on an element, a non-interactive popup
    * is displayed near it.
    *
    * Quick definitions:
    *
    * - "on rest" or "rested on": describes when the element receives mouse hover
    *   after a short delay (and hopefully soon, touch longpress).
    *
    * - "activation": describes a mouse click, keyboard enter, or keyboard space.
    *
    * Only one tooltip can be visible at a time, so we use a global state chart to
    * describe the various states and transitions between states that are possible.
    * With all the timeouts involved with tooltips it's important to "make
    * impossible states impossible" with a state machine.
    *
    * It's also okay to use these module globals because you don't server render
    * tooltips. None of the state is changed outside of user events.
    *
    * There are a few features that are important to understand.
    *
    * 1. Tooltips don't show up until the user has rested on one, we don't want
    *    tooltips popping up as you move your mouse around the page.
    *
    * 2. Once any tooltip becomes visible, other tooltips nearby should skip
    *    resting and display immediately.
    *
    * 3. Tooltips stick around for a little bit after blur/mouseleave.
    *
    * TODO: Research longpress tooltips on Android, iOS - Probably want to position
    *       it by default above, since your thumb is below and would cover it - I'm
    *       thinking after longpress, display the tooltip and cancel any click
    *       events. Then on touchend, so they can read it display the tooltip for a
    *       little while longer in case their hand was obstructing the tooltip.
    *
    * @see Docs     https://reach.tech/tooltip
    * @see Source   https://github.com/reach/reach-ui/tree/main/packages/tooltip
    * @see WAI-ARIA https://www.w3.org/TR/wai-aria-practices-1.2/#tooltip
    */
  @JSImport("@reach/tooltip", "MOUSE_REST_TIMEOUT")
  @js.native
  val MOUSE_REST_TIMEOUT: /* 100 */ Double = js.native
  
  /**
    * Tooltip
    *
    * @see Docs https://reach.tech/tooltip#tooltip
    */
  @JSImport("@reach/tooltip", "Tooltip")
  @js.native
  val Tooltip: ForwardRefComponent[div, TooltipProps] = js.native
  
  /**
    * TooltipPopup
    *
    * @see Docs https://reach.tech/tooltip#tooltippopup
    */
  @JSImport("@reach/tooltip", "TooltipPopup")
  @js.native
  val TooltipPopup: ForwardRefComponent[div, TooltipPopupProps] = js.native
  
  @JSImport("@reach/tooltip", "positionTooltip")
  @js.native
  val positionTooltip: Position = js.native
  
  /**
    * useTooltip
    *
    * @param params
    */
  inline def useTooltip[ElementType /* <: HTMLElement | SVGElement */](): js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")().asInstanceOf[js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean]]
  inline def useTooltip[ElementType /* <: HTMLElement | SVGElement */](
    hasIdPropOnPointerEnterOnPointerMoveOnPointerLeaveOnPointerDownOnMouseEnterOnMouseMoveOnMouseLeaveOnMouseDownOnFocusOnBlurOnKeyDownDisabledForwardedRefDEBUG_STYLE: DEBUGSTYLE[ElementType] & HTMLAttributes[ElementType]
  ): js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")(hasIdPropOnPointerEnterOnPointerMoveOnPointerLeaveOnPointerDownOnMouseEnterOnMouseMoveOnMouseLeaveOnMouseDownOnFocusOnBlurOnKeyDownDisabledForwardedRefDEBUG_STYLE.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[TriggerParams[ElementType], TooltipParams, Boolean]]
  
  /* Inlined std.Partial<std.DOMRect> & { readonly bottom :number,  readonly height :number,  readonly left :number,  readonly right :number,  readonly top :number,  readonly width :number} */
  trait PRect extends StObject {
    
    var bottom: js.UndefOr[Double] & Double
    
    var height: js.UndefOr[Double] & Double
    
    var left: js.UndefOr[Double] & Double
    
    var right: js.UndefOr[Double] & Double
    
    var toJSON: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var top: js.UndefOr[Double] & Double
    
    var width: js.UndefOr[Double] & Double
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PRect {
    
    inline def apply(
      bottom: js.UndefOr[Double] & Double,
      height: js.UndefOr[Double] & Double,
      left: js.UndefOr[Double] & Double,
      right: js.UndefOr[Double] & Double,
      top: js.UndefOr[Double] & Double,
      width: js.UndefOr[Double] & Double
    ): PRect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PRect]
    }
    
    extension [Self <: PRect](x: Self) {
      
      inline def setBottom(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
      
      inline def setTop(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type Position = js.Function2[
    /* targetRect */ js.UndefOr[PRect | Null], 
    /* popoverRect */ js.UndefOr[PRect | Null], 
    CSSProperties
  ]
  
  trait TooltipContentProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    var label: Node
    
    var position: js.UndefOr[Position] = js.undefined
    
    var triggerRect: DOMRect | Null
  }
  object TooltipContentProps {
    
    inline def apply(): TooltipContentProps = {
      val __obj = js.Dynamic.literal(label = null, triggerRect = null)
      __obj.asInstanceOf[TooltipContentProps]
    }
    
    extension [Self <: TooltipContentProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPosition(
        value: (/* targetRect */ js.UndefOr[PRect | Null], /* popoverRect */ js.UndefOr[PRect | Null]) => CSSProperties
      ): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTriggerRect(value: DOMRect): Self = StObject.set(x, "triggerRect", value.asInstanceOf[js.Any])
      
      inline def setTriggerRectNull: Self = StObject.set(x, "triggerRect", null)
    }
  }
  
  trait TooltipParams extends StObject {
    
    var id: String
    
    var isVisible: Boolean
    
    var triggerRect: DOMRect | Null
  }
  object TooltipParams {
    
    inline def apply(id: String, isVisible: Boolean): TooltipParams = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], triggerRect = null)
      __obj.asInstanceOf[TooltipParams]
    }
    
    extension [Self <: TooltipParams](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setTriggerRect(value: DOMRect): Self = StObject.set(x, "triggerRect", value.asInstanceOf[js.Any])
      
      inline def setTriggerRectNull: Self = StObject.set(x, "triggerRect", null)
    }
  }
  
  trait TooltipPopupProps
    extends StObject
       with TooltipContentProps {
    
    var children: js.UndefOr[Node] = js.undefined
  }
  object TooltipPopupProps {
    
    inline def apply(): TooltipPopupProps = {
      val __obj = js.Dynamic.literal(label = null, triggerRect = null)
      __obj.asInstanceOf[TooltipPopupProps]
    }
    
    extension [Self <: TooltipPopupProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<@reach/tooltip.@reach/tooltip.TooltipContentProps, 'triggerRect' | 'isVisible'> */
  trait TooltipProps extends StObject {
    
    var DEBUG_STYLE: js.UndefOr[Boolean] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var children: Node
    
    var label: Node
    
    var position: js.UndefOr[Position] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal(children = null, label = null)
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDEBUG_STYLE(value: Boolean): Self = StObject.set(x, "DEBUG_STYLE", value.asInstanceOf[js.Any])
      
      inline def setDEBUG_STYLEUndefined: Self = StObject.set(x, "DEBUG_STYLE", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPosition(
        value: (/* targetRect */ js.UndefOr[PRect | Null], /* popoverRect */ js.UndefOr[PRect | Null]) => CSSProperties
      ): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait TriggerParams[ElementType /* <: HTMLElement | SVGElement */] extends StObject {
    
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    var `data-reach-tooltip-trigger`: String
    
    var `data-state`: String
    
    var onBlur: FocusEventHandler[ElementType]
    
    var onFocus: FocusEventHandler[ElementType]
    
    var onKeyDown: KeyboardEventHandler[ElementType]
    
    var onMouseDown: js.UndefOr[MouseEventHandler[ElementType]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[ElementType]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[ElementType]] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[ElementType]] = js.undefined
    
    var onPointerDown: PointerEventHandler[ElementType]
    
    var onPointerEnter: PointerEventHandler[ElementType]
    
    var onPointerLeave: PointerEventHandler[ElementType]
    
    var onPointerMove: PointerEventHandler[ElementType]
    
    var ref: Ref[ElementType]
  }
  object TriggerParams {
    
    inline def apply[ElementType /* <: HTMLElement | SVGElement */](
      `data-reach-tooltip-trigger`: String,
      `data-state`: String,
      onBlur: ReactFocusEventFrom[ElementType & org.scalajs.dom.Element] => Callback,
      onFocus: ReactFocusEventFrom[ElementType & org.scalajs.dom.Element] => Callback,
      onKeyDown: ReactKeyboardEventFrom[ElementType & org.scalajs.dom.Element] => Callback,
      onPointerDown: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element] => Callback,
      onPointerEnter: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element] => Callback,
      onPointerLeave: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element] => Callback,
      onPointerMove: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element] => Callback
    ): TriggerParams[ElementType] = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[ElementType & org.scalajs.dom.Element]) => onBlur(t0).runNow()), onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[ElementType & org.scalajs.dom.Element]) => onFocus(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[ElementType & org.scalajs.dom.Element]) => onKeyDown(t0).runNow()), onPointerDown = js.Any.fromFunction1((t0: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element]) => onPointerDown(t0).runNow()), onPointerEnter = js.Any.fromFunction1((t0: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element]) => onPointerEnter(t0).runNow()), onPointerLeave = js.Any.fromFunction1((t0: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element]) => onPointerLeave(t0).runNow()), onPointerMove = js.Any.fromFunction1((t0: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element]) => onPointerMove(t0).runNow()), ref = null)
      __obj.updateDynamic("data-reach-tooltip-trigger")(`data-reach-tooltip-trigger`.asInstanceOf[js.Any])
      __obj.updateDynamic("data-state")(`data-state`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerParams[ElementType]]
    }
    
    extension [Self <: TriggerParams[?], ElementType /* <: HTMLElement | SVGElement */](x: Self & TriggerParams[ElementType]) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setData-reach-tooltip-trigger`(value: String): Self = StObject.set(x, "data-reach-tooltip-trigger", value.asInstanceOf[js.Any])
      
      inline def `setData-state`(value: String): Self = StObject.set(x, "data-state", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[ElementType & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[ElementType & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocus(value: ReactFocusEventFrom[ElementType & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[ElementType & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[ElementType & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[ElementType & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[ElementType & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[ElementType & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[ElementType & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[ElementType & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[ElementType & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[ElementType & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: ReactMouseEventFrom[ElementType & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[ElementType & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnPointerDown(value: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerEnter(value: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerLeave(value: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPointerMove(value: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[ElementType & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setRef(value: Ref[ElementType]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: ElementType | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: ElementType | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
}
