package typingsJapgolly.iconvCorefoundation

import typingsJapgolly.iconvCorefoundation.anon.DecodeOptionsSelectAndEnc
import typingsJapgolly.iconvCorefoundation.anon.SelectAndEncodeOptionsisE
import typingsJapgolly.iconvCorefoundation.libNativeMod.BufferLike
import typingsJapgolly.iconvCorefoundation.libNativeMod.DecodeOptions
import typingsJapgolly.iconvCorefoundation.libNativeMod.EncodeOptions
import typingsJapgolly.iconvCorefoundation.libNativeMod.SelectAndEncodeOptions
import typingsJapgolly.iconvCorefoundation.libNativeMod.TextAndEncoding
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iconv-corefoundation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("iconv-corefoundation", "InvalidEncodedTextError")
  @js.native
  /* private */ open class InvalidEncodedTextError ()
    extends typingsJapgolly.iconvCorefoundation.libErrorsMod.InvalidEncodedTextError
  
  @JSImport("iconv-corefoundation", "NotRepresentableError")
  @js.native
  /* private */ open class NotRepresentableError ()
    extends typingsJapgolly.iconvCorefoundation.libErrorsMod.NotRepresentableError
  
  @JSImport("iconv-corefoundation", "StringEncoding")
  @js.native
  /** Instances of this class cannot be constructed directly. */
  /* private */ open class StringEncoding ()
    extends typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding
  /* static members */
  object StringEncoding {
    
    @JSImport("iconv-corefoundation", "StringEncoding")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Looks up a {@link StringEncoding} by its {@link https://developer.apple.com/documentation/corefoundation/cfstringencoding?language=objc | numeric identifier}.
      *
      * @remarks
      * Throws {@link UnrecognizedEncodingError} if not recognized and supported.
      *
      * @returns The found {@link StringEncoding}.
      */
    inline def byCFStringEncoding(id: Double): typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("byCFStringEncoding")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding]
    
    /**
      * Looks up a {@link StringEncoding} by corresponding IANA character set identifier.
      *
      * @remarks
      * Throws {@link UnrecognizedEncodingError} if not recognized and supported.
      *
      * This uses the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1542975-cfstringconvertianacharsetnameto?language=objc | CFStringConvertIANACharSetNameToEncoding}.
      *
      * @returns The found {@link StringEncoding}.
      */
    inline def byIANACharSetName(charset: String): typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("byIANACharSetName")(charset.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding]
    
    /**
      * Looks up a {@link StringEncoding} by corresponding Cocoa encoding constant.
      *
      * @remarks
      * Throws {@link UnrecognizedEncodingError} if not recognized and supported.
      *
      * This uses the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1542787-cfstringconvertnsstringencodingt?language=objc | CFStringConvertNSStringEncodingToEncoding}.
      *
      * @returns The found {@link StringEncoding}.
      */
    inline def byNSStringEncoding(nsStringEncoding: Double): typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("byNSStringEncoding")(nsStringEncoding.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding]
    
    /**
      * Looks up a {@link StringEncoding} by corresponding Windows codepage.
      *
      * @remarks
      * Throws {@link UnrecognizedEncodingError} if not recognized and supported.
      *
      * This uses the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1542113-cfstringconvertwindowscodepageto?language=objc | CFStringConvertWindowsCodepageToEncoding}.
      *
      * @returns The found {@link StringEncoding}.
      */
    inline def byWindowsCodepage(codepage: Double): typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("byWindowsCodepage")(codepage.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding]
    
    /**
      * The default {@link StringEncoding} used by the operating system when it creates strings.
      *
      * @remarks
      * This uses the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1541720-cfstringgetsystemencoding?language=objc | CFStringGetSystemEncoding}.
      */
    @JSImport("iconv-corefoundation", "StringEncoding.system")
    @js.native
    val system: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding = js.native
  }
  
  @JSImport("iconv-corefoundation", "UnrecognizedEncodingError")
  @js.native
  /* private */ open class UnrecognizedEncodingError ()
    extends typingsJapgolly.iconvCorefoundation.libErrorsMod.UnrecognizedEncodingError
  
  inline def decode(text: BufferLike, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(text: BufferLike, encoding: String, options: DecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(text: BufferLike, encoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(
    text: BufferLike,
    encoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding,
    options: DecodeOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(text.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encode(text: String, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encode(text: String, encoding: String, options: EncodeOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encode(text: String, encoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encode(
    text: String,
    encoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding,
    options: EncodeOptions
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(text.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeSmallest(text: String): TextAndEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSmallest")(text.asInstanceOf[js.Any]).asInstanceOf[TextAndEncoding]
  inline def encodeSmallest(text: String, options: SelectAndEncodeOptionsisE): TextAndEncoding = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSmallest")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding]
  inline def encodeSmallest(text: String, options: SelectAndEncodeOptions): TextAndEncoding | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSmallest")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding | Null]
  
  inline def encodingExists(encoding: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingExists")(encoding.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def transcode(text: BufferLike, fromEncoding: String, toEncoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(text: BufferLike, fromEncoding: String, toEncoding: String, options: DecodeOptions & EncodeOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(
    text: BufferLike,
    fromEncoding: String,
    toEncoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(
    text: BufferLike,
    fromEncoding: String,
    toEncoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding,
    options: DecodeOptions & EncodeOptions
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(
    text: BufferLike,
    fromEncoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding,
    toEncoding: String
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(
    text: BufferLike,
    fromEncoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding,
    toEncoding: String,
    options: DecodeOptions & EncodeOptions
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(
    text: BufferLike,
    fromEncoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding,
    toEncoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(
    text: BufferLike,
    fromEncoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding,
    toEncoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding,
    options: DecodeOptions & EncodeOptions
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def transcodeSmallest(text: BufferLike, fromEncoding: String): TextAndEncoding = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding]
  inline def transcodeSmallest(text: BufferLike, fromEncoding: String, options: DecodeOptions & SelectAndEncodeOptions): TextAndEncoding | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding | Null]
  inline def transcodeSmallest(text: BufferLike, fromEncoding: String, options: DecodeOptionsSelectAndEnc): TextAndEncoding = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding]
  inline def transcodeSmallest(text: BufferLike, fromEncoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding): TextAndEncoding = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding]
  inline def transcodeSmallest(
    text: BufferLike,
    fromEncoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding,
    options: DecodeOptions & SelectAndEncodeOptions
  ): TextAndEncoding | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding | Null]
  inline def transcodeSmallest(
    text: BufferLike,
    fromEncoding: typingsJapgolly.iconvCorefoundation.libNativeMod.StringEncoding,
    options: DecodeOptionsSelectAndEnc
  ): TextAndEncoding = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding]
}
