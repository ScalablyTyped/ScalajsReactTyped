package typingsJapgolly.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPLAYER_TO_SPECTATOR_ERROR extends js.Object {
  var errorCode: Double
  var errorMessage: String
}

object IPLAYER_TO_SPECTATOR_ERROR {
  @scala.inline
  def apply(errorCode: Double, errorMessage: String): IPLAYER_TO_SPECTATOR_ERROR = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPLAYER_TO_SPECTATOR_ERROR]
  }
}

