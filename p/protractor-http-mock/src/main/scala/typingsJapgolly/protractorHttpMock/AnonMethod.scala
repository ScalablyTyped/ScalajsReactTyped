package typingsJapgolly.protractorHttpMock

import typingsJapgolly.protractorHttpMock.protractorHttpMockStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod[TPayload] extends js.Object {
  var data: TPayload
  var method: POST
  var path: String
  var regex: js.UndefOr[Boolean] = js.undefined
}

object AnonMethod {
  @scala.inline
  def apply[TPayload](data: TPayload, method: POST, path: String, regex: js.UndefOr[Boolean] = js.undefined): AnonMethod[TPayload] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod[TPayload]]
  }
}

