package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITraditionalFolders extends js.Object {
  val Count: Double
  def Item(Index: Double): ITraditionalFolder
}

object ITraditionalFolders {
  @scala.inline
  def apply(Count: Double, Item: Double => CallbackTo[ITraditionalFolder]): ITraditionalFolders = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[ITraditionalFolders]
  }
}

