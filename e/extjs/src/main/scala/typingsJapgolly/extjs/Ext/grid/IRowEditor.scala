package typingsJapgolly.extjs.Ext.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.data.IModel
import typingsJapgolly.extjs.Ext.form.IBasic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowEditor
  extends typingsJapgolly.extjs.Ext.form.IPanel {
  /** [Method] Lie to the CQ system about our nesting structure  */
  @JSName("getRefItems")
  var getRefItems_IRowEditor: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Loads an Ext data Model into this form internally just calls Ext form Basic loadRecord See also trackResetOnLoad
  		* @param record Object
  		* @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
  		*/
  @JSName("loadRecord")
  var loadRecord_IRowEditor: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], IBasic]] = js.undefined
  /** [Method] Start editing the specified grid at the specified position
  		* @param record Ext.data.Model The Store data record which backs the row to be edited.
  		* @param columnHeader Ext.data.Model The Column object defining the column to be edited.
  		*/
  var startEdit: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel], Unit]
  ] = js.undefined
}

object IRowEditor {
  @scala.inline
  def apply(
    IPanel: typingsJapgolly.extjs.Ext.form.IPanel = null,
    getRefItems: js.UndefOr[Callback] = js.undefined,
    loadRecord: /* record */ js.UndefOr[js.Any] => CallbackTo[IBasic] = null,
    startEdit: (/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel]) => Callback = null
  ): IRowEditor = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    getRefItems.foreach(p => __obj.updateDynamic("getRefItems")(p.toJsFn))
    if (loadRecord != null) __obj.updateDynamic("loadRecord")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[js.Any]) => loadRecord(t0).runNow()))
    if (startEdit != null) __obj.updateDynamic("startEdit")(js.Any.fromFunction2((t0: /* record */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel], t1: /* columnHeader */ js.UndefOr[typingsJapgolly.extjs.Ext.data.IModel]) => startEdit(t0, t1).runNow()))
    __obj.asInstanceOf[IRowEditor]
  }
}

