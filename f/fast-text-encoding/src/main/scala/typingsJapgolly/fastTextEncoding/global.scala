package typingsJapgolly.fastTextEncoding

import typingsJapgolly.fastTextEncoding.fastTextEncoding.TextDecoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object fastTextEncoding {
    
    /**
      * TextDecoder instance.
      */
    @JSGlobal("fastTextEncoding.TextDecoderClass")
    @js.native
    open class TextDecoderClass ()
      extends StObject
         with typingsJapgolly.fastTextEncoding.fastTextEncoding.TextDecoderClass {
      def this(utfLabel: String) = this()
      def this(utfLabel: String, options: TextDecoderOptions) = this()
      def this(utfLabel: Unit, options: TextDecoderOptions) = this()
    }
    
    /**
      * TextEncoder instance.
      */
    @JSGlobal("fastTextEncoding.TextEncoderClass")
    @js.native
    open class TextEncoderClass ()
      extends StObject
         with typingsJapgolly.fastTextEncoding.fastTextEncoding.TextEncoderClass {
      def this(label: String) = this()
    }
  }
}
