package typingsJapgolly.reactNativeCommunityCli.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeCommunityCli.AnonCmd
import typingsJapgolly.reactNativeCommunityCli.AnonDefault
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var examples: js.UndefOr[js.Array[AnonCmd]] = js.undefined
  var name: String
  var options: js.UndefOr[js.Array[AnonDefault]] = js.undefined
  def func(argv: js.Array[String], ctx: Config_, args: Record[String, String]): js.Promise[Unit]
}

object Command {
  @scala.inline
  def apply(
    func: (js.Array[String], Config_, Record[String, String]) => CallbackTo[js.Promise[Unit]],
    name: String,
    description: String = null,
    examples: js.Array[AnonCmd] = null,
    options: js.Array[AnonDefault] = null
  ): Command = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("func")(js.Any.fromFunction3((t0: js.Array[java.lang.String], t1: typingsJapgolly.reactNativeCommunityCli.mod.Config_, t2: typingsJapgolly.std.Record[java.lang.String, java.lang.String]) => func(t0, t1, t2).runNow()))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

