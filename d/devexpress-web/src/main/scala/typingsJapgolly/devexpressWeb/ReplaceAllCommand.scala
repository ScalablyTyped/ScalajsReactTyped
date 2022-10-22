package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to search for a specific text and replace all matches in the document with the specified string.
  */
trait ReplaceAllCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the ReplaceAllCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param text A string value specifying a text to replace.
    * @param replaceText A string value specifying the inserted text.
    * @param matchCase true, to perform a case-sensitive search; otherwise, false.
    */
  def execute(text: String, replaceText: String, matchCase: Boolean): Boolean
}
object ReplaceAllCommand {
  
  inline def apply(execute: (String, String, Boolean) => Boolean, getState: CallbackTo[SimpleCommandState]): ReplaceAllCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ReplaceAllCommand]
  }
  
  extension [Self <: ReplaceAllCommand](x: Self) {
    
    inline def setExecute(value: (String, String, Boolean) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
  }
}
