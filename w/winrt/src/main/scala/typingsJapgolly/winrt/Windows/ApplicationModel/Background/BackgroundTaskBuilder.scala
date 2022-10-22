package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundTaskBuilder
  extends StObject
     with IBackgroundTaskBuilder
object BackgroundTaskBuilder {
  
  inline def apply(
    addCondition: IBackgroundCondition => Callback,
    name: String,
    register: CallbackTo[BackgroundTaskRegistration],
    setTrigger: IBackgroundTrigger => Callback,
    taskEntryPoint: String
  ): BackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal(addCondition = js.Any.fromFunction1((t0: IBackgroundCondition) => addCondition(t0).runNow()), name = name.asInstanceOf[js.Any], register = register.toJsFn, setTrigger = js.Any.fromFunction1((t0: IBackgroundTrigger) => setTrigger(t0).runNow()), taskEntryPoint = taskEntryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskBuilder]
  }
}
