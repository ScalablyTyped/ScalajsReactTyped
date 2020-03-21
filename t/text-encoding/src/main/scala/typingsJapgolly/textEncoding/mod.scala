package typingsJapgolly.textEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.textEncoding.TextEncoding.TextEncoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("text-encoding", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class TextDecoder ()
    extends typingsJapgolly.textEncoding.TextDecoder {
    def this(label: String) = this()
    def this(label: String, options: TextDecoderOptions) = this()
  }
  
  @js.native
  class TextEncoder ()
    extends typingsJapgolly.textEncoding.TextEncoder {
    def this(utfLabel: String) = this()
    def this(utfLabel: String, options: TextEncoderOptions) = this()
  }
  
  @js.native
  object TextDecoder
    extends Instantiable0[typingsJapgolly.textEncoding.TextDecoder]
       with Instantiable1[/* label */ String, typingsJapgolly.textEncoding.TextDecoder]
       with Instantiable2[
          /* label */ String, 
          /* options */ TextDecoderOptions, 
          typingsJapgolly.textEncoding.TextDecoder
        ] {
    var encoding: String = js.native
    def apply(): typingsJapgolly.textEncoding.TextDecoder = js.native
    def apply(label: String): typingsJapgolly.textEncoding.TextDecoder = js.native
    def apply(label: String, options: TextDecoderOptions): typingsJapgolly.textEncoding.TextDecoder = js.native
  }
  
  @js.native
  object TextEncoder
    extends Instantiable0[typingsJapgolly.textEncoding.TextEncoder]
       with Instantiable1[/* utfLabel */ String, typingsJapgolly.textEncoding.TextEncoder]
       with Instantiable2[
          /* utfLabel */ String, 
          /* options */ TextEncoderOptions, 
          typingsJapgolly.textEncoding.TextEncoder
        ] {
    var encoding: String = js.native
    def apply(): typingsJapgolly.textEncoding.TextEncoder = js.native
    def apply(utfLabel: String): typingsJapgolly.textEncoding.TextEncoder = js.native
    def apply(utfLabel: String, options: TextEncoderOptions): typingsJapgolly.textEncoding.TextEncoder = js.native
  }
  
}

