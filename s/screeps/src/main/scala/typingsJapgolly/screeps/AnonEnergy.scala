package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsNumbers.`0`
import typingsJapgolly.screeps.screepsNumbers.`10000`
import typingsJapgolly.screeps.screepsNumbers.`100`
import typingsJapgolly.screeps.screepsNumbers.`14`
import typingsJapgolly.screeps.screepsNumbers.`15000`
import typingsJapgolly.screeps.screepsNumbers.`20000`
import typingsJapgolly.screeps.screepsNumbers.`20`
import typingsJapgolly.screeps.screepsNumbers.`22`
import typingsJapgolly.screeps.screepsNumbers.`25000`
import typingsJapgolly.screeps.screepsNumbers.`2`
import typingsJapgolly.screeps.screepsNumbers.`5000`
import typingsJapgolly.screeps.screepsNumbers.`50`
import typingsJapgolly.screeps.screepsNumbers.`7`
import typingsJapgolly.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnergy extends js.Object {
  var className: operator
  var cooldown: `20`
  var duration: `50`
  var effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`]
  var energy: `100`
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
}

object AnonEnergy {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `20`,
    duration: `50`,
    effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`],
    energy: `100`,
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  ): AnonEnergy = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnergy]
  }
}

