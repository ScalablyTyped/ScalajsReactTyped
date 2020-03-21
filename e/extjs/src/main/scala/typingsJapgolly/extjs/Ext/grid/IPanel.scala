package typingsJapgolly.extjs.Ext.grid

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.data.IStore
import typingsJapgolly.extjs.Ext.panel.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel extends ITable {
  /** [Method] Reconfigures the grid with a new store columns
  		* @param store Ext.data.Store The new store.
  		* @param columns Object[] An array of column configs
  		*/
  var reconfigure: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array], Unit]
  ] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    ITable: ITable = null,
    reconfigure: (/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array]) => Callback = null
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    if (ITable != null) js.Dynamic.global.Object.assign(__obj, ITable)
    if (reconfigure != null) __obj.updateDynamic("reconfigure")(js.Any.fromFunction2((t0: /* store */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IStore], t1: /* columns */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => reconfigure(t0, t1).runNow()))
    __obj.asInstanceOf[IPanel]
  }
}

