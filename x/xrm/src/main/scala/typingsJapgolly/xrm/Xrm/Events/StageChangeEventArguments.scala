package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.ProcessFlow.Stage
import typingsJapgolly.xrm.Xrm.ProcessFlow.StageChangeDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for process stage change event arguments.
  */
trait StageChangeEventArguments extends StObject {
  
  /**
    * Gets the direction of the stage change.
    * @returns The direction: "next" or "previous"
    */
  def getDirection(): StageChangeDirection
  
  /**
    * Gets the destination stage object
    * @returns The stage object. For switching between entities, returns the previous stage object
    */
  def getStage(): Stage
  
  /**
    * Prevents the stage or status change operation from being submitted to the server.
    */
  def preventDefault(): Unit
}
object StageChangeEventArguments {
  
  inline def apply(
    getDirection: CallbackTo[StageChangeDirection],
    getStage: CallbackTo[Stage],
    preventDefault: Callback
  ): StageChangeEventArguments = {
    val __obj = js.Dynamic.literal(getDirection = getDirection.toJsFn, getStage = getStage.toJsFn, preventDefault = preventDefault.toJsFn)
    __obj.asInstanceOf[StageChangeEventArguments]
  }
  
  extension [Self <: StageChangeEventArguments](x: Self) {
    
    inline def setGetDirection(value: CallbackTo[StageChangeDirection]): Self = StObject.set(x, "getDirection", value.toJsFn)
    
    inline def setGetStage(value: CallbackTo[Stage]): Self = StObject.set(x, "getStage", value.toJsFn)
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
  }
}
