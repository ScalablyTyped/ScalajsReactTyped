package typingsJapgolly.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tokens and sentences returned from syntax analysis. */
trait SyntaxResult extends js.Object {
  var sentences: js.UndefOr[js.Array[SentenceResult]] = js.undefined
  var tokens: js.UndefOr[js.Array[TokenResult]] = js.undefined
}

object SyntaxResult {
  @scala.inline
  def apply(sentences: js.Array[SentenceResult] = null, tokens: js.Array[TokenResult] = null): SyntaxResult = {
    val __obj = js.Dynamic.literal()
    if (sentences != null) __obj.updateDynamic("sentences")(sentences.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxResult]
  }
}

