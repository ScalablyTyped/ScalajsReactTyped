package typingsJapgolly.winrtUwp.Windows.Storage

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages a delayed set version operation. */
trait SetVersionDeferral extends StObject {
  
  /** Notifies the system that the app has set the version of the application data in its app data store. */
  def complete(): Unit
}
object SetVersionDeferral {
  
  inline def apply(complete: Callback): SetVersionDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[SetVersionDeferral]
  }
  
  extension [Self <: SetVersionDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
