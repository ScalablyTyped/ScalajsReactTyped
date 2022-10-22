package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the settings of individual section columns.
  */
trait ChangeSectionColumnsCommand extends StObject {
  
  /**
    * Executes the ChangeSectionColumnsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columns An array of SectionColumn objects.
    */
  def execute(columns: js.Array[SectionColumn]): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[js.Array[SectionColumn]]
}
object ChangeSectionColumnsCommand {
  
  inline def apply(
    execute: js.Array[SectionColumn] => Boolean,
    getState: CallbackTo[CommandState[js.Array[SectionColumn]]]
  ): ChangeSectionColumnsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeSectionColumnsCommand]
  }
  
  extension [Self <: ChangeSectionColumnsCommand](x: Self) {
    
    inline def setExecute(value: js.Array[SectionColumn] => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[js.Array[SectionColumn]]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
