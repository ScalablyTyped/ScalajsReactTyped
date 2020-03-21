package typingsJapgolly.ethers.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncProvider extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var isMetaMask: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  def sendAsync(request: js.Any, callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]): Unit
}

object AsyncProvider {
  @scala.inline
  def apply(
    sendAsync: (js.Any, js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]) => Callback,
    host: String = null,
    isMetaMask: js.UndefOr[Boolean] = js.undefined,
    path: String = null
  ): AsyncProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sendAsync")(js.Any.fromFunction2((t0: js.Any, t1: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]) => sendAsync(t0, t1).runNow()))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(isMetaMask)) __obj.updateDynamic("isMetaMask")(isMetaMask.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncProvider]
  }
}

