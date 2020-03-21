package typingsJapgolly.inboxsdk.mod.ButterBar

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavingResolver extends js.Object {
  def reject(): Unit
  def resolve(): Unit
}

object SavingResolver {
  @scala.inline
  def apply(reject: Callback, resolve: Callback): SavingResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reject")(reject.toJsFn)
    __obj.updateDynamic("resolve")(resolve.toJsFn)
    __obj.asInstanceOf[SavingResolver]
  }
}

