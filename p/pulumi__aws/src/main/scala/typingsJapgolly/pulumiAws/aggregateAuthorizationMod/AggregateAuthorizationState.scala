package typingsJapgolly.pulumiAws.aggregateAuthorizationMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateAuthorizationState extends js.Object {
  /**
    * Account ID
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the authorization
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Region
    */
  val region: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object AggregateAuthorizationState {
  @scala.inline
  def apply(
    accountId: Input[String] = null,
    arn: Input[String] = null,
    region: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): AggregateAuthorizationState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateAuthorizationState]
  }
}

