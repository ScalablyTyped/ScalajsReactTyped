package typingsJapgolly.dogapi

import typingsJapgolly.dogapi.dogapiStrings.`my apps`
import typingsJapgolly.dogapi.dogapiStrings.bitbucket
import typingsJapgolly.dogapi.dogapiStrings.capistrano
import typingsJapgolly.dogapi.dogapiStrings.chef
import typingsJapgolly.dogapi.dogapiStrings.error
import typingsJapgolly.dogapi.dogapiStrings.fabric
import typingsJapgolly.dogapi.dogapiStrings.feed
import typingsJapgolly.dogapi.dogapiStrings.git
import typingsJapgolly.dogapi.dogapiStrings.hudson
import typingsJapgolly.dogapi.dogapiStrings.info
import typingsJapgolly.dogapi.dogapiStrings.jenkins
import typingsJapgolly.dogapi.dogapiStrings.low
import typingsJapgolly.dogapi.dogapiStrings.nagios
import typingsJapgolly.dogapi.dogapiStrings.normal
import typingsJapgolly.dogapi.dogapiStrings.puppet
import typingsJapgolly.dogapi.dogapiStrings.success
import typingsJapgolly.dogapi.dogapiStrings.user
import typingsJapgolly.dogapi.dogapiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAggregationkey extends js.Object {
  var aggregation_key: js.UndefOr[String] = js.undefined
  var alert_type: js.UndefOr[error | warning | info | success] = js.undefined
  var date_happened: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[normal | low] = js.undefined
  var source_type_name: js.UndefOr[
    nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano
  ] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonAggregationkey {
  @scala.inline
  def apply(
    aggregation_key: String = null,
    alert_type: error | warning | info | success = null,
    date_happened: Int | Double = null,
    host: String = null,
    priority: normal | low = null,
    source_type_name: nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano = null,
    tags: js.Array[String] = null
  ): AnonAggregationkey = {
    val __obj = js.Dynamic.literal()
    if (aggregation_key != null) __obj.updateDynamic("aggregation_key")(aggregation_key.asInstanceOf[js.Any])
    if (alert_type != null) __obj.updateDynamic("alert_type")(alert_type.asInstanceOf[js.Any])
    if (date_happened != null) __obj.updateDynamic("date_happened")(date_happened.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (source_type_name != null) __obj.updateDynamic("source_type_name")(source_type_name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAggregationkey]
  }
}

