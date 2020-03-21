package typingsJapgolly.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestedNamedStyles extends js.Object {
  var namedStyles: js.UndefOr[NamedStyles] = js.undefined
  var namedStylesSuggestionState: js.UndefOr[NamedStylesSuggestionState] = js.undefined
}

object SuggestedNamedStyles {
  @scala.inline
  def apply(namedStyles: NamedStyles = null, namedStylesSuggestionState: NamedStylesSuggestionState = null): SuggestedNamedStyles = {
    val __obj = js.Dynamic.literal()
    if (namedStyles != null) __obj.updateDynamic("namedStyles")(namedStyles.asInstanceOf[js.Any])
    if (namedStylesSuggestionState != null) __obj.updateDynamic("namedStylesSuggestionState")(namedStylesSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedNamedStyles]
  }
}

