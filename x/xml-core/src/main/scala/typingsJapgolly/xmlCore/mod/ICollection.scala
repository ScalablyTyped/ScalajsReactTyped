package typingsJapgolly.xmlCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollection[I] extends js.Object {
  val Count: Double
  def Add(item: I): Unit
  def Clear(): Unit
  def Every(cb: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean
  def Filter(cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): ICollection[I]
  def ForEach(cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit]): Unit
  def GetIterator(): js.Array[I]
  def IsEmpty(): Boolean
  def Item(index: Double): I | Null
  def Map[U](cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], U]): ICollection[U]
  def Pop(): js.UndefOr[I]
  def RemoveAt(index: Double): Unit
  def Some(cb: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean
  def Sort(cb: js.Function2[/* a */ I, /* b */ I, Double]): ICollection[I]
}

object ICollection {
  @scala.inline
  def apply[I](
    Add: I => Callback,
    Clear: Callback,
    Count: Double,
    Every: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => CallbackTo[Boolean],
    Filter: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => CallbackTo[ICollection[I]],
    ForEach: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit] => Callback,
    GetIterator: CallbackTo[js.Array[I]],
    IsEmpty: CallbackTo[Boolean],
    Item: Double => CallbackTo[I | Null],
    Map: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], js.Any] => CallbackTo[ICollection[js.Any]],
    Pop: CallbackTo[js.UndefOr[I]],
    RemoveAt: Double => Callback,
    Some: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => CallbackTo[Boolean],
    Sort: js.Function2[/* a */ I, /* b */ I, Double] => CallbackTo[ICollection[I]]
  ): ICollection[I] = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction1((t0: I) => Add(t0).runNow()))
    __obj.updateDynamic("Clear")(Clear.toJsFn)
    __obj.updateDynamic("Every")(js.Any.fromFunction1((t0: js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]) => Every(t0).runNow()))
    __obj.updateDynamic("Filter")(js.Any.fromFunction1((t0: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]) => Filter(t0).runNow()))
    __obj.updateDynamic("ForEach")(js.Any.fromFunction1((t0: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Unit]) => ForEach(t0).runNow()))
    __obj.updateDynamic("GetIterator")(GetIterator.toJsFn)
    __obj.updateDynamic("IsEmpty")(IsEmpty.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Map")(js.Any.fromFunction1((t0: js.Function3[/* item */ I, /* index */ scala.Double, /* array */ js.Array[I], js.Any]) => Map(t0).runNow()))
    __obj.updateDynamic("Pop")(Pop.toJsFn)
    __obj.updateDynamic("RemoveAt")(js.Any.fromFunction1((t0: scala.Double) => RemoveAt(t0).runNow()))
    __obj.updateDynamic("Some")(js.Any.fromFunction1((t0: js.Function3[/* value */ I, /* index */ scala.Double, /* array */ js.Array[I], scala.Boolean]) => Some(t0).runNow()))
    __obj.updateDynamic("Sort")(js.Any.fromFunction1((t0: js.Function2[/* a */ I, /* b */ I, scala.Double]) => Sort(t0).runNow()))
    __obj.asInstanceOf[ICollection[I]]
  }
}

