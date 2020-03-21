package typingsJapgolly.log4js.mod

import typingsJapgolly.log4js.log4jsStrings.master
import typingsJapgolly.log4js.log4jsStrings.multiprocess
import typingsJapgolly.log4js.log4jsStrings.worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiprocessAppender extends Appender {
  // (only needed if mode == master)- the name of the appender to send the log events to
  var appender: js.UndefOr[String] = js.undefined
  // (defaults to localhost) - the host/IP address to listen on, or send to
  var loggerHost: js.UndefOr[String] = js.undefined
  // (defaults to 5000) - the port to listen on, or send to
  var loggerPort: js.UndefOr[Double] = js.undefined
  // controls whether the appender listens for log events sent over the network, or is responsible for serialising events and sending them to a server.
  var mode: master | worker
  var `type`: multiprocess
}

object MultiprocessAppender {
  @scala.inline
  def apply(
    mode: master | worker,
    `type`: multiprocess,
    appender: String = null,
    loggerHost: String = null,
    loggerPort: Int | Double = null
  ): MultiprocessAppender = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appender != null) __obj.updateDynamic("appender")(appender.asInstanceOf[js.Any])
    if (loggerHost != null) __obj.updateDynamic("loggerHost")(loggerHost.asInstanceOf[js.Any])
    if (loggerPort != null) __obj.updateDynamic("loggerPort")(loggerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiprocessAppender]
  }
}

