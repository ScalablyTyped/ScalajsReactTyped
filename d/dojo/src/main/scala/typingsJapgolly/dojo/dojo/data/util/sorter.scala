package typingsJapgolly.dojo.dojo.data.util

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dojo.data.api.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/data/util/sorter.html
  *
  *
  */
trait sorter extends js.Object {
  /**
    * Basic comparison function that compares if an item is greater or less than another item
    * returns 1 if a > b, -1 if a < b, 0 if equal.
    * 'null' values (null, undefined) are treated as larger values so that they're pushed to the end of the list.
    * And compared to each other, null is equivalent to undefined.
    *
    * @param a
    * @param b
    */
  def basicComparator(a: js.Any, b: js.Any): Double
  /**
    * Helper function to generate the sorting function based off the list of sort attributes.
    * The sort function creation will look for a property on the store called 'comparatorMap'.  If it exists
    * it will look in the mapping for comparisons function for the attributes.  If one is found, it will
    * use it instead of the basic comparator, which is typically used for strings, ints, booleans, and dates.
    * Returns the sorting function for this particular list of attributes and sorting directions.
    *
    * @param sortSpec A JS object that array that defines out what attribute names to sort on and whether it should be descenting or asending.The objects should be formatted as follows:{    attribute: "attributeName-string" || attribute,    descending: true|false;   // Default is false.}
    * @param store The datastore object to look up item values from.
    */
  def createSortFunction(sortSpec: js.Object, store: Read): js.Array[String]
}

object sorter {
  @scala.inline
  def apply(
    basicComparator: (js.Any, js.Any) => CallbackTo[Double],
    createSortFunction: (js.Object, Read) => CallbackTo[js.Array[String]]
  ): sorter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basicComparator")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => basicComparator(t0, t1).runNow()))
    __obj.updateDynamic("createSortFunction")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.dojo.dojo.data.api.Read) => createSortFunction(t0, t1).runNow()))
    __obj.asInstanceOf[sorter]
  }
}

