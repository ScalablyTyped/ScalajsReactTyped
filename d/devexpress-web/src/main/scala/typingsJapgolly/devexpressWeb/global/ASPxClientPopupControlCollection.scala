package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientControlAction
import typingsJapgolly.devexpressWeb.ASPxClientControlPredicate
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
  * Represents a client collection that maintains client popup control objects.
  */
@JSGlobal("ASPxClientPopupControlCollection")
@js.native
open class ASPxClientPopupControlCollection ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientPopupControlCollection {
  
  /**
    * Occurs when a callback for server-side processing is initiated by any DevExpress control.
    */
  /* CompleteClass */
  var BeginCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalBeginCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlCollection]
  ] = js.native
  
  /**
    * Occurs when the browser window is being resized.
    */
  /* CompleteClass */
  var BrowserWindowResized: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlCollection]
  ] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by any DevExpress web control.
    */
  /* CompleteClass */
  var CallbackError: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalCallbackErrorEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlCollection]
  ] = js.native
  
  /**
    * Occurs on the client side after client object models of all DevExpress web controls contained within the page have been initialized.
    */
  /* CompleteClass */
  var ControlsInitialized: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientControlsInitializedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlCollection]
  ] = js.native
  
  /**
    * Occurs on the client side, after server-side processing of a callback initiated by any DevExpress web control, has been completed.
    */
  /* CompleteClass */
  var EndCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalEndCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlCollection]
  ] = js.native
  
  /**
    * Performs the specified action for each control in the collection.
    * @param action An ASPxClientControlAction object specifying an action to perform.
    */
  /* CompleteClass */
  override def ForEachControl(action: ASPxClientControlAction): Unit = js.native
  
  /** @deprecated Use the GetByName method instead. */
  /**
    * Returns a collection item identified by its unique hierarchically-qualified identifier. An object representing the collection item found.
    * @param name A string value representing the hierarchically-qualified identifier of the required control.
    */
  /* CompleteClass */
  override def Get(name: Any): Any = js.native
  
  /**
    * Returns a DevExpress client control object identified by its unique hierarchically-qualified identifier (either ClientInstanceName or ClientID property value). An object that is the client control object found.
    * @param name A string value that is the hierarchically-qualified identifier of the required DevExpress control.
    */
  /* CompleteClass */
  override def GetByName(name: String): Any = js.native
  
  /**
    * Returns all controls in the collection that satisfy the specified predicate. An array of all client controls found.
    * @param predicate An ASPxClientControlPredicate object that is a predicate used to search for controls in the collection.
    */
  /* CompleteClass */
  override def GetControlsByPredicate(predicate: ASPxClientControlPredicate): js.Array[Any] = js.native
  
  /**
    * Returns all controls of the specified type. An array of all client controls found.
    * @param type The object specifying the client control type.
    */
  /* CompleteClass */
  override def GetControlsByType(`type`: Any): js.Array[Any] = js.native
  
  /**
    * Hides all popup windows maintained by the collection.
    */
  /* CompleteClass */
  override def HideAllWindows(): Unit = js.native
  
  /**
    * Occurs after the validation initiated for a DevExpress web control (or a group of DevExpress web controls) has been completed.
    */
  /* CompleteClass */
  var ValidationCompleted: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientValidationCompletedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlCollection]
  ] = js.native
}
