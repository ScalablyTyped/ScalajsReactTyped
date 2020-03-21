package typingsJapgolly.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCooldownLevel extends js.Object {
  /**
    * Cooldown ticks remaining, or undefined if the power creep is not spawned in the world.
    */
  var cooldown: js.UndefOr[Double] = js.undefined
  /**
    * Current level of the power
    */
  var level: Double
}

object AnonCooldownLevel {
  @scala.inline
  def apply(level: Double, cooldown: Int | Double = null): AnonCooldownLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (cooldown != null) __obj.updateDynamic("cooldown")(cooldown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCooldownLevel]
  }
}

