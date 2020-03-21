package typingsJapgolly.babelPluginSyntaxJsx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManipulateOptions extends js.Object {
  def manipulateOptions(opts: js.Any, parserOpts: AnonPlugins): Unit
}

object AnonManipulateOptions {
  @scala.inline
  def apply(manipulateOptions: (js.Any, AnonPlugins) => Callback): AnonManipulateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("manipulateOptions")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.babelPluginSyntaxJsx.AnonPlugins) => manipulateOptions(t0, t1).runNow()))
    __obj.asInstanceOf[AnonManipulateOptions]
  }
}

