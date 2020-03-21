package typingsJapgolly.tabulator.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
trait Tabulator extends js.Object {
  // myMethod(opts: Tabulator.chartType): number;
  var defaultShowAttribute: String
  def toHtmlTable(matrix: js.Object): js.Any
  def toMatrix(datum: js.Object): js.Object
}

object Tabulator {
  @scala.inline
  def apply(
    defaultShowAttribute: String,
    toHtmlTable: js.Object => CallbackTo[js.Any],
    toMatrix: js.Object => CallbackTo[js.Object]
  ): Tabulator = {
    val __obj = js.Dynamic.literal(defaultShowAttribute = defaultShowAttribute.asInstanceOf[js.Any])
    __obj.updateDynamic("toHtmlTable")(js.Any.fromFunction1((t0: js.Object) => toHtmlTable(t0).runNow()))
    __obj.updateDynamic("toMatrix")(js.Any.fromFunction1((t0: js.Object) => toMatrix(t0).runNow()))
    __obj.asInstanceOf[Tabulator]
  }
}

