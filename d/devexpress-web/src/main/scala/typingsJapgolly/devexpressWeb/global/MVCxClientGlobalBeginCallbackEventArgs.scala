package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the MVCxClientGlobalEvents.BeginCallback event.
  */
@JSGlobal("MVCxClientGlobalBeginCallbackEventArgs")
@js.native
open class MVCxClientGlobalBeginCallbackEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.MVCxClientGlobalBeginCallbackEventArgs {
  /**
    * Initializes a new instance of the MVCxClientGlobalBeginCallbackEventArgs class.
    * @param control An ASPxClientControl class descendant object that is the control that initiated a callback.
    * @param command A string value that is the name of the command that initiated a callback.
    */
  def this(control: typingsJapgolly.devexpressWeb.ASPxClientControl, command: String) = this()
  
  /**
    * Gets a command name that identifies which client action forced a callback to occur.
    */
  /* CompleteClass */
  var command: String = js.native
  
  /**
    * Gets an object that initiated a callback.
    */
  /* CompleteClass */
  var control: typingsJapgolly.devexpressWeb.ASPxClientControl = js.native
  
  /**
    * Gets an object containing specific information (if any, as name/value pairs) that should be passed as a request parameter from the client to the server side for further processing.
    */
  /* CompleteClass */
  var customArgs: Any = js.native
}
