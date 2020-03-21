package typingsJapgolly.reduxSagaCore.effectsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEffectDescriptor extends js.Object {
  var args: js.Array[_]
  def selector(state: js.Any, args: js.Any*): js.Any
}

object SelectEffectDescriptor {
  @scala.inline
  def apply(args: js.Array[_], selector: (js.Any, /* repeated */ js.Any) => CallbackTo[js.Any]): SelectEffectDescriptor = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("selector")(js.Any.fromFunction2((t0: js.Any, t1: /* repeated */ js.Any) => selector(t0, t1).runNow()))
    __obj.asInstanceOf[SelectEffectDescriptor]
  }
}

