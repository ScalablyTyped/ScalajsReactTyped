package typingsJapgolly.marked.mod.Tokens

import typingsJapgolly.marked.markedStrings.text
import typingsJapgolly.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends Token {
  var text: String
  var `type`: text
}

object Text {
  @scala.inline
  def apply(text: String, `type`: text): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

