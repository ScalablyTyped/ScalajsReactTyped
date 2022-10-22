package typingsJapgolly.reactOverlays

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactOverlays.anon.ArrowProps
import typingsJapgolly.reactOverlays.anon.inbooleanundefinedappearb
import typingsJapgolly.reactOverlays.esmTypesMod.TransitionCallbacks
import typingsJapgolly.reactOverlays.esmUsePopperMod.Offset
import typingsJapgolly.reactOverlays.esmUsePopperMod.OffsetValue
import typingsJapgolly.reactOverlays.esmUsePopperMod.Placement
import typingsJapgolly.reactOverlays.esmUsePopperMod.UsePopperOptions
import typingsJapgolly.reactOverlays.esmUseRootCloseMod.MouseEvents
import typingsJapgolly.reactOverlays.esmUseWaitForDOMRefMod.DOMContainer
import typingsJapgolly.reactOverlays.reactOverlaysStrings.placement
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmOverlayMod extends Shortcut {
  
  /**
    * Built on top of `Popper.js`, the overlay component is
    * great for custom tooltip overlays.
    */
  @JSImport("react-overlays/esm/Overlay", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLElement]] = js.native
  
  trait OverlayProps
    extends StObject
       with TransitionCallbacks {
    
    def children(value: ArrowProps): Node
    
    var container: js.UndefOr[DOMContainer[HTMLElement]] = js.undefined
    
    var containerPadding: js.UndefOr[Double] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Offset] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var popperConfig: js.UndefOr[Omit[UsePopperOptions, placement]] = js.undefined
    
    var rootClose: js.UndefOr[Boolean] = js.undefined
    
    var rootCloseDisabled: js.UndefOr[Boolean] = js.undefined
    
    var rootCloseEvent: js.UndefOr[MouseEvents] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var target: DOMContainer[HTMLElement]
    
    var transition: js.UndefOr[ComponentType[inbooleanundefinedappearb]] = js.undefined
  }
  object OverlayProps {
    
    inline def apply(children: ArrowProps => Node): OverlayProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), target = null)
      __obj.asInstanceOf[OverlayProps]
    }
    
    extension [Self <: OverlayProps](x: Self) {
      
      inline def setChildren(value: ArrowProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setContainer(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerCallbackTo(value: CallbackTo[HTMLElement | RefHandle[HTMLElement] | Null]): Self = StObject.set(x, "container", value.toJsFn)
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      inline def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction1(value: /* details */ typingsJapgolly.reactOverlays.anon.Placement => OffsetValue): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnHide(value: /* e */ Event => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopperConfig(value: Omit[UsePopperOptions, placement]): Self = StObject.set(x, "popperConfig", value.asInstanceOf[js.Any])
      
      inline def setPopperConfigUndefined: Self = StObject.set(x, "popperConfig", js.undefined)
      
      inline def setRootClose(value: Boolean): Self = StObject.set(x, "rootClose", value.asInstanceOf[js.Any])
      
      inline def setRootCloseDisabled(value: Boolean): Self = StObject.set(x, "rootCloseDisabled", value.asInstanceOf[js.Any])
      
      inline def setRootCloseDisabledUndefined: Self = StObject.set(x, "rootCloseDisabled", js.undefined)
      
      inline def setRootCloseEvent(value: MouseEvents): Self = StObject.set(x, "rootCloseEvent", value.asInstanceOf[js.Any])
      
      inline def setRootCloseEventUndefined: Self = StObject.set(x, "rootCloseEvent", js.undefined)
      
      inline def setRootCloseUndefined: Self = StObject.set(x, "rootClose", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTarget(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetCallbackTo(value: CallbackTo[HTMLElement | RefHandle[HTMLElement] | Null]): Self = StObject.set(x, "target", value.toJsFn)
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTransition(value: ComponentType[inbooleanundefinedappearb]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esmOverlayMod.foo` */
  override def _to: ForwardRefExoticComponent[OverlayProps & RefAttributes[HTMLElement]] = default
}
