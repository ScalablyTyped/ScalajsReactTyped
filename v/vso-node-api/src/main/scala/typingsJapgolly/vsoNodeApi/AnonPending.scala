package typingsJapgolly.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPending extends js.Object {
  var approved: Double
  var canceled: Double
  var pending: Double
  var reassigned: Double
  var rejected: Double
  var skipped: Double
  var undefined: Double
}

object AnonPending {
  @scala.inline
  def apply(
    approved: Double,
    canceled: Double,
    pending: Double,
    reassigned: Double,
    rejected: Double,
    skipped: Double,
    undefined: Double
  ): AnonPending = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], reassigned = reassigned.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPending]
  }
}

