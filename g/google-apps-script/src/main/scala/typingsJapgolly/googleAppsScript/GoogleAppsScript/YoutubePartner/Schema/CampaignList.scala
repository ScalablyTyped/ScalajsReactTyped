package typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignList extends js.Object {
  var items: js.UndefOr[js.Array[Campaign]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object CampaignList {
  @scala.inline
  def apply(items: js.Array[Campaign] = null, kind: String = null): CampaignList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignList]
  }
}

