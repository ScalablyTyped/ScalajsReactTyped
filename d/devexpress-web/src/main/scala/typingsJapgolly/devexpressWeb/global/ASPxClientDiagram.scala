package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientBeginCallbackEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientDiagramCustomShapeCreateTemplateEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientDiagramItemClickEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientDiagramRequestEditOperationEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientDiagramSelectionChangedEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEndCallbackEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxDiagram control.
  */
@JSGlobal("ASPxClientDiagram")
@js.native
open class ASPxClientDiagram ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientDiagram {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  var BeginCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientBeginCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]
  ] = js.native
  
  /**
    * Fires after a diagram model's data (mapped to a data source) is changed and the client-server synchronization starts to apply the change on the server.
    */
  /* CompleteClass */
  var BeginSynchronization: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]] = js.native
  
  /**
    * Fires on the client if any unhandled server error occurs during server-side processing of a callback sent by the ASPxClientDiagram.
    */
  /* CompleteClass */
  var CallbackError: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientCallbackErrorEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]
  ] = js.native
  
  /**
    * Allows you to create a template for custom shapes.
    */
  /* CompleteClass */
  var CustomShapeCreateTemplate: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientDiagramCustomShapeCreateTemplateEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]
  ] = js.native
  
  /**
    * Allows you to create a template for custom shapes in the toolbox.
    */
  /* CompleteClass */
  var CustomShapeCreateToolboxTemplate: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientDiagramCustomShapeCreateTemplateEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]
  ] = js.native
  
  /**
    * Fires when the diagram's data is changed.
    */
  /* CompleteClass */
  var DiagramChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  var EndCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientEndCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]
  ] = js.native
  
  /**
    * Fires after a diagram model's data change is applied to the server (the server and client document models have been synchronized).
    */
  /* CompleteClass */
  var EndSynchronization: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]] = js.native
  
  /**
    * Exports the diagram data in JSON format.
    */
  /* CompleteClass */
  override def Export(): String = js.native
  
  /**
    * Exports the diagram to an image format.
    * @param format The image format. Acceptable values: svg, png, jpg.
    * @param callback A function to be executed after a diagram image is prepared and allows you to save the image.
    */
  /* CompleteClass */
  override def ExportTo(format: String, callback: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  /**
    * Focuses the Diagram control.
    */
  /* CompleteClass */
  override def Focus(): Unit = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns a shape or connector object specified by its internal identifier. The DiagramShape or DiagramConnector object with the specified identifier.
    * @param id The item identifier.
    */
  /* CompleteClass */
  override def GetItemById(id: String): typingsJapgolly.devexpressWeb.DiagramItem = js.native
  
  /**
    * Returns a shape or connector object specified by its key. The DiagramShape or DiagramConnector object with the specified key.
    * @param key The item key.
    */
  /* CompleteClass */
  override def GetItemByKey(key: Any): typingsJapgolly.devexpressWeb.DiagramItem = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): Any = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Returns a value that indicates whether the control's status is read-only.
    */
  /* CompleteClass */
  override def GetReadOnly(): Boolean = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  
  /**
    * Imports the diagram data.
    * @param data The diagram data in JSON format.
    */
  /* CompleteClass */
  override def Import(data: String): Unit = js.native
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlBase]] = js.native
  
  /**
    * Fires after a shape or connector is clicked.
    */
  /* CompleteClass */
  var ItemClick: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientDiagramItemClickEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]
  ] = js.native
  
  /**
    * Fires after a shape or connector is double-clicked.
    */
  /* CompleteClass */
  var ItemDblClick: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientDiagramItemClickEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]
  ] = js.native
  
  /**
    * Allows you to prohibit an edit operation at run time.
    */
  /* CompleteClass */
  var RequestEditOperation: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientDiagramRequestEditOperationEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]
  ] = js.native
  
  /**
    * Fires after the selection changes in the Diagram.
    */
  /* CompleteClass */
  var SelectionChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientDiagramSelectionChangedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientDiagram]
  ] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Allows you to enable/disable full-screen mode.
    * @param fullscreen true to activate full-screen mode; false to deactivate full-screen mode.
    */
  /* CompleteClass */
  override def SetFullscreenMode(fullscreen: Boolean): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Allows you to enable/disable read-only mode.
    * @param readOnly true to make the diagram read-only; otherwise, false.
    */
  /* CompleteClass */
  override def SetReadOnly(readOnly: Boolean): Unit = js.native
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
