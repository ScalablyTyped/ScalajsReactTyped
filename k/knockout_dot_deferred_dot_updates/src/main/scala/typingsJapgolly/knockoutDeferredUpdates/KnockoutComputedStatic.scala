package typingsJapgolly.knockoutDeferredUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Computed
trait KnockoutComputedStatic extends js.Object {
  var deferUpdates: Boolean
}

object KnockoutComputedStatic {
  @scala.inline
  def apply(deferUpdates: Boolean): KnockoutComputedStatic = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutComputedStatic]
  }
}

