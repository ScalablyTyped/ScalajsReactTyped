package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsNumbers.`0.5`
import typingsJapgolly.screeps.screepsNumbers.`0.6`
import typingsJapgolly.screeps.screepsNumbers.`0.7`
import typingsJapgolly.screeps.screepsNumbers.`0.8`
import typingsJapgolly.screeps.screepsNumbers.`0.9`
import typingsJapgolly.screeps.screepsNumbers.`0`
import typingsJapgolly.screeps.screepsNumbers.`1000`
import typingsJapgolly.screeps.screepsNumbers.`100`
import typingsJapgolly.screeps.screepsNumbers.`14`
import typingsJapgolly.screeps.screepsNumbers.`22`
import typingsJapgolly.screeps.screepsNumbers.`2`
import typingsJapgolly.screeps.screepsNumbers.`3`
import typingsJapgolly.screeps.screepsNumbers.`500`
import typingsJapgolly.screeps.screepsNumbers.`7`
import typingsJapgolly.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCooldownDuration extends js.Object {
  var className: operator
  var cooldown: `500`
  var duration: `1000`
  var effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`]
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  var ops: `100`
  var range: `3`
}

object AnonCooldownDuration {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `500`,
    duration: `1000`,
    effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`],
    ops: `100`,
    range: `3`
  ): AnonCooldownDuration = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCooldownDuration]
  }
}

