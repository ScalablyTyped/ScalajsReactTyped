package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcm {
  type GcmErrorEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* error */ typingsJapgolly.chrome.chrome.gcm.GcmError, scala.Unit]]
  type MessageDeletionEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type MessageReceptionEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* message */ typingsJapgolly.chrome.chrome.gcm.IncomingMessage, scala.Unit]
  ]
}
