package typingsJapgolly.webscopeioReactTextareaAutocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.start
    - typingsJapgolly.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.end
    - typingsJapgolly.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.next
    - scala.Double
  */
  type CaretPositionType = typingsJapgolly.webscopeioReactTextareaAutocomplete.mod._CaretPositionType | scala.Double
  type DataProviderType[TItem] = js.Function1[/* token */ java.lang.String, js.Promise[js.Array[TItem]] | js.Array[TItem]]
  type TriggerType[TItem] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.webscopeioReactTextareaAutocomplete.mod.SettingType[TItem]]
}
