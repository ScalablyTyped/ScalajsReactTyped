package typingsJapgolly.webpackPluginServe

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApply extends js.Object {
  @JSName("apply")
  def apply(compiler: Compiler_): Unit
}

object AnonApply {
  @scala.inline
  def apply(apply: Compiler_ => Callback): AnonApply = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.webpack.mod.Compiler_) => apply(t0).runNow()))
    __obj.asInstanceOf[AnonApply]
  }
}

