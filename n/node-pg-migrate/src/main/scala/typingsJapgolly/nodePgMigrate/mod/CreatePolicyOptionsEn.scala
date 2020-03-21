package typingsJapgolly.nodePgMigrate.mod

import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.ALL
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.DELETE
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.INSERT
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.SELECT
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyOptionsEn extends js.Object {
  var command: ALL | SELECT | INSERT | UPDATE | DELETE
}

object CreatePolicyOptionsEn {
  @scala.inline
  def apply(command: ALL | SELECT | INSERT | UPDATE | DELETE): CreatePolicyOptionsEn = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePolicyOptionsEn]
  }
}

