package typingsJapgolly.amapJsApiAutocomplete.AMap.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete
  - typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error
  - typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.no_data = this.cast("no_data")
}

