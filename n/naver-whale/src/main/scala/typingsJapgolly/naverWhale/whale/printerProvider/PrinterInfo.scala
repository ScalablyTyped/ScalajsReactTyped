package typingsJapgolly.naverWhale.whale.printerProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrinterInfo extends js.Object {
  /** Optional. Printer's human readable description. */
  var description: js.UndefOr[String] = js.undefined
  /** Unique printer ID. */
  var id: String
  /** Printer's human readable name. */
  var name: String
}

object PrinterInfo {
  @scala.inline
  def apply(id: String, name: String, description: String = null): PrinterInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterInfo]
  }
}

