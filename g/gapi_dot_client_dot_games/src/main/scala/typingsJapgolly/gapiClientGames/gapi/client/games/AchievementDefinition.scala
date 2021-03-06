package typingsJapgolly.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementDefinition extends js.Object {
  /**
    * The type of the achievement.
    * Possible values are:
    * - "STANDARD" - Achievement is either locked or unlocked.
    * - "INCREMENTAL" - Achievement is incremental.
    */
  var achievementType: js.UndefOr[String] = js.undefined
  /** The description of the achievement. */
  var description: js.UndefOr[String] = js.undefined
  /** Experience points which will be earned when unlocking this achievement. */
  var experiencePoints: js.UndefOr[String] = js.undefined
  /** The total steps for an incremental achievement as a string. */
  var formattedTotalSteps: js.UndefOr[String] = js.undefined
  /** The ID of the achievement. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The initial state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var initialState: js.UndefOr[String] = js.undefined
  /** Indicates whether the revealed icon image being returned is a default image, or is provided by the game. */
  var isRevealedIconUrlDefault: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the unlocked icon image being returned is a default image, or is game-provided. */
  var isUnlockedIconUrlDefault: js.UndefOr[Boolean] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementDefinition. */
  var kind: js.UndefOr[String] = js.undefined
  /** The name of the achievement. */
  var name: js.UndefOr[String] = js.undefined
  /** The image URL for the revealed achievement icon. */
  var revealedIconUrl: js.UndefOr[String] = js.undefined
  /** The total steps for an incremental achievement. */
  var totalSteps: js.UndefOr[Double] = js.undefined
  /** The image URL for the unlocked achievement icon. */
  var unlockedIconUrl: js.UndefOr[String] = js.undefined
}

object AchievementDefinition {
  @scala.inline
  def apply(
    achievementType: String = null,
    description: String = null,
    experiencePoints: String = null,
    formattedTotalSteps: String = null,
    id: String = null,
    initialState: String = null,
    isRevealedIconUrlDefault: js.UndefOr[Boolean] = js.undefined,
    isUnlockedIconUrlDefault: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    name: String = null,
    revealedIconUrl: String = null,
    totalSteps: Int | Double = null,
    unlockedIconUrl: String = null
  ): AchievementDefinition = {
    val __obj = js.Dynamic.literal()
    if (achievementType != null) __obj.updateDynamic("achievementType")(achievementType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (experiencePoints != null) __obj.updateDynamic("experiencePoints")(experiencePoints.asInstanceOf[js.Any])
    if (formattedTotalSteps != null) __obj.updateDynamic("formattedTotalSteps")(formattedTotalSteps.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (!js.isUndefined(isRevealedIconUrlDefault)) __obj.updateDynamic("isRevealedIconUrlDefault")(isRevealedIconUrlDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnlockedIconUrlDefault)) __obj.updateDynamic("isUnlockedIconUrlDefault")(isUnlockedIconUrlDefault.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (revealedIconUrl != null) __obj.updateDynamic("revealedIconUrl")(revealedIconUrl.asInstanceOf[js.Any])
    if (totalSteps != null) __obj.updateDynamic("totalSteps")(totalSteps.asInstanceOf[js.Any])
    if (unlockedIconUrl != null) __obj.updateDynamic("unlockedIconUrl")(unlockedIconUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchievementDefinition]
  }
}

