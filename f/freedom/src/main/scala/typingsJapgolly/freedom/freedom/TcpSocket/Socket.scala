package typingsJapgolly.freedom.freedom.TcpSocket

import typingsJapgolly.freedom.freedom.Method0
import typingsJapgolly.freedom.freedom.Method1
import typingsJapgolly.freedom.freedomStrings.onConnection
import typingsJapgolly.freedom.freedomStrings.onData
import typingsJapgolly.freedom.freedomStrings.onDisconnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The TcpSocket class (freedom['core.TcpSocket'])
@js.native
trait Socket extends js.Object {
  @JSName("pause")
  var pause_Original: Method0[Unit] = js.native
  @JSName("resume")
  var resume_Original: Method0[Unit] = js.native
  @JSName("write")
  var write_Original: Method1[scala.scalajs.js.typedarray.ArrayBuffer, WriteInfo] = js.native
  def close(): js.Promise[Unit] = js.native
  def connect(hostname: String, port: Double): js.Promise[Unit] = js.native
  def getInfo(): js.Promise[SocketInfo] = js.native
  def listen(address: String, port: Double): js.Promise[Unit] = js.native
  def off(eventType: String, f: js.Function1[/* i */ js.Object, Unit]): Unit = js.native
  @JSName("off")
  def off_onData(`type`: onData, f: js.Function1[/* i */ ReadInfo, Unit]): Unit = js.native
  def on(eventType: String, f: js.Function1[/* i */ js.Object, Unit]): Unit = js.native
  // TcpSockets have 3 types of events:
  @JSName("on")
  def on_onConnection(`type`: onConnection, f: js.Function1[/* i */ ConnectInfo, Unit]): Unit = js.native
  @JSName("on")
  def on_onData(`type`: onData, f: js.Function1[/* i */ ReadInfo, Unit]): Unit = js.native
  @JSName("on")
  def on_onDisconnect(`type`: onDisconnect, f: js.Function1[/* i */ DisconnectInfo, Unit]): Unit = js.native
  def pause(): js.Promise[Unit] = js.native
  def resume(): js.Promise[Unit] = js.native
  def secure(): js.Promise[Unit] = js.native
  def write(a: scala.scalajs.js.typedarray.ArrayBuffer): js.Promise[WriteInfo] = js.native
}

