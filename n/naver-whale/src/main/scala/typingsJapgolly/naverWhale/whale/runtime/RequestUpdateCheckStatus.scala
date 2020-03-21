package typingsJapgolly.naverWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.naverWhale.naverWhaleStrings.throttled
  - typingsJapgolly.naverWhale.naverWhaleStrings.no_update
  - typingsJapgolly.naverWhale.naverWhaleStrings.update_available
*/
trait RequestUpdateCheckStatus extends js.Object

object RequestUpdateCheckStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def no_update: typingsJapgolly.naverWhale.naverWhaleStrings.no_update = this.cast("no_update")
  @scala.inline
  def throttled: typingsJapgolly.naverWhale.naverWhaleStrings.throttled = this.cast("throttled")
  @scala.inline
  def update_available: typingsJapgolly.naverWhale.naverWhaleStrings.update_available = this.cast("update_available")
}

