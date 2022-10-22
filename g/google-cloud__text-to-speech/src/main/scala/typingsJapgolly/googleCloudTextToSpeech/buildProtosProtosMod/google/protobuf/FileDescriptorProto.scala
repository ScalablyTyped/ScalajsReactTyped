package typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleGax.mod.protobuf.Reader
import typingsJapgolly.googleGax.mod.protobuf.Writer
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileDescriptorProto. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FileDescriptorProto")
@js.native
/**
  * Constructs a new FileDescriptorProto.
  * @param [properties] Properties to set
  */
open class FileDescriptorProto ()
  extends StObject
     with IFileDescriptorProto {
  def this(properties: IFileDescriptorProto) = this()
  
  /** FileDescriptorProto package. */
  @JSName("package")
  var _package_FileDescriptorProto: String = js.native
  
  /** FileDescriptorProto dependency. */
  @JSName("dependency")
  var dependency_FileDescriptorProto: js.Array[String] = js.native
  
  /** FileDescriptorProto edition. */
  @JSName("edition")
  var edition_FileDescriptorProto: String = js.native
  
  /** FileDescriptorProto enumType. */
  @JSName("enumType")
  var enumType_FileDescriptorProto: js.Array[IEnumDescriptorProto] = js.native
  
  /** FileDescriptorProto extension. */
  @JSName("extension")
  var extension_FileDescriptorProto: js.Array[IFieldDescriptorProto] = js.native
  
  /** FileDescriptorProto messageType. */
  @JSName("messageType")
  var messageType_FileDescriptorProto: js.Array[IDescriptorProto] = js.native
  
  /** FileDescriptorProto name. */
  @JSName("name")
  var name_FileDescriptorProto: String = js.native
  
  /** FileDescriptorProto publicDependency. */
  @JSName("publicDependency")
  var publicDependency_FileDescriptorProto: js.Array[Double] = js.native
  
  /** FileDescriptorProto service. */
  @JSName("service")
  var service_FileDescriptorProto: js.Array[IServiceDescriptorProto] = js.native
  
  /** FileDescriptorProto syntax. */
  @JSName("syntax")
  var syntax_FileDescriptorProto: String = js.native
  
  /**
    * Converts this FileDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** FileDescriptorProto weakDependency. */
  @JSName("weakDependency")
  var weakDependency_FileDescriptorProto: js.Array[Double] = js.native
}
object FileDescriptorProto {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.protobuf.FileDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new FileDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FileDescriptorProto instance
    */
  /* static member */
  inline def create(): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[FileDescriptorProto]
  inline def create(properties: IFileDescriptorProto): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  
  inline def decode(reader: js.typedarray.Uint8Array): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): FileDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FileDescriptorProto]
  /**
    * Decodes a FileDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FileDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  inline def decode(reader: Reader, length: Double): FileDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[FileDescriptorProto]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  /**
    * Decodes a FileDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FileDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  
  /**
    * Encodes the specified FileDescriptorProto message. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
    * @param message FileDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IFileDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IFileDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified FileDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
    * @param message FileDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IFileDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IFileDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a FileDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileDescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  
  /**
    * Gets the default type url for FileDescriptorProto
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a FileDescriptorProto message. Also converts values to other types if specified.
    * @param message FileDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FileDescriptorProto): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: FileDescriptorProto, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a FileDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
