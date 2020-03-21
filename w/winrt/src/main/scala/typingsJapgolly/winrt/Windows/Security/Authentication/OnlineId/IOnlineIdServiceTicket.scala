package typingsJapgolly.winrt.Windows.Security.Authentication.OnlineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOnlineIdServiceTicket extends js.Object {
  var errorCode: Double
  var request: OnlineIdServiceTicketRequest
  var value: String
}

object IOnlineIdServiceTicket {
  @scala.inline
  def apply(errorCode: Double, request: OnlineIdServiceTicketRequest, value: String): IOnlineIdServiceTicket = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOnlineIdServiceTicket]
  }
}

