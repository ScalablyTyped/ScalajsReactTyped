package typingsJapgolly.googleCloudTextToSpeech.buildSrcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.IEnumReservedRange
import typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.IEnumDescriptorProto
import typingsJapgolly.googleGax.mod.protobuf.Reader
import typingsJapgolly.googleGax.mod.protobuf.Writer
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumDescriptorProto. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.EnumDescriptorProto")
@js.native
/**
  * Constructs a new EnumDescriptorProto.
  * @param [properties] Properties to set
  */
open class EnumDescriptorProto ()
  extends typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto {
  def this(properties: IEnumDescriptorProto) = this()
}
object EnumDescriptorProto {
  
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.EnumDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an EnumReservedRange. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.EnumDescriptorProto.EnumReservedRange")
  @js.native
  /**
    * Constructs a new EnumReservedRange.
    * @param [properties] Properties to set
    */
  open class EnumReservedRange ()
    extends typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange {
    def this(properties: IEnumReservedRange) = this()
  }
  object EnumReservedRange {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.EnumDescriptorProto.EnumReservedRange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new EnumReservedRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns EnumReservedRange instance
      */
    /* static member */
    inline def create(): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    inline def create(properties: IEnumReservedRange): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    
    inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    inline def decode(reader: Reader, length: Double): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    
    /**
      * Encodes the specified EnumReservedRange message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IEnumReservedRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IEnumReservedRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified EnumReservedRange message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IEnumReservedRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IEnumReservedRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an EnumReservedRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns EnumReservedRange
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange]
    
    /**
      * Gets the default type url for EnumReservedRange
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from an EnumReservedRange message. Also converts values to other types if specified.
      * @param message EnumReservedRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto.EnumReservedRange,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an EnumReservedRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new EnumDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumDescriptorProto instance
    */
  /* static member */
  inline def create(): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto]
  inline def create(properties: IEnumDescriptorProto): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto]
  
  inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto]
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto]
  inline def decode(reader: Reader, length: Double): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto]
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto]
  
  /**
    * Encodes the specified EnumDescriptorProto message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IEnumDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IEnumDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EnumDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IEnumDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IEnumDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EnumDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumDescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto]
  
  /**
    * Gets the default type url for EnumDescriptorProto
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an EnumDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(
    message: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto
  ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.EnumDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an EnumDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
