package typingsJapgolly.knockoutPaging

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutSubscription extends js.Object {
  def dispose(): Unit
}

object KnockoutSubscription {
  @scala.inline
  def apply(dispose: Callback): KnockoutSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[KnockoutSubscription]
  }
}

