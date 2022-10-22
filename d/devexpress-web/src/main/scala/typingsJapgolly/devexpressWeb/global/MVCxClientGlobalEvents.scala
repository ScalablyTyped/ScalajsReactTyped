package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientControlsInitializedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEndCallbackEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGlobalCallbackErrorEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientGlobalEndCallbackEventHandler
import typingsJapgolly.devexpressWeb.MVCxClientBeginCallbackEventHandler
import typingsJapgolly.devexpressWeb.MVCxClientGlobalBeginCallbackEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ASP.NET MVC equivalent of the client ASPxClientGlobalEvents component.
  */
@JSGlobal("MVCxClientGlobalEvents")
@js.native
open class MVCxClientGlobalEvents ()
  extends StObject
     with typingsJapgolly.devexpressWeb.MVCxClientGlobalEvents {
  
  /**
    * Occurs on the client when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  var BeginCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    MVCxClientGlobalBeginCallbackEventHandler[typingsJapgolly.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by a DevExpress MVC extension.
    */
  /* CompleteClass */
  var CallbackError: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalCallbackErrorEventHandler[typingsJapgolly.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
  
  /**
    * Occurs on the client side after client object models of all DevExpress MVC extensions contained within the page have been initialized.
    */
  /* CompleteClass */
  var ControlsInitialized: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientControlsInitializedEventHandler[typingsJapgolly.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
  
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  var EndCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalEndCallbackEventHandler[typingsJapgolly.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
}
object MVCxClientGlobalEvents {
  
  @JSGlobal("MVCxClientGlobalEvents")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.BeginCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  /* static member */
  inline def AddBeginCallbackEventHandler(
    handler: typingsJapgolly.devexpressWeb.ASPxClientEvent[
      MVCxClientBeginCallbackEventHandler[typingsJapgolly.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddBeginCallbackEventHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.CallbackError client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  /* static member */
  inline def AddCallbackErrorHandler(
    handler: typingsJapgolly.devexpressWeb.ASPxClientEvent[
      ASPxClientCallbackErrorEventHandler[typingsJapgolly.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddCallbackErrorHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.ControlsInitialized client event with an appropriate event handler function.
    * @param handler A object representing the event handling function's content.
    */
  /* static member */
  inline def AddControlsInitializedEventHandler(
    handler: typingsJapgolly.devexpressWeb.ASPxClientEvent[
      ASPxClientControlsInitializedEventHandler[typingsJapgolly.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddControlsInitializedEventHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.EndCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  /* static member */
  inline def AddEndCallbackEventHandler(
    handler: typingsJapgolly.devexpressWeb.ASPxClientEvent[
      ASPxClientEndCallbackEventHandler[typingsJapgolly.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddEndCallbackEventHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
