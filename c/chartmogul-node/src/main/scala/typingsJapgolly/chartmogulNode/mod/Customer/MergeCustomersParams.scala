package typingsJapgolly.chartmogulNode.mod.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeCustomersParams extends js.Object {
  var from: MergeID
  var into: MergeID
}

object MergeCustomersParams {
  @scala.inline
  def apply(from: MergeID, into: MergeID): MergeCustomersParams = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], into = into.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MergeCustomersParams]
  }
}

