package typingsJapgolly.msnodesql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRawColumn extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object QueryRawColumn {
  @scala.inline
  def apply(name: String = null): QueryRawColumn = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRawColumn]
  }
}

