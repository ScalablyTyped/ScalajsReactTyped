package typingsJapgolly.stripe.mod.resources

import typingsJapgolly.stripe.mod.IListOptions
import typingsJapgolly.stripe.mod.IResponseFn
import typingsJapgolly.stripe.mod.StripeResource
import typingsJapgolly.stripe.mod.usageRecordSummaries.IUsageRecordSummaries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.UsageRecordSummaries")
@js.native
class UsageRecordSummaries () extends StripeResource {
  def list(subscriptionItem: String): js.Promise[IUsageRecordSummaries] = js.native
  /**
    * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
    */
  def list(subscriptionItem: String, options: IListOptions): js.Promise[IUsageRecordSummaries] = js.native
  def list(subscriptionItem: String, options: IListOptions, response: IResponseFn[IUsageRecordSummaries]): js.Promise[IUsageRecordSummaries] = js.native
  def list(subscriptionItem: String, response: IResponseFn[IUsageRecordSummaries]): js.Promise[IUsageRecordSummaries] = js.native
}

