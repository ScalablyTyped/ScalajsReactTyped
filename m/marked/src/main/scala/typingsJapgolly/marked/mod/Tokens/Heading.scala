package typingsJapgolly.marked.mod.Tokens

import typingsJapgolly.marked.markedStrings.heading
import typingsJapgolly.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heading extends Token {
  var depth: Double
  var text: String
  var `type`: heading
}

object Heading {
  @scala.inline
  def apply(depth: Double, text: String, `type`: heading): Heading = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heading]
  }
}

