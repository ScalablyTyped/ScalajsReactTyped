package typingsJapgolly.detox.mod._Global_.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.detox.detoxStrings.YES
  - typingsJapgolly.detox.detoxStrings.NO
  - typingsJapgolly.detox.detoxStrings.unset
*/
trait PermissionState extends js.Object

object PermissionState {
  @scala.inline
  def NO: typingsJapgolly.detox.detoxStrings.NO = this.cast("NO")
  @scala.inline
  def YES: typingsJapgolly.detox.detoxStrings.YES = this.cast("YES")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unset: typingsJapgolly.detox.detoxStrings.unset = this.cast("unset")
}

