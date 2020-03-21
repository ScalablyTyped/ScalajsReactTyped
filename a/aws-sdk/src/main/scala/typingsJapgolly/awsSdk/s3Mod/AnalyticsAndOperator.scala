package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsAndOperator extends js.Object {
  /**
    * The prefix to use when evaluating an AND predicate: The prefix that an object must have to be included in the metrics results.
    */
  var Prefix: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.Prefix] = js.native
  /**
    * The list of tags to use when evaluating an AND predicate.
    */
  var Tags: js.UndefOr[TagSet] = js.native
}

object AnalyticsAndOperator {
  @scala.inline
  def apply(Prefix: Prefix = null, Tags: TagSet = null): AnalyticsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsAndOperator]
  }
}

