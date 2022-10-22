package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.ProcessFlow.Stage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for process stage selected event arguments.
  */
trait StageSelectedEventArguments extends StObject {
  
  /**
    * Gets the selected stage object
    * @returns The stage object
    */
  def getStage(): Stage
}
object StageSelectedEventArguments {
  
  inline def apply(getStage: CallbackTo[Stage]): StageSelectedEventArguments = {
    val __obj = js.Dynamic.literal(getStage = getStage.toJsFn)
    __obj.asInstanceOf[StageSelectedEventArguments]
  }
  
  extension [Self <: StageSelectedEventArguments](x: Self) {
    
    inline def setGetStage(value: CallbackTo[Stage]): Self = StObject.set(x, "getStage", value.toJsFn)
  }
}
