package typingsJapgolly.nodelibFsWalk.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var directory: String
}

object QueueItem {
  @scala.inline
  def apply(directory: String, base: String = null): QueueItem = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
}

