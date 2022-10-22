package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the Rich Edit's document view type.
  */
trait ChangeViewTypeCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ChangeViewTypeCommand command with the specified parameter. A Boolean value identifying whether method execution was successful or failed.
    * @param viewType A string value specifying the Rich Edit's document view type.
    */
  def execute(viewType: ViewType): Boolean
}
object ChangeViewTypeCommand {
  
  inline def apply(execute: ViewType => Boolean, getState: CallbackTo[CommandState[Boolean]]): ChangeViewTypeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeViewTypeCommand]
  }
  
  extension [Self <: ChangeViewTypeCommand](x: Self) {
    
    inline def setExecute(value: ViewType => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
  }
}
