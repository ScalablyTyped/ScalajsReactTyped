package typingsJapgolly.jqueryFileupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySupport extends js.Object {
  var fileInput: js.UndefOr[Boolean] = js.undefined
}

object JQuerySupport {
  @scala.inline
  def apply(fileInput: js.UndefOr[Boolean] = js.undefined): JQuerySupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileInput)) __obj.updateDynamic("fileInput")(fileInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
}

