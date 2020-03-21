package typingsJapgolly.koaSessionMinimal

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegenerateId extends js.Object {
  def regenerateId(): Unit
}

object AnonRegenerateId {
  @scala.inline
  def apply(regenerateId: Callback): AnonRegenerateId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("regenerateId")(regenerateId.toJsFn)
    __obj.asInstanceOf[AnonRegenerateId]
  }
}

