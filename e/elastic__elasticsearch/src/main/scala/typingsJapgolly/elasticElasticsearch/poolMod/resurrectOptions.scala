package typingsJapgolly.elasticElasticsearch.poolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait resurrectOptions extends js.Object {
  var name: String
  var now: js.UndefOr[Double] = js.undefined
  var requestId: String
}

object resurrectOptions {
  @scala.inline
  def apply(name: String, requestId: String, now: Int | Double = null): resurrectOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    __obj.asInstanceOf[resurrectOptions]
  }
}

