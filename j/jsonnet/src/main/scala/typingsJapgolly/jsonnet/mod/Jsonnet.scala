package typingsJapgolly.jsonnet.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jsonnet extends js.Object {
  def destroy(): Unit
  def eval(code: String): js.Any
  def evalFile(): js.Any
}

object Jsonnet {
  @scala.inline
  def apply(destroy: Callback, eval: String => CallbackTo[js.Any], evalFile: CallbackTo[js.Any]): Jsonnet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("eval")(js.Any.fromFunction1((t0: java.lang.String) => eval(t0).runNow()))
    __obj.updateDynamic("evalFile")(evalFile.toJsFn)
    __obj.asInstanceOf[Jsonnet]
  }
}

