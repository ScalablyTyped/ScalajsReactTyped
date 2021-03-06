package typingsJapgolly.when.When

import typingsJapgolly.when.whenStrings.fulfilled
import typingsJapgolly.when.whenStrings.pending
import typingsJapgolly.when.whenStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Snapshot which describes the status of a promise.
  * state may be one of:
  * "fulfilled" - the promise has resolved
  * "rejected" - the promise has rejected
  * "pending" - the promise is still pending to resolve/reject
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.when.When.FulfilledDescriptor[T]
  - typingsJapgolly.when.When.RejectedDescriptor
  - typingsJapgolly.when.When.PendingDescriptor
*/
trait Snapshot[T] extends js.Object

object Snapshot {
  @scala.inline
  def FulfilledDescriptor[T](state: fulfilled, value: T): Snapshot[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Snapshot[T]]
  }
  @scala.inline
  def RejectedDescriptor[T](reason: js.Any, state: rejected): Snapshot[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Snapshot[T]]
  }
  @scala.inline
  def PendingDescriptor[T](state: pending): Snapshot[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Snapshot[T]]
  }
}

