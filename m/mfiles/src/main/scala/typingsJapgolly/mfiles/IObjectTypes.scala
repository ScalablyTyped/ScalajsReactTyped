package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypes extends js.Object {
  val Count: Double
  def Clone(): IObjectTypes
  def Item(Index: Double): IObjectType
}

object IObjectTypes {
  @scala.inline
  def apply(Clone: CallbackTo[IObjectTypes], Count: Double, Item: Double => CallbackTo[IObjectType]): IObjectTypes = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[IObjectTypes]
  }
}

