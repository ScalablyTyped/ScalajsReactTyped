package typingsJapgolly.prettyFormat.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldPlugin extends Plugin {
  var test: Test
  def print(`val`: js.Any, print: Print, indent: Indent, options: PluginOptions, colors: Colors): String
}

object OldPlugin {
  @scala.inline
  def apply(
    print: (js.Any, Print, Indent, PluginOptions, Colors) => CallbackTo[String],
    test: /* arg0 */ js.Any => CallbackTo[Boolean]
  ): OldPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("print")(js.Any.fromFunction5((t0: js.Any, t1: typingsJapgolly.prettyFormat.typesMod.Print, t2: typingsJapgolly.prettyFormat.typesMod.Indent, t3: typingsJapgolly.prettyFormat.typesMod.PluginOptions, t4: typingsJapgolly.prettyFormat.typesMod.Colors) => print(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: /* arg0 */ js.Any) => test(t0).runNow()))
    __obj.asInstanceOf[OldPlugin]
  }
}

