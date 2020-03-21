package typingsJapgolly.sequelize.mod

import typingsJapgolly.sequelize.AnonField
import typingsJapgolly.sequelize.sequelizeStrings.`foreign key`
import typingsJapgolly.sequelize.sequelizeStrings.`primary key`
import typingsJapgolly.sequelize.sequelizeStrings.check
import typingsJapgolly.sequelize.sequelizeStrings.default
import typingsJapgolly.sequelize.sequelizeStrings.unique_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sequelize.mod.AddUniqueConstraintOptions
  - typingsJapgolly.sequelize.mod.AddDefaultConstraintOptions
  - typingsJapgolly.sequelize.mod.AddCheckConstraintOptions
  - typingsJapgolly.sequelize.mod.AddPrimaryKeyConstraintOptions
  - typingsJapgolly.sequelize.mod.AddForeignKeyConstraintOptions
*/
trait AddConstraintOptions extends js.Object

object AddConstraintOptions {
  @scala.inline
  def AddForeignKeyConstraintOptions(
    onDelete: String,
    onUpdate: String,
    `type`: `foreign key`,
    name: String = null,
    references: AnonField = null
  ): AddConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddDefaultConstraintOptions(`type`: default, defaultValue: js.Any = null, name: String = null): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddCheckConstraintOptions(`type`: check, name: String = null, where: AnyWhereOptions = null): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddPrimaryKeyConstraintOptions(`type`: `primary key`, name: String = null): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddUniqueConstraintOptions(`type`: unique_, name: String = null): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
}

