package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostCancellationToken extends StObject {
  
  def isCancellationRequested(): Boolean
}
object HostCancellationToken {
  
  inline def apply(isCancellationRequested: CallbackTo[Boolean]): HostCancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = isCancellationRequested.toJsFn)
    __obj.asInstanceOf[HostCancellationToken]
  }
  
  extension [Self <: HostCancellationToken](x: Self) {
    
    inline def setIsCancellationRequested(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCancellationRequested", value.toJsFn)
  }
}
