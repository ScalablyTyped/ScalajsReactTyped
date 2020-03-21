package typingsJapgolly.senchaTouch.Ext.dataview.component

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataItem
  extends typingsJapgolly.senchaTouch.Ext.IContainer {
  /** [Config Option] (Object) */
  var dataMap: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of dataMap
  		* @returns Object
  		*/
  var getDataMap: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of itemCls
  		* @returns String
  		*/
  var getItemCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of items
  		* @returns Array
  		*/
  @JSName("getItems")
  var getItems_IDataItem: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of dataMap
  		* @param dataMap Object The new value.
  		*/
  var setDataMap: js.UndefOr[js.Function1[/* dataMap */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of itemCls
  		* @param itemCls String The new value.
  		*/
  var setItemCls: js.UndefOr[js.Function1[/* itemCls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of items
  		* @param items Array The new value.
  		*/
  @JSName("setItems")
  var setItems_IDataItem: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of width
  		* @param width String The new value.
  		*/
  @JSName("setWidth")
  var setWidth_IDataItem: js.UndefOr[js.Function1[/* width */ js.UndefOr[String], Unit]] = js.undefined
}

object IDataItem {
  @scala.inline
  def apply(
    IContainer: typingsJapgolly.senchaTouch.Ext.IContainer = null,
    dataMap: js.Any = null,
    getDataMap: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getItemCls: js.UndefOr[CallbackTo[String]] = js.undefined,
    getItems: js.UndefOr[CallbackTo[Array]] = js.undefined,
    itemCls: String = null,
    setDataMap: /* dataMap */ js.UndefOr[js.Any] => Callback = null,
    setItemCls: /* itemCls */ js.UndefOr[String] => Callback = null,
    setItems: /* items */ js.UndefOr[Array] => Callback = null,
    setWidth: /* width */ js.UndefOr[String] => Callback = null
  ): IDataItem = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (dataMap != null) __obj.updateDynamic("dataMap")(dataMap.asInstanceOf[js.Any])
    getDataMap.foreach(p => __obj.updateDynamic("getDataMap")(p.toJsFn))
    getItemCls.foreach(p => __obj.updateDynamic("getItemCls")(p.toJsFn))
    getItems.foreach(p => __obj.updateDynamic("getItems")(p.toJsFn))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls.asInstanceOf[js.Any])
    if (setDataMap != null) __obj.updateDynamic("setDataMap")(js.Any.fromFunction1((t0: /* dataMap */ js.UndefOr[js.Any]) => setDataMap(t0).runNow()))
    if (setItemCls != null) __obj.updateDynamic("setItemCls")(js.Any.fromFunction1((t0: /* itemCls */ js.UndefOr[java.lang.String]) => setItemCls(t0).runNow()))
    if (setItems != null) __obj.updateDynamic("setItems")(js.Any.fromFunction1((t0: /* items */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => setItems(t0).runNow()))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: /* width */ js.UndefOr[java.lang.String]) => setWidth(t0).runNow()))
    __obj.asInstanceOf[IDataItem]
  }
}

