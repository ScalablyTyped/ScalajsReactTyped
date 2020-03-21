package typingsJapgolly.regexpp.astMod

import typingsJapgolly.regexpp.regexppStrings.digit
import typingsJapgolly.regexpp.regexppStrings.space
import typingsJapgolly.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EscapeCharacterSet
  extends CharacterSet
     with NodeBase
     with CharacterClassElement {
  var kind: digit | space | word
  var negate: Boolean
  @JSName("parent")
  var parent_EscapeCharacterSet: Alternative | Quantifier | CharacterClass
  @JSName("type")
  var type_EscapeCharacterSet: typingsJapgolly.regexpp.regexppStrings.CharacterSet
}

object EscapeCharacterSet {
  @scala.inline
  def apply(
    end: Double,
    kind: digit | space | word,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.CharacterSet
  ): EscapeCharacterSet = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EscapeCharacterSet]
  }
}

