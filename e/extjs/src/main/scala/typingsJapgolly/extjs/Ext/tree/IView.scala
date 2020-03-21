package typingsJapgolly.extjs.Ext.tree

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.view.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IView: js.UndefOr[Boolean] = js.undefined
  /** [Method] Collapses a record that is loaded in the view
  		* @param record Ext.data.Model The record to collapse
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var collapse: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Expands a record that is loaded in the view
  		* @param record Ext.data.Model The record to expand
  		* @param deep Boolean True to expand nodes all the way down the tree hierarchy.
  		* @param callback Function The function to run after the expand is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var expand: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Gets the listeners to bind to a new store
  		* @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
  		*/
  @JSName("getStoreListeners")
  var getStoreListeners_IView: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets the base TreeStore from the bound TreePanel  */
  var getTreeStore: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isTreeView: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  @JSName("loadMask")
  var loadMask_IView: js.UndefOr[Boolean] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance  */
  @JSName("onBindStore")
  var onBindStore_IView: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance  */
  @JSName("onUnbindStore")
  var onUnbindStore_IView: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.undefined
  /** [Method] Toggles a record between expanded and collapsed
  		* @param record Ext.data.Model
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the expand/collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var toggle: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}

object IView {
  @scala.inline
  def apply(
    ITable: ITable = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    collapse: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    expand: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null,
    getStoreListeners: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getTreeStore: js.UndefOr[Callback] = js.undefined,
    isTreeView: js.UndefOr[Boolean] = js.undefined,
    loadMask: js.UndefOr[Boolean] = js.undefined,
    onBindStore: js.UndefOr[Callback] = js.undefined,
    onUnbindStore: js.UndefOr[Callback] = js.undefined,
    rootVisible: js.UndefOr[Boolean] = js.undefined,
    toggle: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Callback = null
  ): IView = {
    val __obj = js.Dynamic.literal()
    if (ITable != null) js.Dynamic.global.Object.assign(__obj, ITable)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction4((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: /* deep */ js.UndefOr[scala.Boolean], t2: /* callback */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => collapse(t0, t1, t2, t3).runNow()))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction4((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: /* deep */ js.UndefOr[scala.Boolean], t2: /* callback */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => expand(t0, t1, t2, t3).runNow()))
    getStoreListeners.foreach(p => __obj.updateDynamic("getStoreListeners")(p.toJsFn))
    getTreeStore.foreach(p => __obj.updateDynamic("getTreeStore")(p.toJsFn))
    if (!js.isUndefined(isTreeView)) __obj.updateDynamic("isTreeView")(isTreeView.asInstanceOf[js.Any])
    if (!js.isUndefined(loadMask)) __obj.updateDynamic("loadMask")(loadMask.asInstanceOf[js.Any])
    onBindStore.foreach(p => __obj.updateDynamic("onBindStore")(p.toJsFn))
    onUnbindStore.foreach(p => __obj.updateDynamic("onUnbindStore")(p.toJsFn))
    if (!js.isUndefined(rootVisible)) __obj.updateDynamic("rootVisible")(rootVisible.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction4((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: /* deep */ js.UndefOr[scala.Boolean], t2: /* callback */ js.UndefOr[js.Any], t3: /* scope */ js.UndefOr[js.Any]) => toggle(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[IView]
  }
}

