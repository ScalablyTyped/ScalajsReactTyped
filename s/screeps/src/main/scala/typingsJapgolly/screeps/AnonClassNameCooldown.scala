package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsNumbers.`0`
import typingsJapgolly.screeps.screepsNumbers.`1000`
import typingsJapgolly.screeps.screepsNumbers.`10`
import typingsJapgolly.screeps.screepsNumbers.`14`
import typingsJapgolly.screeps.screepsNumbers.`200`
import typingsJapgolly.screeps.screepsNumbers.`22`
import typingsJapgolly.screeps.screepsNumbers.`2`
import typingsJapgolly.screeps.screepsNumbers.`3`
import typingsJapgolly.screeps.screepsNumbers.`400`
import typingsJapgolly.screeps.screepsNumbers.`600`
import typingsJapgolly.screeps.screepsNumbers.`7`
import typingsJapgolly.screeps.screepsNumbers.`800`
import typingsJapgolly.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassNameCooldown extends js.Object {
  var className: operator
  var cooldown: `400`
  var duration: js.Tuple5[`200`, `400`, `600`, `800`, `1000`]
  var level: js.Tuple5[`0`, `2`, `7`, `14`, `22`]
  var ops: `10`
  var range: `3`
}

object AnonClassNameCooldown {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `400`,
    duration: js.Tuple5[`200`, `400`, `600`, `800`, `1000`],
    level: js.Tuple5[`0`, `2`, `7`, `14`, `22`],
    ops: `10`,
    range: `3`
  ): AnonClassNameCooldown = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClassNameCooldown]
  }
}

