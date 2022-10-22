package typingsJapgolly.reactMdTransition.typesTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionCallbacks extends StObject {
  
  /**
    * This function will be called once the {@link TransitionStage} has been set
    * to `"enter"`.
    *
    * @see {@link TransitionEnterHandler}
    */
  var onEnter: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  /**
    * This function will be called once the {@link TransitionStage} has been set
    * to `"entering"`.
    *
    * @see {@link TransitionEnterHandler}
    */
  var onEntered: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  /**
    * This function will be called once the {@link TransitionStage} has been set
    * to `"enter"`.
    *
    * @see {@link TransitionEnterHandler}
    */
  var onEntering: js.UndefOr[TransitionEnterHandler] = js.undefined
  
  /**
    * This function will be called once the {@link TransitionStage} has been set
    * to `"entered"`.
    *
    * @see {@link TransitionEnterHandler}
    */
  var onExit: js.UndefOr[TransitionExitHandler] = js.undefined
  
  /**
    * This function will be called once the {@link TransitionStage} has been set
    * to `"exited"`.
    *
    * @see {@link TransitionExitHandler}
    */
  var onExited: js.UndefOr[TransitionExitHandler] = js.undefined
  
  /**
    * This function will be called once the {@link TransitionStage} has been set
    * to `"exiting"`.
    *
    * @see {@link TransitionExitHandler}
    */
  var onExiting: js.UndefOr[TransitionExitHandler] = js.undefined
}
object TransitionCallbacks {
  
  inline def apply(): TransitionCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionCallbacks]
  }
  
  extension [Self <: TransitionCallbacks](x: Self) {
    
    inline def setOnEnter(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEnter", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnEntered(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntered", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
    
    inline def setOnEntering(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntering", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
    
    inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
    
    inline def setOnExit(value: Callback): Self = StObject.set(x, "onExit", value.toJsFn)
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnExited(value: Callback): Self = StObject.set(x, "onExited", value.toJsFn)
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    inline def setOnExiting(value: Callback): Self = StObject.set(x, "onExiting", value.toJsFn)
    
    inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
  }
}
