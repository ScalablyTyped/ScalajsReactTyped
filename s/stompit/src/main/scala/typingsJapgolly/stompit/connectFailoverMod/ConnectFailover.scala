package typingsJapgolly.stompit.connectFailoverMod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.stompit.AnonAbort
import typingsJapgolly.stompit.connectMod.ConnectOptions
import typingsJapgolly.stompit.stompitStrings.connect
import typingsJapgolly.stompit.stompitStrings.connecting
import typingsJapgolly.stompit.stompitStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectFailover extends EventEmitter {
  def addServer(config: String): Unit = js.native
  def addServer(config: ConnectOptions): Unit = js.native
  def connect(
    callback: js.Function4[
      /* error */ js.Error | Null, 
      /* client */ typingsJapgolly.stompit.clientMod.^, 
      /* reconnect */ js.Function0[Unit], 
      /* server */ Server, 
      Unit
    ]
  ): AnonAbort = js.native
  def getReconnectDelay(reconnects: Double): Double = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function1[/* server */ ConnectState, Unit]): this.type = js.native
  @JSName("on")
  def on_connecting(event: connecting, listener: js.Function1[/* server */ ConnectState, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ ConnectError, /* server */ ConnectState, Unit]): this.type = js.native
}

