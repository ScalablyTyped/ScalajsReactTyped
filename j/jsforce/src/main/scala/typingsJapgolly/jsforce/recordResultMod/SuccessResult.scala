package typingsJapgolly.jsforce.recordResultMod

import typingsJapgolly.jsforce.jsforceBooleans.`true`
import typingsJapgolly.jsforce.salesforceIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessResult extends RecordResult {
  var id: SalesforceId
  var success: `true`
}

object SuccessResult {
  @scala.inline
  def apply(id: SalesforceId, success: `true`): SuccessResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuccessResult]
  }
}

