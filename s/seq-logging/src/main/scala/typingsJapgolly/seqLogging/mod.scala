package typingsJapgolly.seqLogging

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("seq-logging", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    def this(config: SeqLoggerConfig) = this()
    
    /**
      * Flush then destroy connections, close the logger, destroying timers and other resources.
      * @returns {Promise<void>}
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Enqueue an event in Seq format.
      * @param {*} event
      * @returns {void}
      */
    def emit(event: SeqEvent): Unit = js.native
    
    /**
      * Flush events queued at the time of the call, and wait for pending writes to complete regardless of configured batching/timers.
      * @returns {Promise<boolean}
      */
    def flush(): js.Promise[Boolean] = js.native
    
    /**
      * * A browser only function that queues events for sending using the navigator.sendBeacon() API.
      * * This may work in an unload or pagehide event handler when a normal flush() would not.
      * * Events over 63K in length are discarded (with a warning sent in its place) and the total size batch will be no more than 63K in length.
      * @returns {boolean}
      */
    def flushToBeacon(): Boolean = js.native
  }
  
  trait RemoteConfig extends StObject {
    
    var MinimumLevelAccepted: SeqLogLevel | Null
  }
  object RemoteConfig {
    
    inline def apply(): RemoteConfig = {
      val __obj = js.Dynamic.literal(MinimumLevelAccepted = null)
      __obj.asInstanceOf[RemoteConfig]
    }
    
    extension [Self <: RemoteConfig](x: Self) {
      
      inline def setMinimumLevelAccepted(value: SeqLogLevel): Self = StObject.set(x, "MinimumLevelAccepted", value.asInstanceOf[js.Any])
      
      inline def setMinimumLevelAcceptedNull: Self = StObject.set(x, "MinimumLevelAccepted", null)
    }
  }
  
  trait SeqEvent extends StObject {
    
    var exception: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var messageTemplate: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[js.Object] = js.undefined
    
    var timestamp: js.Date
  }
  object SeqEvent {
    
    inline def apply(timestamp: js.Date): SeqEvent = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeqEvent]
    }
    
    extension [Self <: SeqEvent](x: Self) {
      
      inline def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
      
      inline def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.seqLogging.seqLoggingStrings.Verbose
    - typingsJapgolly.seqLogging.seqLoggingStrings.Debug
    - typingsJapgolly.seqLogging.seqLoggingStrings.Information
    - typingsJapgolly.seqLogging.seqLoggingStrings.Warning
    - typingsJapgolly.seqLogging.seqLoggingStrings.Error
    - typingsJapgolly.seqLogging.seqLoggingStrings.Fatal
  */
  trait SeqLogLevel extends StObject
  object SeqLogLevel {
    
    inline def Debug: typingsJapgolly.seqLogging.seqLoggingStrings.Debug = "Debug".asInstanceOf[typingsJapgolly.seqLogging.seqLoggingStrings.Debug]
    
    inline def Error: typingsJapgolly.seqLogging.seqLoggingStrings.Error = "Error".asInstanceOf[typingsJapgolly.seqLogging.seqLoggingStrings.Error]
    
    inline def Fatal: typingsJapgolly.seqLogging.seqLoggingStrings.Fatal = "Fatal".asInstanceOf[typingsJapgolly.seqLogging.seqLoggingStrings.Fatal]
    
    inline def Information: typingsJapgolly.seqLogging.seqLoggingStrings.Information = "Information".asInstanceOf[typingsJapgolly.seqLogging.seqLoggingStrings.Information]
    
    inline def Verbose: typingsJapgolly.seqLogging.seqLoggingStrings.Verbose = "Verbose".asInstanceOf[typingsJapgolly.seqLogging.seqLoggingStrings.Verbose]
    
    inline def Warning: typingsJapgolly.seqLogging.seqLoggingStrings.Warning = "Warning".asInstanceOf[typingsJapgolly.seqLogging.seqLoggingStrings.Warning]
  }
  
  trait SeqLoggerConfig extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var batchSizeLimit: js.UndefOr[Double] = js.undefined
    
    var eventSizeLimit: js.UndefOr[Double] = js.undefined
    
    var maxBatchingTime: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    def onError(e: js.Error): Unit
    
    var onRemoteConfigChange: js.UndefOr[js.Function1[/* remoteConfig */ RemoteConfig, Unit]] = js.undefined
    
    var requestTimeout: js.UndefOr[Double] = js.undefined
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var serverUrl: js.UndefOr[String] = js.undefined
  }
  object SeqLoggerConfig {
    
    inline def apply(onError: js.Error => Callback): SeqLoggerConfig = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()))
      __obj.asInstanceOf[SeqLoggerConfig]
    }
    
    extension [Self <: SeqLoggerConfig](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setBatchSizeLimit(value: Double): Self = StObject.set(x, "batchSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeLimitUndefined: Self = StObject.set(x, "batchSizeLimit", js.undefined)
      
      inline def setEventSizeLimit(value: Double): Self = StObject.set(x, "eventSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setEventSizeLimitUndefined: Self = StObject.set(x, "eventSizeLimit", js.undefined)
      
      inline def setMaxBatchingTime(value: Double): Self = StObject.set(x, "maxBatchingTime", value.asInstanceOf[js.Any])
      
      inline def setMaxBatchingTimeUndefined: Self = StObject.set(x, "maxBatchingTime", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setOnError(value: js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setOnRemoteConfigChange(value: /* remoteConfig */ RemoteConfig => Callback): Self = StObject.set(x, "onRemoteConfigChange", js.Any.fromFunction1((t0: /* remoteConfig */ RemoteConfig) => value(t0).runNow()))
      
      inline def setOnRemoteConfigChangeUndefined: Self = StObject.set(x, "onRemoteConfigChange", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
      
      inline def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
    }
  }
}
