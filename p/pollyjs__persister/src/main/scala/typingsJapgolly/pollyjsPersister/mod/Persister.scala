package typingsJapgolly.pollyjsPersister.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persister extends js.Object {
  val options: js.Any
  def persist(): js.Promise[Unit]
}

object Persister {
  @scala.inline
  def apply(options: js.Any, persist: CallbackTo[js.Promise[Unit]]): Persister = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("persist")(persist.toJsFn)
    __obj.asInstanceOf[Persister]
  }
}

