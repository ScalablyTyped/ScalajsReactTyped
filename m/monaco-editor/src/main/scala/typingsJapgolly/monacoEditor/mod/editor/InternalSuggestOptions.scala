package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.monacoEditorStrings.`inline`
import typingsJapgolly.monacoEditor.monacoEditorStrings.bottom
import typingsJapgolly.monacoEditor.monacoEditorStrings.none
import typingsJapgolly.monacoEditor.monacoEditorStrings.top
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalSuggestOptions extends js.Object {
  val filterGraceful: Boolean
  val filteredTypes: Record[String, Boolean]
  val localityBonus: Boolean
  val maxVisibleSuggestions: Double
  val shareSuggestSelections: Boolean
  val showIcons: Boolean
  val snippets: top | bottom | `inline` | none
  val snippetsPreventQuickSuggestions: Boolean
}

object InternalSuggestOptions {
  @scala.inline
  def apply(
    filterGraceful: Boolean,
    filteredTypes: Record[String, Boolean],
    localityBonus: Boolean,
    maxVisibleSuggestions: Double,
    shareSuggestSelections: Boolean,
    showIcons: Boolean,
    snippets: top | bottom | `inline` | none,
    snippetsPreventQuickSuggestions: Boolean
  ): InternalSuggestOptions = {
    val __obj = js.Dynamic.literal(filterGraceful = filterGraceful.asInstanceOf[js.Any], filteredTypes = filteredTypes.asInstanceOf[js.Any], localityBonus = localityBonus.asInstanceOf[js.Any], maxVisibleSuggestions = maxVisibleSuggestions.asInstanceOf[js.Any], shareSuggestSelections = shareSuggestSelections.asInstanceOf[js.Any], showIcons = showIcons.asInstanceOf[js.Any], snippets = snippets.asInstanceOf[js.Any], snippetsPreventQuickSuggestions = snippetsPreventQuickSuggestions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InternalSuggestOptions]
  }
}

