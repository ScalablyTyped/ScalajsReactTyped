package typingsJapgolly.regexpp.astMod

import typingsJapgolly.regexpp.regexppStrings.lookahead
import typingsJapgolly.regexpp.regexppStrings.lookbehind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.regexpp.astMod.LookaheadAssertion
  - typingsJapgolly.regexpp.astMod.LookbehindAssertion
*/
trait LookaroundAssertion
  extends Assertion
     with BranchNode

object LookaroundAssertion {
  @scala.inline
  def LookaheadAssertion(
    alternatives: js.Array[Alternative],
    end: Double,
    kind: lookahead,
    negate: Boolean,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.Assertion
  ): LookaroundAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookaroundAssertion]
  }
  @scala.inline
  def LookbehindAssertion(
    alternatives: js.Array[Alternative],
    end: Double,
    kind: lookbehind,
    negate: Boolean,
    parent: Alternative,
    raw: String,
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.Assertion
  ): LookaroundAssertion = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookaroundAssertion]
  }
}

