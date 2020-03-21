package typingsJapgolly.reactAsync

import typingsJapgolly.reactAsync.mod.RejectedChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenPersist[T] extends js.Object {
  var children: js.UndefOr[RejectedChildren[T]] = js.undefined
  var persist: js.UndefOr[Boolean] = js.undefined
}

object AnonChildrenPersist {
  @scala.inline
  def apply[T](children: RejectedChildren[T] = null, persist: js.UndefOr[Boolean] = js.undefined): AnonChildrenPersist[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenPersist[T]]
  }
}

