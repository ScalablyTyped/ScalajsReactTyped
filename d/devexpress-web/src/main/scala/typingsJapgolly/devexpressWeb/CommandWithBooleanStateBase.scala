package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for commands with the Boolean state.
  */
trait CommandWithBooleanStateBase
  extends StObject
     with CommandBase {
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean]
}
object CommandWithBooleanStateBase {
  
  inline def apply(getState: CallbackTo[CommandState[Boolean]]): CommandWithBooleanStateBase = {
    val __obj = js.Dynamic.literal(getState = getState.toJsFn)
    __obj.asInstanceOf[CommandWithBooleanStateBase]
  }
  
  extension [Self <: CommandWithBooleanStateBase](x: Self) {
    
    inline def setGetState(value: CallbackTo[CommandState[Boolean]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
