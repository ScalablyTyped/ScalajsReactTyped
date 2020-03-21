package typingsJapgolly.algoliasearch.mod.Places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface use in HitInterface for some key of highlightResult.
  */
trait highlightResultValueInterface extends js.Object {
  var fullyHighlighted: js.UndefOr[Boolean] = js.undefined
  var matchLevel: String
  var matchedWords: js.Array[String]
  var value: String
}

object highlightResultValueInterface {
  @scala.inline
  def apply(
    matchLevel: String,
    matchedWords: js.Array[String],
    value: String,
    fullyHighlighted: js.UndefOr[Boolean] = js.undefined
  ): highlightResultValueInterface = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel.asInstanceOf[js.Any], matchedWords = matchedWords.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(fullyHighlighted)) __obj.updateDynamic("fullyHighlighted")(fullyHighlighted.asInstanceOf[js.Any])
    __obj.asInstanceOf[highlightResultValueInterface]
  }
}

