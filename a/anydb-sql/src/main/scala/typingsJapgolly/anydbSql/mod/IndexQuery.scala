package typingsJapgolly.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexQuery extends Executable[IndexEntry] {
  def create(): IndexCreationQuery = js.native
  def create(indexName: String): IndexCreationQuery = js.native
  def drop(columns: Column[_]*): Executable[Unit] = js.native
  def drop(indexName: String): Executable[Unit] = js.native
}

