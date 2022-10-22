package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.tree.IPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INodeInterface
  extends StObject
     with IBase {
  
  /** [Config Option] (Boolean) */
  var allowDrag: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var allowDrop: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Inserts node s as the last child node of this node
    * @param node Ext.data.NodeInterface/Ext.data.NodeInterface[]/Object The node or Array of nodes to append
    * @param suppressEvents Boolean True to suppress firering of events.
    * @param commit Boolean
    * @returns Ext.data.NodeInterface The appended node if single append, or null if an array was passed
    */
  var appendChild: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[Any], 
      /* suppressEvents */ js.UndefOr[Boolean], 
      /* commit */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  
  /** [Method] Bubbles up the tree from this node calling the specified function with each node
    * @param fn Function The function to call
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
    * @param args Array The args to call the function with. Defaults to passing the current Node.
    */
  var bubble: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Cascades down the tree from this node calling the specified function with each node
    * @param fn Function The function to call
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
    * @param args Array The args to call the function with. Defaults to passing the current Node.
    */
  var cascadeBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Ext.data.NodeInterface[]) */
  var childNodes: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (Ext.data.NodeInterface[]) */
  var children: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String) */
  var cls: js.UndefOr[String] = js.undefined
  
  /** [Method] Collapse this node
    * @param recursive Boolean True to recursively collapse all the children
    * @param callback Function The function to execute once the collapse completes
    * @param scope Object The scope to run the callback in
    */
  var collapse: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Collapse all the children of this node
    * @param recursive Function True to recursively collapse all the children
    * @param callback Function The function to execute once all the children are collapsed
    * @param scope Object The scope to run the callback in
    */
  var collapseChildren: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[Any], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Returns true if this node is an ancestor at any point of the passed node
    * @param node Ext.data.NodeInterface
    * @returns Boolean
    */
  var contains: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Boolean]] = js.undefined
  
  /** [Method] Creates a copy clone of this Node
    * @param id String A new id, defaults to this Node's id.
    * @param deep Boolean True to recursively copy all child Nodes into the new Node. False to copy without child Nodes.
    * @returns Ext.data.NodeInterface A copy of this Node.
    */
  var copy: js.UndefOr[
    js.Function2[/* id */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  
  /** [Method] Ensures that the passed object is an instance of a Record with the NodeInterface applied
    * @param node Object
    * @returns Ext.data.NodeInterface
    */
  var createNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Config Option] (Number) */
  var depth: js.UndefOr[Double] = js.undefined
  
  /** [Method] Destroys the node
    * @param silent Object
    */
  var destroy: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Interates the child nodes of this node calling the specified function with each node
    * @param fn Function The function to call
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node in iteration.
    * @param args Array The args to call the function with. Defaults to passing the current Node.
    */
  var eachChild: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Expand this node
    * @param recursive Boolean True to recursively expand all the children
    * @param callback Function The function to execute once the expand completes
    * @param scope Object The scope to run the callback in
    */
  var expand: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Expand all the children of this node
    * @param recursive Boolean True to recursively expand all the children
    * @param callback Function The function to execute once all the children are expanded
    * @param scope Object The scope to run the callback in
    */
  var expandChildren: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var expandable: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Finds the first child that has the attribute with the specified value
    * @param attribute String The attribute name
    * @param value Object The value to search for
    * @param deep Boolean True to search through nodes deeper than the immediate children
    * @returns Ext.data.NodeInterface The found child or null if none was found
    */
  var findChild: js.UndefOr[
    js.Function3[
      /* attribute */ js.UndefOr[String], 
      /* value */ js.UndefOr[Any], 
      /* deep */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  
  /** [Method] Finds the first child by a custom function
    * @param fn Function A function which must return true if the passed Node is the required Node.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Node being tested.
    * @param deep Boolean True to search through nodes deeper than the immediate children
    * @returns Ext.data.NodeInterface The found child or null if none was found
    */
  var findChildBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* deep */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  
  /** [Property] (Ext.data.NodeInterface) */
  var firstChild: js.UndefOr[INodeInterface] = js.undefined
  
  /** [Method] Returns the child node at the specified index
    * @param index Number
    * @returns Ext.data.NodeInterface
    */
  var getChildAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.undefined
  
  /** [Method] Returns depth of this node the root node has a depth of 0
    * @returns Number
    */
  var getDepth: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the tree this node is in
    * @returns Ext.tree.Panel The tree panel which owns this node.
    */
  var getOwnerTree: js.UndefOr[js.Function0[IPanel]] = js.undefined
  
  /** [Method] Gets the hierarchical path from the root of the current node
    * @param field String The field to construct the path from. Defaults to the model idProperty.
    * @param separator String A separator to use.
    * @returns String The node path
    */
  var getPath: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String], String]
  ] = js.undefined
  
  /** [Method] Returns true if this node has one or more child nodes else false
    * @returns Boolean
    */
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (String) */
  var href: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var index: js.UndefOr[Double] = js.undefined
  
  /** [Method] Returns the index of a child node
    * @param node Ext.data.NodeInterface
    * @returns Number The index of the node or -1 if it was not found
    */
  var indexOf: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Double]] = js.undefined
  
  /** [Method] Returns the index of a child node that matches the id
    * @param id String The id of the node to find
    * @returns Number The index of the node or -1 if it was not found
    */
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Double]] = js.undefined
  
  /** [Method] Inserts the first node before the second node in this nodes childNodes collection
    * @param node Ext.data.NodeInterface The node to insert
    * @param refNode Ext.data.NodeInterface The node to insert before (if null the node is appended)
    * @returns Ext.data.NodeInterface The inserted node
    */
  var insertBefore: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* refNode */ js.UndefOr[this.type], this.type]
  ] = js.undefined
  
  /** [Method] Inserts a node into this node
    * @param index Number The zero-based index to insert the node at
    * @param node Ext.data.NodeInterface The node to insert
    * @returns Ext.data.NodeInterface The node you just inserted
    */
  var insertChild: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* node */ js.UndefOr[this.type], this.type]
  ] = js.undefined
  
  /** [Method] Returns true if the passed node is an ancestor at any point of this node
    * @param node Ext.data.NodeInterface
    * @returns Boolean
    */
  var isAncestor: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Boolean]] = js.undefined
  
  /** [Method] Returns true if this node has one or more child nodes or if the expandable node attribute is explicitly specified as
    * @returns Boolean
    */
  var isExpandable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns true if this node is expaned
    * @returns Boolean
    */
  var isExpanded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var isFirst: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var isLast: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns true if this node is a leaf
    * @returns Boolean
    */
  var isLeaf: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns true if this node is loaded
    * @returns Boolean
    */
  var isLoaded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns true if this node is loading
    * @returns Boolean
    */
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Property] (Boolean) */
  var isNode: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns true if this node is the root node
    * @returns Boolean
    */
  var isRoot: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns true if this node is visible
    * @returns Boolean
    */
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Property] (Ext.data.NodeInterface) */
  var lastChild: js.UndefOr[INodeInterface] = js.undefined
  
  /** [Config Option] (Boolean) */
  var leaf: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var loading: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Ext.data.NodeInterface) */
  var nextSibling: js.UndefOr[INodeInterface] = js.undefined
  
  /** [Config Option] (String) */
  var parentId: js.UndefOr[String] = js.undefined
  
  /** [Property] (Ext.data.NodeInterface) */
  var parentNode: js.UndefOr[INodeInterface] = js.undefined
  
  /** [Property] (Ext.data.NodeInterface) */
  var previousSibling: js.UndefOr[INodeInterface] = js.undefined
  
  /** [Config Option] (Number) */
  var qshowDelay: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var qtip: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var qtitle: js.UndefOr[String] = js.undefined
  
  /** [Method] Removes this node from its parent
    * @param destroy Boolean True to destroy the node upon removal.
    * @returns Ext.data.NodeInterface this
    */
  var remove: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], this.type]] = js.undefined
  
  /** [Method] Removes all child nodes from this node
    * @param destroy Boolean True to destroy the node upon removal.
    * @returns Ext.data.NodeInterface this
    */
  var removeAll: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], this.type]] = js.undefined
  
  /** [Method] Removes a child node from this node
    * @param node Ext.data.NodeInterface The node to remove
    * @param destroy Boolean True to destroy the node upon removal.
    * @returns Ext.data.NodeInterface The removed node
    */
  var removeChild: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* destroy */ js.UndefOr[Boolean], this.type]
  ] = js.undefined
  
  /** [Method] Replaces one child node in this node with another
    * @param newChild Ext.data.NodeInterface The replacement node
    * @param oldChild Ext.data.NodeInterface The node to replace
    * @returns Ext.data.NodeInterface The replaced node
    */
  var replaceChild: js.UndefOr[
    js.Function2[
      /* newChild */ js.UndefOr[this.type], 
      /* oldChild */ js.UndefOr[this.type], 
      this.type
    ]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var root: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Creates an object representation of this node including its children  */
  var serialize: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sorts this nodes children using the supplied sort function
    * @param fn Function A function which, when passed two Nodes, returns -1, 0 or 1 depending upon required sort order.
    * @param recursive Boolean True to apply this sort recursively
    * @param suppressEvent Boolean True to not fire a sort event.
    */
  var sort: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[Any], 
      /* recursive */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.undefined
  
  /** [Method] Updates general data of this node like isFirst isLast depth
    * @param commit Boolean
    * @param info Object The info to update. May contain any of the following
    */
  var updateInfo: js.UndefOr[js.Function2[/* commit */ js.UndefOr[Boolean], /* info */ js.UndefOr[Any], Unit]] = js.undefined
}
object INodeInterface {
  
