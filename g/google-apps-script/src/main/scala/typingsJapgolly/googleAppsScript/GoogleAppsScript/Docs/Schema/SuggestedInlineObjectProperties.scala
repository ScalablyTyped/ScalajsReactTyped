package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedInlineObjectProperties extends js.Object {
  var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.undefined
  var inlineObjectPropertiesSuggestionState: js.UndefOr[InlineObjectPropertiesSuggestionState] = js.undefined
}

object SuggestedInlineObjectProperties {
  @scala.inline
  def apply(
    inlineObjectProperties: InlineObjectProperties = null,
    inlineObjectPropertiesSuggestionState: InlineObjectPropertiesSuggestionState = null
  ): SuggestedInlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    if (inlineObjectProperties != null) __obj.updateDynamic("inlineObjectProperties")(inlineObjectProperties.asInstanceOf[js.Any])
    if (inlineObjectPropertiesSuggestionState != null) __obj.updateDynamic("inlineObjectPropertiesSuggestionState")(inlineObjectPropertiesSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedInlineObjectProperties]
  }
}

