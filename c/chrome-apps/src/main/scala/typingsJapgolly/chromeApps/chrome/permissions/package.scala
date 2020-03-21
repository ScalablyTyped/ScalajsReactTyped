package typingsJapgolly.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object permissions {
  type PermissionEvent = typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function1[
      /* permissions */ typingsJapgolly.chromeApps.chrome.permissions.Permissions, 
      scala.Unit
    ]
  ]
}
