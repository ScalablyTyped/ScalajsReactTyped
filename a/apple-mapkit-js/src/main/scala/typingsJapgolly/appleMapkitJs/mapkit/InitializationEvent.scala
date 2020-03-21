package typingsJapgolly.appleMapkitJs.mapkit

import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.Initialized
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.Refreshed
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.Unauthorized
import typingsJapgolly.appleMapkitJs.appleMapkitJsStrings.`Too Many Requests`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializationEvent extends js.Object {
  var status: Initialized | Refreshed | Unauthorized | (`Too Many Requests`)
}

object InitializationEvent {
  @scala.inline
  def apply(status: Initialized | Refreshed | Unauthorized | (`Too Many Requests`)): InitializationEvent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InitializationEvent]
  }
}

