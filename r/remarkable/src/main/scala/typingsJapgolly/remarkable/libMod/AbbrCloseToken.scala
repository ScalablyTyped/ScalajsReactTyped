package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.abbr_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait AbbrCloseToken extends TagToken {
  @JSName("type")
  var type_AbbrCloseToken: abbr_close
}

object AbbrCloseToken {
  @scala.inline
  def apply(level: Double, `type`: abbr_close, lines: js.Tuple2[Double, Double] = null): AbbrCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbbrCloseToken]
  }
}

