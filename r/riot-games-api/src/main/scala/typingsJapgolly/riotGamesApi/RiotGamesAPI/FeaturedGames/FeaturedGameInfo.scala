package typingsJapgolly.riotGamesApi.RiotGamesAPI.FeaturedGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturedGameInfo extends js.Object {
  var bannedChampions: js.Array[BannedChampion]
  var gameId: Double
  var gameLength: Double
  var gameMode: String
  var gameQueueConfigId: Double
  var gameStartTime: Double
  var gameType: String
  var mapId: Double
  var observers: Observer
  var participants: js.Array[Participant]
  var plateformId: String
}

object FeaturedGameInfo {
  @scala.inline
  def apply(
    bannedChampions: js.Array[BannedChampion],
    gameId: Double,
    gameLength: Double,
    gameMode: String,
    gameQueueConfigId: Double,
    gameStartTime: Double,
    gameType: String,
    mapId: Double,
    observers: Observer,
    participants: js.Array[Participant],
    plateformId: String
  ): FeaturedGameInfo = {
    val __obj = js.Dynamic.literal(bannedChampions = bannedChampions.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameLength = gameLength.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], gameQueueConfigId = gameQueueConfigId.asInstanceOf[js.Any], gameStartTime = gameStartTime.asInstanceOf[js.Any], gameType = gameType.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], plateformId = plateformId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeaturedGameInfo]
  }
}

