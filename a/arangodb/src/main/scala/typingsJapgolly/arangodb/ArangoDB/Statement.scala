package typingsJapgolly.arangodb.ArangoDB

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statement[T] extends js.Object {
  def bind(name: String, value: js.Any): Unit
  def execute(): Cursor[T]
  def getBatchSize(): Double
  def setBatchSize(size: Double): Unit
}

object Statement {
  @scala.inline
  def apply[T](
    bind: (String, js.Any) => Callback,
    execute: CallbackTo[Cursor[T]],
    getBatchSize: CallbackTo[Double],
    setBatchSize: Double => Callback
  ): Statement[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => bind(t0, t1).runNow()))
    __obj.updateDynamic("execute")(execute.toJsFn)
    __obj.updateDynamic("getBatchSize")(getBatchSize.toJsFn)
    __obj.updateDynamic("setBatchSize")(js.Any.fromFunction1((t0: scala.Double) => setBatchSize(t0).runNow()))
    __obj.asInstanceOf[Statement[T]]
  }
}

