package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTask extends StObject {
  
  def run(taskInstance: IBackgroundTaskInstance): Unit
}
object IBackgroundTask {
  
  inline def apply(run: IBackgroundTaskInstance => Callback): IBackgroundTask = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1((t0: IBackgroundTaskInstance) => run(t0).runNow()))
    __obj.asInstanceOf[IBackgroundTask]
  }
  
  extension [Self <: IBackgroundTask](x: Self) {
    
    inline def setRun(value: IBackgroundTaskInstance => Callback): Self = StObject.set(x, "run", js.Any.fromFunction1((t0: IBackgroundTaskInstance) => value(t0).runNow()))
  }
}
