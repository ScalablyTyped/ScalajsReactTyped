package typingsJapgolly.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends js.Object {
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[js.Error] = js.undefined
  var table: js.UndefOr[String] = js.undefined
}

object AnonFields {
  @scala.inline
  def apply(
    fields: js.Array[String] = null,
    index: String = null,
    message: String = null,
    parent: js.Error = null,
    table: String = null
  ): AnonFields = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFields]
  }
}

