package typingsJapgolly.frctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonServer extends js.Object {
  var server: js.UndefOr[Double] = js.undefined
  var sync: js.UndefOr[Double] = js.undefined
}

object AnonServer {
  @scala.inline
  def apply(server: Int | Double = null, sync: Int | Double = null): AnonServer = {
    val __obj = js.Dynamic.literal()
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (sync != null) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonServer]
  }
}

