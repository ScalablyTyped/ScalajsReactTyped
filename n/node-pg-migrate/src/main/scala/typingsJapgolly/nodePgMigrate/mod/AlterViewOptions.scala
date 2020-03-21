package typingsJapgolly.nodePgMigrate.mod

import typingsJapgolly.nodePgMigrate.nodePgMigrateBooleans.`false`
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.CASCADED
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.LOCAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterViewOptions extends js.Object {
  var checkOption: js.UndefOr[Null | `false` | CASCADED | LOCAL] = js.undefined
}

object AlterViewOptions {
  @scala.inline
  def apply(checkOption: `false` | CASCADED | LOCAL = null): AlterViewOptions = {
    val __obj = js.Dynamic.literal()
    if (checkOption != null) __obj.updateDynamic("checkOption")(checkOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlterViewOptions]
  }
}

