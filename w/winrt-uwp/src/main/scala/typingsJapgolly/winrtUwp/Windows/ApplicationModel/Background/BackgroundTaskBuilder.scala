package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a background task to be registered with the system. */
trait BackgroundTaskBuilder extends StObject {
  
  /**
    * Adds a condition to a background task.
    * @param condition An instance of a SystemCondition object.
    */
  def addCondition(condition: IBackgroundCondition): Unit
  
  /** Indicates whether the background task will be canceled if at least one of its required conditions is no longer met. */
  var cancelOnConditionLoss: Boolean
  
  /** This API is not available to all Windows/Windows Phone apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var isNetworkRequested: Boolean
  
  /** Gets or sets the name of a background task. */
  var name: String
  
  /**
    * Registers a background task with the system.
    * @return An instance of a BackgroundTaskRegistration object.
    */
  def register(): BackgroundTaskRegistration
  
  /**
    * Sets the event trigger for a background task.
    * @param trigger An instance of an event trigger object such as a SystemTrigger , TimeTrigger , or NetworkOperatorNotificationTrigger .
    */
  def setTrigger(trigger: IBackgroundTrigger): Unit
  
  /** Gets or sets the class that performs the work of a background task. */
  var taskEntryPoint: String
}
object BackgroundTaskBuilder {
  
  inline def apply(
    addCondition: IBackgroundCondition => Callback,
    cancelOnConditionLoss: Boolean,
    isNetworkRequested: Boolean,
    name: String,
    register: CallbackTo[BackgroundTaskRegistration],
    setTrigger: IBackgroundTrigger => Callback,
    taskEntryPoint: String
  ): BackgroundTaskBuilder = {
    val __obj = js.Dynamic.literal(addCondition = js.Any.fromFunction1((t0: IBackgroundCondition) => addCondition(t0).runNow()), cancelOnConditionLoss = cancelOnConditionLoss.asInstanceOf[js.Any], isNetworkRequested = isNetworkRequested.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], register = register.toJsFn, setTrigger = js.Any.fromFunction1((t0: IBackgroundTrigger) => setTrigger(t0).runNow()), taskEntryPoint = taskEntryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTaskBuilder]
  }
  
  extension [Self <: BackgroundTaskBuilder](x: Self) {
    
    inline def setAddCondition(value: IBackgroundCondition => Callback): Self = StObject.set(x, "addCondition", js.Any.fromFunction1((t0: IBackgroundCondition) => value(t0).runNow()))
    
    inline def setCancelOnConditionLoss(value: Boolean): Self = StObject.set(x, "cancelOnConditionLoss", value.asInstanceOf[js.Any])
    
    inline def setIsNetworkRequested(value: Boolean): Self = StObject.set(x, "isNetworkRequested", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRegister(value: CallbackTo[BackgroundTaskRegistration]): Self = StObject.set(x, "register", value.toJsFn)
    
    inline def setSetTrigger(value: IBackgroundTrigger => Callback): Self = StObject.set(x, "setTrigger", js.Any.fromFunction1((t0: IBackgroundTrigger) => value(t0).runNow()))
    
    inline def setTaskEntryPoint(value: String): Self = StObject.set(x, "taskEntryPoint", value.asInstanceOf[js.Any])
  }
}
