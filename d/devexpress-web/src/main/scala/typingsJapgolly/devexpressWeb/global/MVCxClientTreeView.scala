package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientBeginCallbackEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEndCallbackEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientTreeViewNodeCancelEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientTreeViewNodeClickEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientTreeViewNodeEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientTreeViewNodeProcessingModeEventHandler
import typingsJapgolly.devexpressWeb.MVCxClientBeginCallbackEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the TreeView extension.
  */
@JSGlobal("MVCxClientTreeView")
@js.native
open class MVCxClientTreeView ()
  extends StObject
     with typingsJapgolly.devexpressWeb.MVCxClientTreeView {
  
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
    ASPxClientBeginCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientTreeView: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    MVCxClientBeginCallbackEventHandler[typingsJapgolly.devexpressWeb.MVCxClientTreeView]
  ] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientTreeView.
    */
  /* CompleteClass */
  var CallbackError: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientCallbackErrorEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  
  /**
    * Occurs on the client side when the node's checked state is changed by clicking on a check box.
    */
  /* CompleteClass */
  var CheckedChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientTreeViewNodeProcessingModeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  
  /**
    * Collapses all nodes in the ASPxTreeView on the client side.
    */
  /* CompleteClass */
  override def CollapseAll(): Unit = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  var EndCallback: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientEndCallbackEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  
  /**
    * Expands all nodes in the ASPxTreeView on the client side.
    */
  /* CompleteClass */
  override def ExpandAll(): Unit = js.native
  
  /**
    * Fires on the client side after a node's expansion state has been changed by end-user interaction.
    */
  /* CompleteClass */
  var ExpandedChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientTreeViewNodeEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  
  /**
    * Fires on the client side before the expansion state of a node is changed via end-user interaction.
    */
  /* CompleteClass */
  var ExpandedChanging: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientTreeViewNodeCancelEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTreeView]
  ] = js.native
  
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
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): Any = js.native
  
  /**
    * Returns a node specified by its index within the ASPxTreeView's node collection. An ASPxClientTreeViewNode object, representing the node located at the specified index within the ASPxTreeView's node collection.
    * @param index An integer value specifying the zero-based index of the node to be retrieved.
    */
  /* CompleteClass */
  override def GetNode(index: Double): typingsJapgolly.devexpressWeb.ASPxClientTreeViewNode = js.native
  
  /**
    * Returns a node specified by its name. An ASPxClientTreeViewNode object that represents the node with the specified name.
    * @param name A string value specifying the name of the node.
    */
  /* CompleteClass */
  override def GetNodeByName(name: String): typingsJapgolly.devexpressWeb.ASPxClientTreeViewNode = js.native
  
  /**
    * Returns a node specified by its text. An ASPxClientTreeViewNode object that represents the node with the specified node's text content.
    * @param text A string value specifying the text content of the node.
    */
  /* CompleteClass */
  override def GetNodeByText(text: String): typingsJapgolly.devexpressWeb.ASPxClientTreeViewNode = js.native
  
  /**
    * Returns the number of nodes at the ASPxTreeView's zero level.
    */
  /* CompleteClass */
  override def GetNodeCount(): Double = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Gets the root node of the ASPxTreeView object.
    */
  /* CompleteClass */
  override def GetRootNode(): typingsJapgolly.devexpressWeb.ASPxClientTreeViewNode = js.native
  
  /**
    * Returns the selected node within the ASPxTreeView control on the client side.
    */
  /* CompleteClass */
  override def GetSelectedNode(): typingsJapgolly.devexpressWeb.ASPxClientTreeViewNode = js.native
  
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
    * Fires on the client side after a node has been clicked.
    */
  /* CompleteClass */
  var NodeClick: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientTreeViewNodeClickEventHandler[typingsJapgolly.devexpressWeb.ASPxClientTreeView]
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
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Selects the specified node within the ASPxTreeView control on the client side.
    * @param node An ASPxClientTreeViewNode object specifying the node to select.
    */
  /* CompleteClass */
  override def SetSelectedNode(node: typingsJapgolly.devexpressWeb.ASPxClientTreeViewNode): Unit = js.native
  
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
object MVCxClientTreeView {
  
  @JSGlobal("MVCxClientTreeView")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the specified object to the MVCxClientTreeView type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  /* static member */
  inline def Cast(obj: Any): typingsJapgolly.devexpressWeb.MVCxClientTreeView = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.devexpressWeb.MVCxClientTreeView]
}
