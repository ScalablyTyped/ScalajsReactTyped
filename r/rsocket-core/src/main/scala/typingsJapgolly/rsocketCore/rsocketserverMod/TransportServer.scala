package typingsJapgolly.rsocketCore.rsocketserverMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsocketFlowable.mod.Flowable
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportServer extends js.Object {
  def start(): Flowable[DuplexConnection]
  def stop(): Unit
}

object TransportServer {
  @scala.inline
  def apply(start: CallbackTo[Flowable[DuplexConnection]], stop: Callback): TransportServer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[TransportServer]
  }
}

