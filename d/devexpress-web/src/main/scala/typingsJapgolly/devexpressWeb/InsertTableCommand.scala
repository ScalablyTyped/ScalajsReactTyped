package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Insert Table dialog.
  */
trait InsertTableCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertTableCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param columnCount An integer value specifying a number of columns in a generated table.
    * @param rowCount An integer value specifying a number of rows in a generated table.
    */
  def execute(columnCount: Double, rowCount: Double): Boolean
}
object InsertTableCommand {
  
  inline def apply(execute: (Double, Double) => Boolean, getState: CallbackTo[SimpleCommandState]): InsertTableCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[InsertTableCommand]
  }
  
  extension [Self <: InsertTableCommand](x: Self) {
    
    inline def setExecute(value: (Double, Double) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
  }
}
