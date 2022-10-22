package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ErrorAlertDisplaying event.
  */
@JSGlobal("ASPxClientFileManagerErrorAlertDisplayingEventArgs")
@js.native
open class ASPxClientFileManagerErrorAlertDisplayingEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientFileManagerErrorAlertDisplayingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerErrorAlertDisplayingEventArgs class with the specified settings.
    * @param commandName A String value that specifies the name of the processed command. Initializes the ASPxClientFileManagerErrorAlertDisplayingEventArgs.commandName property.
    * @param errorText A String value that specifies the error text. This value is assigned to the ASPxClientFileManagerErrorAlertDisplayingEventArgs.errorText property.
    */
  def this(commandName: String, errorText: String) = this()
  
  /**
    * Gets the name of the processed command.
    */
  /* CompleteClass */
  var commandName: String = js.native
  
  /**
    * Gets or sets the errors description.
    */
  /* CompleteClass */
  var errorText: String = js.native
  
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the event fires.
    */
  /* CompleteClass */
  var showAlert: Boolean = js.native
}
