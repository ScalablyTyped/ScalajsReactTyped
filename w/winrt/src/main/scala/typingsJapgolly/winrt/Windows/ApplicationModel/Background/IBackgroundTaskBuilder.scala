package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackgroundTaskBuilder extends StObject {
  
  def addCondition(condition: IBackgroundCondition): Unit
  
  var name: String
  
  def register(): BackgroundTaskRegistration
  
  def setTrigger(trigger: IBackgroundTrigger): Unit
  
  var taskEntryPoint: String
}
object IBackgroundTaskBuilder {
  
  inline def apply(
    addCondition: IBackgroundCondition => Callback,
    name: String,
    register: CallbackTo[BackgroundTaskRegistration],
    setTrigger: IBackgroundTrigger => Callback,
    taskEntryPoint: String
  ): IBackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal(addCondition = js.Any.fromFunction1((t0: IBackgroundCondition) => addCondition(t0).runNow()), name = name.asInstanceOf[js.Any], register = register.toJsFn, setTrigger = js.Any.fromFunction1((t0: IBackgroundTrigger) => setTrigger(t0).runNow()), taskEntryPoint = taskEntryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskBuilder]
  }
  
  extension [Self <: IBackgroundTaskBuilder](x: Self) {
    
    inline def setAddCondition(value: IBackgroundCondition => Callback): Self = StObject.set(x, "addCondition", js.Any.fromFunction1((t0: IBackgroundCondition) => value(t0).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRegister(value: CallbackTo[BackgroundTaskRegistration]): Self = StObject.set(x, "register", value.toJsFn)
    
    inline def setSetTrigger(value: IBackgroundTrigger => Callback): Self = StObject.set(x, "setTrigger", js.Any.fromFunction1((t0: IBackgroundTrigger) => value(t0).runNow()))
    
    inline def setTaskEntryPoint(value: String): Self = StObject.set(x, "taskEntryPoint", value.asInstanceOf[js.Any])
  }
}
