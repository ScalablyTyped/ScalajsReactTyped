package typingsJapgolly.routeNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.routeNode.routeNodeStrings.default
  - typingsJapgolly.routeNode.routeNodeStrings.never
  - typingsJapgolly.routeNode.routeNodeStrings.always
*/
trait TrailingSlashMode extends js.Object

object TrailingSlashMode {
  @scala.inline
  def always: typingsJapgolly.routeNode.routeNodeStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.routeNode.routeNodeStrings.default = this.cast("default")
  @scala.inline
  def never: typingsJapgolly.routeNode.routeNodeStrings.never = this.cast("never")
}

