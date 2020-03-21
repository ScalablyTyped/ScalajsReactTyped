package typingsJapgolly.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.eq
  - typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.like
*/
trait FilterCondition extends js.Object

object FilterCondition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eq: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.eq = this.cast("eq")
  @scala.inline
  def like: typingsJapgolly.reactBootstrapTable.reactBootstrapTableStrings.like = this.cast("like")
}

