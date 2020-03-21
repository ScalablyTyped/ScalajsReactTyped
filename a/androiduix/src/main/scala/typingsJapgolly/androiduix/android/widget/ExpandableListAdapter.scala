package typingsJapgolly.androiduix.android.widget

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.database.DataSetObserver
import typingsJapgolly.androiduix.android.view.View
import typingsJapgolly.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandableListAdapter extends js.Object {
  def areAllItemsEnabled(): Boolean
  def getChild(groupPosition: Double, childPosition: Double): js.Any
  def getChildId(groupPosition: Double, childPosition: Double): Double
  def getChildView(
    groupPosition: Double,
    childPosition: Double,
    isLastChild: Boolean,
    convertView: View,
    parent: ViewGroup
  ): View
  def getChildrenCount(groupPosition: Double): Double
  def getCombinedChildId(groupId: Double, childId: Double): Double
  def getCombinedGroupId(groupId: Double): Double
  def getGroup(groupPosition: Double): js.Any
  def getGroupCount(): Double
  def getGroupId(groupPosition: Double): Double
  def getGroupView(groupPosition: Double, isExpanded: Boolean, convertView: View, parent: ViewGroup): View
  def hasStableIds(): Boolean
  def isChildSelectable(groupPosition: Double, childPosition: Double): Boolean
  def isEmpty(): Boolean
  def onGroupCollapsed(groupPosition: Double): Unit
  def onGroupExpanded(groupPosition: Double): Unit
  def registerDataSetObserver(observer: DataSetObserver): Unit
  def unregisterDataSetObserver(observer: DataSetObserver): Unit
}

object ExpandableListAdapter {
  @scala.inline
  def apply(
    areAllItemsEnabled: CallbackTo[Boolean],
    getChild: (Double, Double) => CallbackTo[js.Any],
    getChildId: (Double, Double) => CallbackTo[Double],
    getChildView: (Double, Double, Boolean, View, ViewGroup) => CallbackTo[View],
    getChildrenCount: Double => CallbackTo[Double],
    getCombinedChildId: (Double, Double) => CallbackTo[Double],
    getCombinedGroupId: Double => CallbackTo[Double],
    getGroup: Double => CallbackTo[js.Any],
    getGroupCount: CallbackTo[Double],
    getGroupId: Double => CallbackTo[Double],
    getGroupView: (Double, Boolean, View, ViewGroup) => CallbackTo[View],
    hasStableIds: CallbackTo[Boolean],
    isChildSelectable: (Double, Double) => CallbackTo[Boolean],
    isEmpty: CallbackTo[Boolean],
    onGroupCollapsed: Double => Callback,
    onGroupExpanded: Double => Callback,
    registerDataSetObserver: DataSetObserver => Callback,
    unregisterDataSetObserver: DataSetObserver => Callback
  ): ExpandableListAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("areAllItemsEnabled")(areAllItemsEnabled.toJsFn)
    __obj.updateDynamic("getChild")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getChild(t0, t1).runNow()))
    __obj.updateDynamic("getChildId")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getChildId(t0, t1).runNow()))
    __obj.updateDynamic("getChildView")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Boolean, t3: typingsJapgolly.androiduix.android.view.View, t4: typingsJapgolly.androiduix.android.view.ViewGroup) => getChildView(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("getChildrenCount")(js.Any.fromFunction1((t0: scala.Double) => getChildrenCount(t0).runNow()))
    __obj.updateDynamic("getCombinedChildId")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getCombinedChildId(t0, t1).runNow()))
    __obj.updateDynamic("getCombinedGroupId")(js.Any.fromFunction1((t0: scala.Double) => getCombinedGroupId(t0).runNow()))
    __obj.updateDynamic("getGroup")(js.Any.fromFunction1((t0: scala.Double) => getGroup(t0).runNow()))
    __obj.updateDynamic("getGroupCount")(getGroupCount.toJsFn)
    __obj.updateDynamic("getGroupId")(js.Any.fromFunction1((t0: scala.Double) => getGroupId(t0).runNow()))
    __obj.updateDynamic("getGroupView")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Boolean, t2: typingsJapgolly.androiduix.android.view.View, t3: typingsJapgolly.androiduix.android.view.ViewGroup) => getGroupView(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("hasStableIds")(hasStableIds.toJsFn)
    __obj.updateDynamic("isChildSelectable")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => isChildSelectable(t0, t1).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("onGroupCollapsed")(js.Any.fromFunction1((t0: scala.Double) => onGroupCollapsed(t0).runNow()))
    __obj.updateDynamic("onGroupExpanded")(js.Any.fromFunction1((t0: scala.Double) => onGroupExpanded(t0).runNow()))
    __obj.updateDynamic("registerDataSetObserver")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.database.DataSetObserver) => registerDataSetObserver(t0).runNow()))
    __obj.updateDynamic("unregisterDataSetObserver")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.database.DataSetObserver) => unregisterDataSetObserver(t0).runNow()))
    __obj.asInstanceOf[ExpandableListAdapter]
  }
}

