package typingsJapgolly.rockset.mod

import typingsJapgolly.rockset.rocksetStrings.ACTIVE
import typingsJapgolly.rockset.rocksetStrings.BASIC
import typingsJapgolly.rockset.rocksetStrings.DELETED
import typingsJapgolly.rockset.rocksetStrings.ENTERPRISE
import typingsJapgolly.rockset.rocksetStrings.FREE
import typingsJapgolly.rockset.rocksetStrings.PRO
import typingsJapgolly.rockset.rocksetStrings.TRIAL
import typingsJapgolly.rockset.rocksetStrings.TRIAL_EXPIRED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  // name of the company
  var company_name: js.UndefOr[String] = js.undefined
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.undefined
  // name of the organization
  var display_name: js.UndefOr[String] = js.undefined
  // unique identifier for the organization
  var id: js.UndefOr[String] = js.undefined
  // number of QCUs
  var qcu: js.UndefOr[Double] = js.undefined
  // org state
  var state: js.UndefOr[ACTIVE | TRIAL | TRIAL_EXPIRED | DELETED] = js.undefined
  // pricing tier
  var tier: js.UndefOr[FREE | BASIC | PRO | ENTERPRISE] = js.undefined
}

object Organization {
  @scala.inline
  def apply(
    company_name: String = null,
    created_at: String = null,
    display_name: String = null,
    id: String = null,
    qcu: Int | Double = null,
    state: ACTIVE | TRIAL | TRIAL_EXPIRED | DELETED = null,
    tier: FREE | BASIC | PRO | ENTERPRISE = null
  ): Organization = {
    val __obj = js.Dynamic.literal()
    if (company_name != null) __obj.updateDynamic("company_name")(company_name.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (qcu != null) __obj.updateDynamic("qcu")(qcu.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
}

