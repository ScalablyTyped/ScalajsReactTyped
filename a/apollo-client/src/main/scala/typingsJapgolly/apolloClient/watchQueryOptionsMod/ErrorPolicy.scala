package typingsJapgolly.apolloClient.watchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.apolloClient.apolloClientStrings.none
  - typingsJapgolly.apolloClient.apolloClientStrings.ignore
  - typingsJapgolly.apolloClient.apolloClientStrings.all
*/
trait ErrorPolicy extends js.Object

object ErrorPolicy {
  @scala.inline
  def all: typingsJapgolly.apolloClient.apolloClientStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ignore: typingsJapgolly.apolloClient.apolloClientStrings.ignore = this.cast("ignore")
  @scala.inline
  def none: typingsJapgolly.apolloClient.apolloClientStrings.none = this.cast("none")
}

