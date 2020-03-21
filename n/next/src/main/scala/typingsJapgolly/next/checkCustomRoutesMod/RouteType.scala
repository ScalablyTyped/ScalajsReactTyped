package typingsJapgolly.next.checkCustomRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.next.nextStrings.rewrite
  - typingsJapgolly.next.nextStrings.redirect
  - typingsJapgolly.next.nextStrings.header
*/
trait RouteType extends js.Object

object RouteType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def header: typingsJapgolly.next.nextStrings.header = this.cast("header")
  @scala.inline
  def redirect: typingsJapgolly.next.nextStrings.redirect = this.cast("redirect")
  @scala.inline
  def rewrite: typingsJapgolly.next.nextStrings.rewrite = this.cast("rewrite")
}

