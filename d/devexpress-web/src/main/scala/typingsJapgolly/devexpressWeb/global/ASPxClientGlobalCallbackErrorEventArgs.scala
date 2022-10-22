package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGlobalEvents.CallbackError event.
  */
@JSGlobal("ASPxClientGlobalCallbackErrorEventArgs")
@js.native
open class ASPxClientGlobalCallbackErrorEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientGlobalCallbackErrorEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGlobalCallbackErrorEventArgs class.
    * @param control An ASPxClientControl class descendant object that is the control that initiated a callback.
    * @param message A string value that is the error message.
    */
  def this(control: typingsJapgolly.devexpressWeb.ASPxClientControl, message: String) = this()
  
  /**
    * Gets an object that initiated a callback.
    */
  /* CompleteClass */
  var control: typingsJapgolly.devexpressWeb.ASPxClientControl = js.native
  
  /**
    * Gets or sets whether the event is handled and the default error handling actions are not required.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets the error message that describes the server error that occurred.
    */
  /* CompleteClass */
  var message: String = js.native
}
