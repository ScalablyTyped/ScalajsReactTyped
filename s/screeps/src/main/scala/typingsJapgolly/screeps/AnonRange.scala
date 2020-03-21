package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsNumbers.`0.2`
import typingsJapgolly.screeps.screepsNumbers.`0.4`
import typingsJapgolly.screeps.screepsNumbers.`0.6`
import typingsJapgolly.screeps.screepsNumbers.`0.8`
import typingsJapgolly.screeps.screepsNumbers.`0`
import typingsJapgolly.screeps.screepsNumbers.`1.0`
import typingsJapgolly.screeps.screepsNumbers.`14`
import typingsJapgolly.screeps.screepsNumbers.`22`
import typingsJapgolly.screeps.screepsNumbers.`2`
import typingsJapgolly.screeps.screepsNumbers.`3`
import typingsJapgolly.screeps.screepsNumbers.`50`
import typingsJapgolly.screeps.screepsNumbers.`7`
import typingsJapgolly.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRange extends js.Object {
  var className: operator
  var cooldown: `50`
  var effect: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`]
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  var ops: `2`
  var range: `3`
}

object AnonRange {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `50`,
    effect: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`],
    ops: `2`,
    range: `3`
  ): AnonRange = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRange]
  }
}

