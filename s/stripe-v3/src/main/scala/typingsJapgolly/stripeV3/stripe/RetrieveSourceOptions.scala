package typingsJapgolly.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveSourceOptions extends js.Object {
  var client_secret: String
  var id: String
}

object RetrieveSourceOptions {
  @scala.inline
  def apply(client_secret: String, id: String): RetrieveSourceOptions = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetrieveSourceOptions]
  }
}

