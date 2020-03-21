package typingsJapgolly.gitlab.requestHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationResponse extends js.Object {
  var data: js.Array[js.Object]
  var pagination: PaginationOptions
}

object PaginationResponse {
  @scala.inline
  def apply(data: js.Array[js.Object], pagination: PaginationOptions): PaginationResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaginationResponse]
  }
}

