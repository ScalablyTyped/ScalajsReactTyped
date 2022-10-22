package typingsJapgolly.winrtUwp.Windows.Networking

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.UI.Notifications.BadgeNotification
import typingsJapgolly.winrtUwp.Windows.UI.Notifications.TileNotification
import typingsJapgolly.winrtUwp.Windows.UI.Notifications.ToastNotification
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.pushnotificationreceived
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes and interfaces that encapsulate push notifications. */
object PushNotifications {
  
  @js.native
  sealed trait PushNotificationType extends StObject
  /** The type of push notification that has been received from the app server. Used by the NotificationType property. */
  @JSGlobal("Windows.Networking.PushNotifications.PushNotificationType")
  @js.native
  object PushNotificationType extends StObject {
    
    /** A push notification to update a tile's badge overlay. */
    @js.native
    sealed trait badge
      extends StObject
         with PushNotificationType
    
    /** A push notification to perform an update to a tile that does not involve UI. */
    @js.native
    sealed trait raw
      extends StObject
         with PushNotificationType
    
    /** A push notification to update one or more elements of a tile. */
    @js.native
    sealed trait tile
      extends StObject
         with PushNotificationType
    
    /** A push notification to update an app's tile flyout. */
    @js.native
    sealed trait tileFlyout
      extends StObject
         with PushNotificationType
    
    /** A push notification to display as toast. */
    @js.native
    sealed trait toast
      extends StObject
         with PushNotificationType
  }
  
  /** Represents a delivery vehicle and addressing mechanism for push notifications. The channel Uniform Resource Identifier (URI) represented by this interface is used by a third-party application server to communicate with the Windows Push Notification Services (WNS). The push notification channel is used by the client to intercept notifications. */
  @js.native
  trait PushNotificationChannel extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pushnotificationreceived(
      `type`: pushnotificationreceived,
      listener: TypedEventHandler[PushNotificationChannel, PushNotificationReceivedEventArgs]
    ): Unit = js.native
    
    /** Explicitly invalidates this channel. Any notifications pushed to this channel after this method is called are not delivered. */
    def close(): Unit = js.native
    
    /** Gets the time at which the channel expires. Notifications sent to this channel after this time are rejected. */
    var expirationTime: js.Date = js.native
    
    /** Fires when a push notification has arrived on this channel. */
    def onpushnotificationreceived(ev: PushNotificationReceivedEventArgs & WinRTEvent[PushNotificationChannel]): Unit = js.native
    /** Fires when a push notification has arrived on this channel. */
    @JSName("onpushnotificationreceived")
    var onpushnotificationreceived_Original: TypedEventHandler[PushNotificationChannel, PushNotificationReceivedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pushnotificationreceived(
      `type`: pushnotificationreceived,
      listener: TypedEventHandler[PushNotificationChannel, PushNotificationReceivedEventArgs]
    ): Unit = js.native
    
    /** Gets the Uniform Resource Identifier (URI) to which an app server sends a push notification intended for an application or secondary tile bound to this channel. This URI is transmitted to and stored by the third-party app server. */
    var uri: String = js.native
  }
  
  /** Creates objects that you use to retrieve push notification channels from the Windows Push Notification Services (WNS). These channels are bound to an app or secondary tile . */
  trait PushNotificationChannelManager extends StObject
  
  /** Encapsulates a push notification that has been received from the app server, identifying the type and supplying the content of the notification. Windows passes this information in the PushNotificationReceived event. */
  trait PushNotificationReceivedEventArgs extends StObject {
    
    /** Gets the content of a badge update to perform in response to this push notification. */
    var badgeNotification: BadgeNotification
    
    /** Gets or sets whether Windows should perform its default handling of the notification. */
    var cancel: Boolean
    
    /** Gets the type of push notification that has been received from the app server. */
    var notificationType: PushNotificationType
    
    var rawNotification: Any
    
    /* unmapped type */
    /** Gets the content of a tile update to perform in response to this push notification. */
    var tileNotification: TileNotification
    
    /** Gets the content of a toast to display in response to this push notification. */
    var toastNotification: ToastNotification
  }
  object PushNotificationReceivedEventArgs {
    
    inline def apply(
      badgeNotification: BadgeNotification,
      cancel: Boolean,
      notificationType: PushNotificationType,
      rawNotification: Any,
      tileNotification: TileNotification,
      toastNotification: ToastNotification
    ): PushNotificationReceivedEventArgs = {
      val __obj = js.Dynamic.literal(badgeNotification = badgeNotification.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any], rawNotification = rawNotification.asInstanceOf[js.Any], tileNotification = tileNotification.asInstanceOf[js.Any], toastNotification = toastNotification.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushNotificationReceivedEventArgs]
    }
    
    extension [Self <: PushNotificationReceivedEventArgs](x: Self) {
      
      inline def setBadgeNotification(value: BadgeNotification): Self = StObject.set(x, "badgeNotification", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setNotificationType(value: PushNotificationType): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
      
      inline def setRawNotification(value: Any): Self = StObject.set(x, "rawNotification", value.asInstanceOf[js.Any])
      
      inline def setTileNotification(value: TileNotification): Self = StObject.set(x, "tileNotification", value.asInstanceOf[js.Any])
      
      inline def setToastNotification(value: ToastNotification): Self = StObject.set(x, "toastNotification", value.asInstanceOf[js.Any])
    }
  }
  
  /** Encapsulates the app-defined content of a raw notification (a push notification that does not involve UI). Its contents can be used in an app's background task, if the app has that capability, or otherwise consumed by the app and acted on as needed. */
  trait RawNotification extends StObject {
    
    /** Gets the content of the raw notification as a string. This string specifies a background task associated with the app. */
    var content: String
  }
  object RawNotification {
    
    inline def apply(content: String): RawNotification = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawNotification]
    }
    
    extension [Self <: RawNotification](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
