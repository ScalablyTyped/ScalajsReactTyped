package typingsJapgolly.googleCloudTextToSpeech.buildSrcMod.protos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.IAnnotation
import typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.IGeneratedCodeInfo
import typingsJapgolly.googleGax.mod.protobuf.Reader
import typingsJapgolly.googleGax.mod.protobuf.Writer
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GeneratedCodeInfo. */
@JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.GeneratedCodeInfo")
@js.native
/**
  * Constructs a new GeneratedCodeInfo.
  * @param [properties] Properties to set
  */
open class GeneratedCodeInfo ()
  extends typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo {
  def this(properties: IGeneratedCodeInfo) = this()
}
object GeneratedCodeInfo {
  
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.GeneratedCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an Annotation. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.GeneratedCodeInfo.Annotation")
  @js.native
  /**
    * Constructs a new Annotation.
    * @param [properties] Properties to set
    */
  open class Annotation ()
    extends typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation {
    def this(properties: IAnnotation) = this()
  }
  object Annotation {
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.GeneratedCodeInfo.Annotation")
    @js.native
    val ^ : js.Any = js.native
    
    /** Semantic enum. */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.protobuf.GeneratedCodeInfo.Annotation.Semantic")
    @js.native
    object Semantic extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation.Semantic & Double
          ] = js.native
      
      /* 2 */ val ALIAS: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation.Semantic.ALIAS & Double = js.native
      
      /* 0 */ val NONE: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation.Semantic.NONE & Double = js.native
      
      /* 1 */ val SET: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation.Semantic.SET & Double = js.native
    }
    
    /**
      * Creates a new Annotation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Annotation instance
      */
    /* static member */
    inline def create(): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation]
    inline def create(properties: IAnnotation): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation]
    
    inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation]
    /**
      * Decodes an Annotation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Annotation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation]
    inline def decode(reader: Reader, length: Double): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation]
    /**
      * Decodes an Annotation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Annotation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation]
    
    /**
      * Encodes the specified Annotation message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
      * @param message Annotation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IAnnotation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IAnnotation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Annotation message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
      * @param message Annotation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IAnnotation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IAnnotation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an Annotation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Annotation
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation]
    
    /**
      * Gets the default type url for Annotation
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from an Annotation message. Also converts values to other types if specified.
      * @param message Annotation
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation
    ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(
      message: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo.Annotation,
      options: IConversionOptions
    ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an Annotation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new GeneratedCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GeneratedCodeInfo instance
    */
  /* static member */
  inline def create(): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo]
  inline def create(properties: IGeneratedCodeInfo): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo]
  
  inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo]
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo]
  inline def decode(reader: Reader, length: Double): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo]
  /**
    * Decodes a GeneratedCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GeneratedCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo]
  
  /**
    * Encodes the specified GeneratedCodeInfo message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IGeneratedCodeInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGeneratedCodeInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GeneratedCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
    * @param message GeneratedCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IGeneratedCodeInfo): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGeneratedCodeInfo, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GeneratedCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GeneratedCodeInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo]
  
  /**
    * Gets the default type url for GeneratedCodeInfo
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a GeneratedCodeInfo message. Also converts values to other types if specified.
    * @param message GeneratedCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(
    message: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo
  ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf.GeneratedCodeInfo,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GeneratedCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
