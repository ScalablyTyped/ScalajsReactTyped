package typingsJapgolly.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcm {
  type IGCMDataReceive = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type IGCMDataSend = typingsJapgolly.std.Record[
    typingsJapgolly.std.Exclude[typingsJapgolly.chromeApps.chrome.gcm.DisallowedKeys, java.lang.String], 
    js.Any
  ]
}
