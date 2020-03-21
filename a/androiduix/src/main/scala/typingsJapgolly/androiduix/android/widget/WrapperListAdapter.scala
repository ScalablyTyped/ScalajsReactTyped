package typingsJapgolly.androiduix.android.widget

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.database.DataSetObserver
import typingsJapgolly.androiduix.android.view.View
import typingsJapgolly.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperListAdapter extends ListAdapter {
  def getWrappedAdapter(): ListAdapter
}

object WrapperListAdapter {
  @scala.inline
  def apply(
    areAllItemsEnabled: CallbackTo[Boolean],
    getCount: CallbackTo[Double],
    getItem: Double => CallbackTo[js.Any],
    getItemId: Double => CallbackTo[Double],
    getItemViewType: Double => CallbackTo[Double],
    getView: (Double, View, ViewGroup) => CallbackTo[View],
    getViewTypeCount: CallbackTo[Double],
    getWrappedAdapter: CallbackTo[ListAdapter],
    hasStableIds: CallbackTo[Boolean],
    isEmpty: CallbackTo[Boolean],
    isEnabled: Double => CallbackTo[Boolean],
    registerDataSetObserver: DataSetObserver => Callback,
    unregisterDataSetObserver: DataSetObserver => Callback
  ): WrapperListAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("areAllItemsEnabled")(areAllItemsEnabled.toJsFn)
    __obj.updateDynamic("getCount")(getCount.toJsFn)
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: scala.Double) => getItem(t0).runNow()))
    __obj.updateDynamic("getItemId")(js.Any.fromFunction1((t0: scala.Double) => getItemId(t0).runNow()))
    __obj.updateDynamic("getItemViewType")(js.Any.fromFunction1((t0: scala.Double) => getItemViewType(t0).runNow()))
    __obj.updateDynamic("getView")(js.Any.fromFunction3((t0: scala.Double, t1: typingsJapgolly.androiduix.android.view.View, t2: typingsJapgolly.androiduix.android.view.ViewGroup) => getView(t0, t1, t2).runNow()))
    __obj.updateDynamic("getViewTypeCount")(getViewTypeCount.toJsFn)
    __obj.updateDynamic("getWrappedAdapter")(getWrappedAdapter.toJsFn)
    __obj.updateDynamic("hasStableIds")(hasStableIds.toJsFn)
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("isEnabled")(js.Any.fromFunction1((t0: scala.Double) => isEnabled(t0).runNow()))
    __obj.updateDynamic("registerDataSetObserver")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.database.DataSetObserver) => registerDataSetObserver(t0).runNow()))
    __obj.updateDynamic("unregisterDataSetObserver")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.database.DataSetObserver) => unregisterDataSetObserver(t0).runNow()))
    __obj.asInstanceOf[WrapperListAdapter]
  }
}

