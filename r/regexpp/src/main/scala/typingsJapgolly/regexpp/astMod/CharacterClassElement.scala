package typingsJapgolly.regexpp.astMod

import typingsJapgolly.regexpp.regexppStrings.digit
import typingsJapgolly.regexpp.regexppStrings.property
import typingsJapgolly.regexpp.regexppStrings.space
import typingsJapgolly.regexpp.regexppStrings.word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.regexpp.astMod.EscapeCharacterSet
  - typingsJapgolly.regexpp.astMod.UnicodePropertyCharacterSet
  - typingsJapgolly.regexpp.astMod.Character
  - typingsJapgolly.regexpp.astMod.CharacterClassRange
*/
trait CharacterClassElement extends js.Object

object CharacterClassElement {
  @scala.inline
  def EscapeCharacterSet(
    end: Double,
    kind: digit | space | word,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.CharacterSet
  ): CharacterClassElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterClassElement]
  }
  @scala.inline
  def UnicodePropertyCharacterSet(
    end: Double,
    key: String,
    kind: property,
    negate: Boolean,
    parent: Alternative | Quantifier | CharacterClass,
    raw: String,
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.CharacterSet,
    value: String = null
  ): CharacterClassElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterClassElement]
  }
  @scala.inline
  def Character(
    end: Double,
    parent: Alternative | Quantifier | CharacterClass | CharacterClassRange,
    raw: String,
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.Character,
    value: Double
  ): CharacterClassElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterClassElement]
  }
  @scala.inline
  def CharacterClassRange(
    end: Double,
    max: Character,
    min: Character,
    parent: CharacterClass,
    raw: String,
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.CharacterClassRange
  ): CharacterClassElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterClassElement]
  }
}

