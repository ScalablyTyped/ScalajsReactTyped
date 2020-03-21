package typingsJapgolly.postcssLoadConfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Additional context options that postcss-load-config understands.
trait Context extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[String] = js.undefined
}

object Context {
  @scala.inline
  def apply(cwd: String = null, env: String = null): Context = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

