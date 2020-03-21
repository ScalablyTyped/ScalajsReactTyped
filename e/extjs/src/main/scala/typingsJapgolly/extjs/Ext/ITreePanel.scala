package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.data.INodeInterface
import typingsJapgolly.extjs.Ext.data.ITreeStore
import typingsJapgolly.extjs.Ext.panel.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreePanel extends ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_ITreePanel: js.UndefOr[Boolean] = js.undefined
  /** [Method] Collapse all nodes
  		* @param callback Function A function to execute when the collapse finishes.
  		* @param scope Object The scope of the callback function
  		*/
  var collapseAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Collapses a record that is loaded in the tree
  		* @param record Ext.data.Model The record to collapse
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var collapseNode: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Expand all nodes
  		* @param callback Function A function to execute when the expand finishes.
  		* @param scope Object The scope of the callback function
  		*/
  var expandAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Expands a record that is loaded in the tree
  		* @param record Ext.data.Model The record to expand
  		* @param deep Boolean True to expand nodes all the way down the tree hierarchy.
  		* @param callback Function The function to run after the expand is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var expandNode: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Expand the tree to the path of a particular node
  		* @param path String The path to expand. The path should include a leading separator.
  		* @param field String The field to get the data from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @param callback Function A function to execute when the expand finishes. The callback will be called with (success, lastNode) where success is if the expand was successful and lastNode is the last node that was expanded.
  		* @param scope Object The scope of the callback function
  		*/
  var expandPath: js.UndefOr[
    js.Function5[
      /* path */ js.UndefOr[java.lang.String], 
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[Boolean] = js.undefined
  /** [Method] Retrieve an array of checked records
  		* @returns Ext.data.NodeInterface[] An array containing the checked records
  		*/
  var getChecked: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the root node for this tree
  		* @returns Ext.data.NodeInterface
  		*/
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.undefined
  /** [Config Option] (Boolean) */
  var lines: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.undefined
  /** [Method] Expand the tree to the path of a particular node then select it
  		* @param path String The path to select. The path should include a leading separator.
  		* @param field String The field to get the data from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @param callback Function A function to execute when the select finishes. The callback will be called with (bSuccess, oLastNode) where bSuccess is if the select was successful and oLastNode is the last node that was expanded.
  		* @param scope Object The scope of the callback function
  		*/
  var selectPath: js.UndefOr[
    js.Function5[
      /* path */ js.UndefOr[java.lang.String], 
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets root node of this tree
  		* @param root Ext.data.Model/Ext.data.NodeInterface/Object
  		* @returns Ext.data.NodeInterface The new root
  		*/
  var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], INodeInterface]] = js.undefined
  /** [Config Option] (Boolean) */
  var singleExpand: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.data.TreeStore) */
  @JSName("store")
  var store_ITreePanel: js.UndefOr[ITreeStore] = js.undefined
  /** [Config Option] (Boolean) */
  var useArrows: js.UndefOr[Boolean] = js.undefined
}

object ITreePanel {
  @scala.inline
  def apply(
    ITable: ITable = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    collapseAll: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    collapseNode: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    displayField: java.lang.String = null,
    expandAll: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    expandNode: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    expandPath: (/* path */ js.UndefOr[java.lang.String], /* field */ js.UndefOr[java.lang.String], /* separator */ js.UndefOr[java.lang.String], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    folderSort: js.UndefOr[Boolean] = js.undefined,
    getChecked: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getRootNode: js.UndefOr[CallbackTo[INodeInterface]] = js.undefined,
    lines: js.UndefOr[Boolean] = js.undefined,
    root: js.Any = null,
    rootVisible: js.UndefOr[Boolean] = js.undefined,
    selectPath: (/* path */ js.UndefOr[java.lang.String], /* field */ js.UndefOr[java.lang.String], /* separator */ js.UndefOr[java.lang.String], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    setRootNode: /* root */ js.UndefOr[js.Any] => CallbackTo[INodeInterface] = null,
    singleExpand: js.UndefOr[Boolean] = js.undefined,
    store: ITreeStore = null,
    useArrows: js.UndefOr[Boolean] = js.undefined
  ): ITreePanel = {
    val __obj = js.Dynamic.literal()
    if (ITable != null) js.Dynamic.global.Object.assign(__obj, ITable)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (collapseAll != null) __obj.updateDynamic("collapseAll")(js.Any.fromFunction2((t0: /* callback */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => collapseAll(t0, t1).runNow()))
    if (collapseNode != null) __obj.updateDynamic("collapseNode")(js.Any.fromFunction4((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: /* deep */ js.UndefOr[scala.Boolean], t2: /* callback */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => collapseNode(t0, t1, t2, t3).runNow()))
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    if (expandAll != null) __obj.updateDynamic("expandAll")(js.Any.fromFunction2((t0: /* callback */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => expandAll(t0, t1).runNow()))
    if (expandNode != null) __obj.updateDynamic("expandNode")(js.Any.fromFunction4((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: /* deep */ js.UndefOr[scala.Boolean], t2: /* callback */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => expandNode(t0, t1, t2, t3).runNow()))
    if (expandPath != null) __obj.updateDynamic("expandPath")(js.Any.fromFunction5((t0: /* path */ js.UndefOr[java.lang.String], t1: /* field */ js.UndefOr[java.lang.String], t2: /* separator */ js.UndefOr[java.lang.String], t3: /* callback */ js.UndefOr[js.Any], t4: /* scope */ js.UndefOr[js.Any]) => expandPath(t0, t1, t2, t3, t4).runNow()))
    if (!js.isUndefined(folderSort)) __obj.updateDynamic("folderSort")(folderSort.asInstanceOf[js.Any])
    getChecked.foreach(p => __obj.updateDynamic("getChecked")(p.toJsFn))
    getRootNode.foreach(p => __obj.updateDynamic("getRootNode")(p.toJsFn))
    if (!js.isUndefined(lines)) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(rootVisible)) __obj.updateDynamic("rootVisible")(rootVisible.asInstanceOf[js.Any])
    if (selectPath != null) __obj.updateDynamic("selectPath")(js.Any.fromFunction5((t0: /* path */ js.UndefOr[java.lang.String], t1: /* field */ js.UndefOr[java.lang.String], t2: /* separator */ js.UndefOr[java.lang.String], t3: /* callback */ js.UndefOr[js.Any], t4: /* scope */ js.UndefOr[js.Any]) => selectPath(t0, t1, t2, t3, t4).runNow()))
    if (setRootNode != null) __obj.updateDynamic("setRootNode")(js.Any.fromFunction1((t0: /* root */ js.UndefOr[js.Any]) => setRootNode(t0).runNow()))
    if (!js.isUndefined(singleExpand)) __obj.updateDynamic("singleExpand")(singleExpand.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (!js.isUndefined(useArrows)) __obj.updateDynamic("useArrows")(useArrows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreePanel]
  }
}

