package typingsJapgolly.npmWhich.mod

import typingsJapgolly.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for the `npmwhich`-module.
  */
trait StaticWhichOptions extends js.Object {
  /**
    * The directory to find the binary for.
    */
  var cwd: String
  /**
    * The environment to use for resolving the binary.
    */
  var env: js.UndefOr[ProcessEnv] = js.undefined
}

object StaticWhichOptions {
  @scala.inline
  def apply(cwd: String, env: ProcessEnv = null): StaticWhichOptions = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticWhichOptions]
  }
}

