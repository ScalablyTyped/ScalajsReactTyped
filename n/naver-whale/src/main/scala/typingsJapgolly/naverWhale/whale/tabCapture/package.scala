package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabCapture {
  type CaptureStatusChangedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* info */ typingsJapgolly.chrome.chrome.tabCapture.CaptureInfo, scala.Unit]
  ]
}
