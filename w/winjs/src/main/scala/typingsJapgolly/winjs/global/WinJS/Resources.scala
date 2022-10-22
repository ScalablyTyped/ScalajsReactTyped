package typingsJapgolly.winjs.global.WinJS

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.winjs.anon.Empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functions for accessing resources and localizing content.
**/
object Resources {
  
  @JSGlobal("WinJS.Resources")
  @js.native
  val ^ : js.Any = js.native
  
  //#region Functions
  /**
    * Registers an event handler for the specified event. Use this method to register for events that are related to resources, such as when the app's language, scale, or contrast changes.
    * @param type The name of the event to handle.
    * @param listener The listener (event handler function) to associate with the event.
    * @param useCapture Set to true to register the listener for the capturing phase; otherwise, set to false to register the listener for the bubbling phase.
    **/
  inline def addEventListener(`type`: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Raises an event of the specified type and with the specified additional properties.
    * @param type The name of the event to raise.
    * @param details The set of additional properties to attach to the event object.
    **/
  inline def dispatchEvent(`type`: String, details: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(`type`.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Retrieves the resource string that has the specified resource identifier.
    * @param resourceId The resource ID of the string to retrieve.
    * @returns An object that can contain these properties: value, empty, lang.
    **/
  inline def getString(resourceId: String): Empty = ^.asInstanceOf[js.Dynamic].applyDynamic("getString")(resourceId.asInstanceOf[js.Any]).asInstanceOf[Empty]
  
  //#endregion Functions
  //#region Events
  /**
    * Occurs when the user changes the system's language or contrast, or the scale of the display, or when the user changes any of the items in the current context's qualifier values list. For more info about the current context's qualifier values list, see the Remarks section.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.qualifier, detail.changed.
    **/
  inline def oncontextchanged(eventInfo: CustomEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("oncontextchanged")(eventInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Processes data-win-res attributes on elements and replaces attributes and properties with resource strings.
    * @param rootElement The element to process. The element and its child elements will be processed. If an element isn't specified, the entire document is processed.
    **/
  inline def processAll(): typingsJapgolly.winjs.WinJS.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("processAll")().asInstanceOf[typingsJapgolly.winjs.WinJS.Promise[Unit]]
  inline def processAll(rootElement: HTMLElement): typingsJapgolly.winjs.WinJS.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("processAll")(rootElement.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winjs.WinJS.Promise[Unit]]
  
  /**
    * Removes an event listener that the addEventListener method registered.
    * @param type The name of the event that the event listener is registered for.
    * @param listener The listener (event handler function) to remove.
    * @param useCapture Set to true to remove the capturing phase listener; set to false to remove the bubbling phase listener.
    **/
  inline def removeEventListener(`type`: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
