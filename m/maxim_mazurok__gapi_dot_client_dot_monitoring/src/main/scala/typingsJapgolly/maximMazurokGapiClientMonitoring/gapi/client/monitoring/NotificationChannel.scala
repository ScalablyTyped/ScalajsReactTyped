package typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationChannel extends StObject {
  
  /** Record of the creation of this channel. */
  var creationRecord: js.UndefOr[MutationRecord] = js.undefined
  
  /**
    * An optional human-readable description of this notification channel. This description may provide additional details, beyond the display name, for the channel. This may not exceed
    * 1024 Unicode characters.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * An optional human-readable name for this notification channel. It is recommended that you specify a non-empty and unique name in order to make it easier to identify the channels in
    * your project, though this is not enforced. The display name is limited to 512 Unicode characters.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether notifications are forwarded to the described channel. This makes it possible to disable delivery of notifications to a particular channel without removing the channel from
    * all alerting policies that reference the channel. This is a more convenient approach when the change is temporary and you want to receive notifications from the same set of alerting
    * policies on the channel at some point in the future.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configuration fields that define the channel and its behavior. The permissible and required labels are specified in the NotificationChannelDescriptor.labels of the
    * NotificationChannelDescriptor corresponding to the type field.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Records of the modification of this channel. */
  var mutationRecords: js.UndefOr[js.Array[MutationRecord]] = js.undefined
  
  /**
    * The full REST resource name for this channel. The format is: projects/[PROJECT_ID_OR_NUMBER]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID] is automatically assigned by the
    * server on creation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The type of the notification channel. This field matches the value of the NotificationChannelDescriptor.type field. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * User-supplied key/value data that does not need to conform to the corresponding NotificationChannelDescriptor's schema, unlike the labels field. This field is intended to be used
    * for organizing and identifying the NotificationChannel objects.The field can contain up to 64 entries. Each key and value is limited to 63 Unicode characters or 128 bytes, whichever
    * is smaller. Labels and values can contain only lowercase letters, numerals, underscores, and dashes. Keys must begin with a letter.
    */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Indicates whether this channel has been verified or not. On a ListNotificationChannels or GetNotificationChannel operation, this field is expected to be populated.If the value is
    * UNVERIFIED, then it indicates that the channel is non-functioning (it both requires verification and lacks verification); otherwise, it is assumed that the channel works.If the
    * channel is neither VERIFIED nor UNVERIFIED, it implies that the channel is of a type that does not require verification or that this specific channel has been exempted from
    * verification because it was created prior to verification being required for channels of this type.This field cannot be modified using a standard UpdateNotificationChannel
    * operation. To change the value of this field, you must call VerifyNotificationChannel.
    */
  var verificationStatus: js.UndefOr[String] = js.undefined
}
object NotificationChannel {
  
  inline def apply(): NotificationChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationChannel]
  }
  
  extension [Self <: NotificationChannel](x: Self) {
    
    inline def setCreationRecord(value: MutationRecord): Self = StObject.set(x, "creationRecord", value.asInstanceOf[js.Any])
    
    inline def setCreationRecordUndefined: Self = StObject.set(x, "creationRecord", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMutationRecords(value: js.Array[MutationRecord]): Self = StObject.set(x, "mutationRecords", value.asInstanceOf[js.Any])
    
    inline def setMutationRecordsUndefined: Self = StObject.set(x, "mutationRecords", js.undefined)
    
    inline def setMutationRecordsVarargs(value: MutationRecord*): Self = StObject.set(x, "mutationRecords", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    inline def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
    
    inline def setVerificationStatus(value: String): Self = StObject.set(x, "verificationStatus", value.asInstanceOf[js.Any])
    
    inline def setVerificationStatusUndefined: Self = StObject.set(x, "verificationStatus", js.undefined)
  }
}
