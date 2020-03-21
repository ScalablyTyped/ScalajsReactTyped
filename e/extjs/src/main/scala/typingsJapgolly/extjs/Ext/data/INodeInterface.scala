package typingsJapgolly.extjs.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IBase
import typingsJapgolly.extjs.Ext.IClass
import typingsJapgolly.extjs.Ext.tree.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeInterface extends IBase {
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
      /* node */ js.UndefOr[js.Any], 
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
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
      /* recursive */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
  var createNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Number) */
  var depth: js.UndefOr[Double] = js.undefined
  /** [Method] Destroys the node
  		* @param silent Object
  		*/
  var destroy: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Interates the child nodes of this node calling the specified function with each node
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node in iteration.
  		* @param args Array The args to call the function with. Defaults to passing the current Node.
  		*/
  var eachChild: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
      /* value */ js.UndefOr[js.Any], 
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
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
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
      /* fn */ js.UndefOr[js.Any], 
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
  var updateInfo: js.UndefOr[
    js.Function2[/* commit */ js.UndefOr[Boolean], /* info */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object INodeInterface {
  @scala.inline
  def apply(
    alias: Array = null,
    allowDrag: js.UndefOr[Boolean] = js.undefined,
    allowDrop: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    appendChild: (/* node */ js.UndefOr[js.Any], /* suppressEvents */ js.UndefOr[Boolean], /* commit */ js.UndefOr[Boolean]) => CallbackTo[INodeInterface] = null,
    bubble: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Callback = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    cascadeBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Callback = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    childNodes: Array = null,
    children: Array = null,
    cls: String = null,
    collapse: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    collapseChildren: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    config: js.Any = null,
    contains: /* node */ js.UndefOr[INodeInterface] => CallbackTo[Boolean] = null,
    copy: (/* id */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean]) => CallbackTo[INodeInterface] = null,
    createNode: /* node */ js.UndefOr[js.Any] => CallbackTo[INodeInterface] = null,
    depth: Int | Double = null,
    destroy: /* silent */ js.UndefOr[js.Any] => Callback = null,
    eachChild: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Callback = null,
    expand: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    expandChildren: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    findChild: (/* attribute */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => CallbackTo[INodeInterface] = null,
    findChildBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => CallbackTo[INodeInterface] = null,
    firstChild: INodeInterface = null,
    getChildAt: /* index */ js.UndefOr[Double] => CallbackTo[INodeInterface] = null,
    getDepth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getOwnerTree: js.UndefOr[CallbackTo[IPanel]] = js.undefined,
    getPath: (/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String]) => CallbackTo[String] = null,
    hasChildNodes: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    href: String = null,
    hrefTarget: String = null,
    icon: String = null,
    iconCls: String = null,
    index: Int | Double = null,
    indexOf: /* node */ js.UndefOr[INodeInterface] => CallbackTo[Double] = null,
    indexOfId: /* id */ js.UndefOr[String] => CallbackTo[Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => CallbackTo[INodeInterface] = null,
    insertBefore: (/* node */ js.UndefOr[INodeInterface], /* refNode */ js.UndefOr[INodeInterface]) => CallbackTo[INodeInterface] = null,
    insertChild: (/* index */ js.UndefOr[Double], /* node */ js.UndefOr[INodeInterface]) => CallbackTo[INodeInterface] = null,
    isAncestor: /* node */ js.UndefOr[INodeInterface] => CallbackTo[Boolean] = null,
    isExpandable: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isExpanded: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isFirst: js.UndefOr[Boolean] = js.undefined,
    isLast: js.UndefOr[Boolean] = js.undefined,
    isLeaf: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isLoaded: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isLoading: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isNode: js.UndefOr[Boolean] = js.undefined,
    isRoot: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isVisible: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    lastChild: INodeInterface = null,
    leaf: js.UndefOr[Boolean] = js.undefined,
    loaded: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    nextSibling: INodeInterface = null,
    parentId: String = null,
    parentNode: INodeInterface = null,
    previousSibling: INodeInterface = null,
    qshowDelay: Int | Double = null,
    qtip: String = null,
    qtitle: String = null,
    remove: /* destroy */ js.UndefOr[Boolean] => CallbackTo[INodeInterface] = null,
    removeAll: /* destroy */ js.UndefOr[Boolean] => CallbackTo[INodeInterface] = null,
    removeChild: (/* node */ js.UndefOr[INodeInterface], /* destroy */ js.UndefOr[Boolean]) => CallbackTo[INodeInterface] = null,
    replaceChild: (/* newChild */ js.UndefOr[INodeInterface], /* oldChild */ js.UndefOr[INodeInterface]) => CallbackTo[INodeInterface] = null,
    requires: Array = null,
    root: js.UndefOr[Boolean] = js.undefined,
    self: IClass = null,
    serialize: js.UndefOr[Callback] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (/* fn */ js.UndefOr[js.Any], /* recursive */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Callback = null,
    statics: js.Any = null,
    text: String = null,
    updateInfo: (/* commit */ js.UndefOr[Boolean], /* info */ js.UndefOr[js.Any]) => Callback = null,
    uses: Array = null
  ): INodeInterface = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDrop)) __obj.updateDynamic("allowDrop")(allowDrop.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction3((t0: /* node */ js.UndefOr[js.Any], t1: /* suppressEvents */ js.UndefOr[scala.Boolean], t2: /* commit */ js.UndefOr[scala.Boolean]) => appendChild(t0, t1, t2).runNow()))
    if (bubble != null) __obj.updateDynamic("bubble")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => bubble(t0, t1, t2).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (cascadeBy != null) __obj.updateDynamic("cascadeBy")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => cascadeBy(t0, t1, t2).runNow()))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction3((t0: /* recursive */ js.UndefOr[scala.Boolean], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => collapse(t0, t1, t2).runNow()))
    if (collapseChildren != null) __obj.updateDynamic("collapseChildren")(js.Any.fromFunction3((t0: /* recursive */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => collapseChildren(t0, t1, t2).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[typingsJapgolly.extjs.Ext.data.INodeInterface]) => contains(t0).runNow()))
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction2((t0: /* id */ js.UndefOr[java.lang.String], t1: /* deep */ js.UndefOr[scala.Boolean]) => copy(t0, t1).runNow()))
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[js.Any]) => createNode(t0).runNow()))
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[js.Any]) => destroy(t0).runNow()))
    if (eachChild != null) __obj.updateDynamic("eachChild")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* args */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => eachChild(t0, t1, t2).runNow()))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction3((t0: /* recursive */ js.UndefOr[scala.Boolean], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => expand(t0, t1, t2).runNow()))
    if (expandChildren != null) __obj.updateDynamic("expandChildren")(js.Any.fromFunction3((t0: /* recursive */ js.UndefOr[scala.Boolean], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => expandChildren(t0, t1, t2).runNow()))
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (findChild != null) __obj.updateDynamic("findChild")(js.Any.fromFunction3((t0: /* attribute */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* deep */ js.UndefOr[scala.Boolean]) => findChild(t0, t1, t2).runNow()))
    if (findChildBy != null) __obj.updateDynamic("findChildBy")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* deep */ js.UndefOr[scala.Boolean]) => findChildBy(t0, t1, t2).runNow()))
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (getChildAt != null) __obj.updateDynamic("getChildAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getChildAt(t0).runNow()))
    getDepth.foreach(p => __obj.updateDynamic("getDepth")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getOwnerTree.foreach(p => __obj.updateDynamic("getOwnerTree")(p.toJsFn))
    if (getPath != null) __obj.updateDynamic("getPath")(js.Any.fromFunction2((t0: /* field */ js.UndefOr[java.lang.String], t1: /* separator */ js.UndefOr[java.lang.String]) => getPath(t0, t1).runNow()))
    hasChildNodes.foreach(p => __obj.updateDynamic("hasChildNodes")(p.toJsFn))
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (hrefTarget != null) __obj.updateDynamic("hrefTarget")(hrefTarget.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[typingsJapgolly.extjs.Ext.data.INodeInterface]) => indexOf(t0).runNow()))
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(js.Any.fromFunction1((t0: /* id */ js.UndefOr[java.lang.String]) => indexOfId(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* config */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: /* node */ js.UndefOr[typingsJapgolly.extjs.Ext.data.INodeInterface], t1: /* refNode */ js.UndefOr[typingsJapgolly.extjs.Ext.data.INodeInterface]) => insertBefore(t0, t1).runNow()))
    if (insertChild != null) __obj.updateDynamic("insertChild")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* node */ js.UndefOr[typingsJapgolly.extjs.Ext.data.INodeInterface]) => insertChild(t0, t1).runNow()))
    if (isAncestor != null) __obj.updateDynamic("isAncestor")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[typingsJapgolly.extjs.Ext.data.INodeInterface]) => isAncestor(t0).runNow()))
    isExpandable.foreach(p => __obj.updateDynamic("isExpandable")(p.toJsFn))
    isExpanded.foreach(p => __obj.updateDynamic("isExpanded")(p.toJsFn))
    if (!js.isUndefined(isFirst)) __obj.updateDynamic("isFirst")(isFirst.asInstanceOf[js.Any])
    if (!js.isUndefined(isLast)) __obj.updateDynamic("isLast")(isLast.asInstanceOf[js.Any])
    isLeaf.foreach(p => __obj.updateDynamic("isLeaf")(p.toJsFn))
    isLoaded.foreach(p => __obj.updateDynamic("isLoaded")(p.toJsFn))
    isLoading.foreach(p => __obj.updateDynamic("isLoading")(p.toJsFn))
    if (!js.isUndefined(isNode)) __obj.updateDynamic("isNode")(isNode.asInstanceOf[js.Any])
    isRoot.foreach(p => __obj.updateDynamic("isRoot")(p.toJsFn))
    isVisible.foreach(p => __obj.updateDynamic("isVisible")(p.toJsFn))
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (!js.isUndefined(leaf)) __obj.updateDynamic("leaf")(leaf.asInstanceOf[js.Any])
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(nextSibling.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (previousSibling != null) __obj.updateDynamic("previousSibling")(previousSibling.asInstanceOf[js.Any])
    if (qshowDelay != null) __obj.updateDynamic("qshowDelay")(qshowDelay.asInstanceOf[js.Any])
    if (qtip != null) __obj.updateDynamic("qtip")(qtip.asInstanceOf[js.Any])
    if (qtitle != null) __obj.updateDynamic("qtitle")(qtitle.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* destroy */ js.UndefOr[scala.Boolean]) => remove(t0).runNow()))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1((t0: /* destroy */ js.UndefOr[scala.Boolean]) => removeAll(t0).runNow()))
    if (removeChild != null) __obj.updateDynamic("removeChild")(js.Any.fromFunction2((t0: /* node */ js.UndefOr[typingsJapgolly.extjs.Ext.data.INodeInterface], t1: /* destroy */ js.UndefOr[scala.Boolean]) => removeChild(t0, t1).runNow()))
    if (replaceChild != null) __obj.updateDynamic("replaceChild")(js.Any.fromFunction2((t0: /* newChild */ js.UndefOr[typingsJapgolly.extjs.Ext.data.INodeInterface], t1: /* oldChild */ js.UndefOr[typingsJapgolly.extjs.Ext.data.INodeInterface]) => replaceChild(t0, t1).runNow()))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    serialize.foreach(p => __obj.updateDynamic("serialize")(p.toJsFn))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* recursive */ js.UndefOr[scala.Boolean], t2: /* suppressEvent */ js.UndefOr[scala.Boolean]) => sort(t0, t1, t2).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (updateInfo != null) __obj.updateDynamic("updateInfo")(js.Any.fromFunction2((t0: /* commit */ js.UndefOr[scala.Boolean], t1: /* info */ js.UndefOr[js.Any]) => updateInfo(t0, t1).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeInterface]
  }
}

