package typingsJapgolly.nodePgMigrate.mod

import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.DISABLE
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.ENABLE
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.FORCE
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.`NO FORCE`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterTableOptions extends js.Object {
  var levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`)
}

object AlterTableOptions {
  @scala.inline
  def apply(levelSecurity: DISABLE | ENABLE | FORCE | (`NO FORCE`)): AlterTableOptions = {
    val __obj = js.Dynamic.literal(levelSecurity = levelSecurity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AlterTableOptions]
  }
}

