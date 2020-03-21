package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Runner[T /* <: js.Object */, U] extends js.Object {
  def run(options: T): js.Promise[U]
}

object Runner {
  @scala.inline
  def apply[T /* <: js.Object */, U](run: T => CallbackTo[js.Promise[U]]): Runner[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: T) => run(t0).runNow()))
    __obj.asInstanceOf[Runner[T, U]]
  }
}

