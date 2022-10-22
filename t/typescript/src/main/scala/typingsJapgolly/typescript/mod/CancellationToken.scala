package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationToken extends StObject {
  
  def isCancellationRequested(): Boolean
  
  /** @throws OperationCanceledException if isCancellationRequested is true */
  def throwIfCancellationRequested(): Unit
}
object CancellationToken {
  
  inline def apply(isCancellationRequested: CallbackTo[Boolean], throwIfCancellationRequested: Callback): CancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested.toJsFn, throwIfCancellationRequested = throwIfCancellationRequested.toJsFn)
    __obj.asInstanceOf[CancellationToken]
  }
  
  extension [Self <: CancellationToken](x: Self) {
    
    inline def setIsCancellationRequested(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCancellationRequested", value.toJsFn)
    
    inline def setThrowIfCancellationRequested(value: Callback): Self = StObject.set(x, "throwIfCancellationRequested", value.toJsFn)
  }
}
