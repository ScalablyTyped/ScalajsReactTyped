package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientControlsInitializedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGlobalBeginCallbackEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGlobalCallbackErrorEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGlobalEndCallbackEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientValidationCompletedEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxGlobalEvents component.
  */
@JSGlobal("ASPxClientGlobalEvents")
@js.native
open class ASPxClientGlobalEvents ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientGlobalEvents {
  
  /**
    * Occurs when a callback for server-side processing is initiated by any DevExpress control.
    */
  /* CompleteClass */
  var BeginCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalBeginCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  
  /**
    * Occurs when the browser window is being resized.
    */
  /* CompleteClass */
  var BrowserWindowResized: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGlobalEvents]] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by any of DevExpress web controls.
    */
  /* CompleteClass */
  var CallbackError: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalCallbackErrorEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  
  /**
    * Occurs on the client side after client object models of all DevExpress web controls contained within the page have been initialized.
    */
  /* CompleteClass */
  var ControlsInitialized: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientControlsInitializedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  
  /**
    * Occurs on the client side, after server-side processing of a callback initiated by any DevExpress web control, has been completed.
    */
  /* CompleteClass */
  var EndCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalEndCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  
  /**
    * Occurs on the client side after the validation initiated for a DevExpress web control (or a group of DevExpress web controls) has been completed.
    */
  /* CompleteClass */
  var ValidationCompleted: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientValidationCompletedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
}
