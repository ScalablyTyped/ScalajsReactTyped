package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cookies {
  type CookieChangedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* changeInfo */ typingsJapgolly.chrome.chrome.cookies.CookieChangeInfo, 
      scala.Unit
    ]
  ]
}
