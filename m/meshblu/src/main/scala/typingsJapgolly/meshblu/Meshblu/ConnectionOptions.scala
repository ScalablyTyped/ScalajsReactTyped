package typingsJapgolly.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Contains the primary means of identifying a device.
	 */
trait ConnectionOptions extends js.Object {
  var token: String
  var uuid: String
}

object ConnectionOptions {
  @scala.inline
  def apply(token: String, uuid: String): ConnectionOptions = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionOptions]
  }
}

