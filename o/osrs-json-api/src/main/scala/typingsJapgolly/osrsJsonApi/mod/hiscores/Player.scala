package typingsJapgolly.osrsJsonApi.mod.hiscores

import typingsJapgolly.osrsJsonApi.AnonAbyssalSire
import typingsJapgolly.osrsJsonApi.AnonAgility
import typingsJapgolly.osrsJsonApi.AnonAll
import typingsJapgolly.osrsJsonApi.AnonHunter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Player extends js.Object {
  var bh: AnonHunter
  var bosses: AnonAbyssalSire
  var clues: AnonAll
  var lms: RankScoreObject
  var skills: AnonAgility
}

object Player {
  @scala.inline
  def apply(bh: AnonHunter, bosses: AnonAbyssalSire, clues: AnonAll, lms: RankScoreObject, skills: AnonAgility): Player = {
    val __obj = js.Dynamic.literal(bh = bh.asInstanceOf[js.Any], bosses = bosses.asInstanceOf[js.Any], clues = clues.asInstanceOf[js.Any], lms = lms.asInstanceOf[js.Any], skills = skills.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Player]
  }
}

