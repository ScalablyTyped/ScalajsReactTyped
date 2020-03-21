package typingsJapgolly.formidable.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var hash: js.UndefOr[String] = js.undefined
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  var name: String
  var path: String
  var size: Double
  var `type`: String
  def toJSON(): js.Object
}

object File {
  @scala.inline
  def apply(
    name: String,
    path: String,
    size: Double,
    toJSON: CallbackTo[js.Object],
    `type`: String,
    hash: String = null,
    lastModifiedDate: js.Date = null
  ): File = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

