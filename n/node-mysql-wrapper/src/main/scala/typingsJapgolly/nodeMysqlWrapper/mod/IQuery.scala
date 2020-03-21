package typingsJapgolly.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQuery[T] extends js.Object {
  var _table: Table[T] = js.native
  def execute(rawCriteria: js.Any): typingsJapgolly.bluebird.mod.^[_] = js.native
  def execute(rawCriteria: js.Any, callback: js.Function1[/* _results */ js.Any, _]): typingsJapgolly.bluebird.mod.^[_] = js.native
}

