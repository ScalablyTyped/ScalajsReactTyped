package typingsJapgolly.rxjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.NotificationOptions
import typingsJapgolly.std.NotificationPermission
import typingsJapgolly.std.NotificationPermissionCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/Notification", JSImport.Namespace)
@js.native
object rxjsNotificationMod extends js.Object {
  @js.native
  class NotificationCls protected ()
    extends typingsJapgolly.rxjsCompat.notificationMod.NotificationCls {
    def this(title: String) = this()
    def this(title: String, options: NotificationOptions) = this()
  }
  
  @js.native
  object Notification
    extends Instantiable1[/* title */ String, typingsJapgolly.std.Notification]
       with Instantiable2[
          /* title */ String, 
          /* options */ typingsJapgolly.std.NotificationOptions, 
          typingsJapgolly.std.Notification
        ] {
    val maxActions: Double = js.native
    val permission: NotificationPermission = js.native
    def requestPermission(): js.Promise[NotificationPermission] = js.native
    def requestPermission(deprecatedCallback: NotificationPermissionCallback): js.Promise[NotificationPermission] = js.native
  }
  
}

