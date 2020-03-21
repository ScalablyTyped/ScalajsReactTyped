package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider[T /* <: SlickData */] extends js.Object {
  /**
  		 * Returns the metadata for the item at a given index (optional).
  		 * @param index
  		 */
  var getItemMetadata: js.UndefOr[js.Function1[/* index */ Double, RowMetadata[T]]] = js.undefined
  /**
  		 * Returns the item at a given index.
  		 * @param index
  		 */
  def getItem(index: Double): T
  /**
  		 * Returns the number of data items in the set.
  		 */
  def getLength(): Double
}

object DataProvider {
  @scala.inline
  def apply[T /* <: SlickData */](
    getItem: Double => CallbackTo[T],
    getLength: CallbackTo[Double],
    getItemMetadata: /* index */ Double => CallbackTo[RowMetadata[T]] = null
  ): DataProvider[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: scala.Double) => getItem(t0).runNow()))
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    if (getItemMetadata != null) __obj.updateDynamic("getItemMetadata")(js.Any.fromFunction1((t0: /* index */ scala.Double) => getItemMetadata(t0).runNow()))
    __obj.asInstanceOf[DataProvider[T]]
  }
}

