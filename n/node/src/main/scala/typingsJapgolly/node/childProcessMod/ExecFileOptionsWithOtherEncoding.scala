package typingsJapgolly.node.childProcessMod

import typingsJapgolly.node.NodeJS.ProcessEnv
import typingsJapgolly.node.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecFileOptionsWithOtherEncoding extends ExecFileOptions {
  var encoding: String
}

object ExecFileOptionsWithOtherEncoding {
  @scala.inline
  def apply(
    encoding: String,
    cwd: String = null,
    env: ProcessEnv = null,
    gid: Int | Double = null,
    killSignal: Signals | Double = null,
    maxBuffer: Int | Double = null,
    shell: Boolean | String = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): ExecFileOptionsWithOtherEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileOptionsWithOtherEncoding]
  }
}

