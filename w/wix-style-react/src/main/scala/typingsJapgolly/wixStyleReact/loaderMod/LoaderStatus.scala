package typingsJapgolly.wixStyleReact.loaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading
  - typingsJapgolly.wixStyleReact.wixStyleReactStrings.success
  - typingsJapgolly.wixStyleReact.wixStyleReactStrings.error
*/
trait LoaderStatus extends js.Object

object LoaderStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.wixStyleReact.wixStyleReactStrings.error = this.cast("error")
  @scala.inline
  def loading: typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading = this.cast("loading")
  @scala.inline
  def success: typingsJapgolly.wixStyleReact.wixStyleReactStrings.success = this.cast("success")
}

