package typingsJapgolly.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arangodb.arangodbStrings.any
  - typingsJapgolly.arangodb.arangodbStrings.inbound
  - typingsJapgolly.arangodb.arangodbStrings.outbound
*/
trait EdgeDirection extends js.Object

object EdgeDirection {
  @scala.inline
  def any: typingsJapgolly.arangodb.arangodbStrings.any = this.cast("any")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inbound: typingsJapgolly.arangodb.arangodbStrings.inbound = this.cast("inbound")
  @scala.inline
  def outbound: typingsJapgolly.arangodb.arangodbStrings.outbound = this.cast("outbound")
}

