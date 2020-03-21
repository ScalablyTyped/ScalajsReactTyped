package typingsJapgolly.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabInstanceParameters extends js.Object {
  /**
    * Flag allowing to select favorite channels only
    */
  var favoriteChannelsOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Flag allowing to select favorite teams only
    */
  var favoriteTeamsOnly: js.UndefOr[Boolean] = js.undefined
}

object TabInstanceParameters {
  @scala.inline
  def apply(
    favoriteChannelsOnly: js.UndefOr[Boolean] = js.undefined,
    favoriteTeamsOnly: js.UndefOr[Boolean] = js.undefined
  ): TabInstanceParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(favoriteChannelsOnly)) __obj.updateDynamic("favoriteChannelsOnly")(favoriteChannelsOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(favoriteTeamsOnly)) __obj.updateDynamic("favoriteTeamsOnly")(favoriteTeamsOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabInstanceParameters]
  }
}

