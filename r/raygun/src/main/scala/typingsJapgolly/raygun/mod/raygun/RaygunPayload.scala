package typingsJapgolly.raygun.mod.raygun

import typingsJapgolly.raygun.AnonClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunPayload extends js.Object {
  var details: AnonClient
  var occurredOn: js.Date
}

object RaygunPayload {
  @scala.inline
  def apply(details: AnonClient, occurredOn: js.Date): RaygunPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], occurredOn = occurredOn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RaygunPayload]
  }
}

