package typingsJapgolly.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.`NO ACTION`
  - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.RESTRICT
  - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.CASCADE
  - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.`SET NULL`
  - typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.`SET DEFAULT`
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def CASCADE: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.CASCADE = this.cast("CASCADE")
  @scala.inline
  def `NO ACTION`: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.`NO ACTION` = this.cast("NO ACTION")
  @scala.inline
  def RESTRICT: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.RESTRICT = this.cast("RESTRICT")
  @scala.inline
  def `SET DEFAULT`: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.`SET DEFAULT` = this.cast("SET DEFAULT")
  @scala.inline
  def `SET NULL`: typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.`SET NULL` = this.cast("SET NULL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

