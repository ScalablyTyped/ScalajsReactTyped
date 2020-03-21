package typingsJapgolly.stripe.mod.resources

import typingsJapgolly.stripe.mod.HeaderOptions
import typingsJapgolly.stripe.mod.IResponseFn
import typingsJapgolly.stripe.mod.StripeResource
import typingsJapgolly.stripe.mod.usageRecords.IUsageRecord
import typingsJapgolly.stripe.mod.usageRecords.IUsageRecordCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.UsageRecords")
@js.native
class UsageRecords () extends StripeResource {
  def create(subscription: String, data: IUsageRecordCreationOptions): js.Promise[IUsageRecord] = js.native
  /**
    * Creates a usage record for a specified subscription item and date, and fills it with a quantity.
    */
  def create(subscription: String, data: IUsageRecordCreationOptions, options: HeaderOptions): js.Promise[IUsageRecord] = js.native
  def create(
    subscription: String,
    data: IUsageRecordCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IUsageRecord]
  ): js.Promise[IUsageRecord] = js.native
  def create(subscription: String, data: IUsageRecordCreationOptions, response: IResponseFn[IUsageRecord]): js.Promise[IUsageRecord] = js.native
}

