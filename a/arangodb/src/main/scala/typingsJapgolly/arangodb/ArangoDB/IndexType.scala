package typingsJapgolly.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arangodb.arangodbStrings.hash
  - typingsJapgolly.arangodb.arangodbStrings.skiplist
  - typingsJapgolly.arangodb.arangodbStrings.fulltext
  - typingsJapgolly.arangodb.arangodbStrings.geo
  - typingsJapgolly.arangodb.arangodbStrings.ttl
*/
trait IndexType extends js.Object

object IndexType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fulltext: typingsJapgolly.arangodb.arangodbStrings.fulltext = this.cast("fulltext")
  @scala.inline
  def geo: typingsJapgolly.arangodb.arangodbStrings.geo = this.cast("geo")
  @scala.inline
  def hash: typingsJapgolly.arangodb.arangodbStrings.hash = this.cast("hash")
  @scala.inline
  def skiplist: typingsJapgolly.arangodb.arangodbStrings.skiplist = this.cast("skiplist")
  @scala.inline
  def ttl: typingsJapgolly.arangodb.arangodbStrings.ttl = this.cast("ttl")
}

