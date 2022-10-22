package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Controls.Control
import typingsJapgolly.xrm.Xrm.Entity
import typingsJapgolly.xrm.Xrm.FormContext
import typingsJapgolly.xrm.Xrm.GlobalContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a process stage change event context
  */
trait StageChangeEventContext
  extends StObject
     with EventContext {
  
  /**
    * Gets process stage change event arguments.
    * @returns The event arguments.
    */
  def getEventArgs(): StageChangeEventArguments
}
object StageChangeEventContext {
  
  inline def apply(
    getContext: CallbackTo[GlobalContext],
    getDepth: CallbackTo[Double],
    getEventArgs: CallbackTo[StageChangeEventArguments],
    getEventSource: CallbackTo[typingsJapgolly.xrm.Xrm.Attributes.Attribute[Any] | Control | Entity],
    getFormContext: CallbackTo[FormContext],
    getSharedVariable: String => Any,
    setSharedVariable: (String, Any) => Callback
  ): StageChangeEventContext = {
    val __obj = js.Dynamic.literal(getContext = getContext.toJsFn, getDepth = getDepth.toJsFn, getEventArgs = getEventArgs.toJsFn, getEventSource = getEventSource.toJsFn, getFormContext = getFormContext.toJsFn, getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2((t0: String, t1: Any) => (setSharedVariable(t0, t1)).runNow()))
    __obj.asInstanceOf[StageChangeEventContext]
  }
  
  extension [Self <: StageChangeEventContext](x: Self) {
    
    inline def setGetEventArgs(value: CallbackTo[StageChangeEventArguments]): Self = StObject.set(x, "getEventArgs", value.toJsFn)
  }
}
