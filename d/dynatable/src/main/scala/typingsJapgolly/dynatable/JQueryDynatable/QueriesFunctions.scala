package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueriesFunctions extends js.Object {
  /**
    * Search in all of the properties of the provided single record
    *
    * @param record A data object with all the properties of the current line
    * @param queryValue The researched value
    * @return A boolean indicating if a match was found
    */
  def search(record: js.Any, queryValue: String): Boolean
}

object QueriesFunctions {
  @scala.inline
  def apply(search: (js.Any, String) => CallbackTo[Boolean]): QueriesFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("search")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => search(t0, t1).runNow()))
    __obj.asInstanceOf[QueriesFunctions]
  }
}

