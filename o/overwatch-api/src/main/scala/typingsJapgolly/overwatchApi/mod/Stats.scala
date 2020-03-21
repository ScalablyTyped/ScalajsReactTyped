package typingsJapgolly.overwatchApi.mod

import typingsJapgolly.overwatchApi.AnonAssists
import typingsJapgolly.overwatchApi.AnonFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var endorsement: AnonFrame
  var level: Double
  var portrait: String
  var `private`: Boolean
  var stats: AnonAssists
  var username: String
}

object Stats {
  @scala.inline
  def apply(
    endorsement: AnonFrame,
    level: Double,
    portrait: String,
    `private`: Boolean,
    stats: AnonAssists,
    username: String
  ): Stats = {
    val __obj = js.Dynamic.literal(endorsement = endorsement.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], portrait = portrait.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

