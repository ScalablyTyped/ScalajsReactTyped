package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.baseui.layerTypesMod.TetherPlacement
import typingsJapgolly.baseui.popoverTypesMod.AccessibilityType
import typingsJapgolly.baseui.popoverTypesMod.PopoverOverrides
import typingsJapgolly.baseui.popoverTypesMod.TriggerType
import typingsJapgolly.std.FocusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<baseui.baseui/popover/types.BasePopoverProps> */
trait PartialBasePopoverProps extends StObject {
  
  var accessibilityType: js.UndefOr[AccessibilityType] = js.undefined
  
  var animateOutTime: js.UndefOr[Double] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var `data-baseweb`: js.UndefOr[String] = js.undefined
  
  var focusLock: js.UndefOr[Boolean] = js.undefined
  
  var focusOptions: js.UndefOr[FocusOptions] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var ignoreBoundary: js.UndefOr[Boolean] = js.undefined
  
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Any]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[Element], Any]] = js.undefined
  
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.undefined
  
  var onMouseEnterDelay: js.UndefOr[Double] = js.undefined
  
  var onMouseLeave: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Any]] = js.undefined
  
  var onMouseLeaveDelay: js.UndefOr[Double] = js.undefined
  
  var overrides: js.UndefOr[PopoverOverrides] = js.undefined
  
  var placement: js.UndefOr[TetherPlacement] = js.undefined
  
  var popoverMargin: js.UndefOr[Double] = js.undefined
  
  var popperOptions: js.UndefOr[Any] = js.undefined
  
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  var returnFocus: js.UndefOr[
    Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])
  ] = js.undefined
  
  var showArrow: js.UndefOr[Boolean] = js.undefined
  
  var triggerType: js.UndefOr[TriggerType] = js.undefined
}
object PartialBasePopoverProps {
  
  inline def apply(): PartialBasePopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBasePopoverProps]
  }
  
  extension [Self <: PartialBasePopoverProps](x: Self) {
    
    inline def setAccessibilityType(value: AccessibilityType): Self = StObject.set(x, "accessibilityType", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityTypeUndefined: Self = StObject.set(x, "accessibilityType", js.undefined)
    
    inline def setAnimateOutTime(value: Double): Self = StObject.set(x, "animateOutTime", value.asInstanceOf[js.Any])
    
    inline def setAnimateOutTimeUndefined: Self = StObject.set(x, "animateOutTime", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
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
    
    inline def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
    
    inline def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
    
    inline def setOnBlur(value: /* e */ ReactFocusEventFrom[Element] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClick(value: /* e */ ReactEventFrom[Element] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
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
