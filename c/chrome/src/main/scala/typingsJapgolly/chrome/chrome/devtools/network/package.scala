package typingsJapgolly.chrome.chrome.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object network {
  type NavigatedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* url */ java.lang.String, scala.Unit]]
  type RequestFinishedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* request */ typingsJapgolly.chrome.chrome.devtools.network.Request, scala.Unit]
  ]
}
