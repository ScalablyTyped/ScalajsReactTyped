package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostCancellationToken extends js.Object {
  def isCancellationRequested(): Boolean
}

object HostCancellationToken {
  @scala.inline
  def apply(isCancellationRequested: CallbackTo[Boolean]): HostCancellationToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isCancellationRequested")(isCancellationRequested.toJsFn)
    __obj.asInstanceOf[HostCancellationToken]
  }
}

