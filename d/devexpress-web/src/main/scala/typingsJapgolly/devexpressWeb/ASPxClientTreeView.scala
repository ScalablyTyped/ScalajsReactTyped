package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxTreeView object.
  */
trait ASPxClientTreeView
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeView]]
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientTreeView.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]]
  
  /**
    * Occurs on the client side when the node's checked state is changed by clicking on a check box.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]]
  
  /**
    * Collapses all nodes in the ASPxTreeView on the client side.
    */
  def CollapseAll(): Unit
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]]
  
  /**
    * Expands all nodes in the ASPxTreeView on the client side.
    */
  def ExpandAll(): Unit
  
  /**
    * Fires on the client side after a node's expansion state has been changed by end-user interaction.
    */
  var ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]]
  
  /**
    * Fires on the client side before the expansion state of a node is changed via end-user interaction.
    */
  var ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]]
  
  /**
    * Returns a node specified by its index within the ASPxTreeView's node collection. An ASPxClientTreeViewNode object, representing the node located at the specified index within the ASPxTreeView's node collection.
    * @param index An integer value specifying the zero-based index of the node to be retrieved.
    */
  def GetNode(index: Double): ASPxClientTreeViewNode
  
  /**
    * Returns a node specified by its name. An ASPxClientTreeViewNode object that represents the node with the specified name.
    * @param name A string value specifying the name of the node.
    */
  def GetNodeByName(name: String): ASPxClientTreeViewNode
  
  /**
    * Returns a node specified by its text. An ASPxClientTreeViewNode object that represents the node with the specified node's text content.
    * @param text A string value specifying the text content of the node.
    */
  def GetNodeByText(text: String): ASPxClientTreeViewNode
  
  /**
    * Returns the number of nodes at the ASPxTreeView's zero level.
    */
  def GetNodeCount(): Double
  
  /**
    * Gets the root node of the ASPxTreeView object.
    */
  def GetRootNode(): ASPxClientTreeViewNode
  
  /**
    * Returns the selected node within the ASPxTreeView control on the client side.
    */
  def GetSelectedNode(): ASPxClientTreeViewNode
  
  /**
    * Fires on the client side after a node has been clicked.
    */
  var NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]]
  
  /**
    * Selects the specified node within the ASPxTreeView control on the client side.
    * @param node An ASPxClientTreeViewNode object specifying the node to select.
    */
  def SetSelectedNode(node: ASPxClientTreeViewNode): Unit
}
object ASPxClientTreeView {
  
  inline def apply(
    AdjustControl: Callback,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeView]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]],
    CheckedChanged: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]],
    CollapseAll: Callback,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]],
    ExpandAll: Callback,
    ExpandedChanged: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]],
    ExpandedChanging: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]],
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetNode: Double => ASPxClientTreeViewNode,
    GetNodeByName: String => ASPxClientTreeViewNode,
    GetNodeByText: String => ASPxClientTreeViewNode,
    GetNodeCount: CallbackTo[Double],
    GetParentControl: CallbackTo[Any],
    GetRootNode: CallbackTo[ASPxClientTreeViewNode],
    GetSelectedNode: CallbackTo[ASPxClientTreeViewNode],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    NodeClick: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetSelectedNode: ASPxClientTreeViewNode => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientTreeView = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CheckedChanged = CheckedChanged.asInstanceOf[js.Any], CollapseAll = CollapseAll.toJsFn, EndCallback = EndCallback.asInstanceOf[js.Any], ExpandAll = ExpandAll.toJsFn, ExpandedChanged = ExpandedChanged.asInstanceOf[js.Any], ExpandedChanging = ExpandedChanging.asInstanceOf[js.Any], GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetNode = js.Any.fromFunction1(GetNode), GetNodeByName = js.Any.fromFunction1(GetNodeByName), GetNodeByText = js.Any.fromFunction1(GetNodeByText), GetNodeCount = GetNodeCount.toJsFn, GetParentControl = GetParentControl.toJsFn, GetRootNode = GetRootNode.toJsFn, GetSelectedNode = GetSelectedNode.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], NodeClick = NodeClick.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetSelectedNode = js.Any.fromFunction1((t0: ASPxClientTreeViewNode) => SetSelectedNode(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeView]
  }
  
  extension [Self <: ASPxClientTreeView](x: Self) {
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setCheckedChanged(value: ASPxClientEvent[ASPxClientTreeViewNodeProcessingModeEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "CheckedChanged", value.asInstanceOf[js.Any])
    
    inline def setCollapseAll(value: Callback): Self = StObject.set(x, "CollapseAll", value.toJsFn)
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setExpandAll(value: Callback): Self = StObject.set(x, "ExpandAll", value.toJsFn)
    
    inline def setExpandedChanged(value: ASPxClientEvent[ASPxClientTreeViewNodeEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "ExpandedChanged", value.asInstanceOf[js.Any])
    
    inline def setExpandedChanging(value: ASPxClientEvent[ASPxClientTreeViewNodeCancelEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "ExpandedChanging", value.asInstanceOf[js.Any])
    
    inline def setGetNode(value: Double => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNode", js.Any.fromFunction1(value))
    
    inline def setGetNodeByName(value: String => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNodeByName", js.Any.fromFunction1(value))
    
    inline def setGetNodeByText(value: String => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNodeByText", js.Any.fromFunction1(value))
    
    inline def setGetNodeCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetNodeCount", value.toJsFn)
    
    inline def setGetRootNode(value: CallbackTo[ASPxClientTreeViewNode]): Self = StObject.set(x, "GetRootNode", value.toJsFn)
    
    inline def setGetSelectedNode(value: CallbackTo[ASPxClientTreeViewNode]): Self = StObject.set(x, "GetSelectedNode", value.toJsFn)
    
    inline def setNodeClick(value: ASPxClientEvent[ASPxClientTreeViewNodeClickEventHandler[ASPxClientTreeView]]): Self = StObject.set(x, "NodeClick", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedNode(value: ASPxClientTreeViewNode => Callback): Self = StObject.set(x, "SetSelectedNode", js.Any.fromFunction1((t0: ASPxClientTreeViewNode) => value(t0).runNow()))
  }
}
