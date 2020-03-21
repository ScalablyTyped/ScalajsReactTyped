package typingsJapgolly.websql

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SQLResultSetRowList objects have a length attribute that must return the number of
  * rows it represents (the number of rows returned by the database). This is the length.
  * Fetching the length might be expensive, and authors are thus encouraged to avoid using
  * it (or enumerating over the object, which implicitly uses it) where possible.
  * The object's supported property indices are the numbers in the range zero to length-1,
  * unless the length is zero, in which case there are no supported property indices.
  * The item(index) attribute must return the row with the given index index.
  * If there is no such row, then the method must return null.
  *
  * Each row must be represented by a native ordered dictionary data type. In the
  * JavaScript binding, this must be Object. Each row object must have one property
  * (or dictionary entry) per column, with those properties enumerating in the order
  * that these columns were returned by the database. Each property must have the
  * name of the column and the value of the cell, as they were returned by the database
  */
trait SQLResultSetRowList extends js.Object {
  var length: Double
  def item(index: Double): js.Any
}

object SQLResultSetRowList {
  @scala.inline
  def apply(item: Double => CallbackTo[js.Any], length: Double): SQLResultSetRowList = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("item")(js.Any.fromFunction1((t0: scala.Double) => item(t0).runNow()))
    __obj.asInstanceOf[SQLResultSetRowList]
  }
}

