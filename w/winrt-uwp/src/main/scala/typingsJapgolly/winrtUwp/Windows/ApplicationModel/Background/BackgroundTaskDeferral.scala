package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a background task deferral returned by the IBackgroundTaskInstance.GetDeferral method. */
trait BackgroundTaskDeferral extends StObject {
  
  /** Informs the system that an asynchronous operation associated with a background task has finished. */
  def complete(): Unit
}
object BackgroundTaskDeferral {
  
  inline def apply(complete: Callback): BackgroundTaskDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[BackgroundTaskDeferral]
  }
  
  extension [Self <: BackgroundTaskDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
