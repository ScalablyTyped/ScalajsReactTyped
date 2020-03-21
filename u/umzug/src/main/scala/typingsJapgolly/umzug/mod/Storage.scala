package typingsJapgolly.umzug.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In order to keep track of already executed tasks, umzug logs successfully executed migrations.
  * This is done in order to allow rollbacks of tasks. This is the interface these `Storages` must
  * follow.
  */
trait Storage extends js.Object {
  /** Gets list of executed migrations. */
  def executed(): js.Promise[js.Array[String]]
  /**
    * Logs migration to be considered as executed.
    *
    * @param migrationName - Name of the migration to be logged.
    */
  def logMigration(migrationName: String): js.Promise[Unit]
  /**
    * Unlogs migration to be considered as pending.
    *
    * @param migrationName - Name of the migration to be unlogged.
    */
  def unlogMigration(migrationName: String): js.Promise[Unit]
}

object Storage {
  @scala.inline
  def apply(
    executed: CallbackTo[js.Promise[js.Array[String]]],
    logMigration: String => CallbackTo[js.Promise[Unit]],
    unlogMigration: String => CallbackTo[js.Promise[Unit]]
  ): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("executed")(executed.toJsFn)
    __obj.updateDynamic("logMigration")(js.Any.fromFunction1((t0: java.lang.String) => logMigration(t0).runNow()))
    __obj.updateDynamic("unlogMigration")(js.Any.fromFunction1((t0: java.lang.String) => unlogMigration(t0).runNow()))
    __obj.asInstanceOf[Storage]
  }
}

