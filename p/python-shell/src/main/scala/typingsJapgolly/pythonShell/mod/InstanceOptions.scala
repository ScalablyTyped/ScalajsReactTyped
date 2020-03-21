package typingsJapgolly.pythonShell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceOptions extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var childProcess: js.UndefOr[String] = js.undefined
  var command: js.UndefOr[String] = js.undefined
  var exitCode: js.UndefOr[js.Any] = js.undefined
  var script: js.UndefOr[String] = js.undefined
  var stderr: js.UndefOr[js.Any] = js.undefined
  var stdin: js.UndefOr[js.Any] = js.undefined
  var stdout: js.UndefOr[js.Any] = js.undefined
  var terminated: js.UndefOr[js.Any] = js.undefined
}

object InstanceOptions {
  @scala.inline
  def apply(
    args: js.Array[_] = null,
    childProcess: String = null,
    command: String = null,
    exitCode: js.Any = null,
    script: String = null,
    stderr: js.Any = null,
    stdin: js.Any = null,
    stdout: js.Any = null,
    terminated: js.Any = null
  ): InstanceOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (childProcess != null) __obj.updateDynamic("childProcess")(childProcess.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (stdin != null) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (terminated != null) __obj.updateDynamic("terminated")(terminated.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceOptions]
  }
}

