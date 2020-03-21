package typingsJapgolly.ol.dragPanMod

import typingsJapgolly.ol.conditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var condition: js.UndefOr[Condition] = js.undefined
  var kinetic: js.UndefOr[typingsJapgolly.ol.kineticMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(condition: Condition = null, kinetic: typingsJapgolly.ol.kineticMod.default = null): Options = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (kinetic != null) __obj.updateDynamic("kinetic")(kinetic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

