package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a class for command events.
  * Event handlers can use the cancel property to cancel the operation in progress. The semantics of canceling an event depend on the event source.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393715(v=vs.100).aspx
  */
trait CommandEventArgs
  extends StObject
     with EventArgs {
  
  /**
    * Gets a value that represents the command argument.
    */
  def get_commandArgument(): Any
  
  //#endregion
  //#region Properties
  /**
    * Gets a string that specifies the command name.
    */
  def get_commandName(): String
  
  /**
    * Gets a value that represents the command source.
    */
  def get_commandSource(): Any
}
object CommandEventArgs {
  
  inline def apply(
    Empty: EventArgs,
    get_commandArgument: CallbackTo[Any],
    get_commandName: CallbackTo[String],
    get_commandSource: CallbackTo[Any]
  ): CommandEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_commandArgument = get_commandArgument.toJsFn, get_commandName = get_commandName.toJsFn, get_commandSource = get_commandSource.toJsFn)
    __obj.asInstanceOf[CommandEventArgs]
  }
  
  extension [Self <: CommandEventArgs](x: Self) {
    
    inline def setGet_commandArgument(value: CallbackTo[Any]): Self = StObject.set(x, "get_commandArgument", value.toJsFn)
    
    inline def setGet_commandName(value: CallbackTo[String]): Self = StObject.set(x, "get_commandName", value.toJsFn)
    
    inline def setGet_commandSource(value: CallbackTo[Any]): Self = StObject.set(x, "get_commandSource", value.toJsFn)
  }
}
