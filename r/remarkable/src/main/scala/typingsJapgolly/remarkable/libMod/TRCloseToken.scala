package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.tr_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait TRCloseToken extends TagToken {
  @JSName("type")
  var type_TRCloseToken: tr_close
}

object TRCloseToken {
  @scala.inline
  def apply(level: Double, `type`: tr_close, lines: js.Tuple2[Double, Double] = null): TRCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[TRCloseToken]
  }
}

