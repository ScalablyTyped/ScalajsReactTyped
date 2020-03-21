package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsNumbers.`1000`
import typingsJapgolly.screeps.screepsNumbers.`10`
import typingsJapgolly.screeps.screepsNumbers.`200`
import typingsJapgolly.screeps.screepsNumbers.`20`
import typingsJapgolly.screeps.screepsNumbers.`21`
import typingsJapgolly.screeps.screepsNumbers.`22`
import typingsJapgolly.screeps.screepsNumbers.`23`
import typingsJapgolly.screeps.screepsNumbers.`24`
import typingsJapgolly.screeps.screepsNumbers.`30`
import typingsJapgolly.screeps.screepsNumbers.`3`
import typingsJapgolly.screeps.screepsNumbers.`40`
import typingsJapgolly.screeps.screepsNumbers.`50`
import typingsJapgolly.screeps.screepsNumbers.`800`
import typingsJapgolly.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurationEffectLevel extends js.Object {
  var className: operator
  var cooldown: `800`
  var duration: `1000`
  var effect: js.Tuple5[`10`, `20`, `30`, `40`, `50`]
  var level: js.Tuple5[`20`, `21`, `22`, `23`, `24`]
  var ops: `200`
  var range: `3`
}

object AnonDurationEffectLevel {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `800`,
    duration: `1000`,
    effect: js.Tuple5[`10`, `20`, `30`, `40`, `50`],
    level: js.Tuple5[`20`, `21`, `22`, `23`, `24`],
    ops: `200`,
    range: `3`
  ): AnonDurationEffectLevel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDurationEffectLevel]
  }
}

