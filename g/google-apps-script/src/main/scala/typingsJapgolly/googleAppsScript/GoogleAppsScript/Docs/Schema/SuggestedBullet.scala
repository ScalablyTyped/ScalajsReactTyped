package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedBullet extends js.Object {
  var bullet: js.UndefOr[Bullet] = js.undefined
  var bulletSuggestionState: js.UndefOr[BulletSuggestionState] = js.undefined
}

object SuggestedBullet {
  @scala.inline
  def apply(bullet: Bullet = null, bulletSuggestionState: BulletSuggestionState = null): SuggestedBullet = {
    val __obj = js.Dynamic.literal()
    if (bullet != null) __obj.updateDynamic("bullet")(bullet.asInstanceOf[js.Any])
    if (bulletSuggestionState != null) __obj.updateDynamic("bulletSuggestionState")(bulletSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedBullet]
  }
}

