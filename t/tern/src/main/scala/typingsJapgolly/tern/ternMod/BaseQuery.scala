package typingsJapgolly.tern.ternMod

import typingsJapgolly.tern.ternStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQuery extends js.Object {
  var docFormat: js.UndefOr[full] = js.undefined
  var lineCharPositions: js.UndefOr[Boolean] = js.undefined
  var `type`: String
}

object BaseQuery {
  @scala.inline
  def apply(`type`: String, docFormat: full = null, lineCharPositions: js.UndefOr[Boolean] = js.undefined): BaseQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQuery]
  }
}

