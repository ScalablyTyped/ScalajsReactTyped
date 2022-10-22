package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to increment the left indentation of paragraphs in a selected range.
  */
trait IncrementParagraphLeftIndentCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the IncrementParagraphLeftIndentCommand command.
    */
  def execute(): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}
object IncrementParagraphLeftIndentCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): IncrementParagraphLeftIndentCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[IncrementParagraphLeftIndentCommand]
  }
  
  extension [Self <: IncrementParagraphLeftIndentCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
    
    inline def setGetState(value: CallbackTo[SimpleCommandState]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
