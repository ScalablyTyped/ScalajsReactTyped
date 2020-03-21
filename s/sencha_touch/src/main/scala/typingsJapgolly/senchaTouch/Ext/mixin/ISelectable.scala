package typingsJapgolly.senchaTouch.Ext.mixin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.data.IRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectable extends IBase {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects any currently selected records and clears all stored selections  */
  var clearSelections: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Deselects the given record s
  		* @param records Number/Array/Ext.data.Model The record(s) to deselect. Can also be a number to reference by index.
  		* @param suppressEvent Boolean If true the deselect event will not be fired.
  		*/
  var deselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Deselects all records
  		* @param supress Object
  		*/
  var deselectAll: js.UndefOr[js.Function1[/* supress */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var deselectOnContainerClick: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.undefined
  /** [Method] Deselects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param suppressEvent Boolean Set to false to not fire a deselect event.
  		*/
  var doDeselect: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param records Ext.data.Model/Number An array of records or an index.
  		* @param keepExisting Boolean
  		* @param suppressEvent Boolean Set to false to not fire a select event.
  		*/
  var doSelect: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of deselectOnContainerClick
  		* @returns Boolean
  		*/
  var getDeselectOnContainerClick: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of disableSelection
  		* @returns Boolean
  		*/
  var getDisableSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the array of previously selected items
  		* @returns Array The previous selection.
  		*/
  var getLastSelected: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of mode
  		* @returns String
  		*/
  var getMode: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns an array of the currently selected records
  		* @returns Array An array of selected records.
  		*/
  var getSelection: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the number of selections
  		* @returns Number
  		*/
  var getSelectionCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the selection mode currently used by this Selectable
  		* @returns String The current mode.
  		*/
  var getSelectionMode: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns true if there is a selected record
  		* @returns Boolean
  		*/
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the Selectable is currently locked
  		* @returns Boolean True if currently locked
  		*/
  var isLocked: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if the specified row is selected
  		* @param record Ext.data.Model/Number The record or index of the record to check.
  		* @returns Boolean
  		*/
  var isSelected: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var mode: js.UndefOr[String] = js.undefined
  /** [Method] Adds the given records to the currently selected set
  		* @param records Ext.data.Model/Array/Number The records to select.
  		* @param keepExisting Boolean If true, the existing selection will be added to (if not, the old selection is replaced).
  		* @param suppressEvent Boolean If true, the select event will not be fired.
  		*/
  var select: js.UndefOr[
    js.Function3[
      /* records */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Selects all records
  		* @param silent Boolean true to suppress all select events.
  		*/
  var selectAll: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Selects a range of rows if the selection model getDisableSelection is not locked
  		* @param startRecord Number The index of the first row in the range.
  		* @param endRecord Number The index of the last row in the range.
  		* @param keepExisting Boolean true to retain existing selections.
  		*/
  var selectRange: js.UndefOr[
    js.Function3[
      /* startRecord */ js.UndefOr[Double], 
      /* endRecord */ js.UndefOr[Double], 
      /* keepExisting */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of deselectOnContainerClick
  		* @param deselectOnContainerClick Boolean The new value.
  		*/
  var setDeselectOnContainerClick: js.UndefOr[js.Function1[/* deselectOnContainerClick */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of disableSelection
  		* @param disableSelection Boolean The new value.
  		*/
  var setDisableSelection: js.UndefOr[js.Function1[/* disableSelection */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] This was an internal function accidentally exposed in 1 x and now deprecated  */
  var setLastFocused: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of mode
  		* @param mode String The new value.
  		*/
  var setMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets a record as the last focused record
  		* @param newRecord Ext.data.Record
  		* @param oldRecord Ext.data.Record
  		*/
  var updateLastFocused: js.UndefOr[
    js.Function2[/* newRecord */ js.UndefOr[IRecord], /* oldRecord */ js.UndefOr[IRecord], Unit]
  ] = js.undefined
}

object ISelectable {
  @scala.inline
  def apply(
    alias: Array = null,
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clearSelections: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    deselect: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Callback = null,
    deselectAll: /* supress */ js.UndefOr[js.Any] => Callback = null,
    deselectOnContainerClick: js.UndefOr[Boolean] = js.undefined,
    destroy: js.UndefOr[Callback] = js.undefined,
    disableSelection: js.UndefOr[Boolean] = js.undefined,
    doDeselect: (/* records */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Callback = null,
    doSelect: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Callback = null,
    extend: String = null,
    getAllowDeselect: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getDeselectOnContainerClick: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getDisableSelection: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getLastSelected: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getMode: js.UndefOr[CallbackTo[String]] = js.undefined,
    getSelection: js.UndefOr[CallbackTo[Array]] = js.undefined,
    getSelectionCount: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getSelectionMode: js.UndefOr[CallbackTo[String]] = js.undefined,
    hasSelection: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    isLocked: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isSelected: /* record */ js.UndefOr[js.Any] => CallbackTo[Boolean] = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    mode: String = null,
    platformConfig: js.Any = null,
    select: (/* records */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Callback = null,
    selectAll: /* silent */ js.UndefOr[Boolean] => Callback = null,
    selectRange: (/* startRecord */ js.UndefOr[Double], /* endRecord */ js.UndefOr[Double], /* keepExisting */ js.UndefOr[Boolean]) => Callback = null,
    self: IClass = null,
    setAllowDeselect: /* allowDeselect */ js.UndefOr[Boolean] => Callback = null,
    setDeselectOnContainerClick: /* deselectOnContainerClick */ js.UndefOr[Boolean] => Callback = null,
    setDisableSelection: /* disableSelection */ js.UndefOr[Boolean] => Callback = null,
    setLastFocused: js.UndefOr[Callback] = js.undefined,
    setMode: /* mode */ js.UndefOr[String] => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    updateLastFocused: (/* newRecord */ js.UndefOr[IRecord], /* oldRecord */ js.UndefOr[IRecord]) => Callback = null,
    uses: Array = null
  ): ISelectable = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clearSelections.foreach(p => __obj.updateDynamic("clearSelections")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (deselect != null) __obj.updateDynamic("deselect")(js.Any.fromFunction2((t0: /* records */ js.UndefOr[js.Any], t1: /* suppressEvent */ js.UndefOr[scala.Boolean]) => deselect(t0, t1).runNow()))
    if (deselectAll != null) __obj.updateDynamic("deselectAll")(js.Any.fromFunction1((t0: /* supress */ js.UndefOr[js.Any]) => deselectAll(t0).runNow()))
    if (!js.isUndefined(deselectOnContainerClick)) __obj.updateDynamic("deselectOnContainerClick")(deselectOnContainerClick.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (!js.isUndefined(disableSelection)) __obj.updateDynamic("disableSelection")(disableSelection.asInstanceOf[js.Any])
    if (doDeselect != null) __obj.updateDynamic("doDeselect")(js.Any.fromFunction2((t0: /* records */ js.UndefOr[js.Any], t1: /* suppressEvent */ js.UndefOr[scala.Boolean]) => doDeselect(t0, t1).runNow()))
    if (doSelect != null) __obj.updateDynamic("doSelect")(js.Any.fromFunction3((t0: /* records */ js.UndefOr[js.Any], t1: /* keepExisting */ js.UndefOr[scala.Boolean], t2: /* suppressEvent */ js.UndefOr[scala.Boolean]) => doSelect(t0, t1, t2).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    getAllowDeselect.foreach(p => __obj.updateDynamic("getAllowDeselect")(p.toJsFn))
    getCount.foreach(p => __obj.updateDynamic("getCount")(p.toJsFn))
    getDeselectOnContainerClick.foreach(p => __obj.updateDynamic("getDeselectOnContainerClick")(p.toJsFn))
    getDisableSelection.foreach(p => __obj.updateDynamic("getDisableSelection")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getLastSelected.foreach(p => __obj.updateDynamic("getLastSelected")(p.toJsFn))
    getMode.foreach(p => __obj.updateDynamic("getMode")(p.toJsFn))
    getSelection.foreach(p => __obj.updateDynamic("getSelection")(p.toJsFn))
    getSelectionCount.foreach(p => __obj.updateDynamic("getSelectionCount")(p.toJsFn))
    getSelectionMode.foreach(p => __obj.updateDynamic("getSelectionMode")(p.toJsFn))
    hasSelection.foreach(p => __obj.updateDynamic("hasSelection")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    isLocked.foreach(p => __obj.updateDynamic("isLocked")(p.toJsFn))
    if (isSelected != null) __obj.updateDynamic("isSelected")(js.Any.fromFunction1((t0: /* record */ js.UndefOr[js.Any]) => isSelected(t0).runNow()))
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction3((t0: /* records */ js.UndefOr[js.Any], t1: /* keepExisting */ js.UndefOr[scala.Boolean], t2: /* suppressEvent */ js.UndefOr[scala.Boolean]) => select(t0, t1, t2).runNow()))
    if (selectAll != null) __obj.updateDynamic("selectAll")(js.Any.fromFunction1((t0: /* silent */ js.UndefOr[scala.Boolean]) => selectAll(t0).runNow()))
    if (selectRange != null) __obj.updateDynamic("selectRange")(js.Any.fromFunction3((t0: /* startRecord */ js.UndefOr[scala.Double], t1: /* endRecord */ js.UndefOr[scala.Double], t2: /* keepExisting */ js.UndefOr[scala.Boolean]) => selectRange(t0, t1, t2).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAllowDeselect != null) __obj.updateDynamic("setAllowDeselect")(js.Any.fromFunction1((t0: /* allowDeselect */ js.UndefOr[scala.Boolean]) => setAllowDeselect(t0).runNow()))
    if (setDeselectOnContainerClick != null) __obj.updateDynamic("setDeselectOnContainerClick")(js.Any.fromFunction1((t0: /* deselectOnContainerClick */ js.UndefOr[scala.Boolean]) => setDeselectOnContainerClick(t0).runNow()))
    if (setDisableSelection != null) __obj.updateDynamic("setDisableSelection")(js.Any.fromFunction1((t0: /* disableSelection */ js.UndefOr[scala.Boolean]) => setDisableSelection(t0).runNow()))
    setLastFocused.foreach(p => __obj.updateDynamic("setLastFocused")(p.toJsFn))
    if (setMode != null) __obj.updateDynamic("setMode")(js.Any.fromFunction1((t0: /* mode */ js.UndefOr[java.lang.String]) => setMode(t0).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (updateLastFocused != null) __obj.updateDynamic("updateLastFocused")(js.Any.fromFunction2((t0: /* newRecord */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRecord], t1: /* oldRecord */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.IRecord]) => updateLastFocused(t0, t1).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectable]
  }
}

