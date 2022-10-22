package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to resize the shape to fit the text in the text box.
  */
trait ChangeTextBoxResizeShapeToFitTextCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTextBoxResizeShapeToFitTextCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param resizeShapeToFitText true, to resize the shape to fit the text; otherwise, false.
    */
  def execute(resizeShapeToFitText: Boolean): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Boolean]
}
object ChangeTextBoxResizeShapeToFitTextCommand {
  
  inline def apply(execute: Boolean => Boolean, getState: CallbackTo[CommandState[Boolean]]): ChangeTextBoxResizeShapeToFitTextCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeTextBoxResizeShapeToFitTextCommand]
  }
  
  extension [Self <: ChangeTextBoxResizeShapeToFitTextCommand](x: Self) {
    
    inline def setExecute(value: Boolean => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[Boolean]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
