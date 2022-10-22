package typingsJapgolly.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Schedules and manages notifications._
  * @see https://docs.scriptable.app/notification/#-new-notification
  */
@JSGlobal("Notification")
@js.native
/**
  * _Schedules and manages notifications._
  * @see https://docs.scriptable.app/notification/#-new-notification
  */
open class Notification ()
  extends StObject
     with typingsJapgolly.scriptableIos.Notification
object Notification {
  
  @JSGlobal("Notification")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Delivered notifications displayed in the Notification Center._
    *
    * Fetches all notifications that have been scheduled from Scriptable and that are still displayed in the Notification Center of iOS.
    * @see https://docs.scriptable.app/notification/#alldelivered
    */
  /* static member */
  inline def allDelivered(): js.Promise[js.Array[typingsJapgolly.scriptableIos.Notification]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allDelivered")().asInstanceOf[js.Promise[js.Array[typingsJapgolly.scriptableIos.Notification]]]
  
  /**
    * _All pending notifications._
    *
    * Fetches all notifications that have been scheduled from Scriptable and are waiting to be delivered.
    * @see https://docs.scriptable.app/notification/#allpending
    */
  /* static member */
  inline def allPending(): js.Promise[js.Array[typingsJapgolly.scriptableIos.Notification]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allPending")().asInstanceOf[js.Promise[js.Array[typingsJapgolly.scriptableIos.Notification]]]
  
  /**
    * _Removes all delivered notifications._
    *
    * Removes all notifications that have been scheduled from Scriptable and that are still displayed in the Notification Center of iOS.
    * @see https://docs.scriptable.app/notification/#removealldelivered
    */
  /* static member */
  inline def removeAllDelivered(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllDelivered")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * _Removes all pending notifications._
    *
    * Removes all notifications that have been scheduled from Scriptable and are waiting to be delivered.
    *
    * Use with caution. This removes all notifications scheduled across all of your scripts and the action cannot be undone.
    * @see https://docs.scriptable.app/notification/#removeallpending
    */
  /* static member */
  inline def removeAllPending(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllPending")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * _Removes delivered notifications._
    *
    * Removes notifications with the specified identifiers. The notifications are only removed if they have been delivered. To remove pending notifications, see
    * `Notification.removePending()`.
    * @see https://docs.scriptable.app/notification/#removedelivered
    */
  /* static member */
  inline def removeDelivered(identifiers: js.Array[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDelivered")(identifiers.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * _Removes pending notifications._
    *
    * Removes notifications with the specified identifiers. The notifications are only removed if they are pending, that is they have been scheduled and are waiting to be delivered. To
    * remove delivered notifications, see `Notification.removeDelivered()`.
    * @see https://docs.scriptable.app/notification/#removepending
    */
  /* static member */
  inline def removePending(identifiers: js.Array[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removePending")(identifiers.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * _Resets the current notification._
    *
    * Effectively sets `args.notification` to null.
    *
    * When a notification scheduled from Scriptable has been tapped to open the app or while the app was open, `args.notification` will have a value until Scriptable is quit. You can
    * manually reset the value using `Notification.resetCurrent`.
    * @see https://docs.scriptable.app/notification/#resetcurrent
    */
  /* static member */
  inline def resetCurrent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCurrent")().asInstanceOf[Unit]
}
