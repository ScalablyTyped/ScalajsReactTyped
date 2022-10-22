package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.ProcessFlow.ProcessStatus
import typingsJapgolly.xrm.Xrm.ProcessFlow.Stage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for process status changed event arguments.
  */
trait ProcessStatusChangedEventArguments extends StObject {
  
  /**
    * Gets the selected stage object
    * @returns The stage object
    */
  def getStage(): Stage
  
  /**
    * Gets the destination process status
    * @returns The process status
    */
  def getStatus(): ProcessStatus
  
  /**
    * Prevents the stage or status change operation from being submitted to the server.
    */
  def preventDefault(): Unit
}
object ProcessStatusChangedEventArguments {
  
  inline def apply(getStage: CallbackTo[Stage], getStatus: CallbackTo[ProcessStatus], preventDefault: Callback): ProcessStatusChangedEventArguments = {
    val __obj = js.Dynamic.literal(getStage = getStage.toJsFn, getStatus = getStatus.toJsFn, preventDefault = preventDefault.toJsFn)
    __obj.asInstanceOf[ProcessStatusChangedEventArguments]
  }
  
  extension [Self <: ProcessStatusChangedEventArguments](x: Self) {
    
    inline def setGetStage(value: CallbackTo[Stage]): Self = StObject.set(x, "getStage", value.toJsFn)
    
    inline def setGetStatus(value: CallbackTo[ProcessStatus]): Self = StObject.set(x, "getStatus", value.toJsFn)
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
  }
}
