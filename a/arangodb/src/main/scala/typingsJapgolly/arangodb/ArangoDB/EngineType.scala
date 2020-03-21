package typingsJapgolly.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arangodb.arangodbStrings.mmfiles
  - typingsJapgolly.arangodb.arangodbStrings.rocksdb
*/
trait EngineType extends js.Object

object EngineType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mmfiles: typingsJapgolly.arangodb.arangodbStrings.mmfiles = this.cast("mmfiles")
  @scala.inline
  def rocksdb: typingsJapgolly.arangodb.arangodbStrings.rocksdb = this.cast("rocksdb")
}

