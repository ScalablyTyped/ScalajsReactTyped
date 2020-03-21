package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Agent.ApiVersion
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Agent.MatchMode
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Agent.Tier
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Agent. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Agent")
@js.native
/**
  * Constructs a new Agent.
  * @param [properties] Properties to set
  */
class Agent () extends IAgent {
  def this(properties: IAgent) = this()
  /** Agent apiVersion. */
  @JSName("apiVersion")
  var apiVersion_Agent: ApiVersion = js.native
  /** Agent avatarUri. */
  @JSName("avatarUri")
  var avatarUri_Agent: String = js.native
  /** Agent classificationThreshold. */
  @JSName("classificationThreshold")
  var classificationThreshold_Agent: Double = js.native
  /** Agent defaultLanguageCode. */
  @JSName("defaultLanguageCode")
  var defaultLanguageCode_Agent: String = js.native
  /** Agent description. */
  @JSName("description")
  var description_Agent: String = js.native
  /** Agent displayName. */
  @JSName("displayName")
  var displayName_Agent: String = js.native
  /** Agent enableLogging. */
  @JSName("enableLogging")
  var enableLogging_Agent: Boolean = js.native
  /** Agent matchMode. */
  @JSName("matchMode")
  var matchMode_Agent: MatchMode = js.native
  /** Agent parent. */
  @JSName("parent")
  var parent_Agent: String = js.native
  /** Agent supportedLanguageCodes. */
  @JSName("supportedLanguageCodes")
  var supportedLanguageCodes_Agent: js.Array[String] = js.native
  /** Agent tier. */
  @JSName("tier")
  var tier_Agent: Tier = js.native
  /** Agent timeZone. */
  @JSName("timeZone")
  var timeZone_Agent: String = js.native
  /**
    * Converts this Agent to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Agent")
@js.native
object Agent extends js.Object {
  @js.native
  sealed trait ApiVersion extends js.Object
  
  @js.native
  sealed trait MatchMode extends js.Object
  
  @js.native
  sealed trait Tier extends js.Object
  
  /**
    * Creates a new Agent instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Agent instance
    */
  def create(): Agent = js.native
  def create(properties: IAgent): Agent = js.native
  /**
    * Decodes an Agent message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Agent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Agent = js.native
  def decode(reader: Reader, length: Double): Agent = js.native
  def decode(reader: Uint8Array): Agent = js.native
  def decode(reader: Uint8Array, length: Double): Agent = js.native
  /**
    * Decodes an Agent message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Agent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Agent = js.native
  def decodeDelimited(reader: Uint8Array): Agent = js.native
  /**
    * Encodes the specified Agent message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Agent.verify|verify} messages.
    * @param message Agent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IAgent): Writer = js.native
  def encode(message: IAgent, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Agent message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Agent.verify|verify} messages.
    * @param message Agent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IAgent): Writer = js.native
  def encodeDelimited(message: IAgent, writer: Writer): Writer = js.native
  /**
    * Creates an Agent message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Agent
    */
  def fromObject(`object`: StringDictionary[js.Any]): Agent = js.native
  /**
    * Creates a plain object from an Agent message. Also converts values to other types if specified.
    * @param message Agent
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Agent): StringDictionary[js.Any] = js.native
  def toObject(message: Agent, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Agent message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** ApiVersion enum. */
  @js.native
  object ApiVersion extends js.Object {
    @js.native
    sealed trait API_VERSION_UNSPECIFIED extends ApiVersion
    
    @js.native
    sealed trait API_VERSION_V1 extends ApiVersion
    
    @js.native
    sealed trait API_VERSION_V2 extends ApiVersion
    
    @js.native
    sealed trait API_VERSION_V2_BETA_1 extends ApiVersion
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ApiVersion with Double] = js.native
    /* 0 */ @js.native
    object API_VERSION_UNSPECIFIED extends TopLevel[API_VERSION_UNSPECIFIED with Double]
    
    /* 1 */ @js.native
    object API_VERSION_V1 extends TopLevel[API_VERSION_V1 with Double]
    
    /* 2 */ @js.native
    object API_VERSION_V2 extends TopLevel[API_VERSION_V2 with Double]
    
    /* 3 */ @js.native
    object API_VERSION_V2_BETA_1 extends TopLevel[API_VERSION_V2_BETA_1 with Double]
    
  }
  
  /** MatchMode enum. */
  @js.native
  object MatchMode extends js.Object {
    @js.native
    sealed trait MATCH_MODE_HYBRID extends MatchMode
    
    @js.native
    sealed trait MATCH_MODE_ML_ONLY extends MatchMode
    
    @js.native
    sealed trait MATCH_MODE_UNSPECIFIED extends MatchMode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MatchMode with Double] = js.native
    /* 1 */ @js.native
    object MATCH_MODE_HYBRID extends TopLevel[MATCH_MODE_HYBRID with Double]
    
    /* 2 */ @js.native
    object MATCH_MODE_ML_ONLY extends TopLevel[MATCH_MODE_ML_ONLY with Double]
    
    /* 0 */ @js.native
    object MATCH_MODE_UNSPECIFIED extends TopLevel[MATCH_MODE_UNSPECIFIED with Double]
    
  }
  
  /** Tier enum. */
  @js.native
  object Tier extends js.Object {
    @js.native
    sealed trait TIER_ENTERPRISE extends Tier
    
    @js.native
    sealed trait TIER_ENTERPRISE_PLUS extends Tier
    
    @js.native
    sealed trait TIER_STANDARD extends Tier
    
    @js.native
    sealed trait TIER_UNSPECIFIED extends Tier
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Tier with Double] = js.native
    /* 2 */ @js.native
    object TIER_ENTERPRISE extends TopLevel[TIER_ENTERPRISE with Double]
    
    /* 3 */ @js.native
    object TIER_ENTERPRISE_PLUS extends TopLevel[TIER_ENTERPRISE_PLUS with Double]
    
    /* 1 */ @js.native
    object TIER_STANDARD extends TopLevel[TIER_STANDARD with Double]
    
    /* 0 */ @js.native
    object TIER_UNSPECIFIED extends TopLevel[TIER_UNSPECIFIED with Double]
    
  }
  
}

