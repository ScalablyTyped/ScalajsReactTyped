package typingsJapgolly.winrtUwp.Windows.System

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables an application to request that a device's display remain on even if there is no user activity for an extended period of time. */
object Display {
  
  /** Represents a display request. */
  trait DisplayRequest extends StObject {
    
    /** Activates a display request. */
    def requestActive(): Unit
    
    /** Deactivates a display request. */
    def requestRelease(): Unit
  }
  object DisplayRequest {
    
    inline def apply(requestActive: Callback, requestRelease: Callback): DisplayRequest = {
      val __obj = js.Dynamic.literal(requestActive = requestActive.toJsFn, requestRelease = requestRelease.toJsFn)
      __obj.asInstanceOf[DisplayRequest]
    }
    
    extension [Self <: DisplayRequest](x: Self) {
      
      inline def setRequestActive(value: Callback): Self = StObject.set(x, "requestActive", value.toJsFn)
      
      inline def setRequestRelease(value: Callback): Self = StObject.set(x, "requestRelease", value.toJsFn)
    }
  }
}
