package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.bullet_list_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait BulletListOpenToken extends TagToken {
  @JSName("type")
  var type_BulletListOpenToken: bullet_list_open
}

object BulletListOpenToken {
  @scala.inline
  def apply(level: Double, `type`: bullet_list_open, lines: js.Tuple2[Double, Double] = null): BulletListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletListOpenToken]
  }
}

