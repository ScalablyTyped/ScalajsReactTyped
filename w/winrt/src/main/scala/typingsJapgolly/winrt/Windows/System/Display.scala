package typingsJapgolly.winrt.Windows.System

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Display {
  
  trait DisplayRequest
    extends StObject
       with IDisplayRequest
  object DisplayRequest {
    
    inline def apply(requestActive: Callback, requestRelease: Callback): DisplayRequest = {
      val __obj = js.Dynamic.literal(requestActive = requestActive.toJsFn, requestRelease = requestRelease.toJsFn)
      __obj.asInstanceOf[DisplayRequest]
    }
  }
  
  trait IDisplayRequest extends StObject {
    
    def requestActive(): Unit
    
    def requestRelease(): Unit
  }
  object IDisplayRequest {
    
    inline def apply(requestActive: Callback, requestRelease: Callback): IDisplayRequest = {
      val __obj = js.Dynamic.literal(requestActive = requestActive.toJsFn, requestRelease = requestRelease.toJsFn)
      __obj.asInstanceOf[IDisplayRequest]
    }
    
    extension [Self <: IDisplayRequest](x: Self) {
      
      inline def setRequestActive(value: Callback): Self = StObject.set(x, "requestActive", value.toJsFn)
      
      inline def setRequestRelease(value: Callback): Self = StObject.set(x, "requestRelease", value.toJsFn)
    }
  }
}
