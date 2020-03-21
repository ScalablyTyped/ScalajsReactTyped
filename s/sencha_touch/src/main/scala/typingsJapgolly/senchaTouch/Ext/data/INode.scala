package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INode extends IBase {
  /** [Method] Insert node s as the last child node of this node
  		* @param node Ext.data.NodeInterface/Ext.data.NodeInterface[] The node or Array of nodes to append.
  		* @returns Ext.data.NodeInterface The appended node if single append, or null if an array was passed.
  		*/
  var appendChild: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], INodeInterface]] = js.undefined
  /** [Method] Bubbles up the tree from this node calling the specified function with each node
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
  		* @param args Array The args to call the function with (default to passing the current Node).
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
  		* @param args Array The args to call the function with (default to passing the current Node).
  		*/
  var cascadeBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var childNodes: js.UndefOr[js.Any] = js.undefined
  /** [Method] Collapse this node
  		* @param recursive Function true to recursively collapse all the children.
  		* @param callback Function The function to execute once the collapse completes.
  		* @param scope Object The scope to run the callback in.
  		*/
  var collapse: js.UndefOr[
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
  var contains: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Boolean]] = js.undefined
  /** [Method] Creates a copy clone of this Node
  		* @param newId String A new id, defaults to this Node's id.
  		* @param deep Boolean If passed as true, all child Nodes are recursively copied into the new Node. If omitted or false, the copy will have no child Nodes.
  		* @returns Ext.data.NodeInterface A copy of this Node.
  		*/
  var copy: js.UndefOr[
    js.Function2[/* newId */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean], INodeInterface]
  ] = js.undefined
  /** [Method] Destroys the node
  		* @param silent Object
  		*/
  @JSName("destroy")
  var destroy_INode: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Iterates the child nodes of this node calling the specified function with each node
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node in the iteration.
  		* @param args Array The args to call the function with (default to passing the current Node).
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
  		* @param recursive Function true to recursively expand all the children.
  		* @param callback Function The function to execute once the expand completes.
  		* @param scope Object The scope to run the callback in.
  		*/
  var expand: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Finds the first child that has the attribute with the specified value
  		* @param attribute String The attribute name.
  		* @param value Object The value to search for.
  		* @param deep Boolean true to search through nodes deeper than the immediate children.
  		* @returns Ext.data.NodeInterface The found child or null if none was found.
  		*/
  var findChild: js.UndefOr[
    js.Function3[
      /* attribute */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[Boolean], 
      INodeInterface
    ]
  ] = js.undefined
  /** [Method] Finds the first child by a custom function
  		* @param fn Function A function which must return true if the passed Node is the required Node.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Node being tested.
  		* @param deep Boolean True to search through nodes deeper than the immediate children.
  		* @returns Ext.data.NodeInterface The found child or null if none was found.
  		*/
  var findChildBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[Boolean], 
      INodeInterface
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var firstChild: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the child node at the specified index
  		* @param index Number
  		* @returns Ext.data.NodeInterface
  		*/
  var getChildAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], INodeInterface]] = js.undefined
  /** [Method] Returns depth of this node the root node has a depth of 0
  		* @returns Number
  		*/
  var getDepth: js.UndefOr[js.Function0[Double]] = js.undefined
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
  /** [Method] Returns the index of a child node
  		* @param child Ext.data.NodeInterface
  		* @returns Number The index of the node or -1 if it was not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* child */ js.UndefOr[INodeInterface], Double]] = js.undefined
  /** [Method] Inserts the first node before the second node in this nodes childNodes collection
  		* @param node Ext.data.NodeInterface The node to insert.
  		* @param refNode Ext.data.NodeInterface The node to insert before (if null the node is appended).
  		* @returns Ext.data.NodeInterface The inserted node.
  		*/
  var insertBefore: js.UndefOr[
    js.Function2[
      /* node */ js.UndefOr[INodeInterface], 
      /* refNode */ js.UndefOr[INodeInterface], 
      INodeInterface
    ]
  ] = js.undefined
  /** [Method] Insert a node into this node
  		* @param index Number The zero-based index to insert the node at.
  		* @param node Ext.data.Model The node to insert.
  		* @returns Ext.data.Model The record you just inserted.
  		*/
  var insertChild: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* node */ js.UndefOr[IModel], IModel]
  ] = js.undefined
  /** [Method] Returns true if the passed node is an ancestor at any point of this node
  		* @param node Ext.data.NodeInterface
  		* @returns Boolean
  		*/
  var isAncestor: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Boolean]] = js.undefined
  /** [Method] Returns true if this node has one or more child nodes or if the expandable node attribute is explicitly specified as
  		* @returns Boolean
  		*/
  var isExpandable: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is expanded
  		* @returns Boolean
  		*/
  var isExpanded: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is the first child of its parent
  		* @returns Boolean
  		*/
  var isFirst: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is the last child of its parent
  		* @returns Boolean
  		*/
  var isLast: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
  /** [Method] Returns true if this node is the root node
  		* @returns Boolean
  		*/
  var isRoot: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this node is visible
  		* @returns Boolean
  		*/
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Property] (Object) */
  var lastChild: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var nextSibling: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var parentNode: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var previousSibling: js.UndefOr[js.Any] = js.undefined
  /** [Method] Removes this node from its parent
  		* @param destroy Boolean true to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface this
  		*/
  var remove: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], INodeInterface]] = js.undefined
  /** [Method] Removes all child nodes from this node
  		* @param destroy Boolean true to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface this
  		*/
  var removeAll: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], INodeInterface]] = js.undefined
  /** [Method] Removes a child node from this node
  		* @param node Ext.data.NodeInterface The node to remove.
  		* @param destroy Boolean true to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface The removed node.
  		*/
  var removeChild: js.UndefOr[
    js.Function2[
      /* node */ js.UndefOr[INodeInterface], 
      /* destroy */ js.UndefOr[Boolean], 
      INodeInterface
    ]
  ] = js.undefined
  /** [Method] Replaces one child node in this node with another
  		* @param newChild Ext.data.NodeInterface The replacement node.
  		* @param oldChild Ext.data.NodeInterface The node to replace.
  		* @returns Ext.data.NodeInterface The replaced node.
  		*/
  var replaceChild: js.UndefOr[
    js.Function2[
      /* newChild */ js.UndefOr[INodeInterface], 
      /* oldChild */ js.UndefOr[INodeInterface], 
      INodeInterface
    ]
  ] = js.undefined
  /** [Method] Sorts this nodes children using the supplied sort function
  		* @param sortFn Function A function which, when passed two Nodes, returns -1, 0 or 1 depending upon required sort order.
  		* @param recursive Boolean Whether or not to apply this sort recursively.
  		* @param suppressEvent Boolean Set to true to not fire a sort event.
  		*/
  var sort: js.UndefOr[
    js.Function3[
      /* sortFn */ js.UndefOr[js.Any], 
      /* recursive */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Updates general data of this node like isFirst isLast depth
  		* @param silent Object
  		* @returns Boolean
  		*/
  var updateInfo: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Boolean]] = js.undefined
}

