package typingsJapgolly.easyXHeaders.tlsMod

import typingsJapgolly.easyXHeaders.AnonCa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends typingsJapgolly.easyXHeaders.netMod.Server {
  def addContext(hostName: String, credentials: AnonCa): Unit = js.native
  def listen(port: Double, host: String, callback: js.Function): Server = js.native
}

