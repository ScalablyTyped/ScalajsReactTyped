package typingsJapgolly.googleCloudPubsub

import typingsJapgolly.googleCloudPubsub.buildSrcPublisherMod.PublishOptions
import typingsJapgolly.googleCloudPubsub.buildSrcPublisherPubsubMessageMod.Attributes
import typingsJapgolly.googleCloudPubsub.buildSrcPubsubMod.ClientConfig
import typingsJapgolly.googleCloudPubsub.buildSrcSchemaMod.SchemaMessageMetadata
import typingsJapgolly.googleCloudPubsub.buildSrcSubscriberMod.AckResponse
import typingsJapgolly.googleCloudPubsub.buildSrcSubscriberMod.Subscriber
import typingsJapgolly.googleCloudPubsub.buildSrcSubscriptionMod.SubscriptionMetadata
import typingsJapgolly.googleCloudPubsub.buildSrcSubscriptionMod.SubscriptionOptions
import typingsJapgolly.googleCloudPubsub.buildSrcTemporalMod.DurationLike
import typingsJapgolly.googleCloudPubsub.googleCloudPubsubStrings.AVRO
import typingsJapgolly.googleCloudPubsub.googleCloudPubsubStrings.BASIC
import typingsJapgolly.googleCloudPubsub.googleCloudPubsubStrings.BINARY
import typingsJapgolly.googleCloudPubsub.googleCloudPubsubStrings.FAILED_PRECONDITION
import typingsJapgolly.googleCloudPubsub.googleCloudPubsubStrings.FULL
import typingsJapgolly.googleCloudPubsub.googleCloudPubsubStrings.INVALID
import typingsJapgolly.googleCloudPubsub.googleCloudPubsubStrings.JSON
import typingsJapgolly.googleCloudPubsub.googleCloudPubsubStrings.OTHER
import typingsJapgolly.googleCloudPubsub.googleCloudPubsubStrings.PERMISSION_DENIED
import typingsJapgolly.googleCloudPubsub.googleCloudPubsubStrings.PROTOCOL_BUFFER
import typingsJapgolly.googleCloudPubsub.googleCloudPubsubStrings.SUCCESS
import typingsJapgolly.grpcGrpcJs.buildSrcCallMod.ServiceError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@google-cloud/pubsub", "AckError")
  @js.native
  open class AckError protected ()
    extends typingsJapgolly.googleCloudPubsub.buildSrcSubscriptionMod.AckError {
    def this(errorCode: AckResponse) = this()
    def this(errorCode: AckResponse, message: String) = this()
  }
  
  object AckResponses {
    
    @JSImport("@google-cloud/pubsub", "AckResponses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub", "AckResponses.FailedPrecondition")
    @js.native
    def FailedPrecondition: FAILED_PRECONDITION = js.native
    inline def FailedPrecondition_=(x: FAILED_PRECONDITION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FailedPrecondition")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "AckResponses.Invalid")
    @js.native
    def Invalid: INVALID = js.native
    inline def Invalid_=(x: INVALID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "AckResponses.Other")
    @js.native
    def Other: OTHER = js.native
    inline def Other_=(x: OTHER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Other")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "AckResponses.PermissionDenied")
    @js.native
    def PermissionDenied: PERMISSION_DENIED = js.native
    inline def PermissionDenied_=(x: PERMISSION_DENIED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PermissionDenied")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "AckResponses.Success")
    @js.native
    def Success: SUCCESS = js.native
    inline def Success_=(x: SUCCESS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/pubsub", "Duration")
  @js.native
  /* private */ open class Duration ()
    extends typingsJapgolly.googleCloudPubsub.buildSrcTemporalMod.Duration
  /* static members */
  object Duration {
    
    @JSImport("@google-cloud/pubsub", "Duration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Duration from a DurationLike, which is an object
      * containing zero or more of the following: hours, seconds,
      * minutes, millis.
      */
    inline def from(durationLike: DurationLike): typingsJapgolly.googleCloudPubsub.buildSrcTemporalMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(durationLike.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudPubsub.buildSrcTemporalMod.Duration]
    
    @JSImport("@google-cloud/pubsub", "Duration.hourInMillis")
    @js.native
    def hourInMillis: Any = js.native
    inline def hourInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourInMillis")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "Duration.minuteInMillis")
    @js.native
    def minuteInMillis: Any = js.native
    inline def minuteInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteInMillis")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "Duration.secondInMillis")
    @js.native
    def secondInMillis: Any = js.native
    inline def secondInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondInMillis")(x.asInstanceOf[js.Any])
  }
  
  object Encodings {
    
    @JSImport("@google-cloud/pubsub", "Encodings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub", "Encodings.Binary")
    @js.native
    def Binary: BINARY = js.native
    inline def Binary_=(x: BINARY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "Encodings.Json")
    @js.native
    def Json: JSON = js.native
    inline def Json_=(x: JSON): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Json")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/pubsub", "IAM")
  @js.native
  open class IAM protected ()
    extends typingsJapgolly.googleCloudPubsub.buildSrcIamMod.IAM {
    def this(pubsub: typingsJapgolly.googleCloudPubsub.buildSrcPubsubMod.PubSub, id: String) = this()
  }
  
  @JSImport("@google-cloud/pubsub", "Message")
  @js.native
  open class Message protected ()
    extends typingsJapgolly.googleCloudPubsub.buildSrcSubscriberMod.Message {
    /**
      * @hideconstructor
      *
      * @param {Subscriber} sub The parent subscriber.
      * @param {object} message The raw message response.
      */
    def this(
      sub: Subscriber,
      hasAckIdMessageDeliveryAttempt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.IReceivedMessage */ Any
    ) = this()
  }
  
  @JSImport("@google-cloud/pubsub", "PubSub")
  @js.native
  open class PubSub ()
    extends typingsJapgolly.googleCloudPubsub.buildSrcPubsubMod.PubSub {
    def this(options: ClientConfig) = this()
  }
  /* static members */
  object PubSub {
    
    @JSImport("@google-cloud/pubsub", "PubSub")
    @js.native
    val ^ : js.Any = js.native
    
    /*!
      * Format the name of a project. A project's full name is in the
      * format of projects/{projectId}.
      *
      * The GAPIC client should do this for us, but since we maintain
      * names rather than IDs, this is simpler.
      *
      * @private
      */
    inline def formatName_(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("@google-cloud/pubsub", "PublishError")
  @js.native
  open class PublishError protected ()
    extends typingsJapgolly.googleCloudPubsub.buildSrcPublisherPublishErrorMod.PublishError {
    def this(key: String, err: ServiceError) = this()
  }
  
  @JSImport("@google-cloud/pubsub", "Schema")
  @js.native
  open class Schema protected ()
    extends typingsJapgolly.googleCloudPubsub.buildSrcSchemaMod.Schema {
    def this(pubsub: typingsJapgolly.googleCloudPubsub.buildSrcPubsubMod.PubSub, idOrName: String) = this()
  }
  /* static members */
  object Schema {
    
    @JSImport("@google-cloud/pubsub", "Schema")
    @js.native
    val ^ : js.Any = js.native
    
    /*!
      * Format the name of a schema. A schema's full name is in the
      * format of projects/{projectId}/schemas/{schemaName}.
      *
      * The GAPIC client should do this for us, but since we maintain
      * names rather than IDs, this is simpler.
      *
      * @private
      */
    inline def formatName_(projectId: String, nameOrId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], nameOrId.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Translates the schema attributes in messages delivered from Pub/Sub.
      * All resulting fields may end up being blank.
      */
    inline def metadataFromMessage(attributes: Attributes): SchemaMessageMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("metadataFromMessage")(attributes.asInstanceOf[js.Any]).asInstanceOf[SchemaMessageMetadata]
  }
  
  object SchemaTypes {
    
    @JSImport("@google-cloud/pubsub", "SchemaTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub", "SchemaTypes.Avro")
    @js.native
    def Avro: AVRO = js.native
    inline def Avro_=(x: AVRO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Avro")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "SchemaTypes.ProtocolBuffer")
    @js.native
    def ProtocolBuffer: PROTOCOL_BUFFER = js.native
    inline def ProtocolBuffer_=(x: PROTOCOL_BUFFER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProtocolBuffer")(x.asInstanceOf[js.Any])
  }
  
  object SchemaViews {
    
    @JSImport("@google-cloud/pubsub", "SchemaViews")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub", "SchemaViews.Basic")
    @js.native
    def Basic: BASIC = js.native
    inline def Basic_=(x: BASIC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Basic")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub", "SchemaViews.Full")
    @js.native
    def Full: FULL = js.native
    inline def Full_=(x: FULL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Full")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/pubsub", "Snapshot")
  @js.native
  open class Snapshot protected ()
    extends typingsJapgolly.googleCloudPubsub.buildSrcSnapshotMod.Snapshot {
    def this(parent: typingsJapgolly.googleCloudPubsub.buildSrcPubsubMod.PubSub, name: String) = this()
    def this(parent: typingsJapgolly.googleCloudPubsub.buildSrcSubscriptionMod.Subscription, name: String) = this()
  }
  /* static members */
  object Snapshot {
    
    @JSImport("@google-cloud/pubsub", "Snapshot")
    @js.native
    val ^ : js.Any = js.native
    
    inline def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@google-cloud/pubsub", "Subscription")
  @js.native
  open class Subscription protected ()
    extends typingsJapgolly.googleCloudPubsub.buildSrcSubscriptionMod.Subscription {
    def this(pubsub: typingsJapgolly.googleCloudPubsub.buildSrcPubsubMod.PubSub, name: String) = this()
    def this(
      pubsub: typingsJapgolly.googleCloudPubsub.buildSrcPubsubMod.PubSub,
      name: String,
      options: SubscriptionOptions
    ) = this()
  }
  /* static members */
  object Subscription {
    
    @JSImport("@google-cloud/pubsub", "Subscription")
    @js.native
    val ^ : js.Any = js.native
    
    /*!
      * Formats Subscription metadata.
      *
      * @private
      */
    inline def formatMetadata_(metadata: SubscriptionMetadata): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMetadata_")(metadata.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /*!
      * Format the name of a subscription. A subscription's full name is in the
      * format of projects/{projectId}/subscriptions/{subName}.
      *
      * @private
      */
    inline def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@google-cloud/pubsub", "Topic")
  @js.native
  open class Topic protected ()
    extends typingsJapgolly.googleCloudPubsub.buildSrcTopicMod.Topic {
    def this(pubsub: typingsJapgolly.googleCloudPubsub.buildSrcPubsubMod.PubSub, name: String) = this()
    def this(
      pubsub: typingsJapgolly.googleCloudPubsub.buildSrcPubsubMod.PubSub,
      name: String,
      options: PublishOptions
    ) = this()
  }
  /* static members */
  object Topic {
    
    @JSImport("@google-cloud/pubsub", "Topic")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Format the name of a topic. A Topic's full name is in the format of
      * 'projects/{projectId}/topics/{topicName}'.
      *
      * @private
      *
      * @return {string}
      */
    inline def formatName_(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
