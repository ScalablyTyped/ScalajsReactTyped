package typingsJapgolly.terminalKit.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abort extends StObject {
  
  def abort(): Unit
  
  var promise: js.UndefOr[js.Promise[Boolean]] = js.undefined
}
object Abort {
  
  inline def apply(abort: Callback): Abort = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn)
    __obj.asInstanceOf[Abort]
  }
  
  extension [Self <: Abort](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setPromise(value: js.Promise[Boolean]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
  }
}
