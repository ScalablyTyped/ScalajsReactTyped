package typingsJapgolly.cornerstoneCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageLoadObject extends StObject {
  
  /** A function to cancel the image load request */
  var cancelFn: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** The Promise tracking the loading of this image */
  var promise: js.Promise[Image]
}
object ImageLoadObject {
  
  inline def apply(promise: js.Promise[Image]): ImageLoadObject = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLoadObject]
  }
  
  extension [Self <: ImageLoadObject](x: Self) {
    
    inline def setCancelFn(value: Callback): Self = StObject.set(x, "cancelFn", value.toJsFn)
    
    inline def setCancelFnUndefined: Self = StObject.set(x, "cancelFn", js.undefined)
    
    inline def setPromise(value: js.Promise[Image]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
