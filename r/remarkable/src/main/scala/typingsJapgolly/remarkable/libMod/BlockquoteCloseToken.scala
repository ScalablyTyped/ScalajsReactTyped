package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.blockquote_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait BlockquoteCloseToken extends TagToken {
  @JSName("type")
  var type_BlockquoteCloseToken: blockquote_close
}

object BlockquoteCloseToken {
  @scala.inline
  def apply(level: Double, `type`: blockquote_close, lines: js.Tuple2[Double, Double] = null): BlockquoteCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockquoteCloseToken]
  }
}

