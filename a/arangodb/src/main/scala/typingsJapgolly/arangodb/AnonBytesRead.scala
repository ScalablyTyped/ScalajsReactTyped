package typingsJapgolly.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesRead extends js.Object {
  var bytesRead: Double
  var bytesWritten: Double
  var count: Double
  var filesCombined: Double
  var message: String
  var time: String
}

object AnonBytesRead {
  @scala.inline
  def apply(
    bytesRead: Double,
    bytesWritten: Double,
    count: Double,
    filesCombined: Double,
    message: String,
    time: String
  ): AnonBytesRead = {
    val __obj = js.Dynamic.literal(bytesRead = bytesRead.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], filesCombined = filesCombined.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBytesRead]
  }
}

