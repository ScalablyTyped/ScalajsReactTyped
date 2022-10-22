package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Insert Merge Field dialog.
  */
trait MergeFieldDialogCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the MergeFieldDialogCommand command.
    */
  def execute(): Boolean
}
object MergeFieldDialogCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): MergeFieldDialogCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[MergeFieldDialogCommand]
  }
  
  extension [Self <: MergeFieldDialogCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
