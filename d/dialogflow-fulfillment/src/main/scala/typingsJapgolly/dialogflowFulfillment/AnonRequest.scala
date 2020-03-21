package typingsJapgolly.dialogflowFulfillment

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  var request: Request_[ParamsDictionary]
  var response: Response_
}

object AnonRequest {
  @scala.inline
  def apply(request: Request_[ParamsDictionary], response: Response_): AnonRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequest]
  }
}

