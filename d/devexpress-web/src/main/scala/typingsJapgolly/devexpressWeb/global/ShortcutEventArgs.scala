package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client-side ASPxClientScheduler.Shortcut event.
  */
@JSGlobal("ShortcutEventArgs")
@js.native
open class ShortcutEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ShortcutEventArgs {
  /**
    * Initialize a new instance of the class.
    * @param commandName Specifies the command name.
    * @param htmlEvent Specifies the html event.
    */
  def this(commandName: String, htmlEvent: Any) = this()
  
  /**
    * Gets the name of a command associated with the keyboard shortcut.
    */
  /* CompleteClass */
  var commandName: String = js.native
  
  /**
    * Gets or sets whether an event is handled, and that default actions are not required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets an object containing information about a keyboard shortcut event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
}
