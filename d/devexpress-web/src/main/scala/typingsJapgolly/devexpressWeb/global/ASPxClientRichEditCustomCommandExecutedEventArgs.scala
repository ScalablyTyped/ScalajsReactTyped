package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.CustomCommandExecuted event.
  */
@JSGlobal("ASPxClientRichEditCustomCommandExecutedEventArgs")
@js.native
open class ASPxClientRichEditCustomCommandExecutedEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientRichEditCustomCommandExecutedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditCustomCommandExecutedEventArgs object. For internal use only.
    * @param commandName A string value that specifies the name of the processed command.
    * @param parameter An object that can contain command specific information needed for handling the command execution.
    */
  def this(commandName: String, parameter: Any) = this()
  
  /**
    * Gets the name of the processed command.
    */
  /* CompleteClass */
  var commandName: String = js.native
  
  /**
    * Gets an optional parameter that complements the processed command.
    */
  /* CompleteClass */
  var parameter: Any = js.native
}
