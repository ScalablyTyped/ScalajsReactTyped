package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to increase the font size of characters in a selected range to the closest larger predefined value.
  */
trait IncreaseFontSizeCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the IncreaseFontSizeCommand command.
    */
  def execute(): Boolean
}
object IncreaseFontSizeCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): IncreaseFontSizeCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[IncreaseFontSizeCommand]
  }
  
  extension [Self <: IncreaseFontSizeCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
