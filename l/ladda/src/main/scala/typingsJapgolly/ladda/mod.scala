package typingsJapgolly.ladda

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ladda", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind(target: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def bind(target: String, options: BindOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bind(target: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def bind(target: HTMLElement, options: BindOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def create(button: HTMLButtonElement): LaddaButton = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(button.asInstanceOf[js.Any]).asInstanceOf[LaddaButton]
  
  inline def stopAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAll")().asInstanceOf[Unit]
  
  trait BindOptions extends StObject {
    
    /**
      * A function to be called with the Ladda instance when a target button is clicked.
      */
    var callback: js.UndefOr[js.Function1[/* instance */ LaddaButton, Unit]] = js.undefined
    
    /**
      * Number of milliseconds to wait before automatically cancelling the animation.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object BindOptions {
    
    inline def apply(): BindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindOptions]
    }
    
    extension [Self <: BindOptions](x: Self) {
      
      inline def setCallback(value: /* instance */ LaddaButton => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* instance */ LaddaButton) => value(t0).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait LaddaButton extends StObject {
    
    def isLoading(): Boolean
    
    def remove(): Unit
    
    def setProgress(progress: Double): Unit
    
    def start(): LaddaButton
    
    def startAfter(delay: Double): LaddaButton
    
    def stop(): LaddaButton
    
    def toggle(): LaddaButton
  }
  object LaddaButton {
    
    inline def apply(
      isLoading: CallbackTo[Boolean],
      remove: Callback,
      setProgress: Double => Callback,
      start: CallbackTo[LaddaButton],
      startAfter: Double => LaddaButton,
      stop: CallbackTo[LaddaButton],
      toggle: CallbackTo[LaddaButton]
    ): LaddaButton = {
      val __obj = js.Dynamic.literal(isLoading = isLoading.toJsFn, remove = remove.toJsFn, setProgress = js.Any.fromFunction1((t0: Double) => setProgress(t0).runNow()), start = start.toJsFn, startAfter = js.Any.fromFunction1(startAfter), stop = stop.toJsFn, toggle = toggle.toJsFn)
      __obj.asInstanceOf[LaddaButton]
    }
    
    extension [Self <: LaddaButton](x: Self) {
      
      inline def setIsLoading(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoading", value.toJsFn)
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def setSetProgress(value: Double => Callback): Self = StObject.set(x, "setProgress", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setStart(value: CallbackTo[LaddaButton]): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStartAfter(value: Double => LaddaButton): Self = StObject.set(x, "startAfter", js.Any.fromFunction1(value))
      
      inline def setStop(value: CallbackTo[LaddaButton]): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setToggle(value: CallbackTo[LaddaButton]): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
}
