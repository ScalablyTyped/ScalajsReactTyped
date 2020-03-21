package typingsJapgolly.rxjsCompat.notificationMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.NotificationOptions
import typingsJapgolly.std.NotificationPermission
import typingsJapgolly.std.NotificationPermissionCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/Notification", "Notification")
@js.native
object Notification
  extends Instantiable1[/* title */ String, typingsJapgolly.std.Notification]
     with Instantiable2[
      /* title */ String, 
      /* options */ NotificationOptions, 
      typingsJapgolly.std.Notification
    ] {
  val maxActions: Double = js.native
  val permission: NotificationPermission = js.native
  def requestPermission(): js.Promise[NotificationPermission] = js.native
  def requestPermission(deprecatedCallback: NotificationPermissionCallback): js.Promise[NotificationPermission] = js.native
}

