package typingsJapgolly.contractProxyKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var data: String
  var operation: Double | String | js.Object
  var to: String
  var value: Double | String | js.Object
}

object Transaction {
  @scala.inline
  def apply(
    data: String,
    operation: Double | String | js.Object,
    to: String,
    value: Double | String | js.Object
  ): Transaction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Transaction]
  }
}

