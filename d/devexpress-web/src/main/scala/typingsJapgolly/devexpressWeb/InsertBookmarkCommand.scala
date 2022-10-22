package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a new bookmark that references the current selection.
  */
trait InsertBookmarkCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertBookmarkCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param name A string value specifying a name of the created bookmark.
    * @param start An integer value specifying the start position of the bookmark's range.
    * @param length An integer value specifying the length of the bookmark's range.
    */
  def execute(name: String, start: Double, length: Double): Boolean
}
object InsertBookmarkCommand {
  
  inline def apply(execute: (String, Double, Double) => Boolean, getState: CallbackTo[SimpleCommandState]): InsertBookmarkCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[InsertBookmarkCommand]
  }
  
  extension [Self <: InsertBookmarkCommand](x: Self) {
    
    inline def setExecute(value: (String, Double, Double) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
  }
}
