package typingsJapgolly.senchaTouch.Ext.picker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.dataview.IDataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlot extends IDataView {
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.undefined
  /** [Method] Looks at the data configuration and turns it into store
  		* @param data Object
  		* @returns Object
  		*/
  var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Sets the title for this dataview by creating element
  		* @param title String
  		* @returns String
  		*/
  var applyTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], String]] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.undefined
  /** [Method] Returns the value of align
  		* @returns String
  		*/
  var getAlign: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of displayField
  		* @returns String
  		*/
  var getDisplayField: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of valueField
  		* @returns String
  		*/
  var getValueField: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Config Option] (String) */
  @JSName("itemTpl")
  var itemTpl_ISlot: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of align
  		* @param align String The new value.
  		*/
  var setAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of displayField
  		* @param displayField String The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of itemTpl
  		* @param itemTpl String The new value.
  		*/
  @JSName("setItemTpl")
  var setItemTpl_ISlot: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of valueField
  		* @param valueField String The new value.
  		*/
  var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
  /** [Method] Updates the align configuration
  		* @param newAlign Object
  		* @param oldAlign Object
  		*/
  var updateAlign: js.UndefOr[
    js.Function2[/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var value: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var valueField: js.UndefOr[String] = js.undefined
}

object ISlot {
  @scala.inline
  def apply(
    IDataView: IDataView = null,
    align: String = null,
    applyData: /* data */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    applyTitle: /* title */ js.UndefOr[String] => CallbackTo[String] = null,
    displayField: String = null,
    getAlign: js.UndefOr[CallbackTo[String]] = js.undefined,
    getDisplayField: js.UndefOr[CallbackTo[String]] = js.undefined,
    getName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getTitle: js.UndefOr[CallbackTo[String]] = js.undefined,
    getValueField: js.UndefOr[CallbackTo[String]] = js.undefined,
    itemTpl: String = null,
    name: String = null,
    setAlign: /* align */ js.UndefOr[String] => Callback = null,
    setDisplayField: /* displayField */ js.UndefOr[String] => Callback = null,
    setItemTpl: /* itemTpl */ js.UndefOr[String] => Callback = null,
    setName: /* name */ js.UndefOr[String] => Callback = null,
    setTitle: /* title */ js.UndefOr[String] => Callback = null,
    setValueField: /* valueField */ js.UndefOr[String] => Callback = null,
    title: String = null,
    updateAlign: (/* newAlign */ js.UndefOr[js.Any], /* oldAlign */ js.UndefOr[js.Any]) => Callback = null,
    value: Int | Double = null,
    valueField: String = null
  ): ISlot = {
    val __obj = js.Dynamic.literal()
    if (IDataView != null) js.Dynamic.global.Object.assign(__obj, IDataView)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (applyData != null) __obj.updateDynamic("applyData")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[js.Any]) => applyData(t0).runNow()))
    if (applyTitle != null) __obj.updateDynamic("applyTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => applyTitle(t0).runNow()))
    if (displayField != null) __obj.updateDynamic("displayField")(displayField.asInstanceOf[js.Any])
    getAlign.foreach(p => __obj.updateDynamic("getAlign")(p.toJsFn))
    getDisplayField.foreach(p => __obj.updateDynamic("getDisplayField")(p.toJsFn))
    getName.foreach(p => __obj.updateDynamic("getName")(p.toJsFn))
    getTitle.foreach(p => __obj.updateDynamic("getTitle")(p.toJsFn))
    getValueField.foreach(p => __obj.updateDynamic("getValueField")(p.toJsFn))
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (setAlign != null) __obj.updateDynamic("setAlign")(js.Any.fromFunction1((t0: /* align */ js.UndefOr[java.lang.String]) => setAlign(t0).runNow()))
    if (setDisplayField != null) __obj.updateDynamic("setDisplayField")(js.Any.fromFunction1((t0: /* displayField */ js.UndefOr[java.lang.String]) => setDisplayField(t0).runNow()))
    if (setItemTpl != null) __obj.updateDynamic("setItemTpl")(js.Any.fromFunction1((t0: /* itemTpl */ js.UndefOr[java.lang.String]) => setItemTpl(t0).runNow()))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => setName(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (setValueField != null) __obj.updateDynamic("setValueField")(js.Any.fromFunction1((t0: /* valueField */ js.UndefOr[java.lang.String]) => setValueField(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateAlign != null) __obj.updateDynamic("updateAlign")(js.Any.fromFunction2((t0: /* newAlign */ js.UndefOr[js.Any], t1: /* oldAlign */ js.UndefOr[js.Any]) => updateAlign(t0, t1).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISlot]
  }
}

