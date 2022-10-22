package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to force synchronizing the server document model with the client model and execute a callback function if it is necessary.
  */
trait ForceSyncWithServerCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ForceSyncWithServerCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param callback A callback function that is performed when the server model is updated.
    */
  def execute(callback: js.Function0[Unit]): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}
object ForceSyncWithServerCommand {
  
  inline def apply(execute: js.Function0[Unit] => Boolean, getState: CallbackTo[SimpleCommandState]): ForceSyncWithServerCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ForceSyncWithServerCommand]
  }
  
  extension [Self <: ForceSyncWithServerCommand](x: Self) {
    
    inline def setExecute(value: js.Function0[Unit] => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[SimpleCommandState]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
