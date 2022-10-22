package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessFailOptions extends StObject {
  
  /** A callback that starts when the operation has an error. */
  val failure: js.UndefOr[SuccessFailCallback[js.Array[String]]] = js.undefined
  
  /** A callback that starts when the operation completes successfully. */
  val success: js.UndefOr[SuccessFailCallback[js.Array[Any]]] = js.undefined
}
object SuccessFailOptions {
  
  inline def apply(): SuccessFailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessFailOptions]
  }
  
  extension [Self <: SuccessFailOptions](x: Self) {
    
    inline def setFailure(value: js.Array[String] => Callback): Self = StObject.set(x, "failure", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setSuccess(value: js.Array[Any] => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
