package typingsJapgolly.marked.mod.Tokens

import typingsJapgolly.marked.markedStrings.center
import typingsJapgolly.marked.markedStrings.left
import typingsJapgolly.marked.markedStrings.right
import typingsJapgolly.marked.markedStrings.table
import typingsJapgolly.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends Token {
  var align: js.Array[center | left | right | Null]
  var cells: js.Array[js.Array[String]]
  var header: js.Array[String]
  var `type`: table
}

object Table {
  @scala.inline
  def apply(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    `type`: table
  ): Table = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
}

