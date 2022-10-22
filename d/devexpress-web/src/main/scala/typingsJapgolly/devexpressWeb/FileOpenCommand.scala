package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to open the file, specifying its path.
  */
trait FileOpenCommand extends StObject {
  
  /**
    * Executes the FileOpenCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param path A string value specifying path to the opening file.
    */
  def execute(path: String): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}
object FileOpenCommand {
  
  inline def apply(execute: String => Boolean, getState: CallbackTo[SimpleCommandState]): FileOpenCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[FileOpenCommand]
  }
  
  extension [Self <: FileOpenCommand](x: Self) {
    
    inline def setExecute(value: String => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[SimpleCommandState]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
