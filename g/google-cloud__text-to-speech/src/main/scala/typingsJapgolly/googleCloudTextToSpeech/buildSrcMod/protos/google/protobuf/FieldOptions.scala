package typingsJapgolly.googleCloudTextToSpeech.buildSrcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.IFieldOptions
import typingsJapgolly.googleGax.mod.protobuf.Reader
import typingsJapgolly.googleGax.mod.protobuf.Writer
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldOptions. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions")
@js.native
/**
  * Constructs a new FieldOptions.
  * @param [properties] Properties to set
  */
open class FieldOptions ()
  extends typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions {
  def this(properties: IFieldOptions) = this()
}
object FieldOptions {
  
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /** CType enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.CType")
  @js.native
  object CType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.CType & Double
      ] = js.native
    
    /* 1 */ val CORD: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.CType.CORD & Double = js.native
    
    /* 0 */ val STRING: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.CType.STRING & Double = js.native
    
    /* 2 */ val STRING_PIECE: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.CType.STRING_PIECE & Double = js.native
  }
  
  /** JSType enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.FieldOptions.JSType")
  @js.native
  object JSType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.JSType & Double
      ] = js.native
    
    /* 0 */ val JS_NORMAL: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.JSType.JS_NORMAL & Double = js.native
    
    /* 2 */ val JS_NUMBER: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.JSType.JS_NUMBER & Double = js.native
    
    /* 1 */ val JS_STRING: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions.JSType.JS_STRING & Double = js.native
  }
  
  /**
    * Creates a new FieldOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldOptions instance
    */
  /* static member */
  inline def create(): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions]
  inline def create(properties: IFieldOptions): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions]
  
  inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions]
  /**
    * Decodes a FieldOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions]
  inline def decode(reader: Reader, length: Double): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions]
  /**
    * Decodes a FieldOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions]
  
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
  inline def fromObject(`object`: StringDictionary[Any]): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions]
  
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
  inline def toObject(message: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.FieldOptions,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a FieldOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
