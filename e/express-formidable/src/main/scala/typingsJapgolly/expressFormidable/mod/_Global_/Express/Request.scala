package typingsJapgolly.expressFormidable.mod._Global_.Express

import typingsJapgolly.formidable.mod.Fields
import typingsJapgolly.formidable.mod.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var fields: js.UndefOr[Fields] = js.undefined
  var files: js.UndefOr[Files] = js.undefined
}

object Request {
  @scala.inline
  def apply(fields: Fields = null, files: Files = null): Request = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

