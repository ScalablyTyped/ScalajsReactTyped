package typingsJapgolly.phaser.phaserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents one single Leaderboard that belongs to a Facebook Instant Game.
  * 
  * You do not need to instantiate this class directly, it will be created when you use the
  * `getLeaderboard()` method of the main plugin.
  */
@JSImport("phaser", "FacebookInstantGamesLeaderboard")
@js.native
class FacebookInstantGamesLeaderboard protected ()
  extends typingsJapgolly.phaser.Phaser.FacebookInstantGamesLeaderboard {
  /**
    * 
    * @param plugin A reference to the Facebook Instant Games Plugin.
    * @param data An Instant Game leaderboard instance.
    */
  def this(plugin: typingsJapgolly.phaser.Phaser.FacebookInstantGamesPlugin, data: js.Any) = this()
}

