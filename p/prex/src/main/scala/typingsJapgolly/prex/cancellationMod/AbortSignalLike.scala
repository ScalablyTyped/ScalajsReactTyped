package typingsJapgolly.prex.cancellationMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.prex.prexStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortSignalLike extends js.Object {
  val aborted: Boolean
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, callback: js.Function0[_]): js.Any
}

object AbortSignalLike {
  @scala.inline
  def apply(aborted: Boolean, addEventListener: (abort, js.Function0[js.Any]) => CallbackTo[js.Any]): AbortSignalLike = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.prex.prexStrings.abort, t1: js.Function0[js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.asInstanceOf[AbortSignalLike]
  }
}

