package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.sub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait SubToken extends ContentToken {
  @JSName("content")
  var content_SubToken: String
  @JSName("type")
  var type_SubToken: sub
}

object SubToken {
  @scala.inline
  def apply(
    content: String,
    level: Double,
    `type`: sub,
    block: js.UndefOr[Boolean] = js.undefined,
    lines: js.Tuple2[Double, Double] = null
  ): SubToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubToken]
  }
}

