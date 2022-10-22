package typingsJapgolly.textEncoding

import typingsJapgolly.textEncoding.TextEncoding.TextEncoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object TextEncoding {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("TextEncoding.TextDecoder")
    @js.native
    open class TextDecoder ()
      extends StObject
         with typingsJapgolly.textEncoding.TextDecoder {
      def this(label: String) = this()
      def this(label: String, options: TextDecoderOptions) = this()
      def this(label: Unit, options: TextDecoderOptions) = this()
    }
    object TextDecoder {
      
      inline def apply(): typingsJapgolly.textEncoding.TextDecoder = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.textEncoding.TextDecoder]
      inline def apply(label: String): typingsJapgolly.textEncoding.TextDecoder = ^.asInstanceOf[js.Dynamic].apply(label.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.textEncoding.TextDecoder]
      inline def apply(label: String, options: TextDecoderOptions): typingsJapgolly.textEncoding.TextDecoder = (^.asInstanceOf[js.Dynamic].apply(label.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.textEncoding.TextDecoder]
      inline def apply(label: Unit, options: TextDecoderOptions): typingsJapgolly.textEncoding.TextDecoder = (^.asInstanceOf[js.Dynamic].apply(label.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.textEncoding.TextDecoder]
      
      @JSGlobal("TextEncoding.TextDecoder")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("TextEncoding.TextDecoder.encoding")
      @js.native
      def encoding: String = js.native
      inline def encoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encoding")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("TextEncoding.TextEncoder")
    @js.native
    open class TextEncoder ()
      extends StObject
         with typingsJapgolly.textEncoding.TextEncoder {
      def this(utfLabel: String) = this()
      def this(utfLabel: String, options: TextEncoderOptions) = this()
      def this(utfLabel: Unit, options: TextEncoderOptions) = this()
    }
    object TextEncoder {
      
      inline def apply(): typingsJapgolly.textEncoding.TextEncoder = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.textEncoding.TextEncoder]
      inline def apply(utfLabel: String): typingsJapgolly.textEncoding.TextEncoder = ^.asInstanceOf[js.Dynamic].apply(utfLabel.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.textEncoding.TextEncoder]
      inline def apply(utfLabel: String, options: TextEncoderOptions): typingsJapgolly.textEncoding.TextEncoder = (^.asInstanceOf[js.Dynamic].apply(utfLabel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.textEncoding.TextEncoder]
      inline def apply(utfLabel: Unit, options: TextEncoderOptions): typingsJapgolly.textEncoding.TextEncoder = (^.asInstanceOf[js.Dynamic].apply(utfLabel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.textEncoding.TextEncoder]
      
      @JSGlobal("TextEncoding.TextEncoder")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("TextEncoding.TextEncoder.encoding")
      @js.native
      def encoding: String = js.native
      inline def encoding_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encoding")(x.asInstanceOf[js.Any])
    }
  }
}
