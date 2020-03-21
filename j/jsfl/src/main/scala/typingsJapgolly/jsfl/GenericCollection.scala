package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericCollection[T] extends js.Object {
  var elements: js.Array[T]
  def each(
    callback: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      Unit
    ]
  ): js.Any
  def randomize(info: js.Any): GenericCollection[T]
  def rename(pattern: String): GenericCollection[T]
  def select(): GenericCollection[T]
  def toGrid(x: Double, y: Double): GenericCollection[T]
  def update(): GenericCollection[T]
}

object GenericCollection {
  @scala.inline
  def apply[T](
    each: js.Function3[
      /* element */ T, 
      /* index */ js.UndefOr[Double], 
      /* elements */ js.UndefOr[js.Array[T]], 
      Unit
    ] => CallbackTo[js.Any],
    elements: js.Array[T],
    randomize: js.Any => CallbackTo[GenericCollection[T]],
    rename: String => CallbackTo[GenericCollection[T]],
    select: CallbackTo[GenericCollection[T]],
    toGrid: (Double, Double) => CallbackTo[GenericCollection[T]],
    update: CallbackTo[GenericCollection[T]]
  ): GenericCollection[T] = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function3[
  /* element */ T, 
  /* index */ js.UndefOr[scala.Double], 
  /* elements */ js.UndefOr[js.Array[T]], 
  scala.Unit]) => each(t0).runNow()))
    __obj.updateDynamic("randomize")(js.Any.fromFunction1((t0: js.Any) => randomize(t0).runNow()))
    __obj.updateDynamic("rename")(js.Any.fromFunction1((t0: java.lang.String) => rename(t0).runNow()))
    __obj.updateDynamic("select")(select.toJsFn)
    __obj.updateDynamic("toGrid")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => toGrid(t0, t1).runNow()))
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[GenericCollection[T]]
  }
}

