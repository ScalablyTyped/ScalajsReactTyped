package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object history {
  type HistoryVisitRemovedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* removed */ typingsJapgolly.chrome.chrome.history.RemovedResult, scala.Unit]
  ]
  type HistoryVisitedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* result */ typingsJapgolly.chrome.chrome.history.HistoryItem, scala.Unit]
  ]
}
