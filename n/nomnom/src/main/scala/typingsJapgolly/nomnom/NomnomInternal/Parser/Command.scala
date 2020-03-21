package typingsJapgolly.nomnom.NomnomInternal.Parser

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /**
    * The name of the command.
    */
  var name: String
  /**
    * Sets a callback for the command.
    * @param func The callback function.
    * @returns The command.
    */
  def callback(func: js.Function1[/* options */ js.Any, Unit]): Command
  /**
    * Sets the help string for the command.
    * @param help The help string.
    * @returns The command.
    */
  def help(help: String): Command
  /**
    * Sets an option of the command.
    * @param name The name of the option.
    * @param spec The specifiction of the option.
    * @returns The command.
    */
  def option(name: String, spec: Option): Command
  /**
    * Sets the options of the command.
    * @param specs The specifications of the options.
    * @returns The command.
    */
  def options(specs: StringDictionary[Option]): Command
  /**
    * Sets the usage string for the command.
    * @param usage The usage string.
    * @returns The command.
    */
  def usage(usage: String): Command
}

object Command {
  @scala.inline
  def apply(
    callback: js.Function1[/* options */ js.Any, Unit] => CallbackTo[Command],
    help: String => CallbackTo[Command],
    name: String,
    option: (String, Option) => CallbackTo[Command],
    options: StringDictionary[Option] => CallbackTo[Command],
    usage: String => CallbackTo[Command]
  ): Command = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: js.Function1[/* options */ js.Any, scala.Unit]) => callback(t0).runNow()))
    __obj.updateDynamic("help")(js.Any.fromFunction1((t0: java.lang.String) => help(t0).runNow()))
    __obj.updateDynamic("option")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.nomnom.NomnomInternal.Parser.Option) => option(t0, t1).runNow()))
    __obj.updateDynamic("options")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[typingsJapgolly.nomnom.NomnomInternal.Parser.Option]) => options(t0).runNow()))
    __obj.updateDynamic("usage")(js.Any.fromFunction1((t0: java.lang.String) => usage(t0).runNow()))
    __obj.asInstanceOf[Command]
  }
}

