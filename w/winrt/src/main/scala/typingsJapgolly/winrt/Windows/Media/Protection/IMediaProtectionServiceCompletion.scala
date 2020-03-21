package typingsJapgolly.winrt.Windows.Media.Protection

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaProtectionServiceCompletion extends js.Object {
  def complete(success: Boolean): Unit
}

object IMediaProtectionServiceCompletion {
  @scala.inline
  def apply(complete: Boolean => Callback): IMediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: scala.Boolean) => complete(t0).runNow()))
    __obj.asInstanceOf[IMediaProtectionServiceCompletion]
  }
}

