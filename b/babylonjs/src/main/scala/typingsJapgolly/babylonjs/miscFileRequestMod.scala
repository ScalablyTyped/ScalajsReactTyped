package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscFileRequestMod {
  
  trait IFileRequest extends StObject {
    
    /**
      * Aborts the request for a file.
      */
    def abort(): Unit
    
    /**
      * Raised when the request is complete (success or error).
      */
    var onCompleteObservable: Observable[IFileRequest]
  }
  object IFileRequest {
    
    inline def apply(abort: Callback, onCompleteObservable: Observable[IFileRequest]): IFileRequest = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, onCompleteObservable = onCompleteObservable.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileRequest]
    }
    
    extension [Self <: IFileRequest](x: Self) {
      
      inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setOnCompleteObservable(value: Observable[IFileRequest]): Self = StObject.set(x, "onCompleteObservable", value.asInstanceOf[js.Any])
    }
  }
}
