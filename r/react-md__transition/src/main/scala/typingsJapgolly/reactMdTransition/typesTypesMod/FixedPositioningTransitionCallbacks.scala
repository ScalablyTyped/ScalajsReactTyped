package typingsJapgolly.reactMdTransition.typesTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@react-md/transition.@react-md/transition/types/types.TransitionCallbacks, 'onEnter' | 'onEntering' | 'onEntered' | 'onExited'> */
trait FixedPositioningTransitionCallbacks extends StObject {
  
  var onEnter: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  var onEntered: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  var onEntering: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  var onExited: js.UndefOr[TransitionExitHandler] = js.undefined
}
object FixedPositioningTransitionCallbacks {
  
  inline def apply(): FixedPositioningTransitionCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedPositioningTransitionCallbacks]
  }
  
  extension [Self <: FixedPositioningTransitionCallbacks](x: Self) {
    
    inline def setOnEnter(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEnter", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnEntered(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntered", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
    
    inline def setOnEntering(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntering", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
    
    inline def setOnExited(value: Callback): Self = StObject.set(x, "onExited", value.toJsFn)
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
  }
}
