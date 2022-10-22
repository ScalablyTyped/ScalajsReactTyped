package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverMod.PopoverInteractionKind
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverSharedPropsMod.PopoverPosition
import typingsJapgolly.popperJs.mod.Boundary
import typingsJapgolly.popperJs.mod.Modifiers
import typingsJapgolly.popperJs.mod.Placement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("@blueprintjs/core", "Popover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.Popover] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def backdropProps(value: HTMLProps[HTMLDivElement]): this.type = set("backdropProps", value.asInstanceOf[js.Any])
    
    inline def boundary(value: Boundary): this.type = set("boundary", value.asInstanceOf[js.Any])
    
    inline def canEscapeKeyClose(value: Boolean): this.type = set("canEscapeKeyClose", value.asInstanceOf[js.Any])
    
    inline def captureDismiss(value: Boolean): this.type = set("captureDismiss", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: String | Element): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def defaultIsOpen(value: Boolean): this.type = set("defaultIsOpen", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def enforceFocus(value: Boolean): this.type = set("enforceFocus", value.asInstanceOf[js.Any])
    
    inline def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def hasBackdrop(value: Boolean): this.type = set("hasBackdrop", value.asInstanceOf[js.Any])
    
    inline def hoverCloseDelay(value: Double): this.type = set("hoverCloseDelay", value.asInstanceOf[js.Any])
    
    inline def hoverOpenDelay(value: Double): this.type = set("hoverOpenDelay", value.asInstanceOf[js.Any])
    
    inline def inheritDarkTheme(value: Boolean): this.type = set("inheritDarkTheme", value.asInstanceOf[js.Any])
    
    inline def interactionKind(value: PopoverInteractionKind): this.type = set("interactionKind", value.asInstanceOf[js.Any])
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    inline def minimal(value: Boolean): this.type = set("minimal", value.asInstanceOf[js.Any])
    
    inline def modifiers(value: Modifiers): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    inline def onClose(value: /* event */ ReactEventFrom[HTMLElement] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onClosed(value: /* node */ HTMLElement => Callback): this.type = set("onClosed", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onClosing(value: /* node */ HTMLElement => Callback): this.type = set("onClosing", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onInteraction(value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[ReactEventFrom[HTMLElement]]) => Callback): this.type = set("onInteraction", js.Any.fromFunction2((t0: /* nextOpenState */ Boolean, t1: /* e */ js.UndefOr[ReactEventFrom[HTMLElement]]) => (value(t0, t1)).runNow()))
    
    inline def onOpened(value: /* node */ HTMLElement => Callback): this.type = set("onOpened", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onOpening(value: /* node */ HTMLElement => Callback): this.type = set("onOpening", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def openOnTargetFocus(value: Boolean): this.type = set("openOnTargetFocus", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def popoverClassName(value: String): this.type = set("popoverClassName", value.asInstanceOf[js.Any])
    
    inline def popoverRef(value: Ref[HTMLElement]): this.type = set("popoverRef", value.asInstanceOf[js.Any])
    
    inline def popoverRefFunction1(value: HTMLElement | Null => Callback): this.type = set("popoverRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def popoverRefNull: this.type = set("popoverRef", null)
    
    inline def portalClassName(value: String): this.type = set("portalClassName", value.asInstanceOf[js.Any])
    
    inline def portalContainer(value: HTMLElement): this.type = set("portalContainer", value.asInstanceOf[js.Any])
    
    inline def position(value: PopoverPosition): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def shouldReturnFocusOnClose(value: Boolean): this.type = set("shouldReturnFocusOnClose", value.asInstanceOf[js.Any])
    
    inline def target(value: String | Element): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def targetClassName(value: String): this.type = set("targetClassName", value.asInstanceOf[js.Any])
    
    inline def targetProps(value: HTMLAttributes[HTMLElement]): this.type = set("targetProps", value.asInstanceOf[js.Any])
    
    inline def targetTagName(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.a, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.abbr, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.address */ Any
    ): this.type = set("targetTagName", value.asInstanceOf[js.Any])
    
    inline def targetVdomElement(value: VdomElement): this.type = set("target", value.rawElement.asInstanceOf[js.Any])
    
    inline def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    inline def usePortal(value: Boolean): this.type = set("usePortal", value.asInstanceOf[js.Any])
    
    inline def wrapperTagName(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.a, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.abbr, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.address */ Any
    ): this.type = set("wrapperTagName", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
