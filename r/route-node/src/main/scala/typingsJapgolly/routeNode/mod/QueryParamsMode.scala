package typingsJapgolly.routeNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.routeNode.routeNodeStrings.default
  - typingsJapgolly.routeNode.routeNodeStrings.strict
  - typingsJapgolly.routeNode.routeNodeStrings.loose
*/
trait QueryParamsMode extends js.Object

object QueryParamsMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.routeNode.routeNodeStrings.default = this.cast("default")
  @scala.inline
  def loose: typingsJapgolly.routeNode.routeNodeStrings.loose = this.cast("loose")
  @scala.inline
  def strict: typingsJapgolly.routeNode.routeNodeStrings.strict = this.cast("strict")
}

