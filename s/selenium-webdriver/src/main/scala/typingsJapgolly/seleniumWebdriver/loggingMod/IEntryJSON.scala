package typingsJapgolly.seleniumWebdriver.loggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntryJSON extends js.Object {
  var level: String
  var message: String
  var timestamp: Double
  var `type`: String
}

object IEntryJSON {
  @scala.inline
  def apply(level: String, message: String, timestamp: Double, `type`: String): IEntryJSON = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntryJSON]
  }
}

