package typingsJapgolly.easyXapiSupertest.tlsMod

import typingsJapgolly.easyXapiSupertest.AnonAddress
import typingsJapgolly.easyXapiSupertest.AnonName
import typingsJapgolly.easyXapiSupertest.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearTextStream extends Duplex {
  var address: AnonAddress = js.native
  var authorizationError: js.Error = js.native
  var authorized: Boolean = js.native
  var getCipher: AnonName = js.native
  var remoteAddress: String = js.native
  var remotePort: Double = js.native
  def getPeerCertificate(): js.Any = js.native
}

