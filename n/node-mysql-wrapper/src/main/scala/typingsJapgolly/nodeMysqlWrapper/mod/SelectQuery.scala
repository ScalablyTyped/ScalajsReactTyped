package typingsJapgolly.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "SelectQuery")
@js.native
class SelectQuery[T] protected () extends IQuery[T] {
  def this(_table: Table[T]) = this()
  /* private */ def parseQueryResult(result: js.Any, criteria: ICriteriaParts): typingsJapgolly.bluebird.mod.^[_] = js.native
  /**
    * Executes the select and returns the Promise.
    */
  def promise(rawCriteria: js.Any): typingsJapgolly.bluebird.mod.^[js.Array[T]] = js.native
  def promise(rawCriteria: js.Any, callback: js.Function1[/* _results */ js.Array[T], _]): typingsJapgolly.bluebird.mod.^[js.Array[T]] = js.native
}

