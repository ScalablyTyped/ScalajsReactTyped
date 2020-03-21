package typingsJapgolly.wepy.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.wepy.wepyStrings.requestfix
  - typingsJapgolly.wepy.wepyStrings.promisify
*/
trait AddOn extends js.Object

object AddOn {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def promisify: typingsJapgolly.wepy.wepyStrings.promisify = this.cast("promisify")
  @scala.inline
  def requestfix: typingsJapgolly.wepy.wepyStrings.requestfix = this.cast("requestfix")
}

