package typingsJapgolly.reactBootstrap.mod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionCallbacks extends StObject {
  
  var onEnter: js.UndefOr[js.Function1[/* node */ HTMLElement, Any]] = js.undefined
  
  var onEntered: js.UndefOr[js.Function1[/* node */ HTMLElement, Any]] = js.undefined
  
  var onEntering: js.UndefOr[js.Function1[/* node */ HTMLElement, Any]] = js.undefined
  
  var onExit: js.UndefOr[js.Function1[/* node */ HTMLElement, Any]] = js.undefined
  
  var onExited: js.UndefOr[js.Function1[/* node */ HTMLElement, Any]] = js.undefined
  
  var onExiting: js.UndefOr[js.Function1[/* node */ HTMLElement, Any]] = js.undefined
}
object TransitionCallbacks {
  
  inline def apply(): TransitionCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionCallbacks]
  }
  
  extension [Self <: TransitionCallbacks](x: Self) {
    
    inline def setOnEnter(value: /* node */ HTMLElement => Any): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnEntered(value: /* node */ HTMLElement => Any): Self = StObject.set(x, "onEntered", js.Any.fromFunction1(value))
    
    inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
    
    inline def setOnEntering(value: /* node */ HTMLElement => Any): Self = StObject.set(x, "onEntering", js.Any.fromFunction1(value))
    
    inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
    
    inline def setOnExit(value: /* node */ HTMLElement => Any): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnExited(value: /* node */ HTMLElement => Any): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    inline def setOnExiting(value: /* node */ HTMLElement => Any): Self = StObject.set(x, "onExiting", js.Any.fromFunction1(value))
    
    inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
  }
}
