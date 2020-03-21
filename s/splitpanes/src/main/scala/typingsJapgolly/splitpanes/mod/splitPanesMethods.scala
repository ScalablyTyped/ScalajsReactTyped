package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesMethods extends js.Object {
  def bindEvents(): Unit
  def calculatePanesSize(drag: js.Object): Boolean | Unit
  def doPushOtherPanes(sums: js.Object, dragPercentage: Double): js.Any
  def findNextExpandedPane(splitterIndex: Double): js.Object
  def findPrevExpandedPane(splitterIndex: Double): js.Object
  def getCurrentDragPercentage(drag: js.Object): Double
  def getCurrentMouseDrag(e: Event_): positionTypes
  def onMouseDown(e: Event_, splitterIndex: Double): Unit
  def onMouseMove(e: Event_): Unit
  def onMouseUp(): Unit
  def onSplitterClick(e: Event_, splitterIndex: Double): Unit
  def onSplitterDblClick(e: Event_, splitterIndex: Double): Unit
  def sumNextPanesSize(splitterIndex: Double): js.Object
  def sumPrevPanesSize(splitterIndex: Double): js.Object
}

object splitPanesMethods {
  @scala.inline
  def apply(
    bindEvents: Callback,
    calculatePanesSize: js.Object => CallbackTo[Boolean | Unit],
    doPushOtherPanes: (js.Object, Double) => CallbackTo[js.Any],
    findNextExpandedPane: Double => CallbackTo[js.Object],
    findPrevExpandedPane: Double => CallbackTo[js.Object],
    getCurrentDragPercentage: js.Object => CallbackTo[Double],
    getCurrentMouseDrag: Event_ => CallbackTo[positionTypes],
    onMouseDown: (Event_, Double) => Callback,
    onMouseMove: Event_ => Callback,
    onMouseUp: Callback,
    onSplitterClick: (Event_, Double) => Callback,
    onSplitterDblClick: (Event_, Double) => Callback,
    sumNextPanesSize: Double => CallbackTo[js.Object],
    sumPrevPanesSize: Double => CallbackTo[js.Object]
  ): splitPanesMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindEvents")(bindEvents.toJsFn)
    __obj.updateDynamic("calculatePanesSize")(js.Any.fromFunction1((t0: js.Object) => calculatePanesSize(t0).runNow()))
    __obj.updateDynamic("doPushOtherPanes")(js.Any.fromFunction2((t0: js.Object, t1: scala.Double) => doPushOtherPanes(t0, t1).runNow()))
    __obj.updateDynamic("findNextExpandedPane")(js.Any.fromFunction1((t0: scala.Double) => findNextExpandedPane(t0).runNow()))
    __obj.updateDynamic("findPrevExpandedPane")(js.Any.fromFunction1((t0: scala.Double) => findPrevExpandedPane(t0).runNow()))
    __obj.updateDynamic("getCurrentDragPercentage")(js.Any.fromFunction1((t0: js.Object) => getCurrentDragPercentage(t0).runNow()))
    __obj.updateDynamic("getCurrentMouseDrag")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => getCurrentMouseDrag(t0).runNow()))
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: scala.Double) => onMouseDown(t0, t1).runNow()))
    __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => onMouseMove(t0).runNow()))
    __obj.updateDynamic("onMouseUp")(onMouseUp.toJsFn)
    __obj.updateDynamic("onSplitterClick")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: scala.Double) => onSplitterClick(t0, t1).runNow()))
    __obj.updateDynamic("onSplitterDblClick")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: scala.Double) => onSplitterDblClick(t0, t1).runNow()))
    __obj.updateDynamic("sumNextPanesSize")(js.Any.fromFunction1((t0: scala.Double) => sumNextPanesSize(t0).runNow()))
    __obj.updateDynamic("sumPrevPanesSize")(js.Any.fromFunction1((t0: scala.Double) => sumPrevPanesSize(t0).runNow()))
    __obj.asInstanceOf[splitPanesMethods]
  }
}

