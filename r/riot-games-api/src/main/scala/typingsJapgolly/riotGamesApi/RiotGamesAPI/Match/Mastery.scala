package typingsJapgolly.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mastery extends js.Object {
  var masteryId: Double
  var rank: Double
}

object Mastery {
  @scala.inline
  def apply(masteryId: Double, rank: Double): Mastery = {
    val __obj = js.Dynamic.literal(masteryId = masteryId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Mastery]
  }
}

