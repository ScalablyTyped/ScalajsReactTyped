package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetSelection extends js.Object {
  /**
    * A creativeAssets[].id. This should refer to one of the parent assets in this creative, and will be served if none of the rules match. This is a
    * required field.
    */
  var defaultAssetId: js.UndefOr[String] = js.undefined
  /**
    * Rules determine which asset will be served to a viewer. Rules will be evaluated in the order in which they are stored in this list. This list must
    * contain at least one rule. Applicable to INSTREAM_VIDEO creatives.
    */
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}

object CreativeAssetSelection {
  @scala.inline
  def apply(defaultAssetId: String = null, rules: js.Array[Rule] = null): CreativeAssetSelection = {
    val __obj = js.Dynamic.literal()
    if (defaultAssetId != null) __obj.updateDynamic("defaultAssetId")(defaultAssetId.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeAssetSelection]
  }
}

