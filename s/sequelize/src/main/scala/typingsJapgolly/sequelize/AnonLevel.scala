package typingsJapgolly.sequelize

import typingsJapgolly.sequelize.mod.Model
import typingsJapgolly.sequelize.mod.TransactionLockLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: TransactionLockLevel
  var of: Model[_, _, _]
}

object AnonLevel {
  @scala.inline
  def apply(level: TransactionLockLevel, of: Model[_, _, _]): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLevel]
  }
}

