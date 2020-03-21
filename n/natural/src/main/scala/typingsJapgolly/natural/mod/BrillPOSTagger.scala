package typingsJapgolly.natural.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrillPOSTagger extends js.Object {
  var lexicon: Lexicon
  var ruleSet: RuleSet
  def tag(sentence: js.Array[String]): js.Array[js.Array[String]]
}

object BrillPOSTagger {
  @scala.inline
  def apply(
    lexicon: Lexicon,
    ruleSet: RuleSet,
    tag: js.Array[String] => CallbackTo[js.Array[js.Array[String]]]
  ): BrillPOSTagger = {
    val __obj = js.Dynamic.literal(lexicon = lexicon.asInstanceOf[js.Any], ruleSet = ruleSet.asInstanceOf[js.Any])
    __obj.updateDynamic("tag")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => tag(t0).runNow()))
    __obj.asInstanceOf[BrillPOSTagger]
  }
}

