package typingsJapgolly.sequelize

import typingsJapgolly.sequelize.mod.DataTypeAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: DataTypeAbstract
}

object AnonType {
  @scala.inline
  def apply(`type`: DataTypeAbstract): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

