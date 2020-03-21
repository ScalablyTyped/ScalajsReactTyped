package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateReleaseAssetParams extends js.Object {
  var asset_id: Double
  /**
    * An alternate short description of the asset. Used in place of the filename.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The file name of the asset.
    */
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object ReposUpdateReleaseAssetParams {
  @scala.inline
  def apply(asset_id: Double, owner: String, repo: String, label: String = null, name: String = null): ReposUpdateReleaseAssetParams = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateReleaseAssetParams]
  }
}

