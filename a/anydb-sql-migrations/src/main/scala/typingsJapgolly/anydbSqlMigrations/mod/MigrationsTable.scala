package typingsJapgolly.anydbSqlMigrations.mod

import typingsJapgolly.anydbSql.mod.Column
import typingsJapgolly.anydbSql.mod.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationsTable extends Table[Migration] {
  var version: Column[String] = js.native
}

