package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base class for commands that modify floating object settings.
  */
trait ChangeFloatingObjectPropertyCommandBase[T] extends StObject {
  
  /**
    * Executes a command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings An object that contains settings for the execute method.
    */
  def execute(settings: T): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[T]
}
object ChangeFloatingObjectPropertyCommandBase {
  
  inline def apply[T](execute: T => Boolean, getState: CallbackTo[CommandState[T]]): ChangeFloatingObjectPropertyCommandBase[T] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeFloatingObjectPropertyCommandBase[T]]
  }
  
  extension [Self <: ChangeFloatingObjectPropertyCommandBase[?], T](x: Self & ChangeFloatingObjectPropertyCommandBase[T]) {
    
    inline def setExecute(value: T => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[T]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
