package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSets extends js.Object {
  val Count: Double
  def Clone(): IDataSets
  def Item(Index: Double): IDataSet
}

object IDataSets {
  @scala.inline
  def apply(Clone: CallbackTo[IDataSets], Count: Double, Item: Double => CallbackTo[IDataSet]): IDataSets = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[IDataSets]
  }
}

