package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle between the bulleted paragraph and normal text.
  */
trait ToggleBulletedListCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ToggleBulletedListCommand command.
    */
  def execute(): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean]
}
object ToggleBulletedListCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[CommandState[Boolean]]): ToggleBulletedListCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[ToggleBulletedListCommand]
  }
  
  extension [Self <: ToggleBulletedListCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
    
    inline def setGetState(value: CallbackTo[CommandState[Boolean]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