  inline def apply(): INodeInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeInterface]
  }
  
  extension [Self <: INodeInterface](x: Self) {
    
    inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
    
    inline def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
    
    inline def setAllowDrop(value: Boolean): Self = StObject.set(x, "allowDrop", value.asInstanceOf[js.Any])
    
    inline def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
    
    inline def setAppendChild(
      value: (/* node */ js.UndefOr[Any], /* suppressEvents */ js.UndefOr[Boolean], /* commit */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = StObject.set(x, "appendChild", js.Any.fromFunction3(value))
    
    inline def setAppendChildUndefined: Self = StObject.set(x, "appendChild", js.undefined)
    
    inline def setBubble(
      value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* args */ js.UndefOr[Array]) => Callback
    ): Self = StObject.set(x, "bubble", js.Any.fromFunction3((t0: /* fn */ js.UndefOr[Any], t1: /* scope */ js.UndefOr[Any], t2: /* args */ js.UndefOr[Array]) => (value(t0, t1, t2)).runNow()))
    
    inline def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
    
    inline def setCascadeBy(
      value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* args */ js.UndefOr[Array]) => Callback
    ): Self = StObject.set(x, "cascadeBy", js.Any.fromFunction3((t0: /* fn */ js.UndefOr[Any], t1: /* scope */ js.UndefOr[Any], t2: /* args */ js.UndefOr[Array]) => (value(t0, t1, t2)).runNow()))
    
    inline def setCascadeByUndefined: Self = StObject.set(x, "cascadeBy", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setChildNodes(value: Array): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setChildNodesUndefined: Self = StObject.set(x, "childNodes", js.undefined)
    
    inline def setChildren(value: Array): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    inline def setCollapse(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "collapse", js.Any.fromFunction3((t0: /* recursive */ js.UndefOr[Boolean], t1: /* callback */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setCollapseChildren(
      value: (/* recursive */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "collapseChildren", js.Any.fromFunction3((t0: /* recursive */ js.UndefOr[Any], t1: /* callback */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setCollapseChildrenUndefined: Self = StObject.set(x, "collapseChildren", js.undefined)
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setContains(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setCopy(value: (/* id */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean]) => INodeInterface): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCreateNode(value: /* node */ js.UndefOr[Any] => INodeInterface): Self = StObject.set(x, "createNode", js.Any.fromFunction1(value))
    
    inline def setCreateNodeUndefined: Self = StObject.set(x, "createNode", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setDestroy(value: /* silent */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction1((t0: /* silent */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setEachChild(
      value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* args */ js.UndefOr[Array]) => Callback
    ): Self = StObject.set(x, "eachChild", js.Any.fromFunction3((t0: /* fn */ js.UndefOr[Any], t1: /* scope */ js.UndefOr[Any], t2: /* args */ js.UndefOr[Array]) => (value(t0, t1, t2)).runNow()))
    
    inline def setEachChildUndefined: Self = StObject.set(x, "eachChild", js.undefined)
    
    inline def setExpand(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "expand", js.Any.fromFunction3((t0: /* recursive */ js.UndefOr[Boolean], t1: /* callback */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExpandChildren(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "expandChildren", js.Any.fromFunction3((t0: /* recursive */ js.UndefOr[Boolean], t1: /* callback */ js.UndefOr[Any], t2: /* scope */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setExpandChildrenUndefined: Self = StObject.set(x, "expandChildren", js.undefined)
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setFindChild(
      value: (/* attribute */ js.UndefOr[String], /* value */ js.UndefOr[Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = StObject.set(x, "findChild", js.Any.fromFunction3(value))
    
    inline def setFindChildBy(
      value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = StObject.set(x, "findChildBy", js.Any.fromFunction3(value))
    
    inline def setFindChildByUndefined: Self = StObject.set(x, "findChildBy", js.undefined)
    
    inline def setFindChildUndefined: Self = StObject.set(x, "findChild", js.undefined)
    
    inline def setFirstChild(value: INodeInterface): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    inline def setFirstChildUndefined: Self = StObject.set(x, "firstChild", js.undefined)
    
    inline def setGetChildAt(value: /* index */ js.UndefOr[Double] => INodeInterface): Self = StObject.set(x, "getChildAt", js.Any.fromFunction1(value))
    
    inline def setGetChildAtUndefined: Self = StObject.set(x, "getChildAt", js.undefined)
    
    inline def setGetDepth(value: CallbackTo[Double]): Self = StObject.set(x, "getDepth", value.toJsFn)
    
    inline def setGetDepthUndefined: Self = StObject.set(x, "getDepth", js.undefined)
    
    inline def setGetOwnerTree(value: CallbackTo[IPanel]): Self = StObject.set(x, "getOwnerTree", value.toJsFn)
    
    inline def setGetOwnerTreeUndefined: Self = StObject.set(x, "getOwnerTree", js.undefined)
    
    inline def setGetPath(value: (/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String]) => String): Self = StObject.set(x, "getPath", js.Any.fromFunction2(value))
    
    inline def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
    
    inline def setHasChildNodes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChildNodes", value.toJsFn)
    
    inline def setHasChildNodesUndefined: Self = StObject.set(x, "hasChildNodes", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefTarget(value: String): Self = StObject.set(x, "hrefTarget", value.asInstanceOf[js.Any])
    
    inline def setHrefTargetUndefined: Self = StObject.set(x, "hrefTarget", js.undefined)
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconCls(value: String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
    
    inline def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexOf(value: /* node */ js.UndefOr[INodeInterface] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setIndexOfId(value: /* id */ js.UndefOr[String] => Double): Self = StObject.set(x, "indexOfId", js.Any.fromFunction1(value))
    
    inline def setIndexOfIdUndefined: Self = StObject.set(x, "indexOfId", js.undefined)
    
    inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setInsertBefore(
      value: (/* node */ js.UndefOr[INodeInterface], /* refNode */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = StObject.set(x, "insertBefore", js.Any.fromFunction2(value))
    
    inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
    
    inline def setInsertChild(value: (/* index */ js.UndefOr[Double], /* node */ js.UndefOr[INodeInterface]) => INodeInterface): Self = StObject.set(x, "insertChild", js.Any.fromFunction2(value))
    
    inline def setInsertChildUndefined: Self = StObject.set(x, "insertChild", js.undefined)
    
    inline def setIsAncestor(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = StObject.set(x, "isAncestor", js.Any.fromFunction1(value))
    
    inline def setIsAncestorUndefined: Self = StObject.set(x, "isAncestor", js.undefined)
    
    inline def setIsExpandable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isExpandable", value.toJsFn)
    
    inline def setIsExpandableUndefined: Self = StObject.set(x, "isExpandable", js.undefined)
    
    inline def setIsExpanded(value: CallbackTo[Boolean]): Self = StObject.set(x, "isExpanded", value.toJsFn)
    
    inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    inline def setIsFirst(value: Boolean): Self = StObject.set(x, "isFirst", value.asInstanceOf[js.Any])
    
    inline def setIsFirstUndefined: Self = StObject.set(x, "isFirst", js.undefined)
    
    inline def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
    
    inline def setIsLastUndefined: Self = StObject.set(x, "isLast", js.undefined)
    
    inline def setIsLeaf(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLeaf", value.toJsFn)
    
    inline def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
    
    inline def setIsLoaded(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoaded", value.toJsFn)
    
    inline def setIsLoadedUndefined: Self = StObject.set(x, "isLoaded", js.undefined)
    
    inline def setIsLoading(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoading", value.toJsFn)
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setIsNode(value: Boolean): Self = StObject.set(x, "isNode", value.asInstanceOf[js.Any])
    
    inline def setIsNodeUndefined: Self = StObject.set(x, "isNode", js.undefined)
    
    inline def setIsRoot(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRoot", value.toJsFn)
    
    inline def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setLastChild(value: INodeInterface): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    inline def setLastChildUndefined: Self = StObject.set(x, "lastChild", js.undefined)
    
    inline def setLeaf(value: Boolean): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
    
    inline def setLeafUndefined: Self = StObject.set(x, "leaf", js.undefined)
    
    inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setNextSibling(value: INodeInterface): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    inline def setNextSiblingUndefined: Self = StObject.set(x, "nextSibling", js.undefined)
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setParentNode(value: INodeInterface): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    inline def setPreviousSibling(value: INodeInterface): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    inline def setPreviousSiblingUndefined: Self = StObject.set(x, "previousSibling", js.undefined)
    
    inline def setQshowDelay(value: Double): Self = StObject.set(x, "qshowDelay", value.asInstanceOf[js.Any])
    
    inline def setQshowDelayUndefined: Self = StObject.set(x, "qshowDelay", js.undefined)
    
    inline def setQtip(value: String): Self = StObject.set(x, "qtip", value.asInstanceOf[js.Any])
    
    inline def setQtipUndefined: Self = StObject.set(x, "qtip", js.undefined)
    
    inline def setQtitle(value: String): Self = StObject.set(x, "qtitle", value.asInstanceOf[js.Any])
    
    inline def setQtitleUndefined: Self = StObject.set(x, "qtitle", js.undefined)
    
    inline def setRemove(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveAll(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
    
    inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    inline def setRemoveChild(
      value: (/* node */ js.UndefOr[INodeInterface], /* destroy */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = StObject.set(x, "removeChild", js.Any.fromFunction2(value))
    
    inline def setRemoveChildUndefined: Self = StObject.set(x, "removeChild", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setReplaceChild(
      value: (/* newChild */ js.UndefOr[INodeInterface], /* oldChild */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
    
    inline def setReplaceChildUndefined: Self = StObject.set(x, "replaceChild", js.undefined)
    
    inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSerialize(value: Callback): Self = StObject.set(x, "serialize", value.toJsFn)
    
    inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    
    inline def setSort(
      value: (/* fn */ js.UndefOr[Any], /* recursive */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Callback
    ): Self = StObject.set(x, "sort", js.Any.fromFunction3((t0: /* fn */ js.UndefOr[Any], t1: /* recursive */ js.UndefOr[Boolean], t2: /* suppressEvent */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUpdateInfo(value: (/* commit */ js.UndefOr[Boolean], /* info */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "updateInfo", js.Any.fromFunction2((t0: /* commit */ js.UndefOr[Boolean], t1: /* info */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setUpdateInfoUndefined: Self = StObject.set(x, "updateInfo", js.undefined)
  }
}
