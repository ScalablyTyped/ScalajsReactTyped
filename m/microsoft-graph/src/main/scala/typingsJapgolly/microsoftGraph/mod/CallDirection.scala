package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.incoming
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.outgoing
*/
trait CallDirection extends js.Object

object CallDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incoming: typingsJapgolly.microsoftGraph.microsoftGraphStrings.incoming = this.cast("incoming")
  @scala.inline
  def outgoing: typingsJapgolly.microsoftGraph.microsoftGraphStrings.outgoing = this.cast("outgoing")
}

