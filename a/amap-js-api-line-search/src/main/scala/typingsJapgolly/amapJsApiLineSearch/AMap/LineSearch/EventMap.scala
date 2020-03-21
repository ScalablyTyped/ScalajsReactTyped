package typingsJapgolly.amapJsApiLineSearch.AMap.LineSearch

import typingsJapgolly.amapJsApi.AMap.Event_
import typingsJapgolly.amapJsApiLineSearch.AnonInfo
import typingsJapgolly.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete
import typingsJapgolly.amapJsApiLineSearch.amapJsApiLineSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typingsJapgolly.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[typingsJapgolly.amapJsApiLineSearch.amapJsApiLineSearchStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

