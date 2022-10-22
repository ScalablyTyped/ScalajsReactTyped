package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change paragraph tab stops.
  */
trait ChangeTabsCommand extends StObject {
  
  /**
    * Executes the ChangeTabsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TabsSettings object maintaining the information about tab stops.
    */
  def execute(settings: TabsSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TabsSettings]
}
object ChangeTabsCommand {
  
  inline def apply(execute: TabsSettings => Boolean, getState: CallbackTo[CommandState[TabsSettings]]): ChangeTabsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeTabsCommand]
  }
  
  extension [Self <: ChangeTabsCommand](x: Self) {
    
    inline def setExecute(value: TabsSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[TabsSettings]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
