package typingsJapgolly.elasticElasticsearch.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportGetConnectionOptions extends js.Object {
  var requestId: String
}

object TransportGetConnectionOptions {
  @scala.inline
  def apply(requestId: String): TransportGetConnectionOptions = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransportGetConnectionOptions]
  }
}

