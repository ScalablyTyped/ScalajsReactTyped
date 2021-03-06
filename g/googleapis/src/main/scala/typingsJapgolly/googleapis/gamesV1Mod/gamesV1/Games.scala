package typingsJapgolly.googleapis.gamesV1Mod.gamesV1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Play Game Services API
  *
  * The API for Google Play Game Services.
  *
  * @example
  * const {google} = require('googleapis');
  * const games = google.games('v1');
  *
  * @namespace games
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Games
  */
@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Games")
@js.native
class Games protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var achievementDefinitions: ResourceAchievementdefinitions = js.native
  var achievements: ResourceAchievements = js.native
  var applications: ResourceApplications = js.native
  var context: APIRequestContext = js.native
  var events: ResourceEvents = js.native
  var leaderboards: ResourceLeaderboards = js.native
  var metagame: ResourceMetagame = js.native
  var players: ResourcePlayers = js.native
  var pushtokens: ResourcePushtokens = js.native
  var questMilestones: ResourceQuestmilestones = js.native
  var quests: ResourceQuests = js.native
  var revisions: ResourceRevisions = js.native
  var rooms: ResourceRooms = js.native
  var scores: ResourceScores = js.native
  var snapshots: ResourceSnapshots = js.native
  var turnBasedMatches: ResourceTurnbasedmatches = js.native
}

