package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchase extends js.Object {
  var billing_cycle: String
  var free_trial_ends_on: String
  var next_billing_date: String
  var on_free_trial: Boolean
  var plan: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchasePlan
  var unit_count: Null
  var updated_at: String
}

object AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchase {
  @scala.inline
  def apply(
    billing_cycle: String,
    free_trial_ends_on: String,
    next_billing_date: String,
    on_free_trial: Boolean,
    plan: AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchasePlan,
    unit_count: Null,
    updated_at: String
  ): AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchase = {
    val __obj = js.Dynamic.literal(billing_cycle = billing_cycle.asInstanceOf[js.Any], free_trial_ends_on = free_trial_ends_on.asInstanceOf[js.Any], next_billing_date = next_billing_date.asInstanceOf[js.Any], on_free_trial = on_free_trial.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppsCheckAccountIsAssociatedWithAnyResponseMarketplacePurchase]
  }
}

