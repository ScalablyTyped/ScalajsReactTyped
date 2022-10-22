package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the TreeView's BootstrapTreeViewNode object.
  */
trait BootstrapClientTreeViewNode
  extends StObject
     with ASPxClientTreeViewNode {
  
  /**
    * Gets the CSS class of the icon displayed within the node badge.
    */
  def GetBadgeIconCssClass(): String
  
  /**
    * Gets the text displayed within the node badge.
    */
  def GetBadgeText(): String
  
  /**
    * Gets the CSS class of the icon displayed by the node.
    */
  def GetIconCssClass(): String
  
  /**
    * Sets the CSS class of the icon displayed within the node badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: String): Unit
  
  /**
    * Sets the text displayed within the node badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: String): Unit
  
  /**
    * Sets the CSS class of the icon displayed by the node.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: String): Unit
  
  /**
    * Gets the current node's parent node.
    */
  @JSName("parent")
  var parent_BootstrapClientTreeViewNode: BootstrapClientTreeViewNode
  
  /**
    * Gets the BootstrapClientTreeView object to which the current node belongs.
    */
  @JSName("treeView")
  var treeView_BootstrapClientTreeViewNode: BootstrapClientTreeView
}
object BootstrapClientTreeViewNode {
  
  inline def apply(
    GetBadgeIconCssClass: CallbackTo[String],
    GetBadgeText: CallbackTo[String],
    GetCheckState: CallbackTo[String],
    GetChecked: CallbackTo[Boolean],
    GetEnabled: CallbackTo[Boolean],
    GetExpanded: CallbackTo[Boolean],
    GetHtmlElement: CallbackTo[Any],
    GetIconCssClass: CallbackTo[String],
    GetImageUrl: CallbackTo[String],
    GetNavigateUrl: CallbackTo[String],
    GetNode: Double => ASPxClientTreeViewNode,
    GetNodeByName: String => ASPxClientTreeViewNode,
    GetNodeByText: String => ASPxClientTreeViewNode,
    GetNodeCount: CallbackTo[Double],
    GetText: CallbackTo[String],
    GetVisible: CallbackTo[Boolean],
    SetBadgeIconCssClass: String => Callback,
    SetBadgeText: String => Callback,
    SetChecked: Boolean => Callback,
    SetEnabled: Boolean => Callback,
    SetExpanded: Boolean => Callback,
    SetIconCssClass: String => Callback,
    SetImageUrl: String => Callback,
    SetNavigateUrl: String => Callback,
    SetText: String => Callback,
    SetVisible: Boolean => Callback,
    index: Double,
    name: String,
    parent: BootstrapClientTreeViewNode,
    treeView: BootstrapClientTreeView
  ): BootstrapClientTreeViewNode = {
    val __obj = js.Dynamic.literal(GetBadgeIconCssClass = GetBadgeIconCssClass.toJsFn, GetBadgeText = GetBadgeText.toJsFn, GetCheckState = GetCheckState.toJsFn, GetChecked = GetChecked.toJsFn, GetEnabled = GetEnabled.toJsFn, GetExpanded = GetExpanded.toJsFn, GetHtmlElement = GetHtmlElement.toJsFn, GetIconCssClass = GetIconCssClass.toJsFn, GetImageUrl = GetImageUrl.toJsFn, GetNavigateUrl = GetNavigateUrl.toJsFn, GetNode = js.Any.fromFunction1(GetNode), GetNodeByName = js.Any.fromFunction1(GetNodeByName), GetNodeByText = js.Any.fromFunction1(GetNodeByText), GetNodeCount = GetNodeCount.toJsFn, GetText = GetText.toJsFn, GetVisible = GetVisible.toJsFn, SetBadgeIconCssClass = js.Any.fromFunction1((t0: String) => SetBadgeIconCssClass(t0).runNow()), SetBadgeText = js.Any.fromFunction1((t0: String) => SetBadgeText(t0).runNow()), SetChecked = js.Any.fromFunction1((t0: Boolean) => SetChecked(t0).runNow()), SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetExpanded = js.Any.fromFunction1((t0: Boolean) => SetExpanded(t0).runNow()), SetIconCssClass = js.Any.fromFunction1((t0: String) => SetIconCssClass(t0).runNow()), SetImageUrl = js.Any.fromFunction1((t0: String) => SetImageUrl(t0).runNow()), SetNavigateUrl = js.Any.fromFunction1((t0: String) => SetNavigateUrl(t0).runNow()), SetText = js.Any.fromFunction1((t0: String) => SetText(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], treeView = treeView.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientTreeViewNode]
  }
  
  extension [Self <: BootstrapClientTreeViewNode](x: Self) {
    
    inline def setGetBadgeIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeIconCssClass", value.toJsFn)
    
    inline def setGetBadgeText(value: CallbackTo[String]): Self = StObject.set(x, "GetBadgeText", value.toJsFn)
    
    inline def setGetIconCssClass(value: CallbackTo[String]): Self = StObject.set(x, "GetIconCssClass", value.toJsFn)
    
    inline def setParent(value: BootstrapClientTreeViewNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSetBadgeIconCssClass(value: String => Callback): Self = StObject.set(x, "SetBadgeIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBadgeText(value: String => Callback): Self = StObject.set(x, "SetBadgeText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetIconCssClass(value: String => Callback): Self = StObject.set(x, "SetIconCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTreeView(value: BootstrapClientTreeView): Self = StObject.set(x, "treeView", value.asInstanceOf[js.Any])
  }
}
