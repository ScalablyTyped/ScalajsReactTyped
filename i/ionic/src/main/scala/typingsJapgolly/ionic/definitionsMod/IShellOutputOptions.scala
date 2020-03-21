package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.node.NodeJS.ProcessEnv
import typingsJapgolly.node.childProcessMod.SerializationType
import typingsJapgolly.node.childProcessMod.StdioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellOutputOptions extends IShellSpawnOptions {
  var fatalOnError: js.UndefOr[Boolean] = js.undefined
  var fatalOnNotFound: js.UndefOr[Boolean] = js.undefined
  var showError: js.UndefOr[Boolean] = js.undefined
}

object IShellOutputOptions {
  @scala.inline
  def apply(
    argv0: String = null,
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: ProcessEnv = null,
    fatalOnError: js.UndefOr[Boolean] = js.undefined,
    fatalOnNotFound: js.UndefOr[Boolean] = js.undefined,
    gid: Int | Double = null,
    serialization: SerializationType = null,
    shell: Boolean | String = null,
    showCommand: js.UndefOr[Boolean] = js.undefined,
    showError: js.UndefOr[Boolean] = js.undefined,
    stdio: StdioOptions = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): IShellOutputOptions = {
    val __obj = js.Dynamic.literal()
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(fatalOnError)) __obj.updateDynamic("fatalOnError")(fatalOnError.asInstanceOf[js.Any])
    if (!js.isUndefined(fatalOnNotFound)) __obj.updateDynamic("fatalOnNotFound")(fatalOnNotFound.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (!js.isUndefined(showCommand)) __obj.updateDynamic("showCommand")(showCommand.asInstanceOf[js.Any])
    if (!js.isUndefined(showError)) __obj.updateDynamic("showError")(showError.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellOutputOptions]
  }
}

