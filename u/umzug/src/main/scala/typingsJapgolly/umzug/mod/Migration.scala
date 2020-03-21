package typingsJapgolly.umzug.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Migration extends js.Object {
  var file: String
  def down(): js.Promise[_]
  def migration(): js.Promise[_]
  def testFileName(needle: String): Boolean
  def up(): js.Promise[_]
}

object Migration {
  @scala.inline
  def apply(
    down: CallbackTo[js.Promise[js.Any]],
    file: String,
    migration: CallbackTo[js.Promise[js.Any]],
    testFileName: String => CallbackTo[Boolean],
    up: CallbackTo[js.Promise[js.Any]]
  ): Migration = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("down")(down.toJsFn)
    __obj.updateDynamic("migration")(migration.toJsFn)
    __obj.updateDynamic("testFileName")(js.Any.fromFunction1((t0: java.lang.String) => testFileName(t0).runNow()))
    __obj.updateDynamic("up")(up.toJsFn)
    __obj.asInstanceOf[Migration]
  }
}

