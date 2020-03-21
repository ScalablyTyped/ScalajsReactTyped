package typingsJapgolly.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeRange extends js.Object {
  /**
    * The start time, in Unix time in seconds. For more information see timestamp.
    */
  var FromInclusive: js.UndefOr[js.Date] = js.native
  /**
    * The end time, in Unix time in seconds. For more information see timestamp.
    */
  var ToExclusive: js.UndefOr[js.Date] = js.native
}

object TimeRange {
  @scala.inline
  def apply(FromInclusive: js.Date = null, ToExclusive: js.Date = null): TimeRange = {
    val __obj = js.Dynamic.literal()
    if (FromInclusive != null) __obj.updateDynamic("FromInclusive")(FromInclusive.asInstanceOf[js.Any])
    if (ToExclusive != null) __obj.updateDynamic("ToExclusive")(ToExclusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRange]
  }
}

