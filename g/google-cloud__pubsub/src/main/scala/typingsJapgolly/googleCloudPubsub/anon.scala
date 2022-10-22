package typingsJapgolly.googleCloudPubsub

import typingsJapgolly.googleCloudPubsub.buildSrcLeaseManagerMod.FlowControlOptions
import typingsJapgolly.googleCloudPubsub.buildSrcMessageQueuesMod.QueuedMessage
import typingsJapgolly.googleCloudPubsub.buildSrcMessageQueuesMod.QueuedMessages
import typingsJapgolly.googleCloudPubsub.buildSrcPubsubMod.RequestCallback
import typingsJapgolly.googleCloudPubsub.buildSrcPubsubMod.RequestConfig
import typingsJapgolly.googleCloudPubsub.buildSrcSubscriberMod.AckResponse
import typingsJapgolly.googleCloudPubsub.buildSrcSubscriptionMod.OidcToken
import typingsJapgolly.googleCloudPubsub.buildSrcTemporalMod.Duration
import typingsJapgolly.googleGax.buildSrcGaxMod.CallOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AckDeadline extends StObject {
    
    var ackDeadline: Double
    
    var maxAckDeadline: Duration
    
    var maxExtensionMinutes: Double
    
    var maxOutstandingBytes: Double
    
    var maxOutstandingMessages: Double
    
    var maxStreams: Double
    
    var minAckDeadline: Unit
  }
  object AckDeadline {
    
    inline def apply(
      ackDeadline: Double,
      maxAckDeadline: Duration,
      maxExtensionMinutes: Double,
      maxOutstandingBytes: Double,
      maxOutstandingMessages: Double,
      maxStreams: Double,
      minAckDeadline: Unit
    ): AckDeadline = {
      val __obj = js.Dynamic.literal(ackDeadline = ackDeadline.asInstanceOf[js.Any], maxAckDeadline = maxAckDeadline.asInstanceOf[js.Any], maxExtensionMinutes = maxExtensionMinutes.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any], maxStreams = maxStreams.asInstanceOf[js.Any], minAckDeadline = minAckDeadline.asInstanceOf[js.Any])
      __obj.asInstanceOf[AckDeadline]
    }
    
    extension [Self <: AckDeadline](x: Self) {
      
      inline def setAckDeadline(value: Double): Self = StObject.set(x, "ackDeadline", value.asInstanceOf[js.Any])
      
      inline def setMaxAckDeadline(value: Duration): Self = StObject.set(x, "maxAckDeadline", value.asInstanceOf[js.Any])
      
      inline def setMaxExtensionMinutes(value: Double): Self = StObject.set(x, "maxExtensionMinutes", value.asInstanceOf[js.Any])
      
      inline def setMaxOutstandingBytes(value: Double): Self = StObject.set(x, "maxOutstandingBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxOutstandingMessages(value: Double): Self = StObject.set(x, "maxOutstandingMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxStreams(value: Double): Self = StObject.set(x, "maxStreams", value.asInstanceOf[js.Any])
      
      inline def setMinAckDeadline(value: Unit): Self = StObject.set(x, "minAckDeadline", value.asInstanceOf[js.Any])
    }
  }
  
  trait Etag extends StObject {
    
    var etag: js.UndefOr[String | Buffer] = js.undefined
  }
  object Etag {
    
    inline def apply(): Etag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Etag]
    }
    
    extension [Self <: Etag](x: Self) {
      
      inline def setEtag(value: String | Buffer): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    }
  }
  
  trait FlowControl extends StObject {
    
    var flowControl: js.UndefOr[FlowControlOptions] = js.undefined
    
    var gaxOpts: js.UndefOr[CallOptions] = js.undefined
  }
  object FlowControl {
    
    inline def apply(): FlowControl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlowControl]
    }
    
    extension [Self <: FlowControl](x: Self) {
      
      inline def setFlowControl(value: FlowControlOptions): Self = StObject.set(x, "flowControl", value.asInstanceOf[js.Any])
      
      inline def setFlowControlUndefined: Self = StObject.set(x, "flowControl", js.undefined)
      
      inline def setGaxOpts(value: CallOptions): Self = StObject.set(x, "gaxOpts", value.asInstanceOf[js.Any])
      
      inline def setGaxOptsUndefined: Self = StObject.set(x, "gaxOpts", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
  }
  
  trait MaxDelayMillis extends StObject {
    
    var maxDelayMillis: Double
    
    var maxOutstandingBytes: Double
    
    var maxOutstandingMessages: Double
  }
  object MaxDelayMillis {
    
    inline def apply(maxDelayMillis: Double, maxOutstandingBytes: Double, maxOutstandingMessages: Double): MaxDelayMillis = {
      val __obj = js.Dynamic.literal(maxDelayMillis = maxDelayMillis.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxDelayMillis]
    }
    
    extension [Self <: MaxDelayMillis](x: Self) {
      
      inline def setMaxDelayMillis(value: Double): Self = StObject.set(x, "maxDelayMillis", value.asInstanceOf[js.Any])
      
      inline def setMaxOutstandingBytes(value: Double): Self = StObject.set(x, "maxOutstandingBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxOutstandingMessages(value: Double): Self = StObject.set(x, "maxOutstandingMessages", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageRetentionDuration extends StObject {
    
    var messageRetentionDuration: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.IDuration */ Any) | Double
      ] = js.undefined
    
    var oidcToken: js.UndefOr[OidcToken] = js.undefined
    
    var pushEndpoint: js.UndefOr[String] = js.undefined
  }
  object MessageRetentionDuration {
    
    inline def apply(): MessageRetentionDuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageRetentionDuration]
    }
    
    extension [Self <: MessageRetentionDuration](x: Self) {
      
      inline def setMessageRetentionDuration(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.IDuration */ Any) | Double
      ): Self = StObject.set(x, "messageRetentionDuration", value.asInstanceOf[js.Any])
      
      inline def setMessageRetentionDurationUndefined: Self = StObject.set(x, "messageRetentionDuration", js.undefined)
      
      inline def setOidcToken(value: OidcToken): Self = StObject.set(x, "oidcToken", value.asInstanceOf[js.Any])
      
      inline def setOidcTokenUndefined: Self = StObject.set(x, "oidcToken", js.undefined)
      
      inline def setPushEndpoint(value: String): Self = StObject.set(x, "pushEndpoint", value.asInstanceOf[js.Any])
      
      inline def setPushEndpointUndefined: Self = StObject.set(x, "pushEndpoint", js.undefined)
    }
  }
  
  trait ToError extends StObject {
    
    var toError: Map[AckResponse, QueuedMessages]
    
    var toRetry: QueuedMessages
  }
  object ToError {
    
    inline def apply(toError: Map[AckResponse, QueuedMessages], toRetry: QueuedMessages): ToError = {
      val __obj = js.Dynamic.literal(toError = toError.asInstanceOf[js.Any], toRetry = toRetry.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToError]
    }
    
    extension [Self <: ToError](x: Self) {
      
      inline def setToError(value: Map[AckResponse, QueuedMessages]): Self = StObject.set(x, "toError", value.asInstanceOf[js.Any])
      
      inline def setToRetry(value: QueuedMessages): Self = StObject.set(x, "toRetry", value.asInstanceOf[js.Any])
      
      inline def setToRetryVarargs(value: QueuedMessage*): Self = StObject.set(x, "toRetry", js.Array(value*))
    }
  }
}
