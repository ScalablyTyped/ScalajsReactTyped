package typingsJapgolly.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  var style: js.UndefOr[String] = js.undefined
  var `type`: SymbolType
}

object Symbol {
  @scala.inline
  def apply(`type`: SymbolType, style: String = null): Symbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
}

