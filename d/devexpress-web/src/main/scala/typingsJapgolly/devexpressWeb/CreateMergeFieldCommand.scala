package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a MERGEFIELD field (with a data source column name) at the current position in the document.
  */
trait CreateMergeFieldCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the CreateMergeFieldCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fieldName A string value specifying the name of the merge field.
    */
  def execute(fieldName: String): Boolean
}
object CreateMergeFieldCommand {
  
  inline def apply(execute: String => Boolean, getState: CallbackTo[SimpleCommandState]): CreateMergeFieldCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[CreateMergeFieldCommand]
  }
  
  extension [Self <: CreateMergeFieldCommand](x: Self) {
    
    inline def setExecute(value: String => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
