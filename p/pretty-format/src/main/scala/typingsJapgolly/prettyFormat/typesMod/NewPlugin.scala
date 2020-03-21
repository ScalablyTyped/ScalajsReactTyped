package typingsJapgolly.prettyFormat.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewPlugin extends Plugin {
  var test: Test
  def serialize(`val`: js.Any, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String
}

object NewPlugin {
  @scala.inline
  def apply(
    serialize: (js.Any, Config, String, Double, Refs, Printer) => CallbackTo[String],
    test: /* arg0 */ js.Any => CallbackTo[Boolean]
  ): NewPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serialize")(js.Any.fromFunction6((t0: js.Any, t1: typingsJapgolly.prettyFormat.typesMod.Config, t2: java.lang.String, t3: scala.Double, t4: typingsJapgolly.prettyFormat.typesMod.Refs, t5: typingsJapgolly.prettyFormat.typesMod.Printer) => serialize(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: /* arg0 */ js.Any) => test(t0).runNow()))
    __obj.asInstanceOf[NewPlugin]
  }
}

