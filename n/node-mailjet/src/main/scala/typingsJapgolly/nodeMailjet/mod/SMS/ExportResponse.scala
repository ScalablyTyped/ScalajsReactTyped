package typingsJapgolly.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportResponse extends js.Object {
  val body: ExportResponseData
}

object ExportResponse {
  @scala.inline
  def apply(body: ExportResponseData): ExportResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExportResponse]
  }
}

