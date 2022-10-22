package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.IEntry
import typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse")
@js.native
/**
  * Constructs a new ClientStateListResponse.
  * @param [properties] Properties to set
  */
open class ClientStateListResponse ()
  extends StObject
     with IClientStateListResponse {
  def this(properties: IClientStateListResponse) = this()
  
  /** ClientStateListResponse entries. */
  @JSName("entries")
  var entries_ClientStateListResponse: js.Array[IEntry] = js.native
  
  /** ClientStateListResponse stateRoot. */
  @JSName("stateRoot")
  var stateRoot_ClientStateListResponse: String = js.native
  
  /** ClientStateListResponse status. */
  @JSName("status")
  var status_ClientStateListResponse: Status = js.native
  
  /**
    * Converts this ClientStateListResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ClientStateListResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an Entry. */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry")
  @js.native
  /**
    * Constructs a new Entry.
    * @param [properties] Properties to set
    */
  open class Entry ()
    extends StObject
       with IEntry {
    def this(properties: IEntry) = this()
    
    /** Entry address. */
    @JSName("address")
    var address_Entry: String = js.native
    
    /** Entry data. */
    @JSName("data")
    var data_Entry: js.typedarray.Uint8Array = js.native
    
    /**
      * Converts this Entry to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object Entry {
    
    @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Entry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Entry instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Entry instance
      */
    /* static member */
    inline def create(): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Entry]
    inline def create(properties: IEntry): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Entry]
    
    inline def decode(reader: js.typedarray.Uint8Array): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Entry]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Entry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Entry]
    /**
      * Decodes an Entry message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Entry]
    inline def decode(reader: Reader, length: Double): Entry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Entry]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Entry]
    /**
      * Decodes an Entry message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Entry]
    
    /**
      * Encodes the specified Entry message. Does not implicitly {@link ClientStateListResponse.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Entry message, length delimited. Does not implicitly {@link ClientStateListResponse.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an Entry message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Entry
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Entry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Entry]
    
    /**
      * Creates a plain object from an Entry message. Also converts values to other types if specified.
      * @param message Entry
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Entry): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Entry, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an Entry message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientStateListResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with Status
    /* 2 */ val INTERNAL_ERROR: typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INVALID_ADDRESS
      extends StObject
         with Status
    /* 8 */ val INVALID_ADDRESS: typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_ADDRESS & Double = js.native
    
    @js.native
    sealed trait INVALID_PAGING
      extends StObject
         with Status
    /* 6 */ val INVALID_PAGING: typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_PAGING & Double = js.native
    
    @js.native
    sealed trait INVALID_ROOT
      extends StObject
         with Status
    /* 9 */ val INVALID_ROOT: typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_ROOT & Double = js.native
    
    @js.native
    sealed trait INVALID_SORT
      extends StObject
         with Status
    /* 7 */ val INVALID_SORT: typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_SORT & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 3 */ val NOT_READY: typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE
      extends StObject
         with Status
    /* 5 */ val NO_RESOURCE: typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.Status.NO_RESOURCE & Double = js.native
    
    @js.native
    sealed trait NO_ROOT
      extends StObject
         with Status
    /* 4 */ val NO_ROOT: typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.Status.NO_ROOT & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.ClientStateListResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ClientStateListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateListResponse instance
    */
  inline def create(): ClientStateListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientStateListResponse]
  inline def create(properties: IClientStateListResponse): ClientStateListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientStateListResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientStateListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateListResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientStateListResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStateListResponse]
  /**
    * Decodes a ClientStateListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientStateListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateListResponse]
  inline def decode(reader: Reader, length: Double): ClientStateListResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientStateListResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientStateListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateListResponse]
  /**
    * Decodes a ClientStateListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientStateListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientStateListResponse]
  
  /**
    * Encodes the specified ClientStateListResponse message. Does not implicitly {@link ClientStateListResponse.verify|verify} messages.
    * @param message ClientStateListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientStateListResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientStateListResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientStateListResponse message, length delimited. Does not implicitly {@link ClientStateListResponse.verify|verify} messages.
    * @param message ClientStateListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientStateListResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientStateListResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientStateListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateListResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientStateListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientStateListResponse]
  
  /**
    * Creates a plain object from a ClientStateListResponse message. Also converts values to other types if specified.
    * @param message ClientStateListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientStateListResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientStateListResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientStateListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of an Entry. */
  trait IEntry extends StObject {
    
    /** Entry address */
    var address: js.UndefOr[String | Null] = js.undefined
    
    /** Entry data */
    var data: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  }
  object IEntry {
    
    inline def apply(): IEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEntry]
    }
    
    extension [Self <: IEntry](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressNull: Self = StObject.set(x, "address", null)
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
}
