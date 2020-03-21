package typingsJapgolly.reduxPersist.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform[HSS, ESS, S, RS] extends js.Object {
  var in: TransformInbound[HSS, ESS, S]
  var out: TransformOutbound[ESS, HSS, RS]
}

object Transform {
  @scala.inline
  def apply[HSS, ESS, S, RS](
    in: (HSS, /* key */ String, S) => CallbackTo[ESS],
    out: (ESS, /* key */ String, RS) => CallbackTo[HSS]
  ): Transform[HSS, ESS, S, RS] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("in")(js.Any.fromFunction3((t0: HSS, t1: /* key */ java.lang.String, t2: S) => in(t0, t1, t2).runNow()))
    __obj.updateDynamic("out")(js.Any.fromFunction3((t0: ESS, t1: /* key */ java.lang.String, t2: RS) => out(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Transform[HSS, ESS, S, RS]]
  }
}

