package typingsJapgolly.winrtUwp.Windows.Media.Protection

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains a method that indicates whether a protection service has completed successfully. */
trait MediaProtectionServiceCompletion extends StObject {
  
  /**
    * Indicates whether a protection service has completed successfully.
    * @param success Indicates the successful completion of a protection service.
    */
  def complete(success: Boolean): Unit
}
object MediaProtectionServiceCompletion {
  
  inline def apply(complete: Boolean => Callback): MediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Boolean) => complete(t0).runNow()))
    __obj.asInstanceOf[MediaProtectionServiceCompletion]
  }
  
  extension [Self <: MediaProtectionServiceCompletion](x: Self) {
    
    inline def setComplete(value: Boolean => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
