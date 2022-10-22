package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the page orientation.
  */
trait ChangePageOrientationCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangePageOrientationCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param orientation The page orientation.
    */
  def execute(orientation: Orientation): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Orientation]
}
object ChangePageOrientationCommand {
  
  inline def apply(execute: Orientation => Boolean, getState: CallbackTo[CommandState[Orientation]]): ChangePageOrientationCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangePageOrientationCommand]
  }
  
  extension [Self <: ChangePageOrientationCommand](x: Self) {
    
    inline def setExecute(value: Orientation => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[Orientation]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
