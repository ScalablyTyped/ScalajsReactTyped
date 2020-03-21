package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions extends js.Object {
  var exclusionDuration: js.UndefOr[String] = js.undefined
  var segment: js.UndefOr[String] = js.undefined
}

object RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions {
  @scala.inline
  def apply(exclusionDuration: String = null, segment: String = null): RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions = {
    val __obj = js.Dynamic.literal()
    if (exclusionDuration != null) __obj.updateDynamic("exclusionDuration")(exclusionDuration.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions]
  }
}

