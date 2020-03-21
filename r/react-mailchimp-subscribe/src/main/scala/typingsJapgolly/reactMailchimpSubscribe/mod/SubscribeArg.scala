package typingsJapgolly.reactMailchimpSubscribe.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeArg[FormFields] extends js.Object {
  def subscribe(data: FormFields): Unit
}

object SubscribeArg {
  @scala.inline
  def apply[FormFields](subscribe: FormFields => Callback): SubscribeArg[FormFields] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: FormFields) => subscribe(t0).runNow()))
    __obj.asInstanceOf[SubscribeArg[FormFields]]
  }
}

