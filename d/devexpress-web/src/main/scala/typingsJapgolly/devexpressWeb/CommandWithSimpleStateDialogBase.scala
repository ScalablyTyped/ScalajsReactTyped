package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for dialog-related commands with a simple common command state.
  */
trait CommandWithSimpleStateDialogBase extends StObject {
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}
object CommandWithSimpleStateDialogBase {
  
  inline def apply(getState: CallbackTo[SimpleCommandState]): CommandWithSimpleStateDialogBase = {
    val __obj = js.Dynamic.literal(getState = getState.toJsFn)
    __obj.asInstanceOf[CommandWithSimpleStateDialogBase]
  }
  
  extension [Self <: CommandWithSimpleStateDialogBase](x: Self) {
    
    inline def setGetState(value: CallbackTo[SimpleCommandState]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
