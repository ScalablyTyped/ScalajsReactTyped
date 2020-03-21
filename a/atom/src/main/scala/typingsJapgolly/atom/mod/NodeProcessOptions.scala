package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProcessOptions extends js.Object {
  /** The array of arguments to pass to the command. */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /** The command to execute. */
  var command: String
  /** The callback which receives a single argument containing the exit status. */
  var exit: js.UndefOr[js.Function1[/* code */ Double, Unit]] = js.undefined
  /** The options object to pass to Node's ChildProcess.spawn method. */
  var options: js.UndefOr[SpawnProcessOptions] = js.undefined
  /**
    *  The callback that receives a single argument which contains the standard
    *  error output from the command.
    */
  var stderr: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
  /**
    *  The callback that receives a single argument which contains the standard
    *  output from the command.
    */
  var stdout: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
}

object NodeProcessOptions {
  @scala.inline
  def apply(
    command: String,
    args: js.Array[String] = null,
    exit: /* code */ Double => Callback = null,
    options: SpawnProcessOptions = null,
    stderr: /* data */ String => Callback = null,
    stdout: /* data */ String => Callback = null
  ): NodeProcessOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction1((t0: /* code */ scala.Double) => exit(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => stderr(t0).runNow()))
    if (stdout != null) __obj.updateDynamic("stdout")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => stdout(t0).runNow()))
    __obj.asInstanceOf[NodeProcessOptions]
  }
}

