package typingsJapgolly.agGrid.iFilterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilter extends js.Object {
  /** If using React or Angular 2, returns the underlying component instance, so you can call methods
    * on it if you want. */
  var getFrameworkComponentInstance: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Optional method used by ag-Grid when rendering floating filters and there isn't a floating filter
    * associated for this filter, this will happen if you create a custom filter and NOT a custom floating
    * filter.
    */
  var getModelAsString: js.UndefOr[js.Function1[/* model */ js.Any, String]] = js.undefined
  /**
    * Optional method used by ag-Grid when rendering floating filters.
    *
    * If this method IS NOT IMPLEMENTED, when the floating filter changes, ag-Grid will automatically call
    * IFilterParams.filterChangedCallback,  triggering the filtering of the data based on the changes from
    * the floating filter. For the simplest cases this is enough.
    *
    * IF IT IS IMPLEMENTED. ag-Grid will delegate into this method the responsibility of calling
    * IFilterParams.filterChangedCallback. This is useful if additional logic is necessary, for instance
    * ag-Grid uses this in addition with the applyNow flag to handle the apply button logic in the default
    * ag-Grid filters.
    *
    *     change: The exact same object passed on FloatingFilter.onFloatingFilterChanged
    */
  var onFloatingFilterChanged: js.UndefOr[js.Function1[/* change */ js.Any, Unit]] = js.undefined
  /** Gets called when new rows are inserted into the grid. If the filter needs to change it's state
    after rows are loaded, it can do it here. */
  var onNewRowsLoaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** The grid will ask each active filter, in turn, whether each row in the grid passes. If any
    filter fails, then the row will be excluded from the final set. The method is provided a
    params object with attributes node (the rodNode the grid creates that wraps the data) and data
    (the data object that you provided to the grid for that row). */
  def doesFilterPass(params: IDoesFilterPassParams): Boolean
  /** Gets the filter state for storing */
  def getModel(): js.Any
  /** This is used to show the filter icon in the header. If true, the filter icon will be shown. */
  def isFilterActive(): Boolean
  /** Restores the filter state. */
  def setModel(model: js.Any): Unit
}

object IFilter {
  @scala.inline
  def apply(
    doesFilterPass: IDoesFilterPassParams => CallbackTo[Boolean],
    getModel: CallbackTo[js.Any],
    isFilterActive: CallbackTo[Boolean],
    setModel: js.Any => Callback,
    getFrameworkComponentInstance: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    getModelAsString: /* model */ js.Any => CallbackTo[String] = null,
    onFloatingFilterChanged: /* change */ js.Any => Callback = null,
    onNewRowsLoaded: js.UndefOr[Callback] = js.undefined
  ): IFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("doesFilterPass")(js.Any.fromFunction1((t0: typingsJapgolly.agGrid.iFilterMod.IDoesFilterPassParams) => doesFilterPass(t0).runNow()))
    __obj.updateDynamic("getModel")(getModel.toJsFn)
    __obj.updateDynamic("isFilterActive")(isFilterActive.toJsFn)
    __obj.updateDynamic("setModel")(js.Any.fromFunction1((t0: js.Any) => setModel(t0).runNow()))
    getFrameworkComponentInstance.foreach(p => __obj.updateDynamic("getFrameworkComponentInstance")(p.toJsFn))
    if (getModelAsString != null) __obj.updateDynamic("getModelAsString")(js.Any.fromFunction1((t0: /* model */ js.Any) => getModelAsString(t0).runNow()))
    if (onFloatingFilterChanged != null) __obj.updateDynamic("onFloatingFilterChanged")(js.Any.fromFunction1((t0: /* change */ js.Any) => onFloatingFilterChanged(t0).runNow()))
    onNewRowsLoaded.foreach(p => __obj.updateDynamic("onNewRowsLoaded")(p.toJsFn))
    __obj.asInstanceOf[IFilter]
  }
}

