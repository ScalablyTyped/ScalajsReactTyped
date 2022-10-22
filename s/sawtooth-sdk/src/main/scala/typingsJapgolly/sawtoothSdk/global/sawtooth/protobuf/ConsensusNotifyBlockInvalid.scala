package typingsJapgolly.sawtoothSdk.global.sawtooth.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.IConsensusNotifyBlockInvalid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sawtooth.protobuf.ConsensusNotifyBlockInvalid")
@js.native
/**
  * Constructs a new ConsensusNotifyBlockInvalid.
  * @param [properties] Properties to set
  */
open class ConsensusNotifyBlockInvalid ()
  extends typingsJapgolly.sawtoothSdk.mod.protobuf.ConsensusNotifyBlockInvalid {
  def this(properties: IConsensusNotifyBlockInvalid) = this()
}
/* static members */
object ConsensusNotifyBlockInvalid {
  
  @JSGlobal("sawtooth.protobuf.ConsensusNotifyBlockInvalid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusNotifyBlockInvalid instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyBlockInvalid instance
    */
  inline def create(): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid]
  inline def create(properties: IConsensusNotifyBlockInvalid): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid]
  
  inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid]
  /**
    * Decodes a ConsensusNotifyBlockInvalid message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyBlockInvalid
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid]
  inline def decode(reader: Reader, length: Double): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid]
  /**
    * Decodes a ConsensusNotifyBlockInvalid message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyBlockInvalid
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid]
  
  /**
    * Encodes the specified ConsensusNotifyBlockInvalid message. Does not implicitly {@link ConsensusNotifyBlockInvalid.verify|verify} messages.
    * @param message ConsensusNotifyBlockInvalid message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusNotifyBlockInvalid): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusNotifyBlockInvalid, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusNotifyBlockInvalid message, length delimited. Does not implicitly {@link ConsensusNotifyBlockInvalid.verify|verify} messages.
    * @param message ConsensusNotifyBlockInvalid message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusNotifyBlockInvalid): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusNotifyBlockInvalid, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusNotifyBlockInvalid message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyBlockInvalid
    */
  inline def fromObject(`object`: StringDictionary[Any]): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid]
  
  /**
    * Creates a plain object from a ConsensusNotifyBlockInvalid message. Also converts values to other types if specified.
    * @param message ConsensusNotifyBlockInvalid
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusNotifyBlockInvalid,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusNotifyBlockInvalid message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
