package typingsJapgolly.azureKustoData.mod.Client

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KustoResultTable[T] extends js.Object {
  var columns: js.Array[_]
  var id: String
  var kind: String
  var name: String
  def rows(): IterableIterator[KustoResultRow[T]]
  def toJson(): js.Any
}

object KustoResultTable {
  @scala.inline
  def apply[T](
    columns: js.Array[_],
    id: String,
    kind: String,
    name: String,
    rows: CallbackTo[IterableIterator[KustoResultRow[T]]],
    toJson: CallbackTo[js.Any]
  ): KustoResultTable[T] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("rows")(rows.toJsFn)
    __obj.updateDynamic("toJson")(toJson.toJsFn)
    __obj.asInstanceOf[KustoResultTable[T]]
  }
}

