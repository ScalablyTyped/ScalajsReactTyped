package typingsJapgolly.materialProgressIndicator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  trait MDCProgressIndicatorFoundation extends StObject {
    
    /**
      * Puts the component in the closed state.
      */
    def close(): Unit
    
    /**
      * @return the current progress value [0,1];
      */
    def getProgress(): Double
    
    /**
      * @return Whether the component is closed.
      */
    def isClosed(): Boolean
    
    /**
      * @return Whether the component is determinate.
      */
    def isDeterminate(): Boolean
    
    /**
      * Puts the component in the open state.
      */
    def open(): Unit
    
    /**
      * Toggles the component between the determinate and indeterminate state.
      *
      * @param isDeterminate - Whether the component is in determinate state
      */
    def setDeterminate(isDeterminate: Boolean): Unit
    
    /**
      * Sets the current progress value.
      *
      * @param value - the current progress value, should be between [0,1]
      */
    def setProgress(value: Double): Unit
  }
  object MDCProgressIndicatorFoundation {
    
    inline def apply(
      close: Callback,
      getProgress: CallbackTo[Double],
      isClosed: CallbackTo[Boolean],
      isDeterminate: CallbackTo[Boolean],
      open: Callback,
      setDeterminate: Boolean => Callback,
      setProgress: Double => Callback
    ): MDCProgressIndicatorFoundation = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, getProgress = getProgress.toJsFn, isClosed = isClosed.toJsFn, isDeterminate = isDeterminate.toJsFn, open = open.toJsFn, setDeterminate = js.Any.fromFunction1((t0: Boolean) => setDeterminate(t0).runNow()), setProgress = js.Any.fromFunction1((t0: Double) => setProgress(t0).runNow()))
      __obj.asInstanceOf[MDCProgressIndicatorFoundation]
    }
    
    extension [Self <: MDCProgressIndicatorFoundation](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setGetProgress(value: CallbackTo[Double]): Self = StObject.set(x, "getProgress", value.toJsFn)
      
      inline def setIsClosed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isClosed", value.toJsFn)
      
      inline def setIsDeterminate(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDeterminate", value.toJsFn)
      
      inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
      
      inline def setSetDeterminate(value: Boolean => Callback): Self = StObject.set(x, "setDeterminate", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetProgress(value: Double => Callback): Self = StObject.set(x, "setProgress", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
