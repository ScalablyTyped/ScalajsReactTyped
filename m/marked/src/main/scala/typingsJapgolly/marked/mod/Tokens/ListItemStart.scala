package typingsJapgolly.marked.mod.Tokens

import typingsJapgolly.marked.markedStrings.list_item_start
import typingsJapgolly.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemStart extends Token {
  var `type`: list_item_start
}

object ListItemStart {
  @scala.inline
  def apply(`type`: list_item_start): ListItemStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemStart]
  }
}

