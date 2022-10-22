package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.`253`
import typingsJapgolly.baseui.layerTypesMod.TetherPlacement
import typingsJapgolly.baseui.popoverTypesMod.AccessibilityType
import typingsJapgolly.baseui.popoverTypesMod.PopoverOverrides
import typingsJapgolly.baseui.popoverTypesMod.State
import typingsJapgolly.baseui.popoverTypesMod.StateChangeType
import typingsJapgolly.baseui.popoverTypesMod.StatefulContentRenderProp
import typingsJapgolly.baseui.popoverTypesMod.TriggerType
import typingsJapgolly.std.FocusOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_StatefulPopoverProps_2143430071 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def accessibilityType(value: AccessibilityType): this.type = set("accessibilityType", value.asInstanceOf[js.Any])
  
  inline def animateOutTime(value: Double): this.type = set("animateOutTime", value.asInstanceOf[js.Any])
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def content(value: Node | StatefulContentRenderProp): this.type = set("content", value.asInstanceOf[js.Any])
  
  inline def contentFunction1(value: /* a */ `253` => Node): this.type = set("content", js.Any.fromFunction1(value))
  
  inline def contentNull: this.type = set("content", null)
  
  inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
  
  inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
  
  inline def `data-baseweb`(value: String): this.type = set("data-baseweb", value.asInstanceOf[js.Any])
  
  inline def dismissOnClickOutside(value: Boolean): this.type = set("dismissOnClickOutside", value.asInstanceOf[js.Any])
  
  inline def dismissOnEsc(value: Boolean): this.type = set("dismissOnEsc", value.asInstanceOf[js.Any])
  
  inline def focusLock(value: Boolean): this.type = set("focusLock", value.asInstanceOf[js.Any])
  
  inline def focusOptions(value: FocusOptions): this.type = set("focusOptions", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def ignoreBoundary(value: Boolean): this.type = set("ignoreBoundary", value.asInstanceOf[js.Any])
  
  inline def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
  
  inline def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
  
  inline def onBlur(value: /* e */ ReactFocusEventFrom[org.scalajs.dom.Element] => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  inline def onClick(value: /* e */ ReactEventFrom[org.scalajs.dom.Element] => Any): this.type = set("onClick", js.Any.fromFunction1(value))
  
  inline def onClose(value: CallbackTo[Any]): this.type = set("onClose", value.toJsFn)
  
  inline def onFocus(value: /* e */ ReactFocusEventFrom[org.scalajs.dom.Element] => Any): this.type = set("onFocus", js.Any.fromFunction1(value))
  
  inline def onMouseEnter(value: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element] => Any): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  inline def onMouseEnterDelay(value: Double): this.type = set("onMouseEnterDelay", value.asInstanceOf[js.Any])
  
  inline def onMouseLeave(value: /* e */ ReactMouseEventFrom[org.scalajs.dom.Element] => Any): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  inline def onMouseLeaveDelay(value: Double): this.type = set("onMouseLeaveDelay", value.asInstanceOf[js.Any])
  
  inline def onOpen(value: CallbackTo[Any]): this.type = set("onOpen", value.toJsFn)
  
  inline def overrides(value: PopoverOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  
  inline def placement(value: TetherPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
  
  inline def popoverMargin(value: Double): this.type = set("popoverMargin", value.asInstanceOf[js.Any])
  
  inline def popperOptions(value: Any): this.type = set("popperOptions", value.asInstanceOf[js.Any])
  
  inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
  
  inline def returnFocus(
    value: Boolean | FocusOptions | (js.Function1[/* returnTo */ org.scalajs.dom.Element, Boolean | FocusOptions])
  ): this.type = set("returnFocus", value.asInstanceOf[js.Any])
  
  inline def returnFocusFunction1(value: /* returnTo */ org.scalajs.dom.Element => Boolean | FocusOptions): this.type = set("returnFocus", js.Any.fromFunction1(value))
  
  inline def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
  
  inline def stateReducer(
    value: (/* stateChangeType */ StateChangeType, /* nextState */ State, /* currentState */ State) => State
  ): this.type = set("stateReducer", js.Any.fromFunction3(value))
  
  inline def triggerType(value: TriggerType): this.type = set("triggerType", value.asInstanceOf[js.Any])
}
