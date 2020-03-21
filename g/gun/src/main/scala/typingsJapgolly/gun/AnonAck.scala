package typingsJapgolly.gun

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gun.gunNumbers.`2`
import typingsJapgolly.gun.mod.Gun.CryptoKeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAck extends js.Object {
  var ack: `2`
  var get: String
  var put: AnonAlias
  var sea: CryptoKeyPair
  var soul: String
  def on(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [unknown, unknown, unknown] is not an array type */ args: js.Tuple3[_, _, _]
  ): js.Any
}

object AnonAck {
  @scala.inline
  def apply(
    ack: `2`,
    get: String,
    on: js.Tuple3[js.Any, js.Any, js.Any] => CallbackTo[js.Any],
    put: AnonAlias,
    sea: CryptoKeyPair,
    soul: String
  ): AnonAck = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], sea = sea.asInstanceOf[js.Any], soul = soul.asInstanceOf[js.Any])
    __obj.updateDynamic("on")(js.Any.fromFunction1((t0: js.Tuple3[js.Any, js.Any, js.Any]) => on(t0).runNow()))
    __obj.asInstanceOf[AnonAck]
  }
}

