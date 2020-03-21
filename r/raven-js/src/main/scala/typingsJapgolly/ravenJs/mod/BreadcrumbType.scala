package typingsJapgolly.ravenJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ravenJs.ravenJsStrings.navigation
  - typingsJapgolly.ravenJs.ravenJsStrings.http
*/
trait BreadcrumbType extends js.Object

object BreadcrumbType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typingsJapgolly.ravenJs.ravenJsStrings.http = this.cast("http")
  @scala.inline
  def navigation: typingsJapgolly.ravenJs.ravenJsStrings.navigation = this.cast("navigation")
}

