package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.hr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait HrToken extends TagToken {
  @JSName("type")
  var type_HrToken: hr
}

object HrToken {
  @scala.inline
  def apply(level: Double, `type`: hr, lines: js.Tuple2[Double, Double] = null): HrToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[HrToken]
  }
}

