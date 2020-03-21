package typingsJapgolly.sipJs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuiltinEnabled extends js.Object {
  var builtinEnabled: Boolean
  var connector: js.UndefOr[
    js.Function4[
      /* level */ String, 
      /* category */ String, 
      /* label */ js.UndefOr[String], 
      /* content */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var level: js.UndefOr[String | Double] = js.undefined
}

object AnonBuiltinEnabled {
  @scala.inline
  def apply(
    builtinEnabled: Boolean,
    connector: (/* level */ String, /* category */ String, /* label */ js.UndefOr[String], /* content */ js.Any) => Callback = null,
    level: String | Double = null
  ): AnonBuiltinEnabled = {
    val __obj = js.Dynamic.literal(builtinEnabled = builtinEnabled.asInstanceOf[js.Any])
    if (connector != null) __obj.updateDynamic("connector")(js.Any.fromFunction4((t0: /* level */ java.lang.String, t1: /* category */ java.lang.String, t2: /* label */ js.UndefOr[java.lang.String], t3: /* content */ js.Any) => connector(t0, t1, t2, t3).runNow()))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuiltinEnabled]
  }
}

