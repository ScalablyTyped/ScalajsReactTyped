package typingsJapgolly.amapJsApiAutocomplete.AMap.Autocomplete

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiAutocomplete.AnonInfo
import typingsJapgolly.amapJsApiAutocomplete.AnonTip
import typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose
import typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete
import typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error
import typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var choose: Event_[typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.choose, AnonTip]
  var complete: Event_[
    typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.complete, 
    SearchResult | AnonInfo
  ]
  var error: Event_[typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.error, AnonInfo]
  var select: Event_[typingsJapgolly.amapJsApiAutocomplete.amapJsApiAutocompleteStrings.select, AnonTip]
}

object EventMap {
  @scala.inline
  def apply(
    choose: Event_[choose, AnonTip],
    complete: Event_[complete, SearchResult | AnonInfo],
    error: Event_[error, AnonInfo],
    select: Event_[select, AnonTip]
  ): EventMap = {
    val __obj = js.Dynamic.literal(choose = choose.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

