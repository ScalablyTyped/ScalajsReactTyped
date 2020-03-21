package typingsJapgolly.ncom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ncom", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): ComServer = js.native
  def apply(listener: ConnectionListener): ComServer = js.native
  def apply(options: ComServerOptions): ComServer = js.native
  def apply(options: ComServerOptions, listener: ConnectionListener): ComServer = js.native
  def apply(options: SecureComServerOptions): ComServer = js.native
  def apply(options: SecureComServerOptions, listener: ConnectionListener): ComServer = js.native
}

