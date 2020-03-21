package typingsJapgolly.tsMockito.methodStubMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodStub extends js.Object {
  def execute(args: js.Array[_]): Unit
  def getGroupIndex(): Double
  def getValue(): js.Any
  def isApplicable(args: js.Array[_]): Boolean
}

object MethodStub {
  @scala.inline
  def apply(
    execute: js.Array[js.Any] => Callback,
    getGroupIndex: CallbackTo[Double],
    getValue: CallbackTo[js.Any],
    isApplicable: js.Array[js.Any] => CallbackTo[Boolean]
  ): MethodStub = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction1((t0: js.Array[js.Any]) => execute(t0).runNow()))
    __obj.updateDynamic("getGroupIndex")(getGroupIndex.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("isApplicable")(js.Any.fromFunction1((t0: js.Array[js.Any]) => isApplicable(t0).runNow()))
    __obj.asInstanceOf[MethodStub]
  }
}

