package typingsJapgolly.bluebirdLst.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inspection[R] extends js.Object {
  /**
    * See if the underlying promise was cancelled at the creation time of this inspection object.
    */
  def isCancelled(): Boolean
  /**
    * See if the underlying promise was fulfilled at the creation time of this inspection object.
    */
  def isFulfilled(): Boolean
  /**
    * See if the underlying promise was defer at the creation time of this inspection object.
    */
  def isPending(): Boolean
  /**
    * See if the underlying promise was rejected at the creation time of this inspection object.
    */
  def isRejected(): Boolean
  /**
    * Get the rejection reason for the underlying promise. Throws if the promise wasn't rejected at the creation time of this inspection object.
    *
    * throws `TypeError`
    */
  def reason(): js.Any
  /**
    * Get the fulfillment value of the underlying promise. Throws if the promise wasn't fulfilled at the creation time of this inspection object.
    *
    * throws `TypeError`
    */
  def value(): R
}

object Inspection {
  @scala.inline
  def apply[R](
    isCancelled: CallbackTo[Boolean],
    isFulfilled: CallbackTo[Boolean],
    isPending: CallbackTo[Boolean],
    isRejected: CallbackTo[Boolean],
    reason: CallbackTo[js.Any],
    value: CallbackTo[R]
  ): Inspection[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isCancelled")(isCancelled.toJsFn)
    __obj.updateDynamic("isFulfilled")(isFulfilled.toJsFn)
    __obj.updateDynamic("isPending")(isPending.toJsFn)
    __obj.updateDynamic("isRejected")(isRejected.toJsFn)
    __obj.updateDynamic("reason")(reason.toJsFn)
    __obj.updateDynamic("value")(value.toJsFn)
    __obj.asInstanceOf[Inspection[R]]
  }
}

