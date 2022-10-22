package typingsJapgolly.awsSdkTypes

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAbortMod {
  
  trait AbortController extends StObject {
    
    /**
      * Declares the operation associated with this AbortController to have been
      * cancelled.
      */
    def abort(): Unit
    
    /**
      * An object that reports whether the action associated with this
      * {AbortController} has been cancelled.
      */
    val signal: AbortSignal
  }
  object AbortController {
    
    inline def apply(abort: Callback, signal: AbortSignal): AbortController = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortController]
    }
    
    extension [Self <: AbortController](x: Self) {
      
      inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  type AbortHandler = js.ThisFunction1[/* this */ AbortSignal, /* ev */ Any, Any]
  
  trait AbortSignal extends StObject {
    
    /**
      * Whether the action represented by this signal has been cancelled.
      */
    val aborted: Boolean
    
    /**
      * A function to be invoked when the action represented by this signal has
      * been cancelled.
      */
    var onabort: AbortHandler | Null
  }
  object AbortSignal {
    
    inline def apply(aborted: Boolean): AbortSignal = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], onabort = null)
      __obj.asInstanceOf[AbortSignal]
    }
    
    extension [Self <: AbortSignal](x: Self) {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setOnabort(value: AbortHandler): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      inline def setOnabortNull: Self = StObject.set(x, "onabort", null)
    }
  }
}
