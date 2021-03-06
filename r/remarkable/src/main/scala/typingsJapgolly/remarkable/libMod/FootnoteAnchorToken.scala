package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.footnote_anchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait FootnoteAnchorToken extends FootnoteGenericToken {
  @JSName("type")
  var type_FootnoteAnchorToken: footnote_anchor
}

object FootnoteAnchorToken {
  @scala.inline
  def apply(
    id: Double,
    level: Double,
    `type`: footnote_anchor,
    lines: js.Tuple2[Double, Double] = null,
    subId: Int | Double = null
  ): FootnoteAnchorToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (subId != null) __obj.updateDynamic("subId")(subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteAnchorToken]
  }
}

