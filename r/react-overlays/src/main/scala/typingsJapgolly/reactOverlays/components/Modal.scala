package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactOverlays.anon.PreventScroll
import typingsJapgolly.reactOverlays.esmModalManagerMod.default
import typingsJapgolly.reactOverlays.esmModalMod.ModalHandle
import typingsJapgolly.reactOverlays.esmModalMod.ModalProps
import typingsJapgolly.reactOverlays.esmModalMod.ModalTransitionComponent
import typingsJapgolly.reactOverlays.esmModalMod.RenderModalBackdropProps
import typingsJapgolly.reactOverlays.esmModalMod.RenderModalDialogProps
import typingsJapgolly.reactOverlays.esmUseWaitForDOMRefMod.DOMContainer
import typingsJapgolly.reactOverlays.reactOverlaysBooleans.`false`
import typingsJapgolly.reactOverlays.reactOverlaysBooleans.`true`
import typingsJapgolly.reactOverlays.reactOverlaysStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  @JSImport("react-overlays/esm", "Modal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[ModalHandle] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def backdrop(value: `true` | `false` | static): this.type = set("backdrop", value.asInstanceOf[js.Any])
    
    inline def backdropTransition(value: ModalTransitionComponent): this.type = set("backdropTransition", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def container(value: DOMContainer[HTMLElement]): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def containerCallbackTo(value: CallbackTo[HTMLElement | RefHandle[HTMLElement] | Null]): this.type = set("container", value.toJsFn)
    
    inline def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    inline def containerNull: this.type = set("container", null)
    
    inline def enforceFocus(value: Boolean): this.type = set("enforceFocus", value.asInstanceOf[js.Any])
    
    inline def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
    
    inline def manager(value: default): this.type = set("manager", value.asInstanceOf[js.Any])
    
    inline def onBackdropClick(value: /* e */ ReactEventFrom[Element] => Callback): this.type = set("onBackdropClick", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def onEnter(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Any): this.type = set("onEnter", js.Any.fromFunction2(value))
    
    inline def onEntered(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Any): this.type = set("onEntered", js.Any.fromFunction2(value))
    
    inline def onEntering(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Any): this.type = set("onEntering", js.Any.fromFunction2(value))
    
    inline def onEscapeKeyDown(value: /* e */ KeyboardEvent => Callback): this.type = set("onEscapeKeyDown", js.Any.fromFunction1((t0: /* e */ KeyboardEvent) => value(t0).runNow()))
    
    inline def onExit(value: /* node */ HTMLElement => Any): this.type = set("onExit", js.Any.fromFunction1(value))
    
    inline def onExited(value: /* node */ HTMLElement => Any): this.type = set("onExited", js.Any.fromFunction1(value))
    
    inline def onExiting(value: /* node */ HTMLElement => Any): this.type = set("onExiting", js.Any.fromFunction1(value))
    
    inline def onHide(value: Callback): this.type = set("onHide", value.toJsFn)
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def renderBackdrop(value: /* props */ RenderModalBackdropProps => Node): this.type = set("renderBackdrop", js.Any.fromFunction1(value))
    
    inline def renderDialog(value: /* props */ RenderModalDialogProps => Node): this.type = set("renderDialog", js.Any.fromFunction1(value))
    
    inline def restoreFocus(value: Boolean): this.type = set("restoreFocus", value.asInstanceOf[js.Any])
    
    inline def restoreFocusOptions(value: PreventScroll): this.type = set("restoreFocusOptions", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def transition(value: ModalTransitionComponent): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProps & RefAttributes[ModalHandle]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
