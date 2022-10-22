package typingsJapgolly.rcDropdown.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTrigger.esInterfaceMod.ActionType
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.rcTrigger.esInterfaceMod.AnimationType
import typingsJapgolly.rcTrigger.esInterfaceMod.BuildInPlacements
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DropdownPropsRefAttributes1412069010 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
  
  inline def alignPoint(value: Boolean): this.type = set("alignPoint", value.asInstanceOf[js.Any])
  
  inline def animation(value: AnimationType): this.type = set("animation", value.asInstanceOf[js.Any])
  
  inline def arrow(value: Boolean): this.type = set("arrow", value.asInstanceOf[js.Any])
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def builtinPlacements(value: BuildInPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
  
  inline def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  inline def hideAction(value: js.Array[ActionType]): this.type = set("hideAction", value.asInstanceOf[js.Any])
  
  inline def hideActionVarargs(value: ActionType*): this.type = set("hideAction", js.Array(value*))
  
  inline def minOverlayWidthMatchTrigger(value: Boolean): this.type = set("minOverlayWidthMatchTrigger", value.asInstanceOf[js.Any])
  
  inline def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
  
  inline def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
  
  inline def onOverlayClick(value: /* e */ Event => Callback): this.type = set("onOverlayClick", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
  
  inline def onPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Callback): this.type = set("onPopupAlign", js.Any.fromFunction2((t0: /* element */ HTMLElement, t1: /* align */ AlignType) => (value(t0, t1)).runNow()))
  
  inline def onVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
  
  inline def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
  
  inline def overlay(value: js.Function0[Element] | Element): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  inline def overlayCallbackTo(value: CallbackTo[Element]): this.type = set("overlay", value.toJsFn)
  
  inline def overlayClassName(value: String): this.type = set("overlayClassName", value.asInstanceOf[js.Any])
  
  inline def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
  
  inline def overlayVdomElement(value: VdomElement): this.type = set("overlay", value.rawElement.asInstanceOf[js.Any])
  
  inline def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
  
  inline def placements(value: BuildInPlacements): this.type = set("placements", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def showAction(value: js.Array[ActionType]): this.type = set("showAction", value.asInstanceOf[js.Any])
  
  inline def showActionVarargs(value: ActionType*): this.type = set("showAction", js.Array(value*))
  
  inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  
  inline def trigger(value: ActionType | js.Array[ActionType]): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  inline def triggerVarargs(value: ActionType*): this.type = set("trigger", js.Array(value*))
  
  inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
