package typingsJapgolly.agGrid.frameworkComponentWrapperMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapableInterface extends js.Object {
  def addMethod(name: String, callback: js.Function): Unit
  def callMethod(name: String, args: IArguments): Unit
  def hasMethod(name: String): Boolean
}

object WrapableInterface {
  @scala.inline
  def apply(
    addMethod: (String, js.Function) => Callback,
    callMethod: (String, IArguments) => Callback,
    hasMethod: String => CallbackTo[Boolean]
  ): WrapableInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addMethod")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => addMethod(t0, t1).runNow()))
    __obj.updateDynamic("callMethod")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.IArguments) => callMethod(t0, t1).runNow()))
    __obj.updateDynamic("hasMethod")(js.Any.fromFunction1((t0: java.lang.String) => hasMethod(t0).runNow()))
    __obj.asInstanceOf[WrapableInterface]
  }
}

