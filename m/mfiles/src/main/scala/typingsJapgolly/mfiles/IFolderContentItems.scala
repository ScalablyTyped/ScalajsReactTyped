package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderContentItems extends js.Object {
  val Count: Double
  val MoreResults: Boolean
  def Item(Index: Double): IFolderContentItem
}

object IFolderContentItems {
  @scala.inline
  def apply(Count: Double, Item: Double => CallbackTo[IFolderContentItem], MoreResults: Boolean): IFolderContentItems = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any])
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.asInstanceOf[IFolderContentItems]
  }
}

