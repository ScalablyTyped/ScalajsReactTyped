package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.heading_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait HeadingCloseToken extends HeadingToken {
  @JSName("type")
  var type_HeadingCloseToken: heading_close
}

object HeadingCloseToken {
  @scala.inline
  def apply(
    hLevel: HeadingValue,
    level: Double,
    `type`: heading_close,
    lines: js.Tuple2[Double, Double] = null
  ): HeadingCloseToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingCloseToken]
  }
}

