package typingsJapgolly.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportUserField extends js.Object {
  var export_as: js.UndefOr[String] = js.undefined
  var name: String
}

object ExportUserField {
  @scala.inline
  def apply(name: String, export_as: String = null): ExportUserField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (export_as != null) __obj.updateDynamic("export_as")(export_as.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportUserField]
  }
}

