package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.tbody_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait TBodyCloseToken extends TagToken {
  @JSName("type")
  var type_TBodyCloseToken: tbody_close
}

object TBodyCloseToken {
  @scala.inline
  def apply(level: Double, `type`: tbody_close, lines: js.Tuple2[Double, Double] = null): TBodyCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[TBodyCloseToken]
  }
}

