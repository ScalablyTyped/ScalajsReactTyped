package typingsJapgolly.xmlrpc.mod

import typingsJapgolly.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlrpc", "createSecureServer")
@js.native
object createSecureServer extends js.Object {
  def apply(options: String, callback: js.Function0[Unit]): Server = js.native
  def apply(options: TlsOptions, callback: js.Function0[Unit]): Server = js.native
}

