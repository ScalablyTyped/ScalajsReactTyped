package typingsJapgolly.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arangodb.arangodbStrings.traditional
  - typingsJapgolly.arangodb.arangodbStrings.autoincrement
*/
trait KeyGeneratorType extends js.Object

object KeyGeneratorType {
  @scala.inline
  def autoincrement: typingsJapgolly.arangodb.arangodbStrings.autoincrement = this.cast("autoincrement")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def traditional: typingsJapgolly.arangodb.arangodbStrings.traditional = this.cast("traditional")
}

