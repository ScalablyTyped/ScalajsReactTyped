package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to open the file's Save As dialog.
  */
trait FileSaveAsDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the FileSaveAsDialogCommand command.
    */
  def execute(): Boolean
}
object FileSaveAsDialogCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): FileSaveAsDialogCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[FileSaveAsDialogCommand]
  }
  
  extension [Self <: FileSaveAsDialogCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
