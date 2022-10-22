package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the next data record of the bound data source.
  */
trait GoToDataRecordCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the GoToDataRecordCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param activeRecordIndex An integer value specifying index of the next data record.
    */
  def execute(activeRecordIndex: Double): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[DataRecordOptions]
}
object GoToDataRecordCommand {
  
  inline def apply(execute: Double => Boolean, getState: CallbackTo[CommandState[DataRecordOptions]]): GoToDataRecordCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[GoToDataRecordCommand]
  }
  
  extension [Self <: GoToDataRecordCommand](x: Self) {
    
    inline def setExecute(value: Double => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[DataRecordOptions]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
