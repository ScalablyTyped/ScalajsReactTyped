package typingsJapgolly.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a creative which has been associated with a given campaign.
  */
@js.native
trait SchemaCampaignCreativeAssociation extends js.Object {
  /**
    * ID of the creative associated with the campaign. This is a required
    * field.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaignCreativeAssociation&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaCampaignCreativeAssociation {
  @scala.inline
  def apply(creativeId: String = null, kind: String = null): SchemaCampaignCreativeAssociation = {
    val __obj = js.Dynamic.literal()
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCampaignCreativeAssociation]
  }
}

