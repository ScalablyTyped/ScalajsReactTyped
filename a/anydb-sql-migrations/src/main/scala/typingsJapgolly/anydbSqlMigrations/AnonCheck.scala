package typingsJapgolly.anydbSqlMigrations

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.anydbSqlMigrations.mod.MigrationOptions
import typingsJapgolly.anydbSqlMigrations.mod.MigrationTask
import typingsJapgolly.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheck extends js.Object {
  def check(f: js.Function1[/* items */ js.Array[MigrationTask], _]): ^[_]
  def drop(): ^[_]
  def execMigrations(migrationOptions: MigrationOptions): ^[Unit]
  def migrate(): ^[_]
  def run(): ^[_]
  def undoLast(): ^[_]
}

object AnonCheck {
  @scala.inline
  def apply(
    check: js.Function1[/* items */ js.Array[MigrationTask], js.Any] => CallbackTo[^[js.Any]],
    drop: CallbackTo[^[js.Any]],
    execMigrations: MigrationOptions => CallbackTo[^[Unit]],
    migrate: CallbackTo[^[js.Any]],
    run: CallbackTo[^[js.Any]],
    undoLast: CallbackTo[^[js.Any]]
  ): AnonCheck = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: js.Function1[/* items */ js.Array[typingsJapgolly.anydbSqlMigrations.mod.MigrationTask], js.Any]) => check(t0).runNow()))
    __obj.updateDynamic("drop")(drop.toJsFn)
    __obj.updateDynamic("execMigrations")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSqlMigrations.mod.MigrationOptions) => execMigrations(t0).runNow()))
    __obj.updateDynamic("migrate")(migrate.toJsFn)
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.updateDynamic("undoLast")(undoLast.toJsFn)
    __obj.asInstanceOf[AnonCheck]
  }
}

