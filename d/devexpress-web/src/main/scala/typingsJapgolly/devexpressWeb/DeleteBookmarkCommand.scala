package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete a specific bookmark.
  */
trait DeleteBookmarkCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteBookmarkCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param name A string value specifying a name of the deleted bookmark.
    */
  def execute(name: String): Boolean
}
object DeleteBookmarkCommand {
  
  inline def apply(execute: String => Boolean, getState: CallbackTo[SimpleCommandState]): DeleteBookmarkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[DeleteBookmarkCommand]
  }
  
  extension [Self <: DeleteBookmarkCommand](x: Self) {
    
    inline def setExecute(value: String => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
