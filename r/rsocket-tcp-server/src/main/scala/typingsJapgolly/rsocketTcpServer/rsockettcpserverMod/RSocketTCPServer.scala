package typingsJapgolly.rsocketTcpServer.rsockettcpserverMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsocketCore.rsocketserverMod.TransportServer
import typingsJapgolly.rsocketFlowable.mod.Flowable
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSocketTCPServer extends TransportServer

object RSocketTCPServer {
  @scala.inline
  def apply(start: CallbackTo[Flowable[DuplexConnection]], stop: Callback): RSocketTCPServer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[RSocketTCPServer]
  }
}

