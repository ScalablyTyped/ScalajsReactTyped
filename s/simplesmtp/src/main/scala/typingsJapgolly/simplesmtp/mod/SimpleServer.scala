package typingsJapgolly.simplesmtp.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplesmtp", "SimpleServer")
@js.native
class SimpleServer () extends EventEmitter {
  def this(callback: js.Function1[/* connection */ SimpleServerConnection, Unit]) = this()
  def this(options: SmtpServerOptions) = this()
  def this(options: SmtpServerOptions, callback: js.Function1[/* connection */ SimpleServerConnection, Unit]) = this()
  var server: SMTPServer = js.native
  /**
  	 * Server starts listening on defined port and hostname
  	 *
  	 * @param {Number} port The port number to listen
  	 * @param {String} [host] The hostname to listen
  	 * @param {Function} callback The callback function to run when the server is listening
  	 */
  def listen(port: Double, host: String): Unit = js.native
  def listen(port: Double, host: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
}

