package typingsJapgolly.dbMigratePg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchDatabaseOptions extends js.Object {
  var database: js.UndefOr[String] = js.undefined
}

object SwitchDatabaseOptions {
  @scala.inline
  def apply(database: String = null): SwitchDatabaseOptions = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchDatabaseOptions]
  }
}

