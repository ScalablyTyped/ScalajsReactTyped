package typingsJapgolly.expressValidator.contextItemMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.expressValidator.baseMod.Meta
import typingsJapgolly.expressValidator.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextItem extends js.Object {
  def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit]
}

object ContextItem {
  @scala.inline
  def apply(run: (Context, js.Any, Meta) => CallbackTo[js.Promise[Unit]]): ContextItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(js.Any.fromFunction3((t0: typingsJapgolly.expressValidator.contextMod.Context, t1: js.Any, t2: typingsJapgolly.expressValidator.baseMod.Meta) => run(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ContextItem]
  }
}

