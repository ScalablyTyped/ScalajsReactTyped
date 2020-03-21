package typingsJapgolly.anydbSqlMigrations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MigFn = js.Function1[
    /* tx */ typingsJapgolly.anydbSql.mod.Transaction, 
    typingsJapgolly.bluebird.mod.^[js.Any]
  ]
}
