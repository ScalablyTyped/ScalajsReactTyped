package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsEntry")
@js.native
/**
  * Constructs a new ConsensusSettingsEntry.
  * @param [properties] Properties to set
  */
open class ConsensusSettingsEntry ()
  extends StObject
     with IConsensusSettingsEntry {
  def this(properties: IConsensusSettingsEntry) = this()
  
  /** ConsensusSettingsEntry key. */
  @JSName("key")
  var key_ConsensusSettingsEntry: String = js.native
  
  /**
    * Converts this ConsensusSettingsEntry to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** ConsensusSettingsEntry value. */
  @JSName("value")
  var value_ConsensusSettingsEntry: String = js.native
}
/* static members */
object ConsensusSettingsEntry {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsEntry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusSettingsEntry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSettingsEntry instance
    */
  inline def create(): ConsensusSettingsEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusSettingsEntry]
  inline def create(properties: IConsensusSettingsEntry): ConsensusSettingsEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsEntry]
  
  inline def decode(reader: js.typedarray.Uint8Array): ConsensusSettingsEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsEntry]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusSettingsEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusSettingsEntry]
  /**
    * Decodes a ConsensusSettingsEntry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSettingsEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusSettingsEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsEntry]
  inline def decode(reader: Reader, length: Double): ConsensusSettingsEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusSettingsEntry]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusSettingsEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsEntry]
  /**
    * Decodes a ConsensusSettingsEntry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSettingsEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusSettingsEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsEntry]
  
  /**
    * Encodes the specified ConsensusSettingsEntry message. Does not implicitly {@link ConsensusSettingsEntry.verify|verify} messages.
    * @param message ConsensusSettingsEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusSettingsEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusSettingsEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusSettingsEntry message, length delimited. Does not implicitly {@link ConsensusSettingsEntry.verify|verify} messages.
    * @param message ConsensusSettingsEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusSettingsEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusSettingsEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusSettingsEntry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSettingsEntry
    */
  inline def fromObject(`object`: StringDictionary[Any]): ConsensusSettingsEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsEntry]
  
  /**
    * Creates a plain object from a ConsensusSettingsEntry message. Also converts values to other types if specified.
    * @param message ConsensusSettingsEntry
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusSettingsEntry): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ConsensusSettingsEntry, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusSettingsEntry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
