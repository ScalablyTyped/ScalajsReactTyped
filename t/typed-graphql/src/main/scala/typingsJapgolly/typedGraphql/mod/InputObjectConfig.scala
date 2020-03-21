package typingsJapgolly.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputObjectConfig extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var fields: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap
  var name: String
}

object InputObjectConfig {
  @scala.inline
  def apply(
    fields: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap,
    name: String,
    description: String = null
  ): InputObjectConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputObjectConfig]
  }
}

