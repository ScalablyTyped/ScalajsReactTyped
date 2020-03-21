package typingsJapgolly.inboxsdk.mod.ButterBar

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destroyer extends js.Object {
  def destroy(): Unit
}

object Destroyer {
  @scala.inline
  def apply(destroy: Callback): Destroyer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[Destroyer]
  }
}

