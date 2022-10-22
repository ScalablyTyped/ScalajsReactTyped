package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the number of section columns having the same width.
  */
trait ChangeSectionEqualColumnCountCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeSectionEqualColumnCountCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columnCount An interger number specifying the number of section columns having the same width.
    */
  def execute(columnCount: Double): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Double]
}
object ChangeSectionEqualColumnCountCommand {
  
  inline def apply(execute: Double => Boolean, getState: CallbackTo[CommandState[Double]]): ChangeSectionEqualColumnCountCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeSectionEqualColumnCountCommand]
  }
  
  extension [Self <: ChangeSectionEqualColumnCountCommand](x: Self) {
    
    inline def setExecute(value: Double => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[Double]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
