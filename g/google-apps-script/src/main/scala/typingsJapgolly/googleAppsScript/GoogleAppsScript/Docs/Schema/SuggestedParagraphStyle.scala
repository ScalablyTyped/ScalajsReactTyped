package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedParagraphStyle extends js.Object {
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
  var paragraphStyleSuggestionState: js.UndefOr[ParagraphStyleSuggestionState] = js.undefined
}

object SuggestedParagraphStyle {
  @scala.inline
  def apply(
    paragraphStyle: ParagraphStyle = null,
    paragraphStyleSuggestionState: ParagraphStyleSuggestionState = null
  ): SuggestedParagraphStyle = {
    val __obj = js.Dynamic.literal()
    if (paragraphStyle != null) __obj.updateDynamic("paragraphStyle")(paragraphStyle.asInstanceOf[js.Any])
    if (paragraphStyleSuggestionState != null) __obj.updateDynamic("paragraphStyleSuggestionState")(paragraphStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedParagraphStyle]
  }
}

