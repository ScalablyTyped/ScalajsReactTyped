package typingsJapgolly.terminalKit.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Promise extends StObject {
  
  def abort(): Unit
  
  var promise: js.Promise[js.UndefOr[String]]
}
object Promise {
  
  inline def apply(abort: Callback, promise: js.Promise[js.UndefOr[String]]): Promise = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise]
  }
  
  extension [Self <: Promise](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setPromise(value: js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
