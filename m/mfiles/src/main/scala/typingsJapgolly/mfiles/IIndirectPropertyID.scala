package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndirectPropertyID extends js.Object {
  val Count: Double
  def Add(Index: Double, IndirectPropertyIDLevel: IIndirectPropertyIDLevel): Unit
  def Clone(): IIndirectPropertyID
  def EqualTo(IndirectPropertyID: IIndirectPropertyID): Boolean
  def Item(Index: Double): IIndirectPropertyIDLevel
  def Remove(Index: Double): Unit
  def ToJSON(): String
}

object IIndirectPropertyID {
  @scala.inline
  def apply(
    Add: (Double, IIndirectPropertyIDLevel) => Callback,
    Clone: CallbackTo[IIndirectPropertyID],
    Count: Double,
    EqualTo: IIndirectPropertyID => CallbackTo[Boolean],
    Item: Double => CallbackTo[IIndirectPropertyIDLevel],
    Remove: Double => Callback,
    ToJSON: CallbackTo[String]
  ): IIndirectPropertyID = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.IIndirectPropertyIDLevel) => Add(t0, t1).runNow()))
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("EqualTo")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IIndirectPropertyID) => EqualTo(t0).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.updateDynamic("ToJSON")(ToJSON.toJsFn)
    __obj.asInstanceOf[IIndirectPropertyID]
  }
}

