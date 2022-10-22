package typingsJapgolly.reactMdMenu.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionEnterHandler
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionExitHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@react-md/transition.@react-md/transition.FixedPositioningTransitionCallbacks> */
trait RequiredFixedPositioningT extends StObject {
  
  var onEnter: TransitionEnterHandler
  
  var onEntered: TransitionEnterHandler
  
  var onEntering: TransitionEnterHandler
  
  var onExited: TransitionExitHandler
}
object RequiredFixedPositioningT {
  
  inline def apply(
    onEnter: /* appearing */ Boolean => Callback,
    onEntered: /* appearing */ Boolean => Callback,
    onEntering: /* appearing */ Boolean => Callback,
    onExited: Callback
  ): RequiredFixedPositioningT = {
    val __obj = js.Dynamic.literal(onEnter = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEnter(t0).runNow()), onEntered = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEntered(t0).runNow()), onEntering = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEntering(t0).runNow()), onExited = onExited.toJsFn)
    __obj.asInstanceOf[RequiredFixedPositioningT]
  }
  
  extension [Self <: RequiredFixedPositioningT](x: Self) {
    
    inline def setOnEnter(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEnter", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnEntered(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntered", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnEntering(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntering", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnExited(value: Callback): Self = StObject.set(x, "onExited", value.toJsFn)
  }
}
