package typingsJapgolly.reactabularTable.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactabularTable.AnonCell
import typingsJapgolly.reactabularTable.AnonRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderers extends js.Object {
  var body: js.UndefOr[AnonRow] = js.undefined
  var header: js.UndefOr[AnonCell] = js.undefined
  var table: js.UndefOr[String | js.Function0[Element]] = js.undefined
}

object Renderers {
  @scala.inline
  def apply(body: AnonRow = null, header: AnonCell = null, table: String | js.Function0[Element] = null): Renderers = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderers]
  }
}

