package typingsJapgolly.marked.mod.Tokens

import typingsJapgolly.marked.markedStrings.blockquote_start
import typingsJapgolly.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockquoteStart extends Token {
  var `type`: blockquote_start
}

object BlockquoteStart {
  @scala.inline
  def apply(`type`: blockquote_start): BlockquoteStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockquoteStart]
  }
}

