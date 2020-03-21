package typingsJapgolly.ftp.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * How long (in milliseconds) to wait for the control connection to be established. Default: 10000
    */
  var connTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Debug function to invoke to enable debug logging.
    */
  var debug: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  /**
    * The hostname or IP address of the FTP server. Default: 'localhost'
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * How often (in milliseconds) to send a 'dummy' (NOOP) command to keep the connection alive. Default: 10000
    */
  var keepalive: js.UndefOr[Double] = js.undefined
  /**
    * Password for authentication. Default: 'anonymous@'
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * How long (in milliseconds) to wait for a PASV data connection to be established. Default: 10000
    */
  var pasvTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The port of the FTP server. Default: 21
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * Set to true for both control and data connection encryption, 'control' for control connection encryption only, or 'implicit' for
    * implicitly encrypted control connection (this mode is deprecated in modern times, but usually uses port 990) Default: false
    */
  var secure: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Additional options to be passed to tls.connect(). Default: (none)
    */
  var secureOptions: js.UndefOr[ConnectionOptions] = js.undefined
  /**
    * Username for authentication. Default: 'anonymous'
    */
  var user: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    connTimeout: Int | Double = null,
    debug: /* message */ String => Callback = null,
    host: String = null,
    keepalive: Int | Double = null,
    password: String = null,
    pasvTimeout: Int | Double = null,
    port: Int | Double = null,
    secure: String | Boolean = null,
    secureOptions: ConnectionOptions = null,
    user: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (connTimeout != null) __obj.updateDynamic("connTimeout")(connTimeout.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => debug(t0).runNow()))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pasvTimeout != null) __obj.updateDynamic("pasvTimeout")(pasvTimeout.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

