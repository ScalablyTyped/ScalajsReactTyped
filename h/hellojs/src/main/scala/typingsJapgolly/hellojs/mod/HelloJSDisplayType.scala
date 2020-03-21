package typingsJapgolly.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hellojs.hellojsStrings.popup
  - typingsJapgolly.hellojs.hellojsStrings.page
  - typingsJapgolly.hellojs.hellojsStrings.none
*/
trait HelloJSDisplayType extends js.Object

object HelloJSDisplayType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.hellojs.hellojsStrings.none = this.cast("none")
  @scala.inline
  def page: typingsJapgolly.hellojs.hellojsStrings.page = this.cast("page")
  @scala.inline
  def popup: typingsJapgolly.hellojs.hellojsStrings.popup = this.cast("popup")
}

