package typingsJapgolly.microsoftAjax.global.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a class for command events.
  * Event handlers can use the cancel property to cancel the operation in progress. The semantics of canceling an event depend on the event source.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393715(v=vs.100).aspx
  */
@JSGlobal("Sys.CommandEventArgs")
@js.native
open class CommandEventArgs protected ()
  extends StObject
     with typingsJapgolly.microsoftAjax.Sys.CommandEventArgs {
  //#region Constructors
  def this(commandName: String, commandArgument: Any, commandSource: Any) = this()
  
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  var Empty: typingsJapgolly.microsoftAjax.Sys.EventArgs = js.native
  
  /**
    * Gets a value that represents the command argument.
    */
  /* CompleteClass */
  override def get_commandArgument(): Any = js.native
  
  //#endregion
  //#region Properties
  /**
    * Gets a string that specifies the command name.
    */
  /* CompleteClass */
  override def get_commandName(): String = js.native
  
  /**
    * Gets a value that represents the command source.
    */
  /* CompleteClass */
  override def get_commandSource(): Any = js.native
}
