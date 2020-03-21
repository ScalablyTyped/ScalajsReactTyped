package typingsJapgolly.datatablesNet.DataTables

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "util-methods"
trait CommonSubMethods extends js.Object {
  /**
    * Get the DataTables cached data for the selected cell
    *
    * @param t Specify which cache the data should be read from. Can take one of two values: search or order
    */
  def cache(t: String): Api
}

object CommonSubMethods {
  @scala.inline
  def apply(cache: String => CallbackTo[Api]): CommonSubMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cache")(js.Any.fromFunction1((t0: java.lang.String) => cache(t0).runNow()))
    __obj.asInstanceOf[CommonSubMethods]
  }
}

