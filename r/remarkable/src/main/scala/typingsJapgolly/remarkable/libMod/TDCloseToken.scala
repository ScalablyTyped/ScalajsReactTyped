package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.td_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait TDCloseToken extends TagToken {
  @JSName("type")
  var type_TDCloseToken: td_close
}

object TDCloseToken {
  @scala.inline
  def apply(level: Double, `type`: td_close, lines: js.Tuple2[Double, Double] = null): TDCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDCloseToken]
  }
}

