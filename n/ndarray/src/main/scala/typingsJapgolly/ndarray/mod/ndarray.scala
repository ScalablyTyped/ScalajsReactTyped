package typingsJapgolly.ndarray.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ndarray[T] extends js.Object {
  var T: ndarray[T]
  var data: Data[T]
  var dimension: Double
  var dtype: DataType
  var offset: Double
  var order: js.Array[Double]
  var shape: js.Array[Double]
  var size: Double
  var stride: js.Array[Double]
  def get(args: Double*): T
  def hi(args: Double*): ndarray[T]
  def index(args: Double*): T
  def lo(args: Double*): ndarray[T]
  def pick(args: (Double | Null)*): ndarray[T]
  def reshape(shapes: Double*): ndarray[T]
  def set(args: Double*): T
  def step(args: Double*): ndarray[T]
  def transpose(args: Double*): ndarray[T]
}

object ndarray {
  @scala.inline
  def apply[T](
    T: ndarray[T],
    data: Data[T],
    dimension: Double,
    dtype: DataType,
    get: /* repeated */ Double => CallbackTo[T],
    hi: /* repeated */ Double => CallbackTo[ndarray[T]],
    index: /* repeated */ Double => CallbackTo[T],
    lo: /* repeated */ Double => CallbackTo[ndarray[T]],
    offset: Double,
    order: js.Array[Double],
    pick: /* repeated */ Double | Null => CallbackTo[ndarray[T]],
    reshape: /* repeated */ Double => CallbackTo[ndarray[T]],
    set: /* repeated */ Double => CallbackTo[T],
    shape: js.Array[Double],
    size: Double,
    step: /* repeated */ Double => CallbackTo[ndarray[T]],
    stride: js.Array[Double],
    transpose: /* repeated */ Double => CallbackTo[ndarray[T]]
  ): ndarray[T] = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dimension = dimension.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* repeated */ scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("hi")(js.Any.fromFunction1((t0: /* repeated */ scala.Double) => hi(t0).runNow()))
    __obj.updateDynamic("index")(js.Any.fromFunction1((t0: /* repeated */ scala.Double) => index(t0).runNow()))
    __obj.updateDynamic("lo")(js.Any.fromFunction1((t0: /* repeated */ scala.Double) => lo(t0).runNow()))
    __obj.updateDynamic("pick")(js.Any.fromFunction1((t0: /* repeated */ scala.Double | scala.Null) => pick(t0).runNow()))
    __obj.updateDynamic("reshape")(js.Any.fromFunction1((t0: /* repeated */ scala.Double) => reshape(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: /* repeated */ scala.Double) => set(t0).runNow()))
    __obj.updateDynamic("step")(js.Any.fromFunction1((t0: /* repeated */ scala.Double) => step(t0).runNow()))
    __obj.updateDynamic("transpose")(js.Any.fromFunction1((t0: /* repeated */ scala.Double) => transpose(t0).runNow()))
    __obj.asInstanceOf[ndarray[T]]
  }
}