object INode {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    appendChild: /* node */ js.UndefOr[js.Any] => CallbackTo[INodeInterface] = null,
    bubble: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Callback = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    cascadeBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Callback = null,
    childNodes: js.Any = null,
    collapse: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    config: js.Any = null,
    contains: /* node */ js.UndefOr[INodeInterface] => CallbackTo[Boolean] = null,
    copy: (/* newId */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean]) => CallbackTo[INodeInterface] = null,
    destroy: /* silent */ js.UndefOr[js.Any] => Callback = null,
    eachChild: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Callback = null,
    expand: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    extend: String = null,
    findChild: (/* attribute */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => CallbackTo[INodeInterface] = null,
    findChildBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => CallbackTo[INodeInterface] = null,
    firstChild: js.Any = null,
    getChildAt: /* index */ js.UndefOr[Double] => CallbackTo[INodeInterface] = null,
    getDepth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getPath: (/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String]) => CallbackTo[String] = null,
    hasChildNodes: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    indexOf: /* child */ js.UndefOr[INodeInterface] => CallbackTo[Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    insertBefore: (/* node */ js.UndefOr[INodeInterface], /* refNode */ js.UndefOr[INodeInterface]) => CallbackTo[INodeInterface] = null,
    insertChild: (/* index */ js.UndefOr[Double], /* node */ js.UndefOr[IModel]) => CallbackTo[IModel] = null,
    isAncestor: /* node */ js.UndefOr[INodeInterface] => CallbackTo[Boolean] = null,
    isExpandable: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isExpanded: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isFirst: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isLast: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isLeaf: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isLoaded: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isLoading: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isRoot: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isVisible: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    lastChild: js.Any = null,
    mixins: js.Any = null,
    nextSibling: js.Any = null,
    parentNode: js.Any = null,
    platformConfig: js.Any = null,
    previousSibling: js.Any = null,
    remove: /* destroy */ js.UndefOr[Boolean] => CallbackTo[INodeInterface] = null,
    removeAll: /* destroy */ js.UndefOr[Boolean] => CallbackTo[INodeInterface] = null,
    removeChild: (/* node */ js.UndefOr[INodeInterface], /* destroy */ js.UndefOr[Boolean]) => CallbackTo[INodeInterface] = null,
    replaceChild: (/* newChild */ js.UndefOr[INodeInterface], /* oldChild */ js.UndefOr[INodeInterface]) => CallbackTo[INodeInterface] = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (/* sortFn */ js.UndefOr[js.Any], /* recursive */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Callback = null,
    statics: js.Any = null,
    updateInfo: /* silent */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    uses: Array = null
  ): INode = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[js.Any]) => appendChild(t0).runNow()))
    if (bubble != null) __obj.updateDynamic("bubble")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => bubble(t0, t1, t2).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    if (cascadeBy != null) __obj.updateDynamic("cascadeBy")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => cascadeBy(t0, t1, t2).runNow()))
    if (childNodes != null) __obj.updateDynamic("childNodes")(childNodes.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction3((t0: /* recursive */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => collapse(t0, t1, t2).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.INodeInterface]) => contains(t0).runNow()))
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction2((t0: /* newId */ js.UndefOr[java.lang.String], t1: /* deep */ js.UndefOr[scala.Boolean]) => copy(t0, t1).runNow()))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[js.Any]) => destroy(t0).runNow()))
    if (eachChild != null) __obj.updateDynamic("eachChild")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* args */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => eachChild(t0, t1, t2).runNow()))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction3((t0: /* recursive */ js.UndefOr[js.Any], t1: /* callback */ js.UndefOr[js.Any], t2: /* scope */ js.UndefOr[js.Any]) => expand(t0, t1, t2).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (findChild != null) __obj.updateDynamic("findChild")(js.Any.fromFunction3((t0: /* attribute */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* deep */ js.UndefOr[scala.Boolean]) => findChild(t0, t1, t2).runNow()))
    if (findChildBy != null) __obj.updateDynamic("findChildBy")(js.Any.fromFunction3((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any], t2: /* deep */ js.UndefOr[scala.Boolean]) => findChildBy(t0, t1, t2).runNow()))
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (getChildAt != null) __obj.updateDynamic("getChildAt")(js.Any.fromFunction1((t0: /* index */ js.UndefOr[scala.Double]) => getChildAt(t0).runNow()))
    getDepth.foreach(p => __obj.updateDynamic("getDepth")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (getPath != null) __obj.updateDynamic("getPath")(js.Any.fromFunction2((t0: /* field */ js.UndefOr[java.lang.String], t1: /* separator */ js.UndefOr[java.lang.String]) => getPath(t0, t1).runNow()))
    hasChildNodes.foreach(p => __obj.updateDynamic("hasChildNodes")(p.toJsFn))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* child */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.INodeInterface]) => indexOf(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: /* node */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.INodeInterface], t1: /* refNode */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.INodeInterface]) => insertBefore(t0, t1).runNow()))
    if (insertChild != null) __obj.updateDynamic("insertChild")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[scala.Double], t1: /* node */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IModel]) => insertChild(t0, t1).runNow()))
    if (isAncestor != null) __obj.updateDynamic("isAncestor")(js.Any.fromFunction1((t0: /* node */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.INodeInterface]) => isAncestor(t0).runNow()))
    isExpandable.foreach(p => __obj.updateDynamic("isExpandable")(p.toJsFn))
    isExpanded.foreach(p => __obj.updateDynamic("isExpanded")(p.toJsFn))
    isFirst.foreach(p => __obj.updateDynamic("isFirst")(p.toJsFn))
    isLast.foreach(p => __obj.updateDynamic("isLast")(p.toJsFn))
    isLeaf.foreach(p => __obj.updateDynamic("isLeaf")(p.toJsFn))
    isLoaded.foreach(p => __obj.updateDynamic("isLoaded")(p.toJsFn))
    isLoading.foreach(p => __obj.updateDynamic("isLoading")(p.toJsFn))
    isRoot.foreach(p => __obj.updateDynamic("isRoot")(p.toJsFn))
    isVisible.foreach(p => __obj.updateDynamic("isVisible")(p.toJsFn))
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(nextSibling.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (previousSibling != null) __obj.updateDynamic("previousSibling")(previousSibling.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* destroy */ js.UndefOr[scala.Boolean]) => remove(t0).runNow()))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1((t0: /* destroy */ js.UndefOr[scala.Boolean]) => removeAll(t0).runNow()))
    if (removeChild != null) __obj.updateDynamic("removeChild")(js.Any.fromFunction2((t0: /* node */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.INodeInterface], t1: /* destroy */ js.UndefOr[scala.Boolean]) => removeChild(t0, t1).runNow()))
    if (replaceChild != null) __obj.updateDynamic("replaceChild")(js.Any.fromFunction2((t0: /* newChild */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.INodeInterface], t1: /* oldChild */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.INodeInterface]) => replaceChild(t0, t1).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction3((t0: /* sortFn */ js.UndefOr[js.Any], t1: /* recursive */ js.UndefOr[scala.Boolean], t2: /* suppressEvent */ js.UndefOr[scala.Boolean]) => sort(t0, t1, t2).runNow()))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (updateInfo != null) __obj.updateDynamic("updateInfo")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[js.Any]) => updateInfo(t0).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[INode]
  }
}

