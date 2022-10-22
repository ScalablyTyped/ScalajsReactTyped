package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the File Open dialog allowing one to select and load a document file into RichEdit.
  */
trait FileOpenDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the FileOpenDialogCommand command.
    */
  def execute(): Boolean
}
object FileOpenDialogCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): FileOpenDialogCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[FileOpenDialogCommand]
  }
  
  extension [Self <: FileOpenDialogCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
