package typingsJapgolly.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConstraint extends js.Object {
  var constraint: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[js.Error] = js.undefined
  var table: js.UndefOr[String] = js.undefined
}

object AnonConstraint {
  @scala.inline
  def apply(
    constraint: String = null,
    fields: js.Array[String] = null,
    message: String = null,
    parent: js.Error = null,
    table: String = null
  ): AnonConstraint = {
    val __obj = js.Dynamic.literal()
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConstraint]
  }
}

