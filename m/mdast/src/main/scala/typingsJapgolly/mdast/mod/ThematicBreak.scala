package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.thematicBreak
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Node
import typingsJapgolly.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThematicBreak
  extends BlockContent
     with Node {
  @JSName("type")
  var type_ThematicBreak: thematicBreak
}

object ThematicBreak {
  @scala.inline
  def apply(`type`: thematicBreak, data: Data = null, position: Position = null): ThematicBreak = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThematicBreak]
  }
}

