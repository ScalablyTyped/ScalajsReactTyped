package typingsJapgolly.anydbSql.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableNode extends js.Object {
  def join(table: TableNode): JoinTableNode
  def leftJoin(table: TableNode): JoinTableNode
}

object TableNode {
  @scala.inline
  def apply(join: TableNode => CallbackTo[JoinTableNode], leftJoin: TableNode => CallbackTo[JoinTableNode]): TableNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("join")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.TableNode) => join(t0).runNow()))
    __obj.updateDynamic("leftJoin")(js.Any.fromFunction1((t0: typingsJapgolly.anydbSql.mod.TableNode) => leftJoin(t0).runNow()))
    __obj.asInstanceOf[TableNode]
  }
}

