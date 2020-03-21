package typingsJapgolly.stompit.connectFailoverMod

import typingsJapgolly.stompit.connectMod.ConnectOptions
import typingsJapgolly.stompit.getAddressInfoMod.AddressInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var connectOptions: ConnectOptions = js.native
  var remoteAddress: AddressInfo = js.native
  def blacklist(): Unit = js.native
  def blacklist(error: js.Error): Unit = js.native
  def getBlacklistError(): js.Error = js.native
  def isBlacklisted(): Boolean = js.native
}

