package typingsJapgolly.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  /** The number of achievements visible to the currently authenticated player. */
  var achievement_count: js.UndefOr[Double] = js.undefined
  /** The assets of the application. */
  var assets: js.UndefOr[js.Array[ImageAsset]] = js.undefined
  /** The author of the application. */
  var author: js.UndefOr[String] = js.undefined
  /** The category of the application. */
  var category: js.UndefOr[ApplicationCategory] = js.undefined
  /** The description of the application. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * A list of features that have been enabled for the application.
    * Possible values are:
    * - "SNAPSHOTS" - Snapshots has been enabled
    */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.undefined
  /** The ID of the application. */
  var id: js.UndefOr[String] = js.undefined
  /** The instances of the application. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#application. */
  var kind: js.UndefOr[String] = js.undefined
  /** The last updated timestamp of the application. */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.undefined
  /** The number of leaderboards visible to the currently authenticated player. */
  var leaderboard_count: js.UndefOr[Double] = js.undefined
  /** The name of the application. */
  var name: js.UndefOr[String] = js.undefined
  /** A hint to the client UI for what color to use as an app-themed color. The color is given as an RGB triplet (e.g. "E0E0E0"). */
  var themeColor: js.UndefOr[String] = js.undefined
}

object Application {
  @scala.inline
  def apply(
    achievement_count: Int | Double = null,
    assets: js.Array[ImageAsset] = null,
    author: String = null,
    category: ApplicationCategory = null,
    description: String = null,
    enabledFeatures: js.Array[String] = null,
    id: String = null,
    instances: js.Array[Instance] = null,
    kind: String = null,
    lastUpdatedTimestamp: String = null,
    leaderboard_count: Int | Double = null,
    name: String = null,
    themeColor: String = null
  ): Application = {
    val __obj = js.Dynamic.literal()
    if (achievement_count != null) __obj.updateDynamic("achievement_count")(achievement_count.asInstanceOf[js.Any])
    if (assets != null) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enabledFeatures != null) __obj.updateDynamic("enabledFeatures")(enabledFeatures.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp.asInstanceOf[js.Any])
    if (leaderboard_count != null) __obj.updateDynamic("leaderboard_count")(leaderboard_count.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (themeColor != null) __obj.updateDynamic("themeColor")(themeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
}

