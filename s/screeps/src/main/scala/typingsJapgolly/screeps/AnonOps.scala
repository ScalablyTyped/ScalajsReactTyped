package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsNumbers.`0`
import typingsJapgolly.screeps.screepsNumbers.`1000`
import typingsJapgolly.screeps.screepsNumbers.`10`
import typingsJapgolly.screeps.screepsNumbers.`14`
import typingsJapgolly.screeps.screepsNumbers.`22`
import typingsJapgolly.screeps.screepsNumbers.`2`
import typingsJapgolly.screeps.screepsNumbers.`3`
import typingsJapgolly.screeps.screepsNumbers.`4`
import typingsJapgolly.screeps.screepsNumbers.`50`
import typingsJapgolly.screeps.screepsNumbers.`6`
import typingsJapgolly.screeps.screepsNumbers.`7`
import typingsJapgolly.screeps.screepsNumbers.`8`
import typingsJapgolly.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOps extends js.Object {
  var className: operator
  var cooldown: `50`
  var duration: `1000`
  var effect: js.Tuple5[`2`, `4`, `6`, `8`, `10`]
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  var ops: `10`
  var range: `3`
}

object AnonOps {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `50`,
    duration: `1000`,
    effect: js.Tuple5[`2`, `4`, `6`, `8`, `10`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`],
    ops: `10`,
    range: `3`
  ): AnonOps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOps]
  }
}

