package typingsJapgolly.prettyFormat.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.prettyFormat.typesMod.NewPlugin
  - typingsJapgolly.prettyFormat.typesMod.OldPlugin
*/
trait Plugin extends js.Object

object Plugin {
  @scala.inline
  def NewPlugin(
    serialize: (js.Any, Config, String, Double, Refs, Printer) => CallbackTo[String],
    test: /* arg0 */ js.Any => CallbackTo[Boolean]
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serialize")(js.Any.fromFunction6((t0: js.Any, t1: typingsJapgolly.prettyFormat.typesMod.Config, t2: java.lang.String, t3: scala.Double, t4: typingsJapgolly.prettyFormat.typesMod.Refs, t5: typingsJapgolly.prettyFormat.typesMod.Printer) => serialize(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: /* arg0 */ js.Any) => test(t0).runNow()))
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  def OldPlugin(
    print: (js.Any, Print, Indent, PluginOptions, Colors) => CallbackTo[String],
    test: /* arg0 */ js.Any => CallbackTo[Boolean]
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("print")(js.Any.fromFunction5((t0: js.Any, t1: typingsJapgolly.prettyFormat.typesMod.Print, t2: typingsJapgolly.prettyFormat.typesMod.Indent, t3: typingsJapgolly.prettyFormat.typesMod.PluginOptions, t4: typingsJapgolly.prettyFormat.typesMod.Colors) => print(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: /* arg0 */ js.Any) => test(t0).runNow()))
    __obj.asInstanceOf[Plugin]
  }
}

