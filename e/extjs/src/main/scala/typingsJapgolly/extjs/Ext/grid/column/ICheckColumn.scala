package typingsJapgolly.extjs.Ext.grid.column

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckColumn extends IColumn {
  /** [Method] Disables this CheckColumn
  		* @param silent Boolean
  		*/
  @JSName("onDisable")
  var onDisable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Enables this CheckColumn
  		* @param silent Boolean
  		*/
  @JSName("onEnable")
  var onEnable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[Boolean] = js.undefined
}

object ICheckColumn {
  @scala.inline
  def apply(
    IColumn: IColumn = null,
    onDisable: /* silent */ js.UndefOr[Boolean] => Callback = null,
    onEnable: /* silent */ js.UndefOr[Boolean] => Callback = null,
    stopSelection: js.UndefOr[Boolean] = js.undefined
  ): ICheckColumn = {
    val __obj = js.Dynamic.literal()
    if (IColumn != null) js.Dynamic.global.Object.assign(__obj, IColumn)
    if (onDisable != null) __obj.updateDynamic("onDisable")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[scala.Boolean]) => onDisable(t0).runNow()))
    if (onEnable != null) __obj.updateDynamic("onEnable")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[scala.Boolean]) => onEnable(t0).runNow()))
    if (!js.isUndefined(stopSelection)) __obj.updateDynamic("stopSelection")(stopSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckColumn]
  }
}

