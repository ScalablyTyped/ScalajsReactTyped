package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.ClientStatusGetResponse.IPeer
import typingsJapgolly.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse")
@js.native
/**
  * Constructs a new ClientStatusGetResponse.
  * @param [properties] Properties to set
  */
open class ClientStatusGetResponse ()
  extends StObject
     with IClientStatusGetResponse {
  def this(properties: IClientStatusGetResponse) = this()
  
  /** ClientStatusGetResponse endpoint. */
  @JSName("endpoint")
  var endpoint_ClientStatusGetResponse: String = js.native
  
  /** ClientStatusGetResponse peers. */
  @JSName("peers")
  var peers_ClientStatusGetResponse: js.Array[IPeer] = js.native
  
  /** ClientStatusGetResponse status. */
  @JSName("status")
  var status_ClientStatusGetResponse: Status = js.native
  
  /**
    * Converts this ClientStatusGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ClientStatusGetResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Peer. */
  @JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse.Peer")
  @js.native
  /**
    * Constructs a new Peer.
    * @param [properties] Properties to set
    */
  open class Peer ()
    extends StObject
       with IPeer {
    def this(properties: IPeer) = this()
    
    /** Peer endpoint. */
    @JSName("endpoint")
    var endpoint_Peer: String = js.native
    
    /**
      * Converts this Peer to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Peer {
    
    @JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse.Peer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Peer instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Peer instance
      */
    /* static member */
    inline def create(): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Peer]
    inline def create(properties: IPeer): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Peer]
    
    inline def decode(reader: js.typedarray.Uint8Array): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Peer]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Peer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Peer]
    /**
      * Decodes a Peer message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Peer
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Peer]
    inline def decode(reader: Reader, length: Double): Peer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Peer]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Peer]
    /**
      * Decodes a Peer message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Peer
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Peer]
    
    /**
      * Encodes the specified Peer message. Does not implicitly {@link ClientStatusGetResponse.Peer.verify|verify} messages.
      * @param message Peer message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IPeer): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IPeer, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Peer message, length delimited. Does not implicitly {@link ClientStatusGetResponse.Peer.verify|verify} messages.
      * @param message Peer message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IPeer): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IPeer, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Peer message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Peer
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Peer]
    
    /**
      * Creates a plain object from a Peer message. Also converts values to other types if specified.
      * @param message Peer
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Peer): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Peer, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Peer message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with Status
    /* 2 */ val ERROR: typingsJapgolly.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status.ERROR & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.ClientStatusGetResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ClientStatusGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStatusGetResponse instance
    */
  inline def create(): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientStatusGetResponse]
  inline def create(properties: IClientStatusGetResponse): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientStatusGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStatusGetResponse]
  /**
    * Decodes a ClientStatusGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStatusGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  inline def decode(reader: Reader, length: Double): ClientStatusGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStatusGetResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  /**
    * Decodes a ClientStatusGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStatusGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  
  /**
    * Encodes the specified ClientStatusGetResponse message. Does not implicitly {@link ClientStatusGetResponse.verify|verify} messages.
    * @param message ClientStatusGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientStatusGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientStatusGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientStatusGetResponse message, length delimited. Does not implicitly {@link ClientStatusGetResponse.verify|verify} messages.
    * @param message ClientStatusGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientStatusGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientStatusGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientStatusGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStatusGetResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientStatusGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientStatusGetResponse]
  
  /**
    * Creates a plain object from a ClientStatusGetResponse message. Also converts values to other types if specified.
    * @param message ClientStatusGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientStatusGetResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientStatusGetResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientStatusGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a Peer. */
  trait IPeer extends StObject {
    
    /** Peer endpoint */
    var endpoint: js.UndefOr[String | Null] = js.undefined
  }
  object IPeer {
    
    inline def apply(): IPeer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPeer]
    }
    
    extension [Self <: IPeer](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointNull: Self = StObject.set(x, "endpoint", null)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    }
  }
}
