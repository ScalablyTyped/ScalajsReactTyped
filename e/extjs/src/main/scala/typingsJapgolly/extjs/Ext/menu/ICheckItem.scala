package typingsJapgolly.extjs.Ext.menu

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckItem extends IItem {
  /** [Config Option] (Boolean) */
  var checkChangeDisabled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Function) */
  var checkHandler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var checkedCls: js.UndefOr[String] = js.undefined
  /** [Method] Disables just the checkbox functionality of this menu Item  */
  var disableCheckChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Reenables the checkbox functionality of this menu item after having been disabled by disableCheckChange */
  var enableCheckChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var group: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var groupCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the checked state of the item
  		* @param checked Boolean True to check, false to uncheck
  		* @param suppressEvents Boolean True to prevent firing the checkchange events.
  		*/
  var setChecked: js.UndefOr[
    js.Function2[/* checked */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var uncheckedCls: js.UndefOr[String] = js.undefined
}

object ICheckItem {
  @scala.inline
  def apply(
    IItem: IItem = null,
    checkChangeDisabled: js.UndefOr[Boolean] = js.undefined,
    checkHandler: js.Any = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    checkedCls: String = null,
    disableCheckChange: js.UndefOr[Callback] = js.undefined,
    enableCheckChange: js.UndefOr[Callback] = js.undefined,
    group: String = null,
    groupCls: String = null,
    scope: js.Any = null,
    setChecked: (/* checked */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean]) => Callback = null,
    uncheckedCls: String = null
  ): ICheckItem = {
    val __obj = js.Dynamic.literal()
    if (IItem != null) js.Dynamic.global.Object.assign(__obj, IItem)
    if (!js.isUndefined(checkChangeDisabled)) __obj.updateDynamic("checkChangeDisabled")(checkChangeDisabled.asInstanceOf[js.Any])
    if (checkHandler != null) __obj.updateDynamic("checkHandler")(checkHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (checkedCls != null) __obj.updateDynamic("checkedCls")(checkedCls.asInstanceOf[js.Any])
    disableCheckChange.foreach(p => __obj.updateDynamic("disableCheckChange")(p.toJsFn))
    enableCheckChange.foreach(p => __obj.updateDynamic("enableCheckChange")(p.toJsFn))
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupCls != null) __obj.updateDynamic("groupCls")(groupCls.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (setChecked != null) __obj.updateDynamic("setChecked")(js.Any.fromFunction2((t0: /* checked */ js.UndefOr[scala.Boolean], t1: /* suppressEvents */ js.UndefOr[scala.Boolean]) => setChecked(t0, t1).runNow()))
    if (uncheckedCls != null) __obj.updateDynamic("uncheckedCls")(uncheckedCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckItem]
  }
}

