package typingsJapgolly.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterClassRange
  extends BranchNode
     with NodeBase
     with CharacterClassElement {
  var max: Character
  var min: Character
  @JSName("parent")
  var parent_CharacterClassRange: CharacterClass
  @JSName("type")
  var type_CharacterClassRange: typingsJapgolly.regexpp.regexppStrings.CharacterClassRange
}

object CharacterClassRange {
  @scala.inline
  def apply(
    end: Double,
    max: Character,
    min: Character,
    parent: CharacterClass,
    raw: String,
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.CharacterClassRange
  ): CharacterClassRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterClassRange]
  }
}

