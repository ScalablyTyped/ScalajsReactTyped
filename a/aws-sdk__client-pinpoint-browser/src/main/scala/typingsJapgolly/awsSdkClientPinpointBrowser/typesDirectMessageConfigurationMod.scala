package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesAdmmessageMod.ADMMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesAdmmessageMod.UnmarshalledADMMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApnsmessageMod.APNSMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesApnsmessageMod.UnmarshalledAPNSMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesBaiduMessageMod.BaiduMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesBaiduMessageMod.UnmarshalledBaiduMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDefaultMessageMod.DefaultMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDefaultMessageMod.UnmarshalledDefaultMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.DefaultPushNotificationMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.UnmarshalledDefaultPushNotificationMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEmailMessageMod.EmailMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEmailMessageMod.UnmarshalledEmailMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGcmmessageMod.GCMMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGcmmessageMod.UnmarshalledGCMMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSmsmessageMod.SMSMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSmsmessageMod.UnmarshalledSMSMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDirectMessageConfigurationMod {
  
  trait DirectMessageConfiguration extends StObject {
    
    /**
      * The message to ADM channels. Overrides the default push notification message.
      */
    var ADMMessage: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesAdmmessageMod.ADMMessage] = js.undefined
    
    /**
      * The message to APNS channels. Overrides the default push notification message.
      */
    var APNSMessage: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesApnsmessageMod.APNSMessage] = js.undefined
    
    /**
      * The message to Baidu GCM channels. Overrides the default push notification message.
      */
    var BaiduMessage: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesBaiduMessageMod.BaiduMessage] = js.undefined
    
    /**
      * The default message for all channels.
      */
    var DefaultMessage: js.UndefOr[
        typingsJapgolly.awsSdkClientPinpointBrowser.typesDefaultMessageMod.DefaultMessage
      ] = js.undefined
    
    /**
      * The default push notification message for all push channels.
      */
    var DefaultPushNotificationMessage: js.UndefOr[
        typingsJapgolly.awsSdkClientPinpointBrowser.typesDefaultPushNotificationMessageMod.DefaultPushNotificationMessage
      ] = js.undefined
    
    /**
      * The message to Email channels. Overrides the default message.
      */
    var EmailMessage: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesEmailMessageMod.EmailMessage] = js.undefined
    
    /**
      * The message to GCM channels. Overrides the default push notification message.
      */
    var GCMMessage: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesGcmmessageMod.GCMMessage] = js.undefined
    
    /**
      * The message to SMS channels. Overrides the default message.
      */
    var SMSMessage: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesSmsmessageMod.SMSMessage] = js.undefined
  }
  object DirectMessageConfiguration {
    
    inline def apply(): DirectMessageConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectMessageConfiguration]
    }
    
    extension [Self <: DirectMessageConfiguration](x: Self) {
      
      inline def setADMMessage(value: ADMMessage): Self = StObject.set(x, "ADMMessage", value.asInstanceOf[js.Any])
      
      inline def setADMMessageUndefined: Self = StObject.set(x, "ADMMessage", js.undefined)
      
      inline def setAPNSMessage(value: APNSMessage): Self = StObject.set(x, "APNSMessage", value.asInstanceOf[js.Any])
      
      inline def setAPNSMessageUndefined: Self = StObject.set(x, "APNSMessage", js.undefined)
      
      inline def setBaiduMessage(value: BaiduMessage): Self = StObject.set(x, "BaiduMessage", value.asInstanceOf[js.Any])
      
      inline def setBaiduMessageUndefined: Self = StObject.set(x, "BaiduMessage", js.undefined)
      
      inline def setDefaultMessage(value: DefaultMessage): Self = StObject.set(x, "DefaultMessage", value.asInstanceOf[js.Any])
      
      inline def setDefaultMessageUndefined: Self = StObject.set(x, "DefaultMessage", js.undefined)
      
      inline def setDefaultPushNotificationMessage(value: DefaultPushNotificationMessage): Self = StObject.set(x, "DefaultPushNotificationMessage", value.asInstanceOf[js.Any])
      
      inline def setDefaultPushNotificationMessageUndefined: Self = StObject.set(x, "DefaultPushNotificationMessage", js.undefined)
      
      inline def setEmailMessage(value: EmailMessage): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
      
      inline def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
      
      inline def setGCMMessage(value: GCMMessage): Self = StObject.set(x, "GCMMessage", value.asInstanceOf[js.Any])
      
      inline def setGCMMessageUndefined: Self = StObject.set(x, "GCMMessage", js.undefined)
      
      inline def setSMSMessage(value: SMSMessage): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
      
      inline def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
    }
  }
  
  trait UnmarshalledDirectMessageConfiguration
    extends StObject
       with DirectMessageConfiguration {
    
    /**
      * The message to ADM channels. Overrides the default push notification message.
      */
    @JSName("ADMMessage")
    var ADMMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledADMMessage] = js.undefined
    
    /**
      * The message to APNS channels. Overrides the default push notification message.
      */
    @JSName("APNSMessage")
    var APNSMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledAPNSMessage] = js.undefined
    
    /**
      * The message to Baidu GCM channels. Overrides the default push notification message.
      */
    @JSName("BaiduMessage")
    var BaiduMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledBaiduMessage] = js.undefined
    
    /**
      * The default message for all channels.
      */
    @JSName("DefaultMessage")
    var DefaultMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledDefaultMessage] = js.undefined
    
    /**
      * The default push notification message for all push channels.
      */
    @JSName("DefaultPushNotificationMessage")
    var DefaultPushNotificationMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledDefaultPushNotificationMessage] = js.undefined
    
    /**
      * The message to Email channels. Overrides the default message.
      */
    @JSName("EmailMessage")
    var EmailMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledEmailMessage] = js.undefined
    
    /**
      * The message to GCM channels. Overrides the default push notification message.
      */
    @JSName("GCMMessage")
    var GCMMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledGCMMessage] = js.undefined
    
    /**
      * The message to SMS channels. Overrides the default message.
      */
    @JSName("SMSMessage")
    var SMSMessage_UnmarshalledDirectMessageConfiguration: js.UndefOr[UnmarshalledSMSMessage] = js.undefined
  }
  object UnmarshalledDirectMessageConfiguration {
    
    inline def apply(): UnmarshalledDirectMessageConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledDirectMessageConfiguration]
    }
    
    extension [Self <: UnmarshalledDirectMessageConfiguration](x: Self) {
      
      inline def setADMMessage(value: UnmarshalledADMMessage): Self = StObject.set(x, "ADMMessage", value.asInstanceOf[js.Any])
      
      inline def setADMMessageUndefined: Self = StObject.set(x, "ADMMessage", js.undefined)
      
      inline def setAPNSMessage(value: UnmarshalledAPNSMessage): Self = StObject.set(x, "APNSMessage", value.asInstanceOf[js.Any])
      
      inline def setAPNSMessageUndefined: Self = StObject.set(x, "APNSMessage", js.undefined)
      
      inline def setBaiduMessage(value: UnmarshalledBaiduMessage): Self = StObject.set(x, "BaiduMessage", value.asInstanceOf[js.Any])
      
      inline def setBaiduMessageUndefined: Self = StObject.set(x, "BaiduMessage", js.undefined)
      
      inline def setDefaultMessage(value: UnmarshalledDefaultMessage): Self = StObject.set(x, "DefaultMessage", value.asInstanceOf[js.Any])
      
      inline def setDefaultMessageUndefined: Self = StObject.set(x, "DefaultMessage", js.undefined)
      
      inline def setDefaultPushNotificationMessage(value: UnmarshalledDefaultPushNotificationMessage): Self = StObject.set(x, "DefaultPushNotificationMessage", value.asInstanceOf[js.Any])
      
      inline def setDefaultPushNotificationMessageUndefined: Self = StObject.set(x, "DefaultPushNotificationMessage", js.undefined)
      
      inline def setEmailMessage(value: UnmarshalledEmailMessage): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
      
      inline def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
      
      inline def setGCMMessage(value: UnmarshalledGCMMessage): Self = StObject.set(x, "GCMMessage", value.asInstanceOf[js.Any])
      
      inline def setGCMMessageUndefined: Self = StObject.set(x, "GCMMessage", js.undefined)
      
      inline def setSMSMessage(value: UnmarshalledSMSMessage): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
      
      inline def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
    }
  }
}
