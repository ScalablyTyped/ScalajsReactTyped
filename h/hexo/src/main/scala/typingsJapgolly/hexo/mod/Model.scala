package typingsJapgolly.hexo.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model[T] extends js.Object {
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def count(): Double
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def filter(fn: js.Function2[/* v */ T, /* i */ Double, Boolean]): Model[T]
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def forEach(fn: js.Function2[/* v */ T, /* i */ Double, Unit]): Unit
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def map[U](fn: js.Function2[/* v */ T, /* i */ Double, U]): js.Array[U]
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def toArray(): js.Array[T]
}

object Model {
  @scala.inline
  def apply[T](
    count: CallbackTo[Double],
    filter: js.Function2[/* v */ T, /* i */ Double, Boolean] => CallbackTo[Model[T]],
    forEach: js.Function2[/* v */ T, /* i */ Double, Unit] => Callback,
    map: js.Function2[/* v */ T, /* i */ Double, js.Any] => CallbackTo[js.Array[js.Any]],
    toArray: CallbackTo[js.Array[T]]
  ): Model[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: js.Function2[/* v */ T, /* i */ scala.Double, scala.Boolean]) => filter(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function2[/* v */ T, /* i */ scala.Double, scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: js.Function2[/* v */ T, /* i */ scala.Double, js.Any]) => map(t0).runNow()))
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.asInstanceOf[Model[T]]
  }
}

