package typingsJapgolly.extjs.Ext.grid.column

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction extends IColumn {
  /** [Config Option] (String) */
  var altText: js.UndefOr[String] = js.undefined
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
  		* @param fn Object
  		* @param scope Object
  		* @returns Ext.Container this
  		*/
  @JSName("cascade")
  var cascade_IAction: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IContainer]
  ] = js.undefined
  /** [Method] Renderer closure iterates through items creating an element for each and tagging with an identifying class name x ac
  		* @param v Object
  		* @param meta Object
  		* @param record Object
  		* @param rowIdx Object
  		* @param colIdx Object
  		* @param store Object
  		* @param view Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_IAction: js.UndefOr[
    js.Function7[
      /* v */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* colIdx */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Disables this ActionColumn s action at the specified index
  		* @param index Number/Ext.grid.column.Action
  		* @param silent Boolean
  		*/
  var disableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Enables this ActionColumn s action at the specified index
  		* @param index Number/Ext.grid.column.Action
  		* @param silent Boolean
  		*/
  var enableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Config Option] (Function) */
  @JSName("getClass")
  var getClass_FIAction: js.UndefOr[js.Any] = js.undefined
  /** [Method] Private override because this cannot function as a Container and it has an items property which is an Array NOT a M  */
  @JSName("getRefItems")
  var getRefItems_IAction: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var getTip: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object[]) */
  @JSName("items")
  var items_IAction: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[Boolean] = js.undefined
}

object IAction {
  @scala.inline
  def apply(
    IColumn: IColumn = null,
    altText: String = null,
    cascade: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => CallbackTo[IContainer] = null,
    defaultRenderer: (/* v */ js.UndefOr[js.Any], /* meta */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any], /* rowIdx */ js.UndefOr[js.Any], /* colIdx */ js.UndefOr[js.Any], /* store */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any]) => Callback = null,
    disableAction: (/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean]) => Callback = null,
    enableAction: (/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[Boolean]) => Callback = null,
    getClass: js.Any = null,
    getRefItems: js.UndefOr[Callback] = js.undefined,
    getTip: js.Any = null,
    handler: js.Any = null,
    icon: String = null,
    iconCls: String = null,
    items: Array = null,
    stopSelection: js.UndefOr[Boolean] = js.undefined
  ): IAction = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (altText != null) __obj.updateDynamic("altText")(altText.asInstanceOf[js.Any])
    if (cascade != null) __obj.updateDynamic("cascade")(js.Any.fromFunction2((t0: /* fn */ js.UndefOr[js.Any], t1: /* scope */ js.UndefOr[js.Any]) => cascade(t0, t1).runNow()))
    if (defaultRenderer != null) __obj.updateDynamic("defaultRenderer")(js.Any.fromFunction7((t0: /* v */ js.UndefOr[js.Any], t1: /* meta */ js.UndefOr[js.Any], t2: /* record */ js.UndefOr[js.Any], t3: /* rowIdx */ js.UndefOr[js.Any], t4: /* colIdx */ js.UndefOr[js.Any], t5: /* store */ js.UndefOr[js.Any], t6: /* view */ js.UndefOr[js.Any]) => defaultRenderer(t0, t1, t2, t3, t4, t5, t6).runNow()))
    if (disableAction != null) __obj.updateDynamic("disableAction")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[js.Any], t1: /* silent */ js.UndefOr[scala.Boolean]) => disableAction(t0, t1).runNow()))
    if (enableAction != null) __obj.updateDynamic("enableAction")(js.Any.fromFunction2((t0: /* index */ js.UndefOr[js.Any], t1: /* silent */ js.UndefOr[scala.Boolean]) => enableAction(t0, t1).runNow()))
    if (getClass != null) __obj.updateDynamic("getClass")(getClass.asInstanceOf[js.Any])
    getRefItems.foreach(p => __obj.updateDynamic("getRefItems")(p.toJsFn))
    if (getTip != null) __obj.updateDynamic("getTip")(getTip.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(stopSelection)) __obj.updateDynamic("stopSelection")(stopSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAction]
  }
}

