package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Calls

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The LockScreenCallEndCallDeferral object signals when the app no longer needs to defer the removal of itself from the lock screen. */
trait LockScreenCallEndCallDeferral extends StObject {
  
  /** Completes the deferral of the removal of the app from the lock screen, which causes the app to be removed from the lock screen if it hasn't already been removed by other means. */
  def complete(): Unit
}
object LockScreenCallEndCallDeferral {
  
  inline def apply(complete: Callback): LockScreenCallEndCallDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[LockScreenCallEndCallDeferral]
  }
  
  extension [Self <: LockScreenCallEndCallDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
