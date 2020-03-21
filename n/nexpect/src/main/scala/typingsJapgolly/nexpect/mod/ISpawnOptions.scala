package typingsJapgolly.nexpect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpawnOptions extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var ignoreCase: js.UndefOr[js.Any] = js.undefined
  var stream: js.UndefOr[js.Any] = js.undefined
  var stripColors: js.UndefOr[js.Any] = js.undefined
  var verbose: js.UndefOr[js.Any] = js.undefined
}

object ISpawnOptions {
  @scala.inline
  def apply(
    cwd: String = null,
    env: js.Any = null,
    ignoreCase: js.Any = null,
    stream: js.Any = null,
    stripColors: js.Any = null,
    verbose: js.Any = null
  ): ISpawnOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (ignoreCase != null) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (stripColors != null) __obj.updateDynamic("stripColors")(stripColors.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpawnOptions]
  }
}

