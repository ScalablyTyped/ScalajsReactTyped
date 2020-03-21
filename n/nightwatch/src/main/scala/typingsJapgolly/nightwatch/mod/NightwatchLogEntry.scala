package typingsJapgolly.nightwatch.mod

import typingsJapgolly.nightwatch.nightwatchStrings.DEBUG
import typingsJapgolly.nightwatch.nightwatchStrings.INFO
import typingsJapgolly.nightwatch.nightwatchStrings.SEVERE
import typingsJapgolly.nightwatch.nightwatchStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchLogEntry extends js.Object {
  /**
    * Severity level
    */
  var level: SEVERE | WARNING | INFO | DEBUG
  /**
    * The log entry message.
    */
  var message: String
  var source: js.UndefOr[String] = js.undefined
  /**
    * The time stamp of log entry in seconds.
    */
  var timestamp: Double
}

object NightwatchLogEntry {
  @scala.inline
  def apply(level: SEVERE | WARNING | INFO | DEBUG, message: String, timestamp: Double, source: String = null): NightwatchLogEntry = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchLogEntry]
  }
}

