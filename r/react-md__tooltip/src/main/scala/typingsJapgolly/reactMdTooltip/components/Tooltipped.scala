package typingsJapgolly.reactMdTooltip.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMdPortal.typesGetContainerMod.PortalInto
import typingsJapgolly.reactMdTooltip.typesTooltippedMod.ChildrenRenderer
import typingsJapgolly.reactMdTooltip.typesTooltippedMod.TooltippedProps
import typingsJapgolly.reactMdUtils.typesPositioningTypesMod.SimplePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltipped {
  
  inline def apply(children: Element | ChildrenRenderer, id: String): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TooltippedProps]))
  }
  
  @JSImport("@react-md/tooltip", "Tooltipped")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultPosition(value: SimplePosition): this.type = set("defaultPosition", value.asInstanceOf[js.Any])
    
    inline def dense(value: Boolean): this.type = set("dense", value.asInstanceOf[js.Any])
    
    inline def denseSpacing(value: Double | String): this.type = set("denseSpacing", value.asInstanceOf[js.Any])
    
    inline def disableAutoSpacing(value: Boolean): this.type = set("disableAutoSpacing", value.asInstanceOf[js.Any])
    
    inline def disableHoverMode(value: Boolean): this.type = set("disableHoverMode", value.asInstanceOf[js.Any])
    
    inline def disableSwapping(value: Boolean): this.type = set("disableSwapping", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def focusTime(value: Double): this.type = set("focusTime", value.asInstanceOf[js.Any])
    
    inline def lineWrap(value: Boolean): this.type = set("lineWrap", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onContextMenu(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEnter(value: /* appearing */ Boolean => Callback): this.type = set("onEnter", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def onEntered(value: /* appearing */ Boolean => Callback): this.type = set("onEntered", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def onEntering(value: /* appearing */ Boolean => Callback): this.type = set("onEntering", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def onExit(value: Callback): this.type = set("onExit", value.toJsFn)
    
    inline def onExited(value: Callback): this.type = set("onExited", value.toJsFn)
    
    inline def onExiting(value: Callback): this.type = set("onExiting", value.toJsFn)
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseEnter(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def portal(value: Boolean): this.type = set("portal", value.asInstanceOf[js.Any])
    
    inline def portalInto(value: PortalInto): this.type = set("portalInto", value.asInstanceOf[js.Any])
    
    inline def portalIntoCallbackTo(value: CallbackTo[HTMLElement | Null]): this.type = set("portalInto", value.toJsFn)
    
    inline def portalIntoId(value: String): this.type = set("portalIntoId", value.asInstanceOf[js.Any])
    
    inline def portalIntoNull: this.type = set("portalInto", null)
    
    inline def position(value: SimplePosition): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def spacing(value: Double | String): this.type = set("spacing", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def temporary(value: Boolean): this.type = set("temporary", value.asInstanceOf[js.Any])
    
    inline def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: VdomNode): this.type = set("tooltip", value.rawNode.asInstanceOf[js.Any])
    
    inline def tooltipNull: this.type = set("tooltip", null)
    
    inline def tooltipVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("tooltip", js.Array(value*))
    
    inline def tooltipVdomElement(value: VdomElement): this.type = set("tooltip", value.rawElement.asInstanceOf[js.Any])
    
    inline def touchTime(value: Double): this.type = set("touchTime", value.asInstanceOf[js.Any])
    
    inline def vhMargin(value: Double): this.type = set("vhMargin", value.asInstanceOf[js.Any])
    
    inline def vwMargin(value: Double): this.type = set("vwMargin", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TooltippedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
