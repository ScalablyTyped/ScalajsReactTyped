package typingsJapgolly.chrome.chrome.networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object config {
  type CaptivePorttalDetectedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* networkInfo */ typingsJapgolly.chrome.chrome.networking.config.NetworkInfo, 
      scala.Unit
    ]
  ]
}
