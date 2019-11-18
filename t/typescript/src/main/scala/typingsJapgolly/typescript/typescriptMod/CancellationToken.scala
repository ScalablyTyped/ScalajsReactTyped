package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancellationToken extends js.Object {
  def isCancellationRequested(): Boolean
  /** @throws OperationCanceledException if isCancellationRequested is true */
  def throwIfCancellationRequested(): Unit
}

object CancellationToken {
  @scala.inline
  def apply(isCancellationRequested: CallbackTo[Boolean], throwIfCancellationRequested: Callback): CancellationToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isCancellationRequested")(isCancellationRequested.toJsFn)
    __obj.updateDynamic("throwIfCancellationRequested")(throwIfCancellationRequested.toJsFn)
    __obj.asInstanceOf[CancellationToken]
  }
}

