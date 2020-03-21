package typingsJapgolly.freedom.freedom.UdpSocket

import typingsJapgolly.freedom.freedom.Method3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  @JSName("sendTo")
  var sendTo_Original: Method3[scala.scalajs.js.typedarray.ArrayBuffer, String, Double, Double] = js.native
  def bind(address: String, port: Double): js.Promise[Unit] = js.native
  def destroy(): js.Promise[Unit] = js.native
  def getInfo(): js.Promise[SocketInfo] = js.native
  def on(name: String, listener: js.Function): Unit = js.native
  def sendTo(a: scala.scalajs.js.typedarray.ArrayBuffer, b: String, c: Double): js.Promise[Double] = js.native
}

