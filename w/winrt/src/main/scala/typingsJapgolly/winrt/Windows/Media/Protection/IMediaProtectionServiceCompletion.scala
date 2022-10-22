package typingsJapgolly.winrt.Windows.Media.Protection

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaProtectionServiceCompletion extends StObject {
  
  def complete(success: Boolean): Unit
}
object IMediaProtectionServiceCompletion {
  
  inline def apply(complete: Boolean => Callback): IMediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Boolean) => complete(t0).runNow()))
    __obj.asInstanceOf[IMediaProtectionServiceCompletion]
  }
  
  extension [Self <: IMediaProtectionServiceCompletion](x: Self) {
    
    inline def setComplete(value: Boolean => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
