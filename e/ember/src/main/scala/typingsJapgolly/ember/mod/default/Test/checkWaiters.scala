package typingsJapgolly.ember.mod.default.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Test.checkWaiters")
@js.native
object checkWaiters extends js.Object {
  /**
    * Iterates through each registered test waiter, and invokes
    * its callback. If any waiter returns false, this method will return
    * true indicating that the waiters have not settled yet.
    */
  def apply(): Boolean = js.native
}

