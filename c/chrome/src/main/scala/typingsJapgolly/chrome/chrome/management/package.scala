package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object management {
  type ManagementDisabledEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* info */ typingsJapgolly.chrome.chrome.management.ExtensionInfo, scala.Unit]
  ]
  type ManagementEnabledEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* info */ typingsJapgolly.chrome.chrome.management.ExtensionInfo, scala.Unit]
  ]
  type ManagementInstalledEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* info */ typingsJapgolly.chrome.chrome.management.ExtensionInfo, scala.Unit]
  ]
  type ManagementUninstalledEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
}
