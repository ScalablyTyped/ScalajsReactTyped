package typingsJapgolly.json2csv.json2csvbaseMod.json2csv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValueCallbackInfo extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var label: String
}

object FieldValueCallbackInfo {
  @scala.inline
  def apply(label: String, default: String = null): FieldValueCallbackInfo = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldValueCallbackInfo]
  }
}

