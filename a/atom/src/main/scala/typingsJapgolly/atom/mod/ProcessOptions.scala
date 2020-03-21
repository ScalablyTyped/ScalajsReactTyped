package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends NodeProcessOptions {
  /**
    *  Whether the command will automatically start when this BufferedProcess is
    *  created.
    */
  var autoStart: js.UndefOr[Boolean] = js.undefined
}

object ProcessOptions {
  @scala.inline
  def apply(
    command: String,
    args: js.Array[String] = null,
    autoStart: js.UndefOr[Boolean] = js.undefined,
    exit: /* code */ Double => Callback = null,
    options: SpawnProcessOptions = null,
    stderr: /* data */ String => Callback = null,
    stdout: /* data */ String => Callback = null
  ): ProcessOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction1((t0: /* code */ scala.Double) => exit(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => stderr(t0).runNow()))
    if (stdout != null) __obj.updateDynamic("stdout")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => stdout(t0).runNow()))
    __obj.asInstanceOf[ProcessOptions]
  }
}

