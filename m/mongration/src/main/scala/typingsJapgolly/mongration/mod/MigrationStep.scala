package typingsJapgolly.mongration.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.mongodb.mod.Db
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationStep extends js.Object {
  var down: js.UndefOr[
    js.Function2[/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], Unit]
  ] = js.undefined
  var id: String
  def up(db: Db, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit
}

object MigrationStep {
  @scala.inline
  def apply(
    id: String,
    up: (Db, js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Callback,
    down: (/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Callback = null
  ): MigrationStep = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("up")(js.Any.fromFunction2((t0: typingsJapgolly.mongodb.mod.Db, t1: js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]) => up(t0, t1).runNow()))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2((t0: /* db */ typingsJapgolly.mongodb.mod.Db, t1: /* cb */ js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]) => down(t0, t1).runNow()))
    __obj.asInstanceOf[MigrationStep]
  }
}

