package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxTreeView's TreeViewNode object.
  */
trait ASPxClientTreeViewNode extends StObject {
  
  /**
    * Returns a value which specifies the node's check state.
    */
  def GetCheckState(): String
  
  /**
    * Returns a value indicating whether the node is checked.
    */
  def GetChecked(): Boolean
  
  /**
    * Returns a value specifying whether the node is enabled.
    */
  def GetEnabled(): Boolean
  
  /**
    * Returns a value indicating whether the node is expanded.
    */
  def GetExpanded(): Boolean
  
  /**
    * Gets the HTML object that contains the current node.
    */
  def GetHtmlElement(): Any
  
  /**
    * Returns the URL pointing to the image displayed within the node.
    */
  def GetImageUrl(): String
  
  /**
    * Gets an URL which defines the navigation location for the node's hyperlink.
    */
  def GetNavigateUrl(): String
  
  /**
    * Returns the current node's immediate child node specified by its index. An ASPxClientTreeViewNode object representing the node located at the specified index within the current node collection.
    * @param index An integer value specifying the zero-based index of the node to be retrieved.
    */
  def GetNode(index: Double): ASPxClientTreeViewNode
  
  /**
    * Returns the current node's child node specified by its name. An ASPxClientTreeViewNode object that represents the current node's child with the specified name.
    * @param name A string value specifying the name of the node.
    */
  def GetNodeByName(name: String): ASPxClientTreeViewNode
  
  /**
    * Returns the current node's child node specified by its text. An ASPxClientTreeViewNode object that represents the current node's child with the specified node's text content.
    * @param text A string value specifying the text content of the node.
    */
  def GetNodeByText(text: String): ASPxClientTreeViewNode
  
  /**
    * Returns the number of the current node's immediate child nodes.
    */
  def GetNodeCount(): Double
  
  /**
    * Gets the text, displayed within the node.
    */
  def GetText(): String
  
  /**
    * Returns a value specifying whether a node is displayed.
    */
  def GetVisible(): Boolean
  
  /**
    * Sets a value indicating whether the node is checked.
    * @param value true if the node is checked; otherwise, false.
    */
  def SetChecked(value: Boolean): Unit
  
  /**
    * Sets a value specifying whether the node is enabled.
    * @param value true to make the node enabled; false to disable it.
    */
  def SetEnabled(value: Boolean): Unit
  
  /**
    * Sets a value which specifies the node's expansion state.
    * @param value true if the node is expanded; otherwise, false.
    */
  def SetExpanded(value: Boolean): Unit
  
  /**
    * Sets the URL which points to the image displayed within the node.
    * @param value A string value specifying the URL to the image displayed within the node.
    */
  def SetImageUrl(value: String): Unit
  
  /**
    * Specifies a URL which defines the node's navigate URL.
    * @param value A string value which specifies a URL to where the client web browser will navigate when the node is clicked.
    */
  def SetNavigateUrl(value: String): Unit
  
  /**
    * Specifies the text, displayed within the node.
    * @param value A string value that represents the text displayed within the node.
    */
  def SetText(value: String): Unit
  
  /**
    * Specifies whether the node is visible.
    * @param value true if the node is visible; otherwise, false.
    */
  def SetVisible(value: Boolean): Unit
  
  /**
    * Gets the node's index within the parent's collection of nodes.
    */
  var index: Double
  
  /**
    * Gets the name that uniquely identifies the node.
    */
  var name: String
  
  /**
    * Gets the current node's parent node.
    */
  var parent: ASPxClientTreeViewNode
  
  /**
    * Gets the client representation of the ASPxTreeView control to which the current node belongs.
    */
  var treeView: ASPxClientTreeView
}
object ASPxClientTreeViewNode {
  
  inline def apply(
    GetCheckState: CallbackTo[String],
    GetChecked: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetExpanded: CallbackTo[Boolean],
    GetHtmlElement: CallbackTo[Any],
    GetImageUrl: CallbackTo[String],
    GetNavigateUrl: CallbackTo[String],
    GetNode: Double => ASPxClientTreeViewNode,
    GetNodeByName: String => ASPxClientTreeViewNode,
    GetNodeByText: String => ASPxClientTreeViewNode,
    GetNodeCount: CallbackTo[Double],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetChecked: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetExpanded: Boolean => Callback,
    SetImageUrl: String => Callback,
    SetNavigateUrl: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback,
    index: Double,
    name: String,
    parent: ASPxClientTreeViewNode,
    treeView: ASPxClientTreeView
  ): ASPxClientTreeViewNode = {
    val __obj = js.Dynamic.literal(GetCheckState = GetCheckState.toJsFn, GetChecked = GetChecked.toJsFn, GetEnabled = GetEnabled.toJsFn, GetExpanded = GetExpanded.toJsFn, GetHtmlElement = GetHtmlElement.toJsFn, GetImageUrl = GetImageUrl.toJsFn, GetNavigateUrl = GetNavigateUrl.toJsFn, GetNode = js.Any.fromFunction1(GetNode), GetNodeByName = js.Any.fromFunction1(GetNodeByName), GetNodeByText = js.Any.fromFunction1(GetNodeByText), GetNodeCount = GetNodeCount.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetChecked = js.Any.fromFunction1((t0: Boolean) => SetChecked(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetExpanded = js.Any.fromFunction1((t0: Boolean) => SetExpanded(t0).runNow()), SetImageUrl = js.Any.fromFunction1((t0: String) => SetImageUrl(t0).runNow()), SetNavigateUrl = js.Any.fromFunction1((t0: String) => SetNavigateUrl(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], treeView = treeView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeViewNode]
  }
  
  extension [Self <: ASPxClientTreeViewNode](x: Self) {
    
    inline def setGetCheckState(value: CallbackTo[String]): Self = StObject.set(x, "GetCheckState", value.toJsFn)
    
    inline def setGetChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetChecked", value.toJsFn)
    
    inline def setGetEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetEnabled", value.toJsFn)
    
    inline def setGetExpanded(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetExpanded", value.toJsFn)
    
    inline def setGetHtmlElement(value: CallbackTo[Any]): Self = StObject.set(x, "GetHtmlElement", value.toJsFn)
    
    inline def setGetImageUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetImageUrl", value.toJsFn)
    
    inline def setGetNavigateUrl(value: CallbackTo[String]): Self = StObject.set(x, "GetNavigateUrl", value.toJsFn)
    
    inline def setGetNode(value: Double => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNode", js.Any.fromFunction1(value))
    
    inline def setGetNodeByName(value: String => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNodeByName", js.Any.fromFunction1(value))
    
    inline def setGetNodeByText(value: String => ASPxClientTreeViewNode): Self = StObject.set(x, "GetNodeByText", js.Any.fromFunction1(value))
    
    inline def setGetNodeCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetNodeCount", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "GetText", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "GetVisible", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ASPxClientTreeViewNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSetChecked(value: Boolean => Callback): Self = StObject.set(x, "SetChecked", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetExpanded(value: Boolean => Callback): Self = StObject.set(x, "SetExpanded", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetImageUrl(value: String => Callback): Self = StObject.set(x, "SetImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetNavigateUrl(value: String => Callback): Self = StObject.set(x, "SetNavigateUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "SetText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "SetVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setTreeView(value: ASPxClientTreeView): Self = StObject.set(x, "treeView", value.asInstanceOf[js.Any])
  }
}
