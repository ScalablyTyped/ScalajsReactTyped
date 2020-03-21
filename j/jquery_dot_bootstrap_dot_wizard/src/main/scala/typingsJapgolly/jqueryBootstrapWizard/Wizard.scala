package typingsJapgolly.jqueryBootstrapWizard

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wizard extends js.Object {
  def activeTab(): js.Any
  def currentIndex(): Double
  def first(): Unit
  def firstIndex(): Double
  def getIndex(element: js.Any): Double
  def last(): Unit
  def lastIndex(): Double
  def navigationLength(): Double
  def next(): Unit
  def nextIndex(): Double
  def nextTab(): js.Any
  def previous(): Unit
  def previousIndex(): Double
  def previousTab(): js.Any
  def show(index: Double): js.Any
}

object Wizard {
  @scala.inline
  def apply(
    activeTab: CallbackTo[js.Any],
    currentIndex: CallbackTo[Double],
    first: Callback,
    firstIndex: CallbackTo[Double],
    getIndex: js.Any => CallbackTo[Double],
    last: Callback,
    lastIndex: CallbackTo[Double],
    navigationLength: CallbackTo[Double],
    next: Callback,
    nextIndex: CallbackTo[Double],
    nextTab: CallbackTo[js.Any],
    previous: Callback,
    previousIndex: CallbackTo[Double],
    previousTab: CallbackTo[js.Any],
    show: Double => CallbackTo[js.Any]
  ): Wizard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeTab")(activeTab.toJsFn)
    __obj.updateDynamic("currentIndex")(currentIndex.toJsFn)
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("firstIndex")(firstIndex.toJsFn)
    __obj.updateDynamic("getIndex")(js.Any.fromFunction1((t0: js.Any) => getIndex(t0).runNow()))
    __obj.updateDynamic("last")(last.toJsFn)
    __obj.updateDynamic("lastIndex")(lastIndex.toJsFn)
    __obj.updateDynamic("navigationLength")(navigationLength.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("nextIndex")(nextIndex.toJsFn)
    __obj.updateDynamic("nextTab")(nextTab.toJsFn)
    __obj.updateDynamic("previous")(previous.toJsFn)
    __obj.updateDynamic("previousIndex")(previousIndex.toJsFn)
    __obj.updateDynamic("previousTab")(previousTab.toJsFn)
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: scala.Double) => show(t0).runNow()))
    __obj.asInstanceOf[Wizard]
  }
}

