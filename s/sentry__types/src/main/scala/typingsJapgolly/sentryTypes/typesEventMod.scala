package typingsJapgolly.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sentryTypes.anon.Changes
import typingsJapgolly.sentryTypes.anon.Values
import typingsJapgolly.sentryTypes.sentryTypesStrings.transaction
import typingsJapgolly.sentryTypes.typesAttachmentMod.Attachment
import typingsJapgolly.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typingsJapgolly.sentryTypes.typesContextMod.Contexts
import typingsJapgolly.sentryTypes.typesDebugMetaMod.DebugMeta
import typingsJapgolly.sentryTypes.typesExtraMod.Extras
import typingsJapgolly.sentryTypes.typesMeasurementMod.Measurements
import typingsJapgolly.sentryTypes.typesMiscMod.Primitive
import typingsJapgolly.sentryTypes.typesRequestMod.Request
import typingsJapgolly.sentryTypes.typesScopeMod.CaptureContext
import typingsJapgolly.sentryTypes.typesScopeMod.Scope
import typingsJapgolly.sentryTypes.typesSdkinfoMod.SdkInfo
import typingsJapgolly.sentryTypes.typesSeverityMod.Severity
import typingsJapgolly.sentryTypes.typesSeverityMod.SeverityLevel
import typingsJapgolly.sentryTypes.typesSpanMod.Span
import typingsJapgolly.sentryTypes.typesUserMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventMod {
  
  trait Event extends StObject {
    
    var breadcrumbs: js.UndefOr[js.Array[Breadcrumb]] = js.undefined
    
    var contexts: js.UndefOr[Contexts] = js.undefined
    
    var debug_meta: js.UndefOr[DebugMeta] = js.undefined
    
    var dist: js.UndefOr[String] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var event_id: js.UndefOr[String] = js.undefined
    
    var exception: js.UndefOr[Values] = js.undefined
    
    var extra: js.UndefOr[Extras] = js.undefined
    
    var fingerprint: js.UndefOr[js.Array[String]] = js.undefined
    
    var level: js.UndefOr[Severity | SeverityLevel] = js.undefined
    
    var logger: js.UndefOr[String] = js.undefined
    
    var measurements: js.UndefOr[Measurements] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var modules: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var release: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[Request] = js.undefined
    
    var sdk: js.UndefOr[SdkInfo] = js.undefined
    
    var sdkProcessingMetadata: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var server_name: js.UndefOr[String] = js.undefined
    
    var spans: js.UndefOr[js.Array[Span]] = js.undefined
    
    var start_timestamp: js.UndefOr[Double] = js.undefined
    
    var tags: js.UndefOr[StringDictionary[Primitive]] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var transaction: js.UndefOr[String] = js.undefined
    
    var transaction_info: js.UndefOr[Changes] = js.undefined
    
    var `type`: js.UndefOr[EventType] = js.undefined
    
    var user: js.UndefOr[User] = js.undefined
  }
  object Event {
    
    inline def apply(): Event = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setBreadcrumbs(value: js.Array[Breadcrumb]): Self = StObject.set(x, "breadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbsUndefined: Self = StObject.set(x, "breadcrumbs", js.undefined)
      
      inline def setBreadcrumbsVarargs(value: Breadcrumb*): Self = StObject.set(x, "breadcrumbs", js.Array(value*))
      
      inline def setContexts(value: Contexts): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      inline def setDebug_meta(value: DebugMeta): Self = StObject.set(x, "debug_meta", value.asInstanceOf[js.Any])
      
      inline def setDebug_metaUndefined: Self = StObject.set(x, "debug_meta", js.undefined)
      
      inline def setDist(value: String): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setDistUndefined: Self = StObject.set(x, "dist", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      inline def setEvent_idUndefined: Self = StObject.set(x, "event_id", js.undefined)
      
      inline def setException(value: Values): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
      
      inline def setExtra(value: Extras): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFingerprint(value: js.Array[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      inline def setFingerprintVarargs(value: String*): Self = StObject.set(x, "fingerprint", js.Array(value*))
      
      inline def setLevel(value: Severity | SeverityLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLogger(value: String): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMeasurements(value: Measurements): Self = StObject.set(x, "measurements", value.asInstanceOf[js.Any])
      
      inline def setMeasurementsUndefined: Self = StObject.set(x, "measurements", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setModules(value: StringDictionary[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setSdk(value: SdkInfo): Self = StObject.set(x, "sdk", value.asInstanceOf[js.Any])
      
      inline def setSdkProcessingMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "sdkProcessingMetadata", value.asInstanceOf[js.Any])
      
      inline def setSdkProcessingMetadataUndefined: Self = StObject.set(x, "sdkProcessingMetadata", js.undefined)
      
      inline def setSdkUndefined: Self = StObject.set(x, "sdk", js.undefined)
      
      inline def setServer_name(value: String): Self = StObject.set(x, "server_name", value.asInstanceOf[js.Any])
      
      inline def setServer_nameUndefined: Self = StObject.set(x, "server_name", js.undefined)
      
      inline def setSpans(value: js.Array[Span]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
      
      inline def setSpansUndefined: Self = StObject.set(x, "spans", js.undefined)
      
      inline def setSpansVarargs(value: Span*): Self = StObject.set(x, "spans", js.Array(value*))
      
      inline def setStart_timestamp(value: Double): Self = StObject.set(x, "start_timestamp", value.asInstanceOf[js.Any])
      
      inline def setStart_timestampUndefined: Self = StObject.set(x, "start_timestamp", js.undefined)
      
      inline def setTags(value: StringDictionary[Primitive]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
      
      inline def setTransaction_info(value: Changes): Self = StObject.set(x, "transaction_info", value.asInstanceOf[js.Any])
      
      inline def setTransaction_infoUndefined: Self = StObject.set(x, "transaction_info", js.undefined)
      
      inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait EventHint extends StObject {
    
    var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
    
    var captureContext: js.UndefOr[CaptureContext] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var event_id: js.UndefOr[String] = js.undefined
    
    var originalException: js.UndefOr[js.Error | String | Null] = js.undefined
    
    var syntheticException: js.UndefOr[js.Error | Null] = js.undefined
  }
  object EventHint {
    
    inline def apply(): EventHint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventHint]
    }
    
    extension [Self <: EventHint](x: Self) {
      
      inline def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value*))
      
      inline def setCaptureContext(value: CaptureContext): Self = StObject.set(x, "captureContext", value.asInstanceOf[js.Any])
      
      inline def setCaptureContextFunction1(value: /* scope */ Scope => Scope): Self = StObject.set(x, "captureContext", js.Any.fromFunction1(value))
      
      inline def setCaptureContextUndefined: Self = StObject.set(x, "captureContext", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      inline def setEvent_idUndefined: Self = StObject.set(x, "event_id", js.undefined)
      
      inline def setOriginalException(value: js.Error | String): Self = StObject.set(x, "originalException", value.asInstanceOf[js.Any])
      
      inline def setOriginalExceptionNull: Self = StObject.set(x, "originalException", null)
      
      inline def setOriginalExceptionUndefined: Self = StObject.set(x, "originalException", js.undefined)
      
      inline def setSyntheticException(value: js.Error): Self = StObject.set(x, "syntheticException", value.asInstanceOf[js.Any])
      
      inline def setSyntheticExceptionNull: Self = StObject.set(x, "syntheticException", null)
      
      inline def setSyntheticExceptionUndefined: Self = StObject.set(x, "syntheticException", js.undefined)
    }
  }
  
  type EventType = transaction
}
