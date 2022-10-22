package typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.CType
import typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.JSType
import typingsJapgolly.googleGax.mod.protobuf.Reader
import typingsJapgolly.googleGax.mod.protobuf.Writer
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldOptions. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions")
@js.native
/**
  * Constructs a new FieldOptions.
  * @param [properties] Properties to set
  */
open class FieldOptions ()
  extends StObject
     with IFieldOptions {
  def this(properties: IFieldOptions) = this()
  
  /** FieldOptions ctype. */
  @JSName("ctype")
  var ctype_FieldOptions: CType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.CType * / any */ String) = js.native
  
  /** FieldOptions deprecated. */
  @JSName("deprecated")
  var deprecated_FieldOptions: Boolean = js.native
  
  /** FieldOptions jstype. */
  @JSName("jstype")
  var jstype_FieldOptions: JSType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.JSType * / any */ String) = js.native
  
  /** FieldOptions lazy. */
  @JSName("lazy")
  var lazy_FieldOptions: Boolean = js.native
  
  /** FieldOptions packed. */
  @JSName("packed")
  var packed_FieldOptions: Boolean = js.native
  
  /**
    * Converts this FieldOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** FieldOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_FieldOptions: js.Array[IUninterpretedOption] = js.native
  
  /** FieldOptions unverifiedLazy. */
  @JSName("unverifiedLazy")
  var unverifiedLazy_FieldOptions: Boolean = js.native
  
  /** FieldOptions weak. */
  @JSName("weak")
  var weak_FieldOptions: Boolean = js.native
}
object FieldOptions {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CType extends StObject
  /** CType enum. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.CType")
  @js.native
  object CType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CType & Double] = js.native
    
    @js.native
    sealed trait CORD
      extends StObject
         with CType
    /* 1 */ val CORD: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.CType.CORD & Double = js.native
    
    @js.native
    sealed trait STRING
      extends StObject
         with CType
    /* 0 */ val STRING: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.CType.STRING & Double = js.native
    
    @js.native
    sealed trait STRING_PIECE
      extends StObject
         with CType
    /* 2 */ val STRING_PIECE: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.CType.STRING_PIECE & Double = js.native
  }
  
  @js.native
  sealed trait JSType extends StObject
  /** JSType enum. */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FieldOptions.JSType")
  @js.native
  object JSType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JSType & Double] = js.native
    
    @js.native
    sealed trait JS_NORMAL
      extends StObject
         with JSType
    /* 0 */ val JS_NORMAL: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.JSType.JS_NORMAL & Double = js.native
    
    @js.native
    sealed trait JS_NUMBER
      extends StObject
         with JSType
    /* 2 */ val JS_NUMBER: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.JSType.JS_NUMBER & Double = js.native
    
    @js.native
    sealed trait JS_STRING
      extends StObject
         with JSType
    /* 1 */ val JS_STRING: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.JSType.JS_STRING & Double = js.native
  }
  
  /**
    * Creates a new FieldOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldOptions instance
    */
  /* static member */
  inline def create(): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FieldOptions]
  inline def create(properties: IFieldOptions): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  
  inline def decode(reader: js.typedarray.Uint8Array): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): FieldOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FieldOptions]
  /**
    * Decodes a FieldOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  inline def decode(reader: Reader, length: Double): FieldOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FieldOptions]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  /**
    * Decodes a FieldOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  
  /**
    * Encodes the specified FieldOptions message. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
    * @param message FieldOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IFieldOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IFieldOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified FieldOptions message, length delimited. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
    * @param message FieldOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IFieldOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IFieldOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a FieldOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  
  /**
    * Gets the default type url for FieldOptions
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a FieldOptions message. Also converts values to other types if specified.
    * @param message FieldOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FieldOptions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: FieldOptions, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a FieldOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
