package typingsJapgolly.aliOss

import typingsJapgolly.aliOss.mod.NormalSuccessResponse
import typingsJapgolly.aliOss.mod.StyleData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataRes extends js.Object {
  var data: StyleData
  var res: NormalSuccessResponse
}

object AnonDataRes {
  @scala.inline
  def apply(data: StyleData, res: NormalSuccessResponse): AnonDataRes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataRes]
  }
}

