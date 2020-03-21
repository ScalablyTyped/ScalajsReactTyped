package typingsJapgolly.screeps

import typingsJapgolly.screeps.screepsNumbers.`100`
import typingsJapgolly.screeps.screepsNumbers.`10`
import typingsJapgolly.screeps.screepsNumbers.`11`
import typingsJapgolly.screeps.screepsNumbers.`12`
import typingsJapgolly.screeps.screepsNumbers.`14`
import typingsJapgolly.screeps.screepsNumbers.`22`
import typingsJapgolly.screeps.screepsNumbers.`2`
import typingsJapgolly.screeps.screepsNumbers.`3`
import typingsJapgolly.screeps.screepsNumbers.`4`
import typingsJapgolly.screeps.screepsNumbers.`6`
import typingsJapgolly.screeps.screepsNumbers.`8`
import typingsJapgolly.screeps.screepsStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEffectLevel extends js.Object {
  var className: operator
  var cooldown: `100`
  var duration: `100`
  var effect: js.Tuple5[`2`, `4`, `6`, `8`, `10`]
  var level: js.Tuple5[`10`, `11`, `12`, `14`, `22`]
  var period: `10`
  var range: `3`
}

object AnonEffectLevel {
  @scala.inline
  def apply(
    className: operator,
    cooldown: `100`,
    duration: `100`,
    effect: js.Tuple5[`2`, `4`, `6`, `8`, `10`],
    level: js.Tuple5[`10`, `11`, `12`, `14`, `22`],
    period: `10`,
    range: `3`
  ): AnonEffectLevel = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEffectLevel]
  }
}

