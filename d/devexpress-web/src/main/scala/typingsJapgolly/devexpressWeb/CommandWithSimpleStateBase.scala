package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for commands with a simple common command state.
  */
trait CommandWithSimpleStateBase
  extends StObject
     with CommandBase {
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}
object CommandWithSimpleStateBase {
  
  inline def apply(getState: CallbackTo[SimpleCommandState]): CommandWithSimpleStateBase = {
    val __obj = js.Dynamic.literal(getState = getState.toJsFn)
    __obj.asInstanceOf[CommandWithSimpleStateBase]
  }
  
  extension [Self <: CommandWithSimpleStateBase](x: Self) {
    
    inline def setGetState(value: CallbackTo[SimpleCommandState]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
