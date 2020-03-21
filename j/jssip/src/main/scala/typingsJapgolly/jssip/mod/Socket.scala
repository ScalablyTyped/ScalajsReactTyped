package typingsJapgolly.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  var sip_uri: String = js.native
  var url: String = js.native
  var via_transport: String = js.native
  def connect(): Unit = js.native
  def disconnect(): Unit = js.native
  def onconnect(): Unit = js.native
  def ondata(data: String): Unit = js.native
  def ondisconnect(error: Boolean): Unit = js.native
  def ondisconnect(error: Boolean, code: Double): Unit = js.native
  def ondisconnect(error: Boolean, code: Double, reason: String): Unit = js.native
  def send(data: String): Unit = js.native
}

