package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessagingMessagingNamespaceMod {
  
  object messaging {
    
    inline def apply(): Messaging = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Messaging]
    inline def apply(app: App): Messaging = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
    
    @JSImport("firebase-admin/lib/messaging/messaging-namespace", "messaging")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.messaging#AndroidConfig}.
      */
    type AndroidConfig = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.AndroidConfig
    
    /**
      * Type alias to {@link firebase-admin.messaging#AndroidFcmOptions}.
      */
    type AndroidFcmOptions = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.AndroidFcmOptions
    
    /**
      * Type alias to {@link firebase-admin.messaging#AndroidNotification}.
      */
    type AndroidNotification = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.AndroidNotification
    
    /**
      * Type alias to {@link firebase-admin.messaging#ApnsConfig}.
      */
    type ApnsConfig = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.ApnsConfig
    
    /**
      * Type alias to {@link firebase-admin.messaging#ApnsFcmOptions}.
      */
    type ApnsFcmOptions = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.ApnsFcmOptions
    
    /**
      * Type alias to {@link firebase-admin.messaging#ApnsPayload}.
      */
    type ApnsPayload = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.ApnsPayload
    
    /**
      * Type alias to {@link firebase-admin.messaging#Aps}.
      */
    type Aps = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.Aps
    
    /**
      * Type alias to {@link firebase-admin.messaging#ApsAlert}.
      */
    type ApsAlert = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.ApsAlert
    
    /**
      * Type alias to {@link firebase-admin.messaging#BatchResponse}.
      */
    type BatchResponse = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.BatchResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#ConditionMessage}.
      */
    type ConditionMessage = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.ConditionMessage
    
    /**
      * Type alias to {@link firebase-admin.messaging#CriticalSound}.
      */
    type CriticalSound = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.CriticalSound
    
    /**
      * Type alias to {@link firebase-admin.messaging#DataMessagePayload}.
      */
    type DataMessagePayload = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.DataMessagePayload
    
    /**
      * Type alias to {@link firebase-admin.messaging#FcmOptions}.
      */
    type FcmOptions = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.FcmOptions
    
    /**
      * Type alias to {@link firebase-admin.messaging#LightSettings}.
      */
    type LightSettings = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.LightSettings
    
    /**
      * Type alias to {@link firebase-admin.messaging#Message}.
      */
    type Message = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.Message
    
    /**
      * Type alias to {@link firebase-admin.messaging#Messaging}.
      */
    type Messaging = typingsJapgolly.firebaseAdmin.libMessagingMessagingMod.Messaging
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingConditionResponse}.
      */
    type MessagingConditionResponse = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.MessagingConditionResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingDeviceGroupResponse}.
      */
    type MessagingDeviceGroupResponse = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.MessagingDeviceGroupResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingDeviceResult}.
      */
    type MessagingDeviceResult = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.MessagingDeviceResult
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingDevicesResponse}.
      */
    type MessagingDevicesResponse = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.MessagingDevicesResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingOptions}.
      */
    type MessagingOptions = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.MessagingOptions
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingPayload}.
      */
    type MessagingPayload = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.MessagingPayload
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingTopicManagementResponse}.
      */
    type MessagingTopicManagementResponse = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.MessagingTopicManagementResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#MessagingTopicResponse}.
      */
    type MessagingTopicResponse = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.MessagingTopicResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#MulticastMessage}.
      */
    type MulticastMessage = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.MulticastMessage
    
    /**
      * Type alias to {@link firebase-admin.messaging#Notification}.
      */
    type Notification = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.Notification
    
    /**
      * Type alias to {@link firebase-admin.messaging#NotificationMessagePayload}.
      */
    type NotificationMessagePayload = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.NotificationMessagePayload
    
    /**
      * Type alias to {@link firebase-admin.messaging#SendResponse}.
      */
    type SendResponse = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.SendResponse
    
    /**
      * Type alias to {@link firebase-admin.messaging#TokenMessage}.
      */
    type TokenMessage = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.TokenMessage
    
    /**
      * Type alias to {@link firebase-admin.messaging#TopicMessage}.
      */
    type TopicMessage = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.TopicMessage
    
    /**
      * Type alias to {@link firebase-admin.messaging#WebpushConfig}.
      */
    type WebpushConfig = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.WebpushConfig
    
    /**
      * Type alias to {@link firebase-admin.messaging#WebpushFcmOptions}.
      */
    type WebpushFcmOptions = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.WebpushFcmOptions
    
    /**
      * Type alias to {@link firebase-admin.messaging#WebpushNotification}.
      */
    type WebpushNotification = typingsJapgolly.firebaseAdmin.libMessagingMessagingApiMod.WebpushNotification
  }
}
