package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.gestalt.anon.DangerouslydangerouslyDisableOnNavigation
import typingsJapgolly.gestalt.anon.Event
import typingsJapgolly.gestalt.gestaltInts.`-1`
import typingsJapgolly.gestalt.gestaltInts.`0`
import typingsJapgolly.gestalt.gestaltInts.`1`
import typingsJapgolly.gestalt.gestaltInts.`2`
import typingsJapgolly.gestalt.gestaltInts.`3`
import typingsJapgolly.gestalt.gestaltInts.`4`
import typingsJapgolly.gestalt.gestaltInts.`5`
import typingsJapgolly.gestalt.gestaltInts.`6`
import typingsJapgolly.gestalt.gestaltInts.`7`
import typingsJapgolly.gestalt.gestaltInts.`8`
import typingsJapgolly.gestalt.gestaltStrings.blank
import typingsJapgolly.gestalt.gestaltStrings.button
import typingsJapgolly.gestalt.gestaltStrings.circle
import typingsJapgolly.gestalt.gestaltStrings.compress
import typingsJapgolly.gestalt.gestaltStrings.copy
import typingsJapgolly.gestalt.gestaltStrings.grab
import typingsJapgolly.gestalt.gestaltStrings.grabbing
import typingsJapgolly.gestalt.gestaltStrings.link
import typingsJapgolly.gestalt.gestaltStrings.move
import typingsJapgolly.gestalt.gestaltStrings.noDrop
import typingsJapgolly.gestalt.gestaltStrings.nofollow
import typingsJapgolly.gestalt.gestaltStrings.none
import typingsJapgolly.gestalt.gestaltStrings.pill
import typingsJapgolly.gestalt.gestaltStrings.pointer
import typingsJapgolly.gestalt.gestaltStrings.self
import typingsJapgolly.gestalt.gestaltStrings.zoomIn
import typingsJapgolly.gestalt.gestaltStrings.zoomOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapAreaProps extends StObject {
  
  var accessibilityControls: js.UndefOr[String] = js.undefined
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fullHeight: js.UndefOr[Boolean] = js.undefined
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var mouseCursor: js.UndefOr[copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut] = js.undefined
  
  var onBlur: js.UndefOr[
    AbstractEventHandler[ReactFocusEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element], js.Object]
  ] = js.undefined
  
  var onFocus: js.UndefOr[
    AbstractEventHandler[ReactFocusEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element], js.Object]
  ] = js.undefined
  
  var onMouseDown: js.UndefOr[
    AbstractEventHandler[ReactMouseEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element], js.Object]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    AbstractEventHandler[ReactMouseEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element], js.Object]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    AbstractEventHandler[ReactMouseEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element], js.Object]
  ] = js.undefined
  
  var onTap: js.UndefOr[OnTapType] = js.undefined
  
  var rel: js.UndefOr[none | nofollow] = js.undefined
  
  var role: js.UndefOr[button | link] = js.undefined
  
  var rounding: js.UndefOr[pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  
  var tabIndex: js.UndefOr[`-1` | `0`] = js.undefined
  
  var tapStyle: js.UndefOr[none | compress] = js.undefined
  
  var target: js.UndefOr[Null | self | blank] = js.undefined
}
object TapAreaProps {
  
  inline def apply(): TapAreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapAreaProps]
  }
  
  extension [Self <: TapAreaProps](x: Self) {
    
    inline def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    inline def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    inline def setAccessibilityHaspopup(value: Boolean): Self = StObject.set(x, "accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHaspopupUndefined: Self = StObject.set(x, "accessibilityHaspopup", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFullHeight(value: Boolean): Self = StObject.set(x, "fullHeight", value.asInstanceOf[js.Any])
    
    inline def setFullHeightUndefined: Self = StObject.set(x, "fullHeight", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setMouseCursor(value: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut): Self = StObject.set(x, "mouseCursor", value.asInstanceOf[js.Any])
    
    inline def setMouseCursorUndefined: Self = StObject.set(x, "mouseCursor", js.undefined)
    
    inline def setOnBlur(
      value: /* arg */ js.Object & (Event[ReactFocusEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element]]) => Callback
    ): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* arg */ js.Object & (Event[ReactFocusEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element]])) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnFocus(
      value: /* arg */ js.Object & (Event[ReactFocusEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element]]) => Callback
    ): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* arg */ js.Object & (Event[ReactFocusEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element]])) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnMouseDown(
      value: /* arg */ js.Object & (Event[ReactMouseEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element]]) => Callback
    ): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: /* arg */ js.Object & (Event[ReactMouseEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element]])) => value(t0).runNow()))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(
      value: /* arg */ js.Object & (Event[ReactMouseEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element]]) => Callback
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: /* arg */ js.Object & (Event[ReactMouseEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element]])) => value(t0).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: /* arg */ js.Object & (Event[ReactMouseEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element]]) => Callback
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: /* arg */ js.Object & (Event[ReactMouseEventFrom[(HTMLDivElement | HTMLAnchorElement) & Element]])) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnTap(
      value: /* arg */ DangerouslydangerouslyDisableOnNavigation & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element])
        ]) => Callback
    ): Self = StObject.set(x, "onTap", js.Any.fromFunction1((t0: /* arg */ DangerouslydangerouslyDisableOnNavigation & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element])
        ])) => value(t0).runNow()))
    
    inline def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
    
    inline def setRel(value: none | nofollow): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRole(value: button | link): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRounding(value: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    inline def setTabIndex(value: `-1` | `0`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTapStyle(value: none | compress): Self = StObject.set(x, "tapStyle", value.asInstanceOf[js.Any])
    
    inline def setTapStyleUndefined: Self = StObject.set(x, "tapStyle", js.undefined)
    
    inline def setTarget(value: self | blank): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
