package typingsJapgolly.umzug.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONStorageOptions extends Storage {
  /**
    * The path to the json storage.
    * Defaults to process.cwd() + '/umzug.json';
    */
  var path: js.UndefOr[String] = js.undefined
}

object JSONStorageOptions {
  @scala.inline
  def apply(
    executed: CallbackTo[js.Promise[js.Array[String]]],
    logMigration: String => CallbackTo[js.Promise[Unit]],
    unlogMigration: String => CallbackTo[js.Promise[Unit]],
    path: String = null
  ): JSONStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("executed")(executed.toJsFn)
    __obj.updateDynamic("logMigration")(js.Any.fromFunction1((t0: java.lang.String) => logMigration(t0).runNow()))
    __obj.updateDynamic("unlogMigration")(js.Any.fromFunction1((t0: java.lang.String) => unlogMigration(t0).runNow()))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONStorageOptions]
  }
}

