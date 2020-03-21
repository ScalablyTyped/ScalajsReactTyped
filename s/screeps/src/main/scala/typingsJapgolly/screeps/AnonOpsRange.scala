package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsNumbers.`10`
import typingsJapgolly.screeps.screepsNumbers.`20`
import typingsJapgolly.screeps.screepsNumbers.`21`
import typingsJapgolly.screeps.screepsNumbers.`22`
import typingsJapgolly.screeps.screepsNumbers.`23`
import typingsJapgolly.screeps.screepsNumbers.`24`
import typingsJapgolly.screeps.screepsNumbers.`30`
import typingsJapgolly.screeps.screepsNumbers.`40`
import typingsJapgolly.screeps.screepsNumbers.`50`
import typingsJapgolly.screeps.screepsNumbers.`8`
import typingsJapgolly.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpsRange extends js.Object {
  var className: operator
  var cooldown: `8`
  var duration: `10`
  var level: js.Tuple5[`20`, `21`, `22`, `23`, `24`]
  var ops: js.Tuple5[`50`, `40`, `30`, `20`, `10`]
  var range: `50`
}

object AnonOpsRange {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `8`,
    duration: `10`,
    level: js.Tuple5[`20`, `21`, `22`, `23`, `24`],
    ops: js.Tuple5[`50`, `40`, `30`, `20`, `10`],
    range: `50`
  ): AnonOpsRange = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOpsRange]
  }
}

