package typingsJapgolly.typescript

import typingsJapgolly.typescript.typescriptMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[Diagnostic] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply(config: js.Any = null, error: Diagnostic = null): Anon_Config = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Config]
  }
}

