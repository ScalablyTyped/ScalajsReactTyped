package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactOverlays.anon.ArrowProps
import typingsJapgolly.reactOverlays.anon.Placement
import typingsJapgolly.reactOverlays.anon.inbooleanundefinedappearb
import typingsJapgolly.reactOverlays.esmOverlayMod.OverlayProps
import typingsJapgolly.reactOverlays.esmUsePopperMod.Offset
import typingsJapgolly.reactOverlays.esmUsePopperMod.OffsetValue
import typingsJapgolly.reactOverlays.esmUsePopperMod.UsePopperOptions
import typingsJapgolly.reactOverlays.esmUseRootCloseMod.MouseEvents
import typingsJapgolly.reactOverlays.esmUseWaitForDOMRefMod.DOMContainer
import typingsJapgolly.reactOverlays.reactOverlaysStrings.placement
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  inline def apply(children: ArrowProps => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[OverlayProps & RefAttributes[HTMLElement]]))
  }
  
  @JSImport("react-overlays/esm", "Overlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLElement] {
    
    inline def container(value: DOMContainer[HTMLElement]): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def containerCallbackTo(value: CallbackTo[HTMLElement | RefHandle[HTMLElement] | Null]): this.type = set("container", value.toJsFn)
    
    inline def containerNull: this.type = set("container", null)
    
    inline def containerPadding(value: Double): this.type = set("containerPadding", value.asInstanceOf[js.Any])
    
    inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    
    inline def offset(value: Offset): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def offsetFunction1(value: /* details */ Placement => OffsetValue): this.type = set("offset", js.Any.fromFunction1(value))
    
    inline def onEnter(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Any): this.type = set("onEnter", js.Any.fromFunction2(value))
    
    inline def onEntered(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Any): this.type = set("onEntered", js.Any.fromFunction2(value))
    
    inline def onEntering(value: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Any): this.type = set("onEntering", js.Any.fromFunction2(value))
    
    inline def onExit(value: /* node */ HTMLElement => Any): this.type = set("onExit", js.Any.fromFunction1(value))
    
    inline def onExited(value: /* node */ HTMLElement => Any): this.type = set("onExited", js.Any.fromFunction1(value))
    
    inline def onExiting(value: /* node */ HTMLElement => Any): this.type = set("onExiting", js.Any.fromFunction1(value))
    
    inline def onHide(value: /* e */ Event => Callback): this.type = set("onHide", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def placement(value: typingsJapgolly.reactOverlays.esmUsePopperMod.Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def popperConfig(value: Omit[UsePopperOptions, placement]): this.type = set("popperConfig", value.asInstanceOf[js.Any])
    
    inline def rootClose(value: Boolean): this.type = set("rootClose", value.asInstanceOf[js.Any])
    
    inline def rootCloseDisabled(value: Boolean): this.type = set("rootCloseDisabled", value.asInstanceOf[js.Any])
    
    inline def rootCloseEvent(value: MouseEvents): this.type = set("rootCloseEvent", value.asInstanceOf[js.Any])
    
    inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    
    inline def target(value: DOMContainer[HTMLElement]): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def targetCallbackTo(value: CallbackTo[HTMLElement | RefHandle[HTMLElement] | Null]): this.type = set("target", value.toJsFn)
    
    inline def targetNull: this.type = set("target", null)
    
    inline def transition(value: ComponentType[inbooleanundefinedappearb]): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayProps & RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
