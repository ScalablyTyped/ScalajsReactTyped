package typingsJapgolly.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Play Game Services Publishing API
  *
  * The Publishing API for Google Play Game Services.
  *
  * @example
  * const {google} = require('googleapis');
  * const gamesConfiguration = google.gamesConfiguration('v1configuration');
  *
  * @namespace gamesConfiguration
  * @type {Function}
  * @version v1configuration
  * @variation v1configuration
  * @param {object=} options Options for Gamesconfiguration
  */
@JSImport("googleapis/build/src/apis/gamesConfiguration/v1configuration", "gamesConfiguration_v1configuration.Gamesconfiguration")
@js.native
class Gamesconfiguration protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var achievementConfigurations: ResourceAchievementconfigurations = js.native
  var context: APIRequestContext = js.native
  var imageConfigurations: ResourceImageconfigurations = js.native
  var leaderboardConfigurations: ResourceLeaderboardconfigurations = js.native
}

