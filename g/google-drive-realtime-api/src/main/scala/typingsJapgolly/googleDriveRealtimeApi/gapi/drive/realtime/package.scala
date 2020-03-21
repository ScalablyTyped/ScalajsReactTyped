package typingsJapgolly.googleDriveRealtimeApi.gapi.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object realtime {
  type GoogEventHandler = (js.Function1[
    (/* e */ typingsJapgolly.std.Event_) | (/* evt */ typingsJapgolly.googleDriveRealtimeApi.gapi.drive.realtime.ObjectChangedEvent), 
    scala.Unit
  ]) | typingsJapgolly.std.EventListener
}
