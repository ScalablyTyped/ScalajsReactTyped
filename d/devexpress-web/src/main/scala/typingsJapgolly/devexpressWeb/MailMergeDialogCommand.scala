package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gets a command to invoke the Export Range dialog to start a mail merge.
  */
trait MailMergeDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the MailMergeDialogCommand command.
    */
  def execute(): Boolean
}
object MailMergeDialogCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): MailMergeDialogCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[MailMergeDialogCommand]
  }
  
  extension [Self <: MailMergeDialogCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
