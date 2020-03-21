package typingsJapgolly.crossfilter.CrossFilter

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossFilter[T] extends js.Object {
  def GroupAll(): typingsJapgolly.crossfilter.CrossFilter.GroupAll[T, T]
  def add(records: js.Array[T]): typingsJapgolly.crossfilter.CrossFilter.CrossFilter[T]
  def dimension[TDimension](value: js.Function1[/* data */ T, TDimension]): Dimension[T, TDimension]
  def groupAll[TValue](): GroupAll[T, TValue]
  def remove(): typingsJapgolly.crossfilter.CrossFilter.CrossFilter[T]
  def size(): Double
}

object CrossFilter {
  @scala.inline
  def apply[T](
    GroupAll: CallbackTo[GroupAll[T, T]],
    add: js.Array[T] => CallbackTo[typingsJapgolly.crossfilter.CrossFilter.CrossFilter[T]],
    dimension: js.Function1[/* data */ T, js.Any] => CallbackTo[Dimension[T, js.Any]],
    groupAll: CallbackTo[GroupAll[T, js.Any]],
    remove: CallbackTo[typingsJapgolly.crossfilter.CrossFilter.CrossFilter[T]],
    size: CallbackTo[Double]
  ): CrossFilter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GroupAll")(GroupAll.toJsFn)
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: js.Array[T]) => add(t0).runNow()))
    __obj.updateDynamic("dimension")(js.Any.fromFunction1((t0: js.Function1[/* data */ T, js.Any]) => dimension(t0).runNow()))
    __obj.updateDynamic("groupAll")(groupAll.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[CrossFilter[T]]
  }
}

